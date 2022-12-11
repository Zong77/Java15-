package Java15;

class CPrime extends Thread {
	private String id;
	private long start;
	private long end;
	public long count = 0;

	public CPrime(String str, long a, long b) {
		id = str;
		if (a >= 2)
			start = a;
		else
			start = 2L;
		end = b;
	}

	public synchronized void prime() {
		for (long m = start; m <= end; m++)
			for (long n = 2L; n <= m; n++) {
				if (m % n == 0 && n != m)
					break;
				else if (n == m)
					count++;
			}
	}

	public void run() {
		prime();
		System.out.println(id + " ªº½è¼Æ¦³ " + count + " ­Ó");
	}
}

public class Class16 {

	public static void main(String[] args) {
		CPrime p1 = new CPrime("2~100000", 2, 100000);
		CPrime p2 = new CPrime("100000~200000", 100000, 200000);
		p1.start();
		p2.start();
	}
}
//(a)2~100000
//(b)2~100000
