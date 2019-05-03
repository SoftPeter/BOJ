package JMB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class DICTIONARY {
	static int t, n;
	static boolean[] visited;
	static boolean[] finished;
	static boolean iscycle;
	static Stack<Character> stack;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		t = Integer.parseInt(br.readLine());
		for(int q=1; q<=t; q++) {
			int n = Integer.parseInt(br.readLine());
			String[] str = new String[n];
			int[][] adj = new int[26][26];
			visited = new boolean[26];
			finished = new boolean[26];
			
			stack = new Stack<>();
			iscycle = false;
			
			for(int i=0; i<n; i++) {
				str[i] = br.readLine();
			}
			
			makeadj(adj, str);
			
			for(int i=0; i<26; i++) {
				if(!finished[i])
					dfs(i, adj);
			}
			
			if(iscycle)
				System.out.print("INVALID HYPOTHESIS");
			else
				while(!stack.isEmpty())
					System.out.print(stack.pop());
			System.out.println();
		}
	}
	
	private static void dfs(int v, int[][] adj) {
		visited[v] = true;
		for(int i=0; i<26; i++) {
			if(adj[v][i] == 1) {
				if(!visited[i])
					dfs(i, adj);
				else if(!finished[i])
					iscycle = true;
			}
		}
		finished[v] = true;
		stack.push((char)(v+'a'));
	}
	
	private static void makeadj(int[][] adj, String[] str) {
		int l = str.length;
		for(int i=0; i<l-1; i++) {
			int wl = Math.min(str[i].length(), str[i+1].length());
			for(int j=0; j<wl; j++) {
				if(str[i].charAt(j) != str[i+1].charAt(j)) {
					adj[str[i].charAt(j) - 'a'][str[i+1].charAt(j) - 'a'] = 1;
					break;
				}
			}
		}
	}
}