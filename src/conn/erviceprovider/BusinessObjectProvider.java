package conn.erviceprovider;
import java.io.FileInputStream;
import java.util.Properties;


import conn.serviceImpl.Accountoperation;

import conn.servicelayer.Acoounservices;

public class BusinessObjectProvider {
	
	public static Acoounservices provideObject()
	{
//		Acoounservices obj;
//		obj =new Accountoperation();
//		return obj;
		
		Acoounservices obj=null;
		FileInputStream fis=null;
		
		try
		{
			fis=new FileInputStream(".//Resources//info.properties");
			Properties p=new Properties();
			p.load(fis);
			
			String className=p.getProperty("businessClass");
			obj=(Acoounservices) Class.forName(className).newInstance();		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return obj;
		
		
	}
	

}
