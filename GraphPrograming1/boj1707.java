package GraphPrograming1;

import java.util.*;

public class boj1707 {
	static ArrayList<Integer> a[];
	static int color[];
	private static void dfs(int x, int c) {
		color[x] = c;
		for(int y: a[x]) {
			if(color[y] == 0) {
				dfs(y, 3-c);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			a = (ArrayList<Integer>[]) new ArrayList[n+1];
			for(int i=1; i<=n; i++) {
				a[i] = new ArrayList<Integer>();
			}
			for(int i=0; i<m; i++) {
				int u = sc.nextInt();
				int v = sc.nextInt();
				a[u].add(v);
				a[v].add(u);
			}
			color = new int[n+1];
			boolean ok = true;
			for(int i=1; i<=n; i++) {
				if(color[i] == 0) {
					dfs(i, 1);
				}
			}
			
			for(int i=1; i<=n; i++) {
				for(int j: a[i]) {
					if(color[j] == color[i]) {
						ok = false;
					}
				}
			}
			
			if(ok) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
