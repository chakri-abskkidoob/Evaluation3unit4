package com.evaluation3;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateOfBirth {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date of Birth in dd-MM-yyyy format");
		String dob = sc.next();
		try {
			LocalDate c1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate d1 = LocalDate.now();
			Period p = Period.between(c1, d1);
			if(c1.getDayOfMonth() == d1.getDayOfMonth() && c1.getMonth() == d1.getMonth()) {
				System.out.println("Happy Birthday, You are eligible to cast your vote");
			}
			else if(p.getYears()>= 18) {
				System.out.println("You are eligible to cast your vote");
			}
			else if(p.getYears()<=0) {
				System.out.println("Date of birth should not be in future");
			}
			else {
				System.out.println("Your are not eligible to vote");
			}
		}catch(Exception e) {
			System.out.println("please pass the date in the proper format");
		}
		sc.close();
	}

}