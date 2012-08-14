package com.monsanto.commercial.growercreditlist.util;

import org.apache.log4j.Logger;

import java.util.ResourceBundle;
import java.util.HashMap;
import java.util.MissingResourceException;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Oct 5, 2011
 * Time: 11:16:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class URLProperties {
    // The Singleton instance of this class.
    private static URLProperties instance = null;

    private ResourceBundle resourceBundle = null;

    public static final String OSB_URL = ".osb.url";

    private static final String DEV = "dev";
    private static final String DEV_INT = "dev.int";
    private static final String IT = "it";
    private static final String IT_INT = "it.int";
    private static final String PS = "ps";
    private static final String PS_INT = "ps.int";
    private static final String PROD = "prod";
    private static final String PROD_INT = "prod.int";

    private Logger logger = null;
    private HashMap<EnvironmentEnum, String> prefixMap = null;

    private String CONFIG_FILE = "url";

    /**
     * Private constructor.
     */
    private URLProperties() {
        initConfiguration();
    }

    private void initConfiguration(){
        logger = Logger.getLogger(URLProperties.class);
        logger.debug("Initializing system configuration properties.");
        try {
            prefixMap = new HashMap<EnvironmentEnum, String>();
            prefixMap.put(EnvironmentEnum.DEV, DEV);
            prefixMap.put(EnvironmentEnum.DEV_INT, DEV_INT);
            prefixMap.put(EnvironmentEnum.IT, IT);
            prefixMap.put(EnvironmentEnum.IT_INT, IT_INT);
            prefixMap.put(EnvironmentEnum.PS, PS);
            prefixMap.put(EnvironmentEnum.PS_INT, PS_INT);
            prefixMap.put(EnvironmentEnum.PROD, PROD);
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
    public static final synchronized URLProperties getInstance() {
        if (instance == null) {
            instance = new URLProperties();
        }
        return instance;
    }

    public String getWsdlLocation(EnvironmentEnum environment, String serviceName) throws Exception {
        return getProperty(environment, serviceName+OSB_URL);
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

    public String getPropertyPrefix(EnvironmentEnum env) throws Exception {
        if(env == null) {
            throw new Exception("Bad value of Environment = "+env);
        }
        return prefixMap.get(env);
    }

}
