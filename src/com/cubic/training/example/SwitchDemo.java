package com.cubic.training.example;

public class SwitchDemo {

	public static void main(String[] args) {

		int month = 10;
		String monthName;

		switch (month) {

		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "feb";
			break;
		case 3:
			monthName = "Mar";
			break;
		case 4:
			monthName = "Apr";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "Aug";
			break;
		case 9:
			monthName = "Sept";
			break;
		case 10:
			monthName = "Oct";
			break;
		case 11:
			monthName = "NOv";
			break;
		case 12:
			monthName = "Dec";
			break;
		default:
			monthName = "Invalid Entry";
			break;

		}
System.out.println("The name of month is " + monthName);
	}

}
