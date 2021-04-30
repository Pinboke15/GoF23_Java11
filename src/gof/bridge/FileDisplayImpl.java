package gof.bridge;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDisplayImpl extends DisplayImpl {

	private static final int MAX_READ_SIZE = 4096;

	private String filePath;
	private BufferedReader reader;

	public FileDisplayImpl(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void rawOpen() {
		try {
			this.reader = Files.newBufferedReader(Paths.get(filePath));
			this.reader.mark(MAX_READ_SIZE);
			System.out.println(filePath + " is opened.....");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void rawPrint() {
		try {
			this.reader.reset();
			this.reader.lines().forEach(l -> System.out.println("> " + l));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void rawClose() {
		try {
			this.reader.close();
			System.out.println(filePath + " is closed....");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
