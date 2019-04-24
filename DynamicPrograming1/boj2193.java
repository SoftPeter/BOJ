package DynamicPrograming1;

import java.util.*;

public class boj2193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[][] = new int[91][3];
		
		d[1][1] = 1;
		d[1][0] = 0;
		for(int i=2; i<=n; i++) {
			d[i][0] = d[i-1][0] + d[i-1][1];
			d[i][1] = d[i-1][0];
		}
		System.out.println(d[n][0] + d[n][1]);
	}
}
