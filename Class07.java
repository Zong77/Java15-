package Java15;

class CTest157 implements Runnable {
	private String id;

	public CTest157(String str) {
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

public class Class07 {

	public static void main(String[] args) {
		CTest157 hi = new CTest157("Hello");
		CTest157 bye = new CTest157("Good bye");
		CTest157 morning = new CTest157("Good morning");
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		Thread t3 = new Thread(morning);
		t1.start();
		t2.start();
		t3.start();
	}
}