package com.monsanto.irdsoapservices.utils;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * <code>Configuration</code> is used to access name-value pairs stored in the configuration file
 * Configuration.properties.  It implements the Singleton design pattern.
 */
public class Configuration {

  // The Singleton instance of this class.
  private static Configuration instance = null;

  // Used to load the name-value pairs.
  public static final String ERROR_FROM_EMAIL_ADDRESS = "error.email.from.address";
  public static final String ERROR_TO_EMAIL_ADDRESS = "error.email.to.address";
  public static final String CREDITLIST_TO_EMAIL_ADDRESS = "creditlist.email.to.address";
  public static final String CREDITLIST_FROM_EMAIL_ADDRESS = "creditlist.email.from.address";
  public static final String PARTNER_NAME = "partner.name";
  public static final String PARTNER_EMAIL = "partner.email";    

  
  private ResourceBundle resourceBundle = null;
  
  private static final String LSI_FUNCTION = "lsi.function";
  private static final String WIN = "win";
  private static final String DEV = "dev";
  private static final String TEST = "it";
  private static final String PS = "ps";
  private static final String PROD = "prod";

  // Defined property names.

  private Logger logger = null;
  private HashMap<String, String> prefixMap = null;

  private String CONFIG_FILE = "AppConfiguration";
    /**
     * Private constructor.
     */
    private Configuration() {
       initConfiguration();       
    }

    private void initConfiguration(){
    	logger = Logger.getLogger(Configuration.class);
        logger.debug("Initializing system configuration properties.");
      try {
    	  prefixMap = new HashMap<String, String>();
    	  prefixMap.put(WIN, WIN);
    	  prefixMap.put(DEV, DEV);
    	  prefixMap.put(TEST, TEST);
    	  prefixMap.put(PS, PS);
    	  prefixMap.put(PROD, PROD);
    	  resourceBundle = ResourceBundle.getBundle(CONFIG_FILE);
      } catch (Exception e) {
        logger.error(e.getMessage());
        logger.error(e);
      }
    }

  /**
   * Returns the Singleton instance of this class.
   *
   * @return Configuration the singleton instance of this class
   */
  public static final synchronized Configuration getInstance() {
    if (instance == null) {
      instance = new Configuration();
    }
    return instance;
  }

  /**
   * Returns the value associated with the supplied name.
   *
   * @return String the property value
   */
  public String getProperty(String aName) throws Exception {

    String lValue = null;
    try {
      String envPropertyPrefix = getPropertyPrefix();	  
      try {
        lValue = resourceBundle.getString(envPropertyPrefix+"."+aName).trim();
      } catch (MissingResourceException e) {
        lValue = resourceBundle.getString("default." + aName).trim();
      }
    } catch (Exception e) {
      logger.error(e);
      throw(e);
    }

    return lValue;
  }

    
  
  private String getPropertyPrefix() throws Exception {
	  String prefix = System.getProperty(LSI_FUNCTION);
	  if(StringUtils.isNullOrEmpty(prefix)) {
		  throw new Exception("Bad value of lsi.function = "+prefix);
	  }
	  return prefixMap.get(prefix);
  }

}
