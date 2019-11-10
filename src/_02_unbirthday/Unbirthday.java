package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	
	public static void main(String[] args) {
String bday = JOptionPane.showInputDialog(null,"Please enter your birthday (mm/dd)");
if (bday.equals("11/10")) {
JOptionPane.showMessageDialog(null,"Happy Birthday!");		
}
else {
JOptionPane.showMessageDialog(null,"Happy UNbirthday!");
}
}
}
