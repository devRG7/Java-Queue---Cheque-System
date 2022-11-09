//NAME:RAMLOCUND Gitendrajeet
//Algorithmics Assignment
//DATE:12.04.2021
//Creating the Cheque Class to be used for Queues.

import java.util.Scanner;

//Creating Class Cheque to be stored to  an ArrayList
public class Cheque implements Comparable<Cheque> {

	static int chequeNum; // Variable to Store Cheque Number last 7 characters
	private String bankName; // Variable to Store Bank Name
	private String name; // Variable to store Recipient Name
	private String accountType; // Variable to Store Customer Account(Savings,Personal,Cooperate)
	private float amount; // Variable to store Amount being deposited or credited

	// Default Constructor
	public Cheque() {
		Scanner input = new Scanner(System.in);
		chequeNum++;
		System.out.print("Input Bank Name  : ");
		this.bankName = input.nextLine();

		System.out.print("Input Recipient Name : ");
		this.name = input.nextLine();

		System.out.print("Input Account Type  : ");
		this.accountType = input.nextLine();

		System.out.print("Input Cheque Amount  : ");
		this.amount = input.nextFloat();
	}

	// Parameterized constructor
	public Cheque(String bkName, String name, String actype, float amt) {

		chequeNum++;
		this.bankName = bkName;
		this.name = name;
		this.amount = amt;
		this.accountType = actype;

	}

	static int getChequeNum() {
		return chequeNum++;
	}

	private String getName() {
		return name;
	}

	private double getAmount() {
		return amount;
	}

	private String getBankName() {
		return bankName;

	}

	private String getAccountType() {
		return accountType;

	}

	// String representation of Cheque
	public String toString() {
		return "\nCheque Number : " + "000 0000 000" + getChequeNum() + "\nBank Name : " + this.bankName + " PLC LTD"
				+ "\nRecipient Name : " + this.name + "\nAmount : " + this.amount + " MUR" + "\nAccount Type : "
				+ this.accountType + " Account";
	}

	// Function to Clone and make duplicates copy of a Cheque
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// Function to Check if 2 Cheques are Equals
	public boolean equals(Object obj) {
		return (this == obj);
	}

	// Function to Compare 2 Cheques
	public int compareTo(Cheque o) {

		return 0;
	}

}

