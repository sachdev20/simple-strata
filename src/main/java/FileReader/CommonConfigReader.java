package FileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class CommonConfigReader {

    public static HashMap<String, String> commonParameters = new HashMap<String, String>();
    private static Properties properties;
    private static String Dir = System.getProperty("user.dir");
    private final static String propertyFilePath = Dir + "/src/configs/Config.properties";

    public CommonConfigReader() {

    }

    public static HashMap<String, String> DataReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Config.properties not found at " + propertyFilePath);
        }
        for (String propertyName : properties.stringPropertyNames())
            commonParameters.put(propertyName, properties.getProperty(propertyName));
        return commonParameters;
    }
}
