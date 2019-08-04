package managers;

import dataProvider.ConfigFileReader;
import org.openqa.selenium.WebDriver;


public class FileReaderManager {

    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static ConfigFileReader configFileReader;

    WebDriver driver;

    private FileReaderManager() {
    }

    public static FileReaderManager getInstance( ) {

        return fileReaderManager;
    }

    public ConfigFileReader getConfigReader() {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }
}