package CSVproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
		

		String path = "/Users/faitusjelinejoseph/desktop/FL_insurance_sample.csv";
		String line = "";//to store a line
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while((line = br.readLine()) != null) {
				String[] values = line.split(",");
				System.out.println("County : "+ values[2] + "state code : " + values[1]);
				
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		

	}

}
