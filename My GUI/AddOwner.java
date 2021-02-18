//Add Owner
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;

class AddOwner extends JFrame{
	JLabel NoteOwner,oNameLabel1,oIdLabel2,oAgeLabel3,oGgenderLabel4,oAddressLabel5,oOccupationLabel6,oEmailLabel7,oGraveLabel8;
    JTextField name,id,age,gender,adress,occupation,email,grave;
	JButton addbutton,cancelbutton;
	
		
	
	
	
	public void renderScreen(){
		
		setTitle("AddOwner");
		
		
		NoteOwner=new JLabel("Add Owner:");
		NoteOwner.setBounds(75,0,300,100);
	
	//Create Label
		oNameLabel1 = new JLabel("Name :");
		oIdLabel2 = new JLabel("Id :");
		oAgeLabel3 = new JLabel("Age :");
		oGgenderLabel4 = new JLabel("Gender :");
		oAddressLabel5 = new JLabel("Address :");
		oOccupationLabel6 = new JLabel("Occupation :");
		oEmailLabel7  = new JLabel("Email:");
		oGraveLabel8 = new JLabel("Grave");
		
	//Label SetBounds	
		oNameLabel1.setBounds(75,105,110,25);
		//oIdLabel2.setBounds(75,135,110,25);
	    oAgeLabel3.setBounds(75,135,110,25);
		oGgenderLabel4.setBounds(75,165,110,25);
		oAddressLabel5.setBounds(75,195,110,25);
	    oOccupationLabel6.setBounds(75,225,110,25);
		oEmailLabel7.setBounds(75,255,110,25);
		oGraveLabel8.setBounds(75,285,110,25);
	   
		 //String ownerComb[]={"Naser Ahmed","Shaker Jabed","Huzzat Samin","Debasis Dastidar","Abdullah Bin Shiraj","Adi Chowdhury","Abidur Rahman","Ishtiaq Mohammed","Neaz Mohammed","Kazid Nur Mohammed","Rafiuzzaman Ponir","Al Amin Shakil"};        
		 //JComboBox oc=new JComboBox(ownerComb);  
		 
	//Comb
		 
		 String graveComb[]={"A1","A2","A3","A4","A5","B1","B2","B3","B4","B5","C1","C2",
		 "C3","C4","C5","D1","D2","D3","D4","D5"};        
		 JComboBox gc=new JComboBox(graveComb);  
		 
		 
	//Create Text Field	 
		name = new JTextField();
		id = new JTextField();
		age = new JTextField();
		gender = new JTextField();
		adress = new JTextField();
		occupation = new JTextField();
		email = new JTextField();
		grave = new JTextField();
		
		
	//Text Field SetBounds	
		name.setBounds(170,105,170,25);
		//id.setBounds(170,135,170,25);
		age.setBounds(170,135,170,25);
		gender.setBounds(170,165,170,25);
		adress.setBounds(170,195,170,25);
		occupation.setBounds(170,225,170,25);
		email.setBounds(170,255,170,25);
		grave.setBounds(170,285,170,25);
		
	
	//Add Buttons
		addbutton = new JButton("Add");
		addbutton.setBounds(170,325,80,20);
		
		cancelbutton = new JButton("Cancel");
		cancelbutton.setBounds(260,325,80,20);
		
		gc.setBounds(170,285,170,25);
		add(gc);
		
		
	//Add Components
		add(NoteOwner);
		add(oNameLabel1);
		add(oIdLabel2);
		add(oAgeLabel3);
		add(oGgenderLabel4);
		add(oAddressLabel5);
		add(oOccupationLabel6);
		add(oEmailLabel7);
		add(oGraveLabel8);
		
		
		 
		
		add(name);
		add(id);
		add(age);
		add(gender);
		add(adress);
		add(occupation);
		add(email);
		add(addbutton);
		add(cancelbutton);
		
		
		setSize(700,700);  
		setLayout(null);  
		setVisible(true);
		
		
		
		//Action Listener...................................
		
		
   addbutton.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){
	
	System.out.println("click");

	
//get text.............................................
	
	    String name_text=name.getText();
		String age_text=age.getText();
		String gender_text=gender.getText();
	    String adress_text=adress.getText();
		String occupation_text=occupation.getText();
		String email_text=email.getText();
		
		
//Data Acess.........................
		
		DataAccess da=new DataAccess();
        ResultSet rs=null;
		String q="INSERT INTO `owner` (`O_Name`,`O_Age`, `O_Gender`, `O_Adress`, `O_Occupation`, `O_Email`) VALUES ('"+name_text+"','"+age_text+"', '"+gender_text+"', '"+gender_text+"', '"+occupation_text+"', '"+email_text+"')";
		System.out.println(q);
    
	//String q="INSERT INTO `remains` (`R_Name`, `R_Id`, `R_Age`, `R_Gender`, `R_BloodGroup`, `R_Adress`, `R_OccupatioVALUES ('"+name_text+"', NULL, '"+age_text+"', '"+gender_text+"', '"+blood_text+"', '"+adress_text+"', '"+occupation_text+"', '"+birth_text+"', '"+deathdate_text+"', '"+cause_text+"', '"+burial_text+"')";
        //rs=da.getData(q);                                                                                                                                                               ('"+val1+"','"+val2+"','"+val3+"','"+val4+"','"+val5+"','"+val6+"')");
		
		int i=da.updateDB(q);
		System.out.println(""+i);
		
		
		}
				});
		
		
		
		
		}

	public static void main(String []args){
		
		   AddOwner AO= new  AddOwner();
		   AO.renderScreen();
		   AO.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
	
		
		
		
		
		
	
		
		
		
		
		
		
	

