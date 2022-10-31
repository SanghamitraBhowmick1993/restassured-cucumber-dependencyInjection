package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//https://www.youtube.com/watch?v=NhiIAZRoc0g --> 32mins
public class ConfigReader {
	private static Properties prop;
	/*
	 * This is used to load prop file
	 */
	
	public static Properties init_prop(){
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/main/resources/Config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	public static String getUrl() {
		return init_prop().getProperty("baseUri");
	}
}
