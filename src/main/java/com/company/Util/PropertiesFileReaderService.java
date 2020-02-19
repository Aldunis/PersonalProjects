package com.company.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileReaderService {

    private Properties properties;
    private static final String FILE_NAME="C:\\Users\\user\\IdeaProjects\\Books\\src\\main\\resources\\db.properties";
    private static final String DB_USER_NAME="db.username";
    private static final String DB_PASSWORD="db.password";
    private static final String DRIVER="driver";
    private static final String CONNECTION="connection";


    public PropertiesFileReaderService() throws IOException {

        try (InputStream input = new FileInputStream(FILE_NAME)){
            properties = new Properties();

            properties.load(input);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUserName() {
        return properties.getProperty(DB_USER_NAME);
    }
    public String getPassword() {
        return properties.getProperty(DB_PASSWORD);
    }
    public String getDriver() {
        return properties.getProperty(DRIVER);
    }
    public String getConnector() {
        return properties.getProperty(CONNECTION);
    }


}
