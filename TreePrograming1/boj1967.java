package TreePrograming1;

import java.util.*;

class Node{
	int to;
	int cost;
	Node(int to, int cost){
		this.to = to;
		this.cost = cost;
	}
}
public class boj1967 {
	private static int[] bfs(int n, List<Node>a[], int start) {
		boolean c[] = new boolean[n+1];
		int dist[] = new int[n+1];
		Queue<Integer> q = new LinkedList<Integer>();
		c[start] = true;
		q.add(start);
		while(!q.isEmpty()) {
			int x = q.remove();
			for(Node e : a[x]) {
				int y = e.to;
				int cost = e.cost;
				if(c[y] == false) {
					c[y] = true;
					dist[y] = dist[x] + cost;
					q.add(y);
				}
			}
		}
		return dist;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Node> a[] = (List<Node>[]) new List[n+1];
		for(int i=0; i<=n; i++) {
			a[i] = new ArrayList<>();
		}
		for(int i=0; i<n-1; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			a[u].add(new Node(v,w));
			a[v].add(new Node(u,w));
		}
		
		int dist[] = bfs(n,a,1);
		int start = 1;
		for(int i=2; i<=n; i++) {
			if(dist[i] > dist[start]) {
				start = i;
			}
		}
		
		dist = bfs(n,a,start);
		int ans = dist[1];
		for(int i=2; i<=n; i++) {
			if(ans < dist[i]) {
				ans = dist[i];
			}
		}
		System.out.println(ans);
	}
}
