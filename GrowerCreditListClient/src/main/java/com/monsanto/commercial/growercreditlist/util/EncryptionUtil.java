package com.monsanto.commercial.growercreditlist.util;

import com.monsanto.Util.EnvironmentHelper;
import com.monsanto.Util.EnvironmentHelperException;
import com.monsanto.Util.databasepasswordencryption.EncryptionUtils;

import java.util.ResourceBundle;
import java.util.MissingResourceException;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Oct 5, 2011
 * Time: 10:28:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncryptionUtil {
    private static final String RESOURCE_PATH = "service_account";
        private static final String APPLICATION_FOLDER_KEY = "appFolderName";
        private static final String STORAGE_VAR_KEY = "storageVar";
        private static final String USER_NAME_KEY = "username";
        private static final String KEY_FILE_KEY = "keyfile";
        private static final String PASSWORD_FILE_KEY = "encryptedPasswordFile";
        private static final String DEFAULT = "default.";
        private static EncryptionUtil INSTANCE;
        private ResourceBundle resourceBundle;

        private EncryptionUtil() {
            this.resourceBundle = initResourseBundle();
        }

        public static synchronized EncryptionUtil getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new EncryptionUtil();
            }
            return INSTANCE;
        }

        public String getPassword() throws Exception {
            try {
                String envPropertyPrefix = EnvironmentHelper.getPropertyPrefix();
                String storageVar = getProperty(envPropertyPrefix, STORAGE_VAR_KEY);
                String appFolder = getProperty(envPropertyPrefix, APPLICATION_FOLDER_KEY);
                String encryptedPasswordFileName = getProperty(envPropertyPrefix, PASSWORD_FILE_KEY);
                String keyFileName = getProperty(envPropertyPrefix, KEY_FILE_KEY);
                return EncryptionUtils.GetDecryptedStringFromExternalStorage(storageVar, appFolder, encryptedPasswordFileName, keyFileName);
            } catch (Exception e) {
                throw new Exception(
                        "Exception occured while obtaining username/ password in class AuthenticationUtil - " + e, e);
            }
        }

        public String getPassword(String envPropertyPrefix) throws Exception {
            try {
                String storageVar = getProperty(envPropertyPrefix, STORAGE_VAR_KEY);
                String appFolder = getProperty(envPropertyPrefix, APPLICATION_FOLDER_KEY);
                String encryptedPasswordFileName = getProperty(envPropertyPrefix, PASSWORD_FILE_KEY);
                String keyFileName = getProperty(envPropertyPrefix, KEY_FILE_KEY);
                return EncryptionUtils.GetDecryptedStringFromExternalStorage(storageVar, appFolder, encryptedPasswordFileName, keyFileName);
            } catch (Exception e) {
                throw new Exception(
                        "Exception occured while obtaining username/ password in class AuthenticationUtil - " + e, e);
            }
        }

        public String getUserName() throws Exception {
            try {
                String envPropertyPrefix = EnvironmentHelper.getPropertyPrefix();
                return getProperty(envPropertyPrefix, USER_NAME_KEY);
            } catch (EnvironmentHelperException e) {
                throw new Exception(
                        "Exception occured while obtaining username in class AuthenticationUtil - " + e, e);
            }
        } 

        public String getUserName(String envPropertyPrefix) throws Exception {
            try {
                return getProperty(envPropertyPrefix, USER_NAME_KEY);
            } catch (Exception e) {
                throw new Exception(
                        "Exception occured while obtaining username in class AuthenticationUtil - " + e, e);
            }
        }

        private ResourceBundle initResourseBundle() {
            return ResourceBundle.getBundle(RESOURCE_PATH);
        }

        private String getProperty(String envPropertyPrefix, String key) {
            try {
                return this.resourceBundle.getString(envPropertyPrefix + key).trim();
            } catch (MissingResourceException e) {
                return this.resourceBundle.getString(DEFAULT + key).trim();
            }
        }

}
