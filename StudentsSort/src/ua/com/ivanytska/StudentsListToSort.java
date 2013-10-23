package ua.com.ivanytska;

import java.util.*;
import java.io.*;
import java.util.Collections;
import java.util.Scanner;

public class StudentsListToSort {
	
	ArrayList <Student> studentsList = new ArrayList <Student> ();
	public static void main(String[] args) {

		new StudentsListToSort().go();
	}
	public void go () {
		getStudents();
		System.out.println ("Initial list"+ studentsList );
		Collections.sort(studentsList);
		System.out.println ("Sorted list of students:");
		for (Student person:studentsList) {
		System.out.println (person);
		}
	}
	public void getStudents () {
		try {
			Scanner sc = new Scanner(new File("src"+File.separator+"data.txt"));
			while(sc.hasNextLine()) {
				addStudent (sc.nextLine());                     
			}
			sc.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println ("Error!");
		}
	}

	public void addStudent (String lineToParse) {
		String [] data = lineToParse.split(", ");
		
		Student nextStudent = new Student (data [0], data [1], data [2], data [3]);
		studentsList.add(nextStudent);
		
	}
}
