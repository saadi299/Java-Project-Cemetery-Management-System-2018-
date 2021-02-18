import java.sql.ResultSet;
import java.sql.SQLException;
public class DBTest{
    public static void main(String[] args)throws SQLException{
        // TODO code application logic here
        DataAccess da=new DataAccess();
        ResultSet rs=null;
       // String q="select * from employee";
		String q="INSERT INTO `employee` (`E_Name`, `E_Id`, `E_Age`, `E_Job`, `E_Adress`, `E_Gender`, `E_Phone`, `E_Salary`) VALUES ('Ishtiaq', NULL, '20', 'Manager', 'nikunja', 'Male', '01670421822', '20000')";
        //rs=da.getData(q);
		int i=da.updateDB(q);
		System.out.println(i+"row updated");
        /*while(rs.next()){
            String name = rs.getString("E_Name");
			String age = rs.getString("E_Age");
			
			//float cg = rs.getFloat("cgpa");
			System.out.println(name+" with "+age);
        }
		*/
        //da.close();
    }
}