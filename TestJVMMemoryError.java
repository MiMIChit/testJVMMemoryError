package java_basics;

public class TestJVMMemoryError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
	}
	public static void display() {
		System.out.println("Hello");
		display();
	}
}
