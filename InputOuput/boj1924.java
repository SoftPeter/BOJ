import java.util.*;
public class boj1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int td = d;
		for(int i=0; i<m-1 ; i++) {
			td += month[i];
		}
		System.out.println(day[td%7]);
	}
}
