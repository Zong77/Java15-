package Java15;

class CTest155 extends Thread {
	private String id;

	public CTest155(String str) {
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

public class Class05 {

	public static void main(String[] args) {
		CTest155 hi = new CTest155("Hello");
		CTest155 bye = new CTest155("Good morning");
		CTest155 morning = new CTest155("Good morning");
		CTest155 night = new CTest155("Good night");
		hi.start();
		bye.start();
		morning.start();
		night.start();
	}
}