package Java15;

class CTest154 extends Thread {
	private String id;

	public CTest154(String str) {
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

public class Class04 {

	public static void main(String[] args) {
		CTest154 hi = new CTest154("Hello");
		CTest154 bye = new CTest154("Good morning");
		CTest154 morning = new CTest154("Good morning");
		hi.start();
		bye.start();
		morning.start();
	}
}