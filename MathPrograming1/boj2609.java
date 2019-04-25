package MathPrograming1;

import java.util.Scanner;

public class boj2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = 1;
		int min = 1;
		for(int i=1; i<=Math.min(a, b); i++) {
			if(a%i == 0 && b%i == 0) {
				max = i;
			}
		}
		min = (a/max) * (b/max) * max;
		System.out.println(max);
		System.out.println(min);
	}
}
