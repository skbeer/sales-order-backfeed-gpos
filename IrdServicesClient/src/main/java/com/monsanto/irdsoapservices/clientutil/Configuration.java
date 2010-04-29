package com.monsanto.irdsoapservices.clientutil;

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

    private ResourceBundle resourceBundle = null;
    
    public static final String OSB_URL = "osb.url";
    public static final String ACCOUNT_INFORMATION_SERVICE = "account.information.uri";
    public static final String ACCOUNT_AGREEMENTS_SERVICE = "account.agreements.uri";
    public static final String BRANDS_SERVICE = "brands.uri";
    public static final String CONTACTS_SERVICE = "contacts.uri";

    private static final String DEV_EXT = "dev.ext";
    private static final String DEV_INT = "dev.int";
    private static final String IT_EXT = "it.ext";
    private static final String IT_INT = "it.int";
    private static final String PS_EXT = "ps.ext";
    private static final String PS_INT = "ps.int";
    private static final String PROD_EXT = "prod.ext";
    private static final String PROD_INT = "prod.int";

    private Logger logger = null;
    private HashMap<EnvironmentEnum, String> prefixMap = null;

    private String CONFIG_FILE = "Configuration";

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
            prefixMap = new HashMap<EnvironmentEnum, String>();
            prefixMap.put(EnvironmentEnum.DEV_EXT, DEV_EXT);
            prefixMap.put(EnvironmentEnum.DEV_INT, DEV_INT);
            prefixMap.put(EnvironmentEnum.IT_EXT, IT_EXT);
            prefixMap.put(EnvironmentEnum.IT_INT, IT_INT);
            prefixMap.put(EnvironmentEnum.PS_EXT, PS_EXT);
            prefixMap.put(EnvironmentEnum.PS_INT, PS_INT);
            prefixMap.put(EnvironmentEnum.PROD_EXT, PROD_EXT);
            prefixMap.put(EnvironmentEnum.PROD_INT, PROD_INT);
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

    public String getWsdlLocation(EnvironmentEnum environment, String serviceName) throws Exception {
        return getProperty(environment, OSB_URL)+getProperty(environment, serviceName);
    }

    /**
     * Returns the value associated with the supplied name.
     *
     * @return String the property value
     */
    public String getProperty(EnvironmentEnum env, String aName) throws Exception {

        String lValue = null;
        try {
            String envPropertyPrefix = getPropertyPrefix(env);
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

    private String getPropertyPrefix(EnvironmentEnum env) throws Exception {
        if(env == null) {
            throw new Exception("Bad value of Environment = "+env);
        }
        return prefixMap.get(env);
    }

}
