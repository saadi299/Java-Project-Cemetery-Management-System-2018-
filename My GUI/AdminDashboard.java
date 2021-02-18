import javax.swing.*;
import java.awt.event.*;    
class AdminDashboard extends JFrame {

	//JButton addOWner, viewOwner, addGrave, viewGrave, addRemain , viewRemain, search;
	JMenuBar bar;
	JMenu grave, owner, remain , search;
	JMenuItem addOWner, viewOwner, addGrave, viewGrave, addRemain , viewRemain, searchItem;
	public void renderScreen(){
	   
		setTitle("Dashboard");
		bar=new JMenuBar();    
		grave=new JMenu("Grave");
		owner=new JMenu("Owner");
		remain=new JMenu("Remain");
		search=new JMenu("Search");		
		
		addOWner = new JMenuItem("Add owner");
		viewOwner = new JMenuItem("View owner");
		addGrave = new JMenuItem("Add Grave");
		viewGrave = new JMenuItem("View Grave");
		addRemain = new JMenuItem("Add Remain");
		viewRemain = new JMenuItem("View Remain");
		searchItem = new JMenuItem("Search");
		
		grave.add(addGrave);
		grave.add(viewGrave);
		
		owner.add(addOWner);
		owner.add(viewOwner);
		
		remain.add(addRemain);
		remain.add(viewRemain);
		
		search.add(searchItem);
		
		bar.add(grave);
		bar.add(remain);
		bar.add(owner);
		bar.add(search);
		
		setJMenuBar(bar);
		
		/*
		addOWner.setBounds(150,105,110,25);
		viewOwner.setBounds(150,135,110,25);
		addGrave.setBounds(150,105,110,25);
		viewGrave .setBounds(150,135,110,25);
		addRemain.setBounds(150,105,110,25);
		viewOwner.setBounds(150,135,110,25);
		
		add(addOWner);
		add(viewOwner);
		add(addGrave);
		add(viewGrave);
		add(addRemain);
		add(viewRemain);
		add(search);*/
		
		
		addGrave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
					Grave AO= new Grave();
					AO.renderScreen();
			}
		});
		viewGrave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
					GraveData AO= new  GraveData();
					AO.renderScreen();
			}
		});
		
		
		
		addOWner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
					AddOwner AO= new  AddOwner();
					AO.renderScreen();
			}
		});
		viewOwner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
					OwnerData AO= new  OwnerData();
					AO.renderScreen();
			}
		});
		addRemain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
					AddRemains AO= new  AddRemains();
					AO.renderScreen();
			}
		});
		viewRemain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
					RemainsData AO= new  RemainsData();
					AO.renderScreen();
			}
		});
		
		searchItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
					Search AO= new Search();
					AO.renderScreen();
			}
		});
        setSize(500,500); 
        // Frame Visible = true 
        setVisible(true); 
		
		
		
	}
	public static void main(String []args){
		
		AdminDashboard rd= new AdminDashboard();
		   rd.renderScreen();
		   rd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}