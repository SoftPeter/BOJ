import java.util.Scanner;
public class boj10992 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//첫 줄
		for(int i=0; i<n-1; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		
		//중간 줄
		for(int i=1; i<n-1; i++) {
			for(int j=1; j<n-i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			//n=3, i=1 -> 빈칸 개수 : 1
			//n=4, i=1 -> 빈칸 개수 : 1
			//n=4, i=2 -> 빈칸 개수 : 3
			for(int k=0; k<i*2-1; k++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		//마지막 
		if(n != 1) {
			for(int i=0; i<n*2-1; i++) {
				System.out.print("*");
			}
		}
	}
}
