package Java15;

class CTest1511 extends Thread implements Runnable {
	private String id;
	private int sec;

	public CTest1511(String str, int s) {
		id = str;
		sec = s;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				sleep(sec);
			} catch (InterruptedException e) {
			}
			System.out.println(id + " " + i);
		}
	}
}

public class Class11 {

	public static void main(String[] args) {
		CTest1511 hi = new CTest1511("Hello", 1000);
		CTest1511 bye = new CTest1511("Good bye", 2500);
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		hi.start();
		bye.start();
	}
}