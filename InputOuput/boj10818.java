import java.util.Scanner;
public class boj10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//sc.nextLine();
		int[] num = new int[n];
		for(int i=0; i<n ; i++) {
			num[i] = sc.nextInt();
		}
		int max = num[0];
		int min = num[0];
		for(int i=0; i<n ; i++) {
			if(max < num[i]) {
				max = num[i];
			}
			if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.println(min + " " + max);
	}
}