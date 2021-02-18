import javax.swing.*;
import java.awt.event.*;
class Search extends JFrame{
	JLabel welcomeNote,nameL;
	JTextField nameT;
	
	JButton submitButton;
	
	public void renderScreen(){
		
		
		
		
		nameL = new JLabel("Name");
		nameL.setBounds(75,105,110,25);
		
		
		nameT = new JTextField();
        nameT.setBounds(120,105,150,25);
		
		
		submitButton = new JButton("Submit");
		submitButton.setBounds(190,150,80,20);
		
		add(nameL);
		add(submitButton);
		add(nameT);
		
		setSize(400,400);  
		setLayout(null);  
		setVisible(true);
		
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				    String name = nameT.getText();
					System.out.println(name);
					RemainSearch r = new RemainSearch();
					r.renderScreen(name);
			}
		});
		
		
		
	}

	public static void main(String []args){
		
		  Search s = new Search();
		   s.renderScreen();
		   s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}