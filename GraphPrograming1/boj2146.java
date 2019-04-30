package GraphPrograming1;

import java.util.*;

class Map{
	int x;
	int y;
	Map(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class boj2146 {
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		int d[][] = new int[n][n];
		int g[][] = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int cnt = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i][j] == 1 && g[i][j] == 0) {
					Queue<Map> q = new LinkedList<Map>();
					g[i][j] = ++cnt;
					q.add(new Map(i, j));
					while(!q.isEmpty()) {
						Map m = q.remove();
						int x = m.x;
						int y = m.y;
						for(int k=0; k<dx.length; k++) {
							int nx = x + dx[k];
							int ny = y + dy[k];
							if(0<=nx && nx<n && 0<=ny && ny<n) {
								if(a[nx][ny] == 1 && g[nx][ny] == 0) {
									q.add(new Map(nx, ny));
									g[nx][ny] = cnt;
								}
							}
						}
					}
				}
			}
		}
		Queue<Map> q = new LinkedList<Map>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				d[i][j] = -1;
				if(a[i][j] == 1) {
					q.add(new Map(i, j));
					d[i][j] = 0;
				}
			}
		}
		
		while(!q.isEmpty()) {
			Map m = q.remove();
			int x = m.x;
			int y = m.y;
			for(int k=0; k<dx.length; k++) {
				int nx = x+dx[k];
				int ny = y+dy[k];
				if(0<=nx && nx<n && 0<=ny && ny<n) {
					if(d[nx][ny] == -1) {
						d[nx][ny] = d[x][y] + 1;
						g[nx][ny] = g[x][y];
						q.add(new Map(nx, ny));
					}
				}
			}
		}
		int ans = -1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<dx.length; k++) {
					int x = i+dx[k];
					int y = j+dy[k];
					if(0<=x && x<n && 0<=y && y<n) {
						if(g[i][j] != g[x][y]) {
							if(ans == -1 || ans > d[i][j] + d[x][y]) {
								ans = d[i][j] + d[x][y];
							}
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
