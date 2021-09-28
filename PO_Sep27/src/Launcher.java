
public class Launcher {
	
	public static void switchNums(int numOne, int numTwo) {
		System.out.println("#1 initially: " + numOne + " &" + " #2 initially: " + numTwo);
		numOne = numOne + numTwo;
		numTwo = numOne - numTwo;
		numOne = numOne - numTwo;
		System.out.println("#1 after: " + numOne + " &" + " #2 after: " + numTwo);

	}

	public static void main(String[] args) {
		switchNums(4,5);
		switchNums(10,20);
	}

}
