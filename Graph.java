package test;

public class Graph {
	//default values for boolean is false no need to initialize here 
	private boolean adjMatrix[][];
	private int totalVertex;
	
	public Graph(int totalVertex){
		this.totalVertex = totalVertex;
		adjMatrix = new boolean [totalVertex][totalVertex];
	}
	
	//adding an edge
	public void addEdge(int u, int v){
		//making sure u & v is greater/equal to 0 & less than total vertex
		if(u >= 0 && u < totalVertex && v >= 0 && v < totalVertex){
			adjMatrix[u][v] = true;
			adjMatrix[v][u] = true;
		}
	}
	
	//print adjacency matrix 
	public void printMatrix(){
		for(int i = 0; i < totalVertex; i++){
			for(int j = 0; j < totalVertex; j++){
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//returns the number of connections/popularity a node has
	public int numofPopularity(int celebrity){
		int count = 0;
		for(int i = 0; i < totalVertex; i++){
			if(adjMatrix[celebrity][i] == true){
				count++;
			}
		}
		return count;
	}
	
}
