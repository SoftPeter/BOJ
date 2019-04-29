package GraphPrograming1;

import java.util.*;

public class boj2331 {
	static int c[] = new int[1000000];

	private static int pow(int x, int p) {
		int ans = 1;
		for(int i=0; i<p; i++) {
			ans = ans * x;
		}
		return ans;
	}
	private static int next(int a, int p) {
		int ans = 0;
		while(a > 0) {
			ans += pow(a%10, p);
			a /= 10;
		}
		return ans;
	}
	private static int length(int a, int p , int cnt) {
		if(c[a] != 0) {
			return c[a] - 1;
		}
		c[a] = cnt;
		int b = next(a, p);
		return length(b, p, cnt+1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int p = sc.nextInt();
		System.out.println(length(a, p, 1));
	}
}
