package api.test.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Properties;

import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected static final String UserDir = System.getProperty("user.dir");
	private static final String ConfigDir = UserDir + "/Configs";
	private Properties configsProperties = null;
	public String url = "https://api.douban.com/";

	@BeforeMethod
	public void BeforeMethod() throws Exception {
		Properties properties = new Properties();
		String fileName = this.getClass().getSimpleName();
		File file = new File(ConfigDir);
		FileInputStream inputStream = new FileInputStream(file + "/" + fileName + ".properties");
		properties.load(inputStream);
		inputStream.close();
		System.err.println("-----------" + "开始" + "-----------");
	}

	@Deprecated
	protected Properties getPropertiesFromFile(File file) {
		Properties properties = new Properties();
		try {
			InputStreamReader fileInputStream = new InputStreamReader(new FileInputStream(file), "UTF-8");
			properties.load(fileInputStream);
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties;
	}

	protected String getId(String key) {
		return configsProperties.getProperty(key).trim();
	}

	protected String getRealPath(String path) {
		return path;
	}

	protected Properties getPropertiesFromPath(String path) {
		return getPropertiesFromFile(new File(path + ".properties"));
	}

	protected void setPropertiesToFile(Properties properties, File file) {
		try {
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
			properties.store(outputStreamWriter, "store");
			outputStreamWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initConfigs() {
		File file = new File(getRealPath(ConfigDir), this.getClass().getSimpleName() + ".properties");
		if (file.exists() && file.length() > 0) {
			try {
				configsProperties = new Properties();
				InputStreamReader fileInputStream = new InputStreamReader(new FileInputStream(file), "UTF-8");
				configsProperties.load(fileInputStream);
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public BaseTest() {
		initConfigs();
	}

}
