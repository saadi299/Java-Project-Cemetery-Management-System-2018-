import javax.swing.*;
import javax.swing.JTable; 
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
class GraveData extends JFrame{
	
	JTable table; 
	JLabel welcomeNote;
	
	
	
	public void renderScreen(){
	   
		setTitle("Grave Datatable");
		
		String[] columnNames = { "Block","Status"};
		DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);   
		table = new JTable(); 
		table.setModel(model);
        table.setBounds(30,80,200,300);
		try{
			DataAccess da=new DataAccess();
			ResultSet rs =da.getData("select * from grave"); 
			while(rs.next()) {
				String graveName = rs.getString(2);
				String graveStatus= rs.getString(3);
				//String burialDate = rs.getString(11);
				//String ownerName = rs.getString(12);
				//String GraveName = rs.getString(13);
				if (graveName != null) {
					graveName = graveName.trim();
				}
				if (graveStatus != null) {
					graveStatus = graveStatus.trim();
				}
				//if (burialDate != null) {
					//burialDate = burialDate.trim();
				//}
				//if (GraveName != null) {
					//GraveName = GraveName.trim();
				//}
				//if (ownerName != null) {
					//ownerName = ownerName.trim();
				//}
				Object[] row = { graveName, graveStatus};
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
		
		GraveData gd= new GraveData();
		   gd.renderScreen();
		   gd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}*/

}