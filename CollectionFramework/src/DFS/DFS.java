package DFS;

import java.util.Scanner;

class dfsGraph{
	private int V;				// ������ ����
	private int[][] graph; 		// �׷���
	private boolean[] visit; 	// �湮�� ����
	
	// �׷��� �ʱ�ȭ
	public dfsGraph(int V) {
		this.V = V;
		
		// �׷��� �ʱ�ȭ
		// put(int x, int y) ���� �ԷµǴ� ������ ���� 0 �̻��� ����
		// �迭�� index�� 0���� �����̹Ƿ�
		// ArrayIndexOutOfBoundsException ������ ����
		// ������ ��� ��������� ��� �� size�� 1�� ���Ͽ� �ʱ�ȭ ����
		this.graph = new int[this.V+1][this.V+1];
		
		// ���� �湮 ���� Ȯ�� �迭 �ʱ�ȭ
		// �׷����� ���������� ������ ������ +1�Ͽ� �ʱ�ȭ
		this.visit = new boolean[this.V+1];
	}
	
	// �׷��� return
	public int[][] getGraph() {
		return this.graph;
	}
	// �׷��� �߰�(�����)
	public void put(int x, int y) {
		//���� x �� y�� ����Ǿ����� �ǹ�
		this.graph[x][y] = this.graph[y][x] = 1;
	}
	
	// �׷��� �߰�(�ܹ���)
	public void putSingle(int x, int y) {
		this.graph[x][y] = 1;
	}
	
	// �׷��� ���(���� ���)
	public void printGraph() {
		for(int i=0; i<this.graph.length; i++) {
			for(int j=0; j<this.graph[i].length;j++) {
				System.out.print(" " + this.graph[i][j]);
			}
			System.out.println();
		}
	}
	
	// ���� �湮 ���� Ȯ�� �迭 �ʱ�ȭ
	public void clearVisitArr() {
		for(int i=0; i<this.visit.length;i++) {
			this.visit[i] = false;
		}
	}
	
	// �׷��� Ž��(���ȣ��)
	public void dfs(int visitIdx) {
		// dfs() �� ���� visitIdx�� �湮�� ���̹Ƿ�
		// �湮�迭�� �ش� index���� true�� �ٲ��ְ� ���� ���
		this.visit[visitIdx] = true;
		System.out.print(visitIdx + " ");
		
		// ���� ��ķ� ������ �׷������� ������ ����(V)��ŭ Ž��
		for(int i=1; i<=this.V;i++) {
			// graph[][]�� �ش� ������ ����Ǿ��ִ� ������ ǥ�õǾ� ������ (������ 1�� ǥ��)
			// �湮 �迭���� �湮���� ���� ����(false)�� ���
			if(graph[visitIdx][i] == 1 && visit[i] == false) {
				dfs(i);	// dfs() ���ȣ��
			}
		}
	}
}
public class DFS {
	public static void main(String[] args) {
		int V = 8;	// ������ ����
		int E = 10;	// ������ ����
		
		// �Է¹��� ������ ������ �׷��� �ʱ�ȭ
		dfsGraph graph = new dfsGraph(V);
		
		// ex) ���� 8, ���� 10
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
		
		// �Է��� ������ �������� ������ ������� ���
		graph.printGraph();
		
		// ���� ������� �׷��� Ž��
		System.out.println();
		System.out.print("���� 1���� Ž�� : ");
		graph.dfs(1);
		
		System.out.println();
		System.out.print("���� 2���� Ž�� : ");
		graph.clearVisitArr();
		graph.dfs(2);
		
		System.out.println();
		System.out.print("���� 3���� Ž�� : ");
		graph.clearVisitArr();
		graph.dfs(3);
		
		System.out.println();
		System.out.print("���� 4���� Ž�� : ");
		graph.clearVisitArr();
		graph.dfs(4);
		
		System.out.println();
		System.out.print("���� 5���� Ž�� : ");
		graph.clearVisitArr();
		graph.dfs(5);
		
		System.out.println();
		System.out.print("���� 6���� Ž�� : ");
		graph.clearVisitArr();
		graph.dfs(6);
		
		System.out.println();
		System.out.print("���� 7���� Ž�� : ");
		graph.clearVisitArr();
		graph.dfs(7);
		
		System.out.println();
		System.out.print("���� 8���� Ž�� : ");
		graph.clearVisitArr();
		graph.dfs(8);
		
		
	}
}
