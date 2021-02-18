import javax.swing.*;
import javax.swing.JTable; 
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
class OwnerData extends JFrame{
	
	JTable table; 
	JLabel welcomeNote;
	
	
	
	public void renderScreen(){
	   
		setTitle("Owner Datatable");
		
		String[] columnNames = { "Name","Age","Gender", "Address","Occupation","Email"}; 
		DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);   
		table = new JTable(); 
		table.setModel(model);
        table.setBounds(30, 80, 200, 300);
		try{
			DataAccess da=new DataAccess();
			ResultSet rs =da.getData("select * from owner"); 
			while(rs.next()) {
				String ownerName = rs.getString(1);
				String ownerAge = rs.getString(3);
				String ownerGender = rs.getString(4);
				String ownerAddress = rs.getString(5);
				String ownerOccupation = rs.getString(6);
				String ownerEmail = rs.getString(7);
				
				if (ownerName != null) {
					ownerName = ownerName.trim();
				}
				if (ownerAge != null) {
					ownerAge = ownerAge.trim();
				}
				if (ownerGender != null) {
					ownerGender = ownerGender.trim();
				}
				if (ownerAddress != null) {
					ownerAddress = ownerAddress.trim();
				}
				if ( ownerOccupation != null) {
					 ownerOccupation =  ownerOccupation.trim();
				}
				if (ownerEmail != null) {
					ownerEmail = ownerEmail.trim();
				}
				Object[] row = { ownerName,ownerAge,ownerGender,ownerAddress,ownerOccupation,ownerEmail};
				DefaultTableModel model1 = (DefaultTableModel) table.getModel();
				model1.addRow(row);
			} 
			rs.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		
	    JScrollPane sp = new JScrollPane(table); 
        add(sp);		
        // Frame Size 
        setSize(700,700); 
        // Frame Visible = true 
        setVisible(true); 
		
		
		
	}

	public static void main(String []args){
		
		OwnerData od= new OwnerData();
		   od.renderScreen();
		   od.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}