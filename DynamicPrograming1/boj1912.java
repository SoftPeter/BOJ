package DynamicPrograming1;

import java.util.*;

public class boj1912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+1];
		int d[] = new int[n+1];
		int max;
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		d[0] = a[0];
		max = d[0];
		for(int i=1; i<n; i++) {
			d[i] = Math.max((d[i-1] + a[i]), d[i]);
			
			max = Math.max(max, d[i]);
		}
		
		System.out.println(max);
	}
}
