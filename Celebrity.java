/*Natthinee Chanlon 07570488
Nanthawan Jantrasri 07570509
Nattavut Yaemkesorn 07570494
Pimpika Ketpeng 07570527
Auckawit Sornniyom 07580482*/

import java.util.*;
import java.io.*;
import java.text.*;

public class Celebrity {
	public static void main(String[] args) {

		File file = new File("D:\\new Text Document.txt");
		String[] array = new String[10000];
		String[] part = new String[10000];
		String temp;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			int index = 0;
			String line;

			while ((line = br.readLine()) != null) {
				array[index++] = line;

			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int N = 0;
		for (int x = 0; x <= 0; x++) {
			N = Integer.valueOf(array[x]);
			// /System.out.println(h);
		}
		int yy;
		String Str;
		String part1[] = new String[N];
		String part2[] = new String[N];
		int[] jj = new int[N];
		int[][] numceleb = new int[N + 1][N];
		for (int x = 0; x <= N; x++) {
			part[x] = array[x];
			System.out.print(part[x]);
			System.out.println();
		}
		for (int x = 1; x <= N; x++) {
			part[x] = array[x];

			Str = new String(part[x]);
			String[] parts = Str.split(" ");
			for (int i = 0; i < N; i++) {
				part1[i] = parts[i];
				// / System.out.print(part1[i]);
			}
			// System.out.println();

			String[] partss = Str.split(" ");

			for (int i = 0; i < N; i++) {
				jj[i] = Integer.valueOf(part1[i]);
				// /System.out.println(jj[i]);
			}

			for (int i = 0; i < N; i++) {

				numceleb[x][i] = jj[i];
				// System.out.print(arr[i][x]+" ");
				// System.out.print(">"+jj[i]);
			}
			// System.out.println();

		}

		int count1[] = new int[N];
		int count2 = 0;
		int count11 = 0;
		int celeb = 0;
		int c = 0;
		int c1 = 0;
		int kub[] = new int[N];
		for (int i = 1; i < N + 1; i++) {
			for (int j = 0; j < N; j++) {
				///System.out.print(numceleb[i][j]);
				if (numceleb[i][j] == 0) {
					count1[i - 1]++;
					celeb = i;
				}
				count2++;

			}

			if (N == count1[i - 1]) {
				c = i;
			}

		}

		for (int i = 1; i < N + 1; i++) {

			for (int j = 0; j < N; j++) {
				if (c == j + 1) {
					kub[i - 1] = numceleb[i][j];
				///	System.out.println(kub[i - 1]);

				}

				// /System.out.println();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (kub[i] == 1) {
					count11++;
				}
			}
		}
	//	System.out.println(count11);
		if (count11 >= N - 1 && c != 0) {
			System.out.println(c);
		} else {
			System.out.println(-1);
		}

		// System.out.println(count11);

		{
			// /System.out.print(count1[i]);

		}

	}

	/*
	 * for(int i=1;i<=h;i++){ for(int j=0;j<h;j++){ ///
	 * System.out.print(arr[i][j]); } System.out.println(); }
	 */

}
