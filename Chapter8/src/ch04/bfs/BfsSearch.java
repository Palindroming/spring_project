package ch04.bfs;

import java.util.ArrayList;

import ch04.graph.UndirectedGraph;

public class BfsSearch {
	
	
	int count;
	boolean[] visited;
	ArrayList<Integer> queue;
	int[][] matrix;
	
	public BfsSearch(int count) {
		
		this.count = count;
		visited = new boolean[count];
		queue = new ArrayList<Integer>();
		
	}
	
	public void bfsTraversal() {
		
		queue.add(0);
		visited[0] = true;
		
		while(queue.size() != 0 ) {
			int node = queue.remove(0);
			
			System.out.print(node + " ");
			
			for(int j = 0; j<count; j++) {
				if(matrix[node][j]!= 0 && !visited[j]) {
					queue.add(j);
					visited[j] = true;
					
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int count = 8;
		UndirectedGraph graph = new UndirectedGraph(count);
		BfsSearch bfs = new BfsSearch(count);
		
		graph.addEdge(0, 1, 1);
		graph.addEdge(0, 2, 1);
		graph.addEdge(1, 3, 1);
		graph.addEdge(2, 5, 1);
		graph.addEdge(2, 6, 1);
		graph.addEdge(4, 5, 1);
		graph.addEdge(3, 7, 1);
		
		bfs.matrix = graph.getmatrix();
		bfs.bfsTraversal();

	}

}
