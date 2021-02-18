import javax.swing.*;
import javax.swing.JTable; 
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
class RemainSearch extends JFrame{
	
	JTable table; 
	JLabel welcomeNote;
	
	
	
	public void renderScreen(String name){
	   
		setTitle("Remain Search");
		
		String[] columnNames = { "Name","Death Date","Burial Date", "Owner Name","Grave Name"}; 
		DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);   
		table = new JTable(); 
		table.setModel(model);
        table.setBounds(30, 80, 200, 300);
		try{
			DataAccess da=new DataAccess();
			System.out.println("select * from remains where R_name like '%"+name+"%'");
			ResultSet rs =da.getData("select * from remains where R_name like '%"+name+"%'"); 
			while(rs.next()) {
				String remainName = rs.getString(1);
				String dateOfDeath = rs.getString(9);
				String burialDate = rs.getString(11);
				String ownerName = rs.getString(12);
				String GraveName = rs.getString(13);
				if (remainName != null) {
					remainName = remainName.trim();
				}
				if (dateOfDeath != null) {
					dateOfDeath = dateOfDeath.trim();
				}
				if (burialDate != null) {
					burialDate = burialDate.trim();
				}
				if (GraveName != null) {
					GraveName = GraveName.trim();
				}
				if (ownerName != null) {
					ownerName = ownerName.trim();
				}
				Object[] row = { remainName, dateOfDeath, burialDate, ownerName, GraveName};
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

	/*public static void main(String []args){
		
		RemainsData rd= new RemainsData();
		   rd.renderScreen();
		   rd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}*/

}