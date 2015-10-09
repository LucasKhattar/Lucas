import javax.swing.JOptionPane;


public class guessTheAnimal {
	public static void main(String[] args) {
	int i =  JOptionPane.showConfirmDialog(null, "does it have four legs?", "", JOptionPane.YES_NO_OPTION);
		if(i== 1){
		int ii = JOptionPane.showConfirmDialog(null, "Does it have two legs?","",
				JOptionPane.YES_NO_OPTION);}
if(i==1){
	int iii = JOptionPane.showConfirmDialog(null, "Does it live in water?","",
			JOptionPane.YES_NO_OPTION);
	if(i==0){
		int ii = JOptionPane.showConfirmDialog(null, "Does it have stripes?","",
				JOptionPane.YES_NO_OPTION);
	}
}
		}

}
