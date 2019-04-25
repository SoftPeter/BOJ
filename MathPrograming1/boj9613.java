package MathPrograming1;

import java.util.Scanner;

public class boj9613 {
	public static int gcd(int a, int b) {
		if(b ==0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int d[] = new int[n];
			
			for(int i=0; i<n; i++) {
				d[i] = sc.nextInt();
			}
			
			long ans = 0;
			for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					ans += gcd(d[i], d[j]);
				}
			}
			System.out.println(ans);
		}
	}
}
