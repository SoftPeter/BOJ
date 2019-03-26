import java.util.*;
public class boj11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine(); //개행문자를 입력받기 위해서 작성.
		String str = sc.nextLine();
		int result = 0;
		int i;
		for(i = 0; i < str.length(); i++) {
			result = result + str.charAt(i) - '0';
		}
		System.out.println(result);
	}
}
