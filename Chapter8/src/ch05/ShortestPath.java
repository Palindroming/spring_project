package ch05;




class MyGraph {
	
	private int count;
	private int [][] vertexMatrix;
	private int[] distance;
	private boolean[] visited;
	private static int UNLIMIT = 99999;
	
	
	public MyGraph(int count) {
		this.count = count;
		vertexMatrix = new int [count][count];
		distance = new int[count];
		visited = new boolean[count];
	}
	
	public void addEdges(int from, int to, int weight) {
		
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	}
	
	
	public void calcShortestPath(int from) {
		
		for(int i = 0; i<count; i++){
			distance[i] = UNLIMIT;
		}
		visited[from] = true;
		distance[from]= 0;
		
		for(int i = 0; i<count; i++) {
			if(visited[from] && vertexMatrix[from][i] != 0) {
				distance[i] = vertexMatrix[from][i];
			}
		}
		
		for (int k = 0; k<count-1; k++) {
			int min = UNLIMIT;
			int minindex = -1;
			
			for(int i = 0; i<count; i++) {
				if(!visited[i]&& distance[i]!=UNLIMIT) {
					if(distance[i]<min) {
						min = distance[i];
						minindex = i;
					}
				}
			}
			
			visited[minindex] = true;
			for(int i = 0; i<count; i++) {
				if(!visited[i]&& vertexMatrix[minindex][i] != 0) {
					if(distance[i]>distance[minindex]+vertexMatrix[minindex][i]) {
						distance[i] = distance[minindex]+vertexMatrix[minindex][i];
					}
				}
			}
			
			
		}
	}
	
	public void ShowDistance(int from) {
		
		for(int i = 0 ; i<count; i++) {
			System.out.println("the shortest distance from "+from + "node to"+ i +"is "+ distance[i]);
		}
	}
}



public class ShortestPath {

	public static void main(String[] args) {
	
		MyGraph graph = new MyGraph(6);
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 4);
		graph.addEdges(1, 2, 2);
		graph.addEdges(2, 3, 1);
		graph.addEdges(3, 4, 8);
		graph.addEdges(3, 5, 3);
		graph.addEdges(4, 5, 4);
		
		
		graph.calcShortestPath(0);
		graph.ShowDistance(0);

	}

}
