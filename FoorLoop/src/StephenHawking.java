import java.io.IOException;

public class StephenHawking {

	public static void main(String[] args) {
		speak("hi");
	}
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }
}