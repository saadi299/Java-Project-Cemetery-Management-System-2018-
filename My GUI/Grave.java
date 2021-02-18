import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;

class Grave extends JFrame{
	JLabel graveNote,idLabel1,blockLabel2,statusLabel3;
    JTextField id,block,status;
	JButton addbutton,cancelbutton;
		
	
	
	
	public void renderScreen(){
		
		setTitle("Owner Datatable");
		
		
		graveNote=new JLabel("Grave Info:");
		graveNote.setBounds(75,0,300,100);
		
		idLabel1 = new JLabel("Id :");
		blockLabel2 = new JLabel("Block :");
		statusLabel3 = new JLabel("Status :");
		
		
		//idLabel1.setBounds(75,105,110,25);
		blockLabel2.setBounds(75,105,110,25);
	    statusLabel3.setBounds(75,135,110,25);
		
		id = new JTextField();
		block = new JTextField();
		status = new JTextField();
		
	
		//id.setBounds(150,105,170,25);
		block.setBounds(150,105,170,25);
		status.setBounds(150,135,170,25);
		
		addbutton = new JButton("Add");
		addbutton.setBounds(150,180,80,20);
		
		cancelbutton = new JButton("Cancel");
		cancelbutton.setBounds(240,180,80,20);
		
		add(blockLabel2);
		//add(idLabel1);
		add(statusLabel3);
		add(addbutton);
		add(cancelbutton);
		add(graveNote);
		//add(id);
		add(block);
		add(status);
		setSize(600,600);  
		setLayout(null);  
		setVisible(true);
		
		
		
		
		//Action Listener...................................
		
		
   addbutton.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){
	
	System.out.println("click");
		
	//get text.............................................
	
	    String block_text=block.getText();
		String status_text=status.getText();
		
		//Data Acess.........................
		
		DataAccess da=new DataAccess();
        ResultSet rs=null;
		String q="INSERT INTO `grave` (`G_Id`, `G_BlockName`, `G_status`) VALUES (NULL, '"+block_text+"', '"+status_text+"')";
		
    
	//String q="INSERT INTO `remains` (`R_Name`, `R_Id`, `R_Age`, `R_Gender`, `R_BloodGroup`, `R_Adress`, `R_OccupatioVALUES ('"+name_text+"', NULL, '"+age_text+"', '"+gender_text+"', '"+blood_text+"', '"+adress_text+"', '"+occupation_text+"', '"+birth_text+"', '"+deathdate_text+"', '"+cause_text+"', '"+burial_text+"')";
        //rs=da.getData(q);                                                                                                                                                               ('"+val1+"','"+val2+"','"+val3+"','"+val4+"','"+val5+"','"+val6+"')");
		
		int i=da.updateDB(q);
		System.out.println(""+i);
		
		
		}
				});
		
		
		
		
		}

	public static void main(String []args){
		
		   Grave g = new Grave();
		   g.renderScreen();
		   g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}