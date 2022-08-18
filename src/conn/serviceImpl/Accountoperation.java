package conn.serviceImpl;


import conn.servicelayer.Acoounservices;
import DaoImplementation.DaoImpl;
import conn.bean.Account;
import conn.exception.InvalidAccountNoException;

public class Accountoperation implements Acoounservices 
{
	Account acc;

	@Override
	public int Account(String type, int amount) {

		acc=new Account(type,amount);
		return acc.getAccNo();
		
	}
	public boolean validate(int accNo) throws InvalidAccountNoException
	{boolean val=false;
		try {
		
		if(acc.getAccNo()==accNo)
		{
			val=true;
		}
		else
		{
		throw new InvalidAccountNoException("Account no is not there...");
		}}
	 catch(InvalidAccountNoException e)
		{
		 e.printStackTrace();
		}
		return val;
		
	}


	@Override
	public void deposit(int accNo, int amount) throws InvalidAccountNoException {
		if(validate(accNo)) {
			 if(acc.getAccBal()>=amount)
		    {
			 float bal=acc.getAccBal();
			 bal=bal-amount;
			 acc.setAccBal(bal);
			System.out.println("Balance after withdraw="+acc.getAccBal());
			System.out.println("Thank you.........");
		    }
		 else
		    {
			 System.out.println("Not Sufficient Balance");
		    } 
		}
		 else
		 {
			System.out.println("invalid accNo");
		}
	


		
	}

	@Override
	public void withdraw(int accNo, int amount) throws InvalidAccountNoException {

		if(validate(accNo))
		{
	 System.out.println("Balance="+acc.getAccBal());
		}
		else
		{
			 System.out.println("Balance="+0.0);
			
		
}

		
	}

	@Override
	public void Details(int accNo) throws InvalidAccountNoException {
		if(validate(accNo))
		 {
			 System.out.println(acc);
			 
		 }
		 else
		 
			 System.out.println("Invalid Account No....");
	

		
	}

	@Override
	public void balEnquiry(int accNo) throws InvalidAccountNoException {
		

		if(validate(accNo))
		{
	 System.out.println("Balance="+acc.getAccBal());
		}
		else
		{
			 System.out.println("Balance="+0.0);}

	}

 		
	}

	


