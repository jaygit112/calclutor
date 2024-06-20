package calclutor;
import javax.swing.*;
public class cal {

	static void 	add(int a, int b) {
		System.out.println(a+b);
	} 
	
	static int 	add(int a, int b,int c) {
		return a+c+b;
	}
	static void 	div(float a, float b) {
		System.out.println(a/b);
	}
	static void 	div(int a, int b) {
		System.out.println(a/b);
	}
	static {
		add(10,3);
	}
	
	public static void main(String[] args) {
		//JOptionPane.showInputDialog(add(1,10,1));
		cal.div(111, 55);
	}

}
