package num2606_dfs;

import java.util.Scanner;

class dfs {
	private int V;
	private int[][] graph;
	private boolean[] visit;
	int count = 0;

	public dfs(int V) {
		this.V = V;
		this.graph = new int[this.V + 1][this.V + 1];
		this.visit = new boolean[this.V + 1];
	}

	public void put(int x, int y) {
		this.graph[x][y] = this.graph[y][x] = 1;
	}

	public void DFS(int visitIndex) {
		this.visit[visitIndex] = true;
		
		for (int i = 1; i < this.V; i++) {
			if (graph[visitIndex][i] == 1 && visit[i] == false) {
				count++;
				DFS(i);
			}
		}
	}
}

public class num2606_dfs {
	public static void main(String[] args) {
		int computer;
		int edge;
		Scanner sc = new Scanner(System.in);

		computer = sc.nextInt();
		edge = sc.nextInt();

		dfs d = new dfs(computer+1);
		for (int i = 0; i < edge; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			d.put(x, y);
		}
		
		d.DFS(1);
		
		System.out.println("´ä >> " + d.count);
	}
}

