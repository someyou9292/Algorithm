package DFS;

import java.util.Scanner;

class dfsGraph{
	private int V;				// 정점의 갯수
	private int[][] graph; 		// 그래프
	private boolean[] visit; 	// 방문한 정점
	
	// 그래프 초기화
	public dfsGraph(int V) {
		this.V = V;
		
		// 그래프 초기화
		// put(int x, int y) 에서 입력되는 정점의 값은 0 이상의 정수
		// 배열의 index는 0부터 시작이므로
		// ArrayIndexOutOfBoundsException 방지를 위해
		// 정점을 담는 인접행렬의 행과 열 size는 1을 더하여 초기화 해줌
		this.graph = new int[this.V+1][this.V+1];
		
		// 정점 방문 여부 확인 배열 초기화
		// 그래프와 마찬가지로 정점의 개수에 +1하여 초기화
		this.visit = new boolean[this.V+1];
	}
	
	// 그래프 return
	public int[][] getGraph() {
		return this.graph;
	}
	// 그래프 추가(양방향)
	public void put(int x, int y) {
		//정점 x 와 y가 연결되었음을 의미
		this.graph[x][y] = this.graph[y][x] = 1;
	}
	
	// 그래프 추가(단방향)
	public void putSingle(int x, int y) {
		this.graph[x][y] = 1;
	}
	
	// 그래프 출력(인접 행렬)
	public void printGraph() {
		for(int i=0; i<this.graph.length; i++) {
			for(int j=0; j<this.graph[i].length;j++) {
				System.out.print(" " + this.graph[i][j]);
			}
			System.out.println();
		}
	}
	
	// 정점 방문 여부 확인 배열 초기화
	public void clearVisitArr() {
		for(int i=0; i<this.visit.length;i++) {
			this.visit[i] = false;
		}
	}
	
	// 그래프 탐색(재귀호출)
	public void dfs(int visitIdx) {
		// dfs() 에 들어온 visitIdx는 방문한 것이므로
		// 방문배열의 해당 index값을 true로 바꿔주고 값을 출력
		this.visit[visitIdx] = true;
		System.out.print(visitIdx + " ");
		
		// 인접 행렬로 구현된 그래프에서 정점의 개수(V)만큼 탐색
		for(int i=1; i<=this.V;i++) {
			// graph[][]의 해당 정점이 연결되어있는 것으로 표시되어 있으나 (연결은 1로 표시)
			// 방문 배열에서 방문하지 않은 상태(false)인 경우
			if(graph[visitIdx][i] == 1 && visit[i] == false) {
				dfs(i);	// dfs() 재귀호출
			}
		}
	}
}
public class DFS {
	public static void main(String[] args) {
		int V = 8;	// 정점의 개수
		int E = 10;	// 간선의 개수
		
		// 입력받은 정점의 개수로 그래프 초기화
		dfsGraph graph = new dfsGraph(V);
		
		// ex) 정점 8, 간선 10
		graph.put(1, 2);
		graph.put(1, 3);
		graph.put(2, 4);
		graph.put(2, 5);
		graph.put(3, 6);
		graph.put(3, 7);
		graph.put(4, 8);
		graph.put(5, 8);
		graph.put(6, 8);
		graph.put(7, 8);
		
		// 입력한 정점과 간선으로 구성된 인접행렬 출력
		graph.printGraph();
		
		// 정점 순서대로 그래프 탐색
		System.out.println();
		System.out.print("정점 1부터 탐색 : ");
		graph.dfs(1);
		
		System.out.println();
		System.out.print("정점 2부터 탐색 : ");
		graph.clearVisitArr();
		graph.dfs(2);
		
		System.out.println();
		System.out.print("정점 3부터 탐색 : ");
		graph.clearVisitArr();
		graph.dfs(3);
		
		System.out.println();
		System.out.print("정점 4부터 탐색 : ");
		graph.clearVisitArr();
		graph.dfs(4);
		
		System.out.println();
		System.out.print("정점 5부터 탐색 : ");
		graph.clearVisitArr();
		graph.dfs(5);
		
		System.out.println();
		System.out.print("정점 6부터 탐색 : ");
		graph.clearVisitArr();
		graph.dfs(6);
		
		System.out.println();
		System.out.print("정점 7부터 탐색 : ");
		graph.clearVisitArr();
		graph.dfs(7);
		
		System.out.println();
		System.out.print("정점 8부터 탐색 : ");
		graph.clearVisitArr();
		graph.dfs(8);
		
		
	}
}
