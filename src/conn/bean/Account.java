package conn.bean;



//Role-Data carrier----Holding data and methods to manage data
//Java Bean
public class Account 
{
  private int accNo;
  private String accType;
  private float accBal;
  private static int series=900;
 
  //1.
  public Account(String accType,float accBal)
  {
  	accNo=series;
  	series++;
  	this.accType=accType;
  	this.accBal=accBal;
  	
  }
  
  //2.
  public void setAccNo(int accNo)
  {
  	this.accNo=accNo;
  }
  public void setAccType(String accType)
  {
  	this.accType=accType;
  }
  public void setAccBal(float accBal)
  {
  	this.accBal=accBal;
  }
  
  //3.
  public int getAccNo()
  {
  	return accNo;
  }
  public String getAccType()
  {
  	return accType;
  }
  public float getAccBal()
  {
  	return accBal;
  }
  
  //4.
  public String toString()
  {
  	return "Account Details are....."+accNo+"/"+accType+"/"+accBal;
  }
  
}
