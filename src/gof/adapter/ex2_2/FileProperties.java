package gof.adapter.ex2_2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class FileProperties implements FileIO {
	private Properties prop;

	public FileProperties() {
		prop = new Properties();
	}

	@Override
	public void readFromFile(String filePath) throws IOException {
		prop.load(Files.newBufferedReader(Paths.get(filePath)));
	}

	@Override
	public void writeToFile(String filePath) throws IOException {
		prop.store(Files.newBufferedWriter(Paths.get(filePath)), "Created By FileProps.");
	}

	@Override
	public void setValue(String key, String value) throws IOException {
		if (null == prop) {
			throw new FileNotFoundException("Property file does not set.");
		}
		prop.setProperty(key, value);
	}

	@Override
	public String getValue(String key) throws IOException {
		if (null == prop) {
			throw new FileNotFoundException("Property file does not set.");
		}
		return prop.getProperty(key);
	}

}
