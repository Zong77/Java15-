package Java15;

class CTest153 extends Thread {
	private String id;

	public CTest153(String str) {
		id = str;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 100000000; j++)
				;
			System.out.println(id + " " + i);
		}
	}
}

public class Class03 {

	public static void main(String[] args) {
		CTest153 hi = new CTest153("Hello");
		CTest153 bye = new CTest153("Good bye");
		hi.start();
		bye.start();
	}
}