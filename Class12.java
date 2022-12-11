package Java15;

class CTest1512 implements Runnable {
	private String id;

	public CTest1512(String str) {
		id = str;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep((int) (100 * Math.random()));
			} catch (InterruptedException e) {
			}
			System.out.println(id + " " + i);
		}

	}
}

public class Class12 {

	public static void main(String[] args) {
		CTest157 hi = new CTest157("Hello");
		CTest157 bye = new CTest157("Good bye");
		CTest157 morning = new CTest157("Good morning");
		CTest157 night = new CTest157("Good night");
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		Thread t3 = new Thread(morning);
		Thread t4 = new Thread(night);
		try {
			t1.join();
			t3.start();
			t3.join();
			t4.start();
			t4.join();
			t2.start();
			t2.join();
		} catch (InterruptedException e) {
		}
		System.out.println("All Threads are finished");
	}
}