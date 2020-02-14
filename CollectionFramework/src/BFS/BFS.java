package BFS;

import java.util.Iterator;
import java.util.LinkedList;

// ���� ����Ʈ�� �̿��� ���⼺ �ִ� �׷��� Ŭ����
class Graph {
	private int V; // ����� ����
	private LinkedList<Integer> adj[]; // ���� ����Ʈ
	
	// ������
	Graph(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i) { // ���� ����Ʈ �ʱ�ȭ
			adj[i] = new LinkedList();
		}
	}

	// ��带 ���� v->w
	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	// s�� ���� ���� �� BFS�� Ž���ϸ鼭 Ž���� ������ ���
	void BFS(int s) {
		// ����� �湮 ���� �Ǵ� (�ʱⰪ : false)
		boolean visited[] = new boolean[V];
		
		// BFS ������ ���� ť(Queue) ����
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// ���� ��带 �湮�� ������ ǥ���ϰ� ť�� ����(enqueue)
		visited[s] = true;
		queue.add(s);

		// ť(Queue)�� �� ������ �ݺ�
		while (queue.size() != 0) {
			// �湮�� ���带 ť���� ����(dequeue)�ϰ� ���� ���
			s = queue.poll();
			System.out.print(s + " ");

			// �湮�� ���� ������ ��� ��带 �����´�.
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();

				// �湮���� ���� ���� �湮�� ������ ǥ���ϰ� ť�� ����(enqueue)
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
}

public class BFS {
	public static void main(String[] args) {
		System.out.println("Start");
		Graph g = new Graph(4);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		
		g.BFS(2);	// �־��� ��带 ���� ���� BFS Ž��
		
	}
}
