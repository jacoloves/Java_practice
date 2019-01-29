package csv_read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class csv_reader {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			File f = new File("./src/csv_read/sample.csv");
			BufferedReader br = new BufferedReader(new FileReader(f));
			String str1 = "#";

			String line;
			while (((line = br.readLine()) != null) && ((line = br.readLine()).indexOf(str1) == -1)){
				String[] data = line.split(",", 0);

				for (String elem : data) {
					System.out.println(elem);
				}
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
