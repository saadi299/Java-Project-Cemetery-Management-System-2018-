//Admin

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Admin extends JFrame{
	//private 
	JMenuBar menubar;
	
	//private 
	JMenu addnewmember,entermeal,entercost,givenamount,show,logout;
//private

 JMenuItem itaddnewmember,itentermeal,it,itentercost,itgivenamount,itshowmealrate,itshowdetail,ilogout;

	//public Admin(){
		//super ("Menu");
		//Container con =getContentPane();
		
		con.setLayout( new FlowLayout()); 
	 JMenuBar menubar = new JMenuBar(); 	
	addnewmember= new JMenu("Add  Member");
		 itaddnewmember = new JMenuItem("Add a new member");
	
	//	itshowinfo = new JMenuItem("Show UserInfo");
	//	itupdate = new JMenuItem("Update Account");
	
		entermeal=new JMenu("  Enter Meal");
		itentermeal= new JMenuItem("Enter Meal");
		entercost =new JMenu("  Enter Cost");
		itentercost = new JMenuItem("Enter cost");		

		 //tnewaccount = new JMenuItem("Open");
		givenamount=new JMenu("Given Amount  ");
		itgivenamount = new JMenuItem("Enter Given Amount");
	
		show=new JMenu("Show");
		itshowmealrate =new JMenuItem("Show Meal Rate  ");
		itshowdetail =new JMenuItem("Show Detail ");
			

		logout= new JMenu("Logout");
		ilogout=new JMenuItem("Logout");

		con.add(menubar);
		menubar.add(addnewmember);
		addnewmember.add( itaddnewmember);
		
		 menubar.add(entermeal);
		 entermeal.add( itentermeal);
		 
		 menubar.add(entercost);
		entercost.add( itentercost);
		
		menubar.add(givenamount);
		 
	
		 
		givenamount.add( itgivenamount);
		 menubar.add(show);
		show.add( itshowmealrate);
		show.add( itshowdetail);
		
		menubar.add(logout);
		logout.add(ilogout);
		
		menubar.setVisible(true);
		
		/*InfoAction op=new InfoAction();
		itaddnewmember.addActionListener(op);
		itentermeal.addActionListener(new EntermealAction());
		itentercost.addActionListener(new CostAction());
		itgivenamount.addActionListener(new GivenAction());*/
		//itentermeal.addActionListener(new MealAction());
		/*itshowmealrate.addActionListener(new ShowMealRateAction());
		itshowdetail.addActionListener(new ShowDetailAction());*/
		//itdeleteAccount.addActionListener(new DeleteAction());
		//itupdate.addActionListener(new UpdateAction());
		//ilogout.addActionListener(new LogoutAction());
     
       
       
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
		   //class InfoAction implements ActionListener {
        //public void actionPerformed(ActionEvent e) {
		Information info =new Information();
		info.setVisible(true);

		
        }	
}

 //class EntermealAction implements ActionListener {
        //public void actionPerformed(ActionEvent e) {
	  //EnterMeal meal =new EnterMeal();
		
        }	
}

 //class CostAction implements ActionListener {
        //public void actionPerformed(ActionEvent e) {
		//Entercost cost  = new Entercost();
		
        }	
}



		   //class GivenAction implements ActionListener {
       // public void actionPerformed(ActionEvent e) {
	   //EnterGivenAmount amount= new EnterGivenAmount();
		
        }	
		}
						 

		//class ShowMealRateAction implements ActionListener {
        //public void actionPerformed(ActionEvent e) {
	   //ShowMealRate r = new ShowMealRate();
		}	
	}
	
	//class ShowDetailAction implements ActionListener {
        //public void actionPerformed(ActionEvent e) {
	//ShowDetail c = new ShowDetail();
		}	
	}
	 //class LogoutAction implements ActionListener {
        //public void actionPerformed(ActionEvent e) {
		
		
        }	
		}
	 

	  public static void main(String[] args){
		  
		Admin c1 =new Admin();
	}
}
