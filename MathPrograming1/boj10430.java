package MathPrograming1;

import java.util.Scanner;

public class boj10430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int ans1 = (A+B)%C;
		int ans2 = (A%C + B%C)%C;
		int ans3 = (A*B)%C;
		int ans4 = (A%C * B%C)%C;
		//첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
		
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);

	}
}
