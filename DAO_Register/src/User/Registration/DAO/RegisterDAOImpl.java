package User.Registration.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import User.Registration.Basic.RegisterInit;
import User.Registration.Constants.DAOConnect;
import User.Registration.Constants.DAOConst;

public class RegisterDAOImpl implements RegisterDAO{
public boolean Insertion(RegisterInit e)
{
	Connection con=null;
	PreparedStatement pst=null;
	boolean b=false;
	try {
	con=DAOConnect.getConnection(DAOConst.DRIVER, DAOConst.URL, DAOConst.UNAME,DAOConst.PWD);
	pst=con.prepareStatement("insert into details(name,roll) values (?,?)");
	pst.setString(1,e.getName());
	pst.setInt(2,e.getRoll());
	int r=pst.executeUpdate();
	con.close();
	if(r>0)
		b=true;
	else
		b=false;
	}
	catch (Exception e1) {
	if(con!=null)
	{
		try {
			con.close();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}

return b;
}
}
