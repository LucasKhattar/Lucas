import javax.swing.JOptionPane;


public class RollerCoaster {
public static void main(String[] args) {
	String hight = JOptionPane.showInputDialog(null,"How Tall Er You? (In feet)");
	 int high = Integer.parseInt  (hight);
	 if(high <= 4){
		 JOptionPane.showMessageDialog(null, "Sorry Bub, Ter Small");
	 }
	 else{
		 JOptionPane.showMessageDialog(null, "Now Ger Ride It!");
	 }
}
}
