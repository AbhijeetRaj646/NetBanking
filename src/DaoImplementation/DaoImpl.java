package DaoImplementation; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.dao.DaoInterface;


import conn.bean.Account;
import conn.erviceprovider.DatabaseConnectionProvider;

public class DaoImpl implements DaoInterface{
	Connection con=DatabaseConnectionProvider.getDBConnection();

	

	@Override
	public void insertData(Account acc) {
		// TODO Auto-generated method stub
try {
			
			PreparedStatement pst=con.prepareStatement("Insert into account values(?,?,?)");
			pst.setInt(1,acc.getAccNo());
			pst.setString(2,acc.getAccType());
			pst.setFloat(3,acc.getAccBal());
			
			System.out.println("Data Inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
