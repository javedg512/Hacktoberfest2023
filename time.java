import java.util.*;
import javax.swing.JOptionPane;
public class time{
	public static void main(String args[]){
String menuData = "--: Time Converter:--\n";
		 menuData += "1. Seconds to Minutes\n" ;
		 menuData += "2. Minutes to Seconds\n" ;
		 menuData += "3. Minutes to Hours\n" ;
		 menuData += "4. Hours to Minutes \n" ;
		 menuData += "5. Seconds to Minutes and hours  \n" ;
		 menuData += "6. Minutes to Hours and Seconds \n" ;
		 menuData += "7. Exit";
		 
		 while(true){
			 
			 int choice = Integer.parseInt(JOptionPane.showInputDialog(menuData));
			 switch(choice){
				 case 1 : int Sec = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Second(s) "));
					 float result = Sec /60f;
					 JOptionPane.showMessageDialog(null,"total Minute(s) : "+result);
					 break;
				 case 2 : int Min = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Minute(s) "));
					 float result1 = Min * 60f;
					 JOptionPane.showMessageDialog(null,"total Second(s) : "+result1);
					 break;	 
				 case 3 :  Min = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Minute(s) "));
					  result1 = Min / 60f;
					 JOptionPane.showMessageDialog(null,"total Hour(s) : "+result1);
					 break;	 
				case 4 :  int Hour = Integer.parseInt(JOptionPane.showInputDialog("Enter number of hour(s) "));
					  result1 = Hour * 60f;
					 JOptionPane.showMessageDialog(null,"total Minute(s) : "+result1);
					 break;
				case 5 :  Sec = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Second(s) "));
					  result1 = Sec / 60f;
					 JOptionPane.showMessageDialog(null,"total Minute(s) : "+result1);
					  result = result1*60;
					 JOptionPane.showMessageDialog(null,"total Hour(s) : "+result);
					 break;	 
				case 6 :  Min = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Minute(s) "));
					  result1 = Min * 60f;
					 JOptionPane.showMessageDialog(null,"total Second(s) : "+result1);
					  result = result1*60;
					 JOptionPane.showMessageDialog(null,"total Hour(s) : "+result);
					 break;	 	 
					 
			 }if (choice == 7) System.exit(0);
  }
}
