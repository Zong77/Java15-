package Java15;

import java.io.*;

class Sort {
	public void bubbleSort(double data[]) {
		int i, j;
		boolean flag = true;
		double temp;

		for (i = 1; (i < data.length) && (flag == true); i++) {
			flag = false;
			for (j = 0; j < (data.length - i); j++)
				if (data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
					flag = true;
				}
		}
	}

	public void quickSort(double data[], int left, int right) {
		if (left < right) {
			int pivot = partition(data, left, right);
			quickSort(data, left, pivot - 1);
			quickSort(data, pivot + 1, right);
		} else
			return;
	}

//(a)
	public int partition(double data[], int left, int right) {
		int i = left + 1, j = right;
		double temp;
		while (true) {
			while (data[i] <= data[left] && i <= right && i < data.length - 1)
				i++;
			while (data[j] > data[left])
				j--;
			if (i < j) {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			} else
				break;
		}
		temp = data[left];
		data[left] = data[j];
		data[j] = temp;
		return j;
	}

	public void show(double data[]) {
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i] + " ");
		System.out.println();
	}
}

public class Class15 {

	public static void main(String[] args) throws IOException {
		double a[] = { 2.14, 7.148, 0.236, 5.98568, 3.012 };
		double b[] = { 2.14, 7.148, 0.236, 5.98568, 3.012 };
		Sort obj1 = new Sort();
		obj1.show(a);
		obj1.bubbleSort(a);
		obj1.show(a);
		obj1.show(b);
		obj1.quickSort(b, 0, (b.length - 1));
		obj1.show(b);

		FileWriter fw1 = new FileWriter("C:\\Users\\Qi\\課程\\大二上學期\\物件導向程式設計\\ch15\\ch15\\qsort.txt");
		FileWriter fw2 = new FileWriter("C:\\Users\\Qi\\課程\\大二上學期\\物件導向程式設計\\ch15\\ch15\\bsort.txt");
		BufferedWriter bw1 = new BufferedWriter(fw1);
		BufferedWriter bw2 = new BufferedWriter(fw2);
		for (int i = 0; i < 100000; i++) {
			String str = Double.toString(Math.random() * 10000.);
			bw1.write(str);
			bw1.newLine();
			bw2.write(str);
			bw2.newLine();
//(b)
		}
		bw1.flush();
		bw2.flush();
		fw1.close();
		fw2.close();

		FileWriter fw3 = new FileWriter("C:\\Users\\Qi\\課程\\大二上學期\\物件導向程式設計\\ch15\\ch15\\qsort.txt");
		FileWriter fw4 = new FileWriter("C:\\Users\\Qi\\課程\\大二上學期\\物件導向程式設計\\ch15\\ch15\\bsort.txt");
		FileReader fr1 = new FileReader("C:\\Users\\Qi\\課程\\大二上學期\\物件導向程式設計\\ch15\\ch15\\qsort.txt");
		FileReader fr2 = new FileReader("C:\\Users\\Qi\\課程\\大二上學期\\物件導向程式設計\\ch15\\ch15\\bsort.txt");
		BufferedWriter bw3 = new BufferedWriter(fw3);
		BufferedWriter bw4 = new BufferedWriter(fw4);
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		int i = 0;
		double c[] = new double[100000];
		double d[] = new double[100000];
		String str;
		while ((str = br1.readLine()) != null) {
			c[i] = Double.parseDouble(str);
			i++;
		}
		fr1.close();
		obj1.quickSort(c, 0, (c.length - 1));
		for (i = 0; i < c.length; i++) {
			bw3.write(Double.toString(c[i]));
			bw3.newLine();
		}
		bw3.flush();
		fw3.close();

		i = 0;
		while ((str = br2.readLine()) != null) {
			d[i] = Double.parseDouble(str);
			i++;
		}
		fr2.close();
		obj1.bubbleSort(d);
		for (i = 0; i < d.length; i++) {
			bw4.write(Double.toString(d[i]));
			bw4.newLine();
		}
		bw4.flush();
		fw4.close();
	}
}
//(c)