package client;
import java.util.Scanner;

import conn.erviceprovider.BusinessObjectProvider;
import conn.exception.InvalidAccountNoException;
import conn.serviceImpl.Accountoperation;

import conn.servicelayer.Acoounservices;
public class client {

	public static void main(String[] args) throws InvalidAccountNoException {
		Acoounservices bank=BusinessObjectProvider.provideObject();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter Account Type...");
		String type=sc.next();
		
		System.out.println("please enter Ammount...");
		float amount=sc.nextFloat();
		
		
		int accNo=bank.Account(type,(int) amount);
		System.out.println("Account with accNo.."+accNo);
		bank.Details(accNo);
		bank.deposit(accNo, 2000);
		bank.withdraw(accNo, 2000);	
		bank.Details(accNo);
		
		/*
		 * int accNo1=bank.Account("current",10000);
		 * System.out.println("Account with accNo.."+accNo1); bank.Details(accNo1);
		 * bank.deposit(900, 2000); bank.withdraw(900, 2000); bank.Details(800);
		 * bank.balEnquiry(accNo);
		 * 
		 */		// TODO Auto-generated method stub

	}

}
