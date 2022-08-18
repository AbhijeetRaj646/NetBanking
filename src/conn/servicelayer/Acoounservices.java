package conn.servicelayer;


import conn.exception.InvalidAccountNoException;

//import conn.exception.InvalidAccountNoException;

public interface Acoounservices {
	public int Account(String type,int amount);
	public void deposit(int accNo,int amount)throws InvalidAccountNoException;
	public void withdraw(int accNo,int amount)throws InvalidAccountNoException;
	public void Details(int accNo)throws InvalidAccountNoException;
	public void balEnquiry(int accNo)throws InvalidAccountNoException;

}
