// Packages to import 
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 

public class JTableExamples { 
	// frame 
	JFrame f; 
	// Table 
	JTable jtblReqList; 

	// Constructor 
	JTableExamples() 
	{ 
		// Frame initiallization 
		f = new JFrame(); 

		// Frame Title 
		f.setTitle("JTable Example"); 
		String[][] data = null;
		
		
		
		
		
		
		
		try{
		DataAccess da=new DataAccess();
        ResultSet rs=null;
        String q="select * from employee";
        rs=da.getData(q);
		ResultSetMetaData md = rs.getMetaData();
        int columnCount = md.getColumnCount();
        Vector columns = new Vector(columnCount);
 
      //store column names
        for(int i=1; i<=columnCount; i++)
          columns.add(md.getColumnName(i));
         
      Vector data = new Vector();
      Vector row;
		
		
        while(rs.next()){
             //String name = rs.getString("E_Name");
			// String age = rs.getString("E_Age");
			 //String id = rs.getString("E_Id");
			
			 
          row = new Vector(columnCount);
             for(int i=1; i<=columnCount; i++)
             {
                 row.add(rs.getString(i));
             }
             data.add(row); 
			 
				 
    
			
        }
		jtblReqList  = new JTable(data, columns);
		}catch (Exception ex) {
                        } 
		
		
		
		

		// Data to be displayed in the JTable 
		/*String[][] data = { 
			{ "Kundan Kumar Jha", "4031", "CSE" }, 
			{ "Anand Jha", "6014", "IT" } 
		};
*/		

		// Column Names 
		
	} 

	// Driver method 
	public static void main(String[] args) 
	{ 
		new JTableExamples(); 
	} 
} 
