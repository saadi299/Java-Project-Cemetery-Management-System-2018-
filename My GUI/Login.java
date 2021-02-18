import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet; 

class Login extends JFrame{
	JLabel welcomeNote,usernameLabel,passwordLabel;
	JTextField username;
	JPasswordField password;
	JButton loginButton;
	
	public void renderScreen(){
		
		
		welcomeNote=new JLabel("Welcome to cemetry management system");
		welcomeNote.setBounds(75,0,300,100);
		
		usernameLabel = new JLabel("Username");
		passwordLabel = new JLabel("Password");
		
		usernameLabel.setBounds(75,105,110,25);
		passwordLabel.setBounds(75,135,110,25);
		
		username = new JTextField();
		password = new JPasswordField();
	
		username.setBounds(150,105,110,25);
		password.setBounds(150,135,110,25);
		
		loginButton = new JButton("Login");
		loginButton.setBounds(180,170,80,20);
		add(passwordLabel);
		add(usernameLabel);
		add(loginButton);
		add(welcomeNote);
		add(username);
		add(password);
		setSize(400,400);  
		setLayout(null);  
		setVisible(true);
		
		
			loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				
				
				
				String user_name=username.getText();
				String user_pass=password.getText();
				
				System.out.println(""+user_name+"----"+user_pass);
				
				
				 DataAccess da=new DataAccess();
        ResultSet rs=null;
        String q="SELECT count(*) as Count FROM `login` WHERE `UserName`='"+user_name+"' AND `UserPassword`='"+user_pass+"'";
	     rs=da.getData(q);
		
		try{
        while(rs.next()){
            String c = rs.getString("Count");
			//if(count=='1')
			
			if(c.equals("0")){
				
				JOptionPane.showMessageDialog(null, "Wromg Username or Password");
				//System.out.println("Try again");
			}else{
				
				
				AdminDashboard rd= new AdminDashboard();
				rd.renderScreen();
				rd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
			
			
			System.out.println(""+c);
        }
		}catch (Exception ex) {
                        } 
		
        //da.close();
				
			
			
			}
		});
		
	}

	public static void main(String []args){
		
		   Login l = new Login();
		   l.renderScreen();
		   l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}