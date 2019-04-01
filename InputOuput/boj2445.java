import java.util.*;
public class boj2445 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//빈칸 :8 6 4 2
		//별표 :끝
		for(int i=0; i<n ; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			for(int k=0; k<(2*n)-(2*(i+1)); k++) {
				System.out.print(" ");
			}
			for(int q=0; q<i+1; q++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//빈칸 : 2 4 6 8
		for(int i=0; i<n-1; i++) {
			for(int j=n-i-1; j>0; j--) {
				System.out.print("*");
			}
			for(int k=0; k<2*(i+1); k++) {
				System.out.print(" ");
			}
			for(int q=n-i-1; q>0; q--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
