import java.util.*;
public class boj2522 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(" ");
			}
			for(int k=n-i-1; k>0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
