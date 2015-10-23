
public class Illuminachi {
public static void main(String[] args) {
	int a = 1;
	int b = 1;
	

	for (int i = 0; i < 12; i++) {
		System.out.println(a);
		int whatever = b;
		b = a + b;
		a = whatever;
	}
}
}