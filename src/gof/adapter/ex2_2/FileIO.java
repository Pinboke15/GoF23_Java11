package gof.adapter.ex2_2;

import java.io.IOException;

public interface FileIO {
	public void readFromFile(String filePath) throws IOException;

	public void writeToFile(String filePath) throws IOException;

	public void setValue(String key, String value) throws IOException;

	public String getValue(String key) throws IOException;
}
