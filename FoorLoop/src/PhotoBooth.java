import javax.swing.JOptionPane;


public class PhotoBooth {
public static void main(String[] args) {
	String Age = JOptionPane.showInputDialog(null, "How old are you?");
	int Age2=Integer.parseInt(Age);
	if (Age2 >= 18){
		JOptionPane.showInputDialog(null, "Who do yo want to be for presedent?");
	}
	else{
		JOptionPane.showMessageDialog(null, "Too you punk! ¯\\_(ツ)_/¯ ");
	}
}
}
