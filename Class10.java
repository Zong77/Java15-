package Java15;

class CTest1510 implements Runnable {
	private String id;

	public CTest1510(String str) {
		id = str;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep((int) (2000 * Math.random()));
			} catch (InterruptedException e) {
			}
			System.out.println(id + " " + i);
		}

	}
}

public class Class10 {

	public static void main(String[] args) {
		CTest1510 hi = new CTest1510("Hello");
		CTest1510 bye = new CTest1510("Good bye");
		CTest1510 morning = new CTest1510("Good morning");
		CTest1510 night = new CTest1510("Good night");
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		Thread t3 = new Thread(morning);
		Thread t4 = new Thread(night);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}