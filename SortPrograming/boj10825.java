package SortPrograming;

import java.util.*;
import java.io.*;
import java.sql.Array;

public class boj10825 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s[][] = new String[N][4];
		
		for(int i=0; i<N; i++) {
			s[i] = br.readLine().split(" ");
		}
		//0 = 이름, 1 = 국, 2 = 영, 3 = 수 
		Arrays.sort(s, new Comparator<String []>() {

			@Override
			public int compare(String[] s1, String[] s2) {
				// TODO Auto-generated method stub
				if(Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])) {
					if(Integer.parseInt(s1[2]) == Integer.parseInt(s2[2])) {
						if(Integer.parseInt(s1[3]) == Integer.parseInt(s2[3])) {
							//증가하는대로 
							return s1[0].compareTo(s2[0]);
						}
						//감소하는대로 
						return Integer.compare(Integer.parseInt(s2[3]), Integer.parseInt(s1[3]));
					}
					return Integer.compare(Integer.parseInt(s1[2]), Integer.parseInt(s2[2]));
				}
				return Integer.compare(Integer.parseInt(s2[1]), Integer.parseInt(s1[1]));
			}
		});
		
		for(int i=0; i<N; i++) {
			System.out.println(s[i][0]);
		}
	}
}
