import java.util.Scanner;
public class boj2446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//n = 5
		//별표 개수: 9, 7, 5, 3, 1
		//빈칸 개수: 0, 1, 2, 3, 4
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=n-1; k>i-1; k--) {
				System.out.print("*");
			}
			for(int k=n-3; k>i-2; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//빈칸 개수: 3, 2, 1, 0
		//별표 개수: 3, 5, 7, 9
		for(int i=n+1; i<n*2; i++) {
			for(int j=n*2-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=n; k<i+1; k++) {
				System.out.print("*");
			}
			for(int k=n+1; k<i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
