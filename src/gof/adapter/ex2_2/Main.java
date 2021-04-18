package gof.adapter.ex2_2;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try {
			f.readFromFile("files\\adapter\\setting.txt");
			System.out.println(String.format("Current year prop value is %s", f.getValue("year")));
			f.setValue("year", "2021");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile("files\\adapter\\newSetting.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
