package config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	static Properties prop;
	public static Properties init_prop() {
		prop = new Properties();
		try {
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir")
					+ "/src/test/resources/config.properties");
			prop.load(fi);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

}
