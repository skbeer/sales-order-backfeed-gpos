package com.monsanto.irdsoapservices.test;

import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Copyright RoleModel Software, Inc.
 * It's free, but if you find this useful or make any changes, please let me know.
 * awilliams@rolemodelsoftware.com
 */

/**
 * A class used to collect all UT test under a giving list of packages or class.
 */
public class TestCollector {
  public static final String DEFAULT_TEST_CASE_FILTER = ".+_UT\\.class";
  public static final String DEFAULT_TEST_SUITE_FILTER = ".+_TS\\.class";

  protected String s_testCaseFilter = DEFAULT_TEST_CASE_FILTER;
  protected String s_testSuiteFilter = DEFAULT_TEST_SUITE_FILTER;

  /**
   * @param classInPackageContainingTests : Defines the class at which all test methods should be
   *                                      extracted from and placed in Test Suit.
   * @return A JUnit TestSuit.
   */
  public Test createSuiteOfTestCases(Class classInPackageContainingTests) {
    String packageFragmentRoot = classInPackageContainingTests.getPackage().getName();
    File packageDir = getPackageFragmentRootFile(packageFragmentRoot);
    String[] tcFiles = packageDir.list(getTestCaseFilter());
    TestSuite suite = new TestSuite();
    for (int index = 0; index < tcFiles.length; index++)
      addTestToSuite(suite, fullyQualifiedClassName(packageFragmentRoot, tcFiles[index]));

    return suite;
  }

  /**
   * Creates a JUnit TestSuit with all UT class under the given packages.
   * *createSuiteOfTestCases was created on May 19, 2003 using Monsanto
   * resources
   *
   * @param packageFragmentRoot :  Array of Strings holding packages to gather UT test from.
   * @return A JUnit TestSuit.
   */
  public Test createSuiteOfTestCases(String[] packageFragmentRoot) {

    return createSuiteOfTestCases(packageFragmentRoot, null);
  }

  /**
   * Creates a JUnit TestSuit with all UT class under the packages passed in. All packages under the passed in
   * packages will also be searched.
   * createSuiteOfTestCases was created on May 19, 2003 using Monsanto
   * resources
   *
   * @param packageFragmentRoot :  Array of Strings holding packages to gather UT test from.
   * @param classToExclude      : Class to exclude when running test.
   * @return A JUnit TestSuit.
   */
  public Test createSuiteOfTestCases(String[] packageFragmentRoot, Class classToExclude) {
    String classToExcludeName = "";
    if (classToExclude != null) {
      classToExcludeName = classToExclude.getName();
    }

    TestSuite suite = new TestSuite();
    for (int i = 0; i < packageFragmentRoot.length; i++) {
      String packageName = packageFragmentRoot[i];
      List tests = new ArrayList();
      File packageDir = getPackageFragmentRootFile(packageName);
      addTestCaseClasses(packageName, packageDir, tests);
      for (Iterator iter = tests.iterator(); iter.hasNext();) {
        String className = (String) iter.next();
        if (!classToExcludeName.equals(className))
          addTestToSuite(suite, className);
      }
    }
    return suite;
  }

  /**
   * Creates a JUnit test suit from a single package being passed in.
   *
   * @param packageFragmentRoot :  Array of Strings holding packages to gather UT test from.
   * @param classToExclude      : Class to exclude when running test.
   * @return a JUnit test suit from a single package being passed in
   */
  public Test createSuiteOfSuites(String packageFragmentRoot, Class classToExclude) {
    List tests = new ArrayList();
    File packageDir = getPackageFragmentRootFile(packageFragmentRoot);
    addSuiteClasses(packageFragmentRoot, packageDir, tests);

    TestSuite suite = new TestSuite();
    for (Iterator iter = tests.iterator(); iter.hasNext();) {
      String className = (String) iter.next();
      if (!classToExclude.getName().equals(className))
        addSuiteToSuite(suite, className);
    }
    return suite;
  }

  protected File getPackageFragmentRootFile(String packageFragmentRoot) {
    URL urlOfPackage = TestCollector.class.getClassLoader().getResource(slashPackageName(packageFragmentRoot));
    System.out.println(urlOfPackage);
    String absolutePath = getAbsolutePath(urlOfPackage);
    File packageDir = new File(absolutePath);
    return packageDir;
  }

  protected void addSuiteClasses(String packageFragmentRoot, File filePackageFragment, List suiteClassCollector) {
    FilenameFilter testSuiteFilter = getTestSuiteFilter();
    File[] files = filePackageFragment.listFiles();
    for (int i = 0; i < files.length; i++) {
      File file = files[i];
      if (testSuiteFilter.accept(filePackageFragment, file.getName()))
        suiteClassCollector.add(fullyQualifiedClassName(packageFragmentRoot, file.getName()));
      else if (file.isDirectory()) {
        String extendedPackage = packageFragmentRoot + "." + file.getName();
        addSuiteClasses(extendedPackage, file, suiteClassCollector);
      }
    }
  }

  protected void addTestCaseClasses(String packageFragmentRoot, File filePackageFragment, List testCaseClassCollector) {
    FilenameFilter testCaseFilter = getTestCaseFilter();
    File[] files = filePackageFragment.listFiles();
    for (int i = 0; i < files.length; i++) {
      File file = files[i];
      if (testCaseFilter.accept(filePackageFragment, file.getName()))
        testCaseClassCollector.add(fullyQualifiedClassName(packageFragmentRoot, file.getName()));
      else if (file.isDirectory()) {
        String extendedPackage = packageFragmentRoot + "." + file.getName();
        addTestCaseClasses(extendedPackage, file, testCaseClassCollector);
      }
    }
  }

  protected String fullyQualifiedClassName(String packageName, String fileName) {
    return packageName + "." + fileName.substring(0, fileName.indexOf(".class"));
  }

  /**
   * Allows for overriding of default test case filter
   *
   * @param filter Regular expression string to identify class files that are test cases
   */
  public void setTestCaseFilter(String filter) {
    s_testCaseFilter = filter;
  }

  /**
   * Allows for overriding of default test suite filter
   *
   * @param filter Regular expression string to identify files that are test suites
   */
  public void setTestSuiteFilter(String filter) {
    s_testSuiteFilter = filter;
  }

  protected FilenameFilter getTestSuiteFilter() {
    return new FilenameFilter() {
      public boolean accept(File dir, String name) {
        return name.matches(DEFAULT_TEST_SUITE_FILTER);
      }
    };
  }

  protected FilenameFilter getTestCaseFilter() {
    return new FilenameFilter() {
      public boolean accept(File dir, String name) {
        return name.matches(s_testCaseFilter);
      }
    };
  }

  protected void addSuiteToSuite(TestSuite suite, String className) {
    try {
      Class testClass = TestCollector.class.getClassLoader().loadClass(className);
      if (!Modifier.isAbstract(testClass.getModifiers())) {
        //Method suiteMethod= testClass.getMethod("suite", new Class[0]);
        Method suiteMethod = testClass.getMethod("suite", new Class[0]);
        if (!Modifier.isStatic(suiteMethod.getModifiers()))
          throw new RuntimeException("suite() must be static.");
        Test test = (Test) suiteMethod.invoke(null, new Class[0]);
        suite.addTest(test);
      }
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  protected void addTestToSuite(TestSuite suite, String className) {
    if (className.indexOf("$") >= 0)
      return;
    try {
      Class testClass = TestCollector.class.getClassLoader().loadClass(className);
      Method[] methodCount = testClass.getMethods();
      boolean addTest = false;
      String methodName;
      Method suiteMethod = null;
      //excludes any class that does not contain a method starting with test.
      //this was implemented to prevent a ran when running a TestSuit without test.
      for (int i = 0; i < methodCount.length; i++) {
        Method method = methodCount[i];
        methodName = method.getName();
        if (!addTest)
          addTest = methodName.startsWith("test");
        if (methodName.equals("suite")) {
          suiteMethod = method;
        }
//				if(addTest){
//					break;
//				}
      }
      if (suiteMethod != null && !Modifier.isAbstract((testClass.getModifiers()))) {
        addSuiteToSuite(suite, className);
      } else if (addTest) {
        if (!Modifier.isAbstract(testClass.getModifiers())) {
          suite.addTest(new TestSuite(testClass));
        }
      }
    }
    catch (ClassNotFoundException e) {
    }
  }

  protected String slashPackageName(String dotPackageName) {
    return dotPackageName.replaceAll("\\.", "/");
  }

  protected String getAbsolutePath(URL url) {
    if (!"file".equals(url.getProtocol()))
      throw new RuntimeException("This doesn't work with anything but local class files.  Protocol was: " + url.getProtocol());

    String urlWithSpaces = url.getPath().replaceAll("\\%20", " ");
    return urlWithSpaces;
  }
}
