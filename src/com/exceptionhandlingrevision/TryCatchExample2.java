package com.exceptionhandlingrevision;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchExample2 {

	public static void main(String[] args) {

		PrintWriter pw;
		try {

			pw = new PrintWriter("Abhi.txt");
			pw.println("saved");

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		System.out.println("File saved successfullt");
	}

}
