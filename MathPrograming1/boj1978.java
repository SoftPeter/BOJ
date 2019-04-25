package MathPrograming1;

import java.util.Scanner;

public class boj1978 {
	public static boolean prime(int x) {
		if(x <= 1) {
			return false;
		} else if(x == 2) {
			return true;
		}
		for(int i=2; i*i<=x; i++) {
			if(x%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int cnt = 0;
		while(t-- > 0) {
			if(prime(sc.nextInt())) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
	}
}
