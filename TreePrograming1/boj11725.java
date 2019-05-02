package TreePrograming1;

import java.util.*;

public class boj11725 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a[] = (ArrayList<Integer> []) new ArrayList[n+1];
		
		for(int i=1; i<=n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<n-1; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			a[u].add(v);
			a[v].add(u);
		}
		
		boolean c[] = new boolean[n+1];
		int p[] = new int[n+1];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		c[1] = true;
		while(!q.isEmpty()) {
			int x = q.remove();
			for(int y : a[x]) {
				if(c[y] == false) {
					c[y] = true;
					p[y] = x;
					q.add(y);
				}
			}
		}
		
		for(int i=2; i<=n; i++) {
			System.out.println(p[i]);
		}
	}
}
