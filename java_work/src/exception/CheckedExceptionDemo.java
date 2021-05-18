package exception;

import java.io.*;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bReader = null;
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String input = null;
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(input);

	}

}
