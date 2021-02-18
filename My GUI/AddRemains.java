import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
class AddRemains extends JFrame{
	JLabel NoteRemains,R_nameLabel1,R_idLabel2,R_ageLabel3,R_genderLabel4,R_bloodLabel5,R_addressLabel6,R_occupationLabel7,R_birthdateLabel8,R_deathdateLabel9,R_causedeathLabel10,R_burialdateLabel11,R_graveLabel12,R_ownerLabel13;
    JTextField name,id,age,gender,blood,adress,occupation,birth,death,cause,burialdate,grave,owner;
	JButton addbutton,cancelbutton;
	
		
	
	
	
	public void renderScreen(){
		
		setTitle("Add Remains");
		
		NoteRemains=new JLabel("Add Remains:");
		NoteRemains.setBounds(75,0,300,100);
		
		R_nameLabel1 = new JLabel("Name :");
		R_idLabel2 = new JLabel("Id :");
		R_ageLabel3 = new JLabel("Age :");
		R_genderLabel4 = new JLabel("Gender :");
		R_bloodLabel5 = new JLabel("Blood Group :");
		R_addressLabel6 = new JLabel("Address :");
		R_occupationLabel7 = new JLabel("Occupation :");
		R_birthdateLabel8 = new JLabel("Birth Date :");
		R_deathdateLabel9 = new JLabel("Death Date :");
		R_causedeathLabel10 = new JLabel("Cause of Death :");
		R_burialdateLabel11 = new JLabel("Burial Date :");
		R_graveLabel12 = new JLabel("Grave Name :");
		R_ownerLabel13 =new JLabel("Owner Name :");
		
		
		R_nameLabel1.setBounds(75,105,110,25);
		//R_idLabel2.setBounds(75,135,110,25);
	    R_ageLabel3.setBounds(75,135,110,25);
		R_genderLabel4.setBounds(75,165,110,25);
		R_bloodLabel5.setBounds(75,195,110,25);
	    R_addressLabel6.setBounds(75,225,110,25);
		R_occupationLabel7.setBounds(75,255,110,25);
		R_birthdateLabel8.setBounds(335,105,110,25);
	    R_deathdateLabel9.setBounds(335,135,110,25);
		R_causedeathLabel10.setBounds(335,165,110,25);
		R_burialdateLabel11.setBounds(335,195,110,25);
	    R_graveLabel12.setBounds(335,255,110,25);
		R_ownerLabel13.setBounds(335,225,110,25);
		
		 
		 JComboBox oc=new JComboBox();  
		 
       
		 JComboBox gc=new JComboBox();  
		 
		 
		
		name = new JTextField();
		id = new JTextField();
		age = new JTextField();
		gender = new JTextField();
		blood = new JTextField();
		adress = new JTextField();
		occupation = new JTextField();
		birth = new JTextField();
		death = new JTextField();
		cause = new JTextField();
		burialdate = new JTextField();
		grave = new JTextField();
		owner = new JTextField();
		
	    
		name.setBounds(170,105,160,25);
		//id.setBounds(170,135,160,25);
		age.setBounds(170,135,160,25);
		gender.setBounds(170,165,160,25);
		blood.setBounds(170,195,160,25);
		adress.setBounds(170,225,160,25);
		occupation.setBounds(170,255,160,25);
		birth.setBounds(440,105,160,25);
		death.setBounds(440,135,160,25);
		cause.setBounds(440,165,160,25);
		burialdate.setBounds(440,195,160,25);
		grave.setBounds(440,255,160,25);
		owner.setBounds(440,225,160,25);
		
		addbutton = new JButton("Add");
		addbutton.setBounds(440,295,75,20);
		
		cancelbutton = new JButton("Cancel");
		cancelbutton.setBounds(530,295,75,20);
		
		
		
		
		
		
		

	
	 
	 
	 

		
		oc.setBounds(440,225,160,25);
		add(oc);
		gc.setBounds(440,255,160,25);
		add(gc);
		
		
		
		
		//Recieve Grave
		try{
			DataAccess da=new DataAccess();
			ResultSet rs =da.getData("select * from grave"); 
			while(rs.next()) {
			String result = rs.getString(2);
				if (result != null) {
					result = result.trim();
				}
				gc.addItem(result);
			} 
			rs.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
		//Recieve Owner
		try{
			DataAccess da=new DataAccess();
			ResultSet rs =da.getData("select * from owner"); 
			while(rs.next()) {
			String result = rs.getString(1);
				if (result != null) {
					result = result.trim();
				}
				oc.addItem(result);
			} 
			rs.close();
		}catch(Exception e){
			System.out.println(e);
		}
        





		
		add(NoteRemains);
		add(R_nameLabel1);
		//add(R_idLabel2);
		add(R_ageLabel3);
		add(R_genderLabel4);
		add(R_bloodLabel5);
		add(R_addressLabel6);
		add(R_occupationLabel7);
		add(R_birthdateLabel8);
		add(R_deathdateLabel9);
		add(R_causedeathLabel10);
		add(R_burialdateLabel11);
		add(R_graveLabel12);
		add(R_ownerLabel13);
		
		 
		
		add(name);
		//add(id);
		add(age);
		add(gender);
		add(blood);
		add(adress);
		add(occupation);
		add(birth);
		add(death);
		add(cause);
		add(burialdate);
		add(addbutton);
		add(cancelbutton);
		//add(grave);
		//add(owner);
		
		
		
		setSize(700,700);  
		setLayout(null);  
		setVisible(true);
		
		
		
		
		//Action Listener...................
		
		
		
				addbutton.addActionListener(new ActionListener(){
  
public void actionPerformed(ActionEvent ae){
	
	System.out.println("click");
	
	//get text............................
		
		String name_text=name.getText();
		//int id_text=id.getText();
		String age_text=age.getText();
		String gender_text=gender.getText();
		String blood_text=blood.getText();
		String adress_text=adress.getText();
		String occupation_text=occupation.getText();
		String birth_text=birth.getText();
		String deathdate_text=death.getText();
		String cause_text=cause.getText();
		String burial_text=burialdate.getText();
		String owner=oc.getSelectedItem().toString();
		String grave=gc.getSelectedItem().toString(); 
		
		System.out.println("owner="+owner+"grave ="+grave);
		
		
		
		
//Data Acess.........................
		 DataAccess da=new DataAccess();
        ResultSet rs=null;
     String q="INSERT INTO `remains` (`R_Name`, `R_Id`, `R_Age`, `R_Gender`, `R_BloodGroup`, `R_Adress`, `R_Occupation`, `R_BirthDate`, `R_DeathDate`, `R_CauseOfDeath`, `R_BurialDate`,`Owner`,`Grave`) VALUES ('"+name_text+"', NULL, '"+age_text+"', '"+gender_text+"', '"+blood_text+"', '"+adress_text+"', '"+occupation_text+"', '"+birth_text+"', '"+deathdate_text+"', '"+cause_text+"', '"+burial_text+"','"+owner+"','"+grave+"')";
        //rs=da.getData(q);                                                                                                                                                               ('"+val1+"','"+val2+"','"+val3+"','"+val4+"','"+val5+"','"+val6+"')");
		int i=da.updateDB(q);
		System.out.println(""+i);
		
		
		
		
	
		
}
				});
		
		
		
		
		
	
		
		
		
		
	
	

		
		
		
		}

	public static void main(String []args){
		
		   AddRemains AR = new AddRemains();
		   AR.renderScreen();
		   AR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
	
		
		
		
		
		
	
		
		
		
		
		
		
	