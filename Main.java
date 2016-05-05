package test;

public class Main {

	public static void main(String[] args) {
		int totalVertex = 9;
		Graph celebrityMatrix = new Graph(totalVertex);
		
		//relationships Taylor Swift
		for(int i=1;i<4;i++){
			celebrityMatrix.addEdge(0,i);
		}
		//relationships Kanye West
		celebrityMatrix.addEdge(1,0);
		celebrityMatrix.addEdge(1,3);
		celebrityMatrix.addEdge(1,8);
		
		//relationships Susan Wang
		celebrityMatrix.addEdge(2,0);
		celebrityMatrix.addEdge(2,3);
		celebrityMatrix.addEdge(2,7);
		celebrityMatrix.addEdge(2,8);
		
		//relationships Chuck Norris
		for(int i=0;i<9;i++){
			celebrityMatrix.addEdge(3,i);
		}
		
		//relationships Michelle Obama
		celebrityMatrix.addEdge(4,3);
		for(int i=5;i<8;i++){
			celebrityMatrix.addEdge(4,i);
		}
		
		//relationships Ellen Degeneres
		for(int i=3;i<5;i++){
			celebrityMatrix.addEdge(5,i);
		}
		celebrityMatrix.addEdge(5,6);
		
		//relationships Stephen Curry
		for(int i=3;i<6;i++){
			celebrityMatrix.addEdge(6,i);
		}

		//relationships Oprah
		for(int i=2;i<5;i++){
			celebrityMatrix.addEdge(7,i);
		}
		celebrityMatrix.addEdge(7,8);
		
		//relationships Leo Dicarpio
		for(int i=1;i<4;i++){
			celebrityMatrix.addEdge(8,i);
		}
		celebrityMatrix.addEdge(8,7);
		
		//printing Celebrity Matrix
		System.out.println("**Adjacency Celebrity Matrix:** ");
		celebrityMatrix.printMatrix();
		
		System.out.println("\n**Level of Popularity of Celebrities**");
		System.out.println("Taylor Swift: "+ celebrityMatrix.numofPopularity(0));
		System.out.println("Kanye West: "+ celebrityMatrix.numofPopularity(1));
		System.out.println("Susan Wang: "+ celebrityMatrix.numofPopularity(2));
		System.out.println("Chuck Norris: "+ celebrityMatrix.numofPopularity(3));
		System.out.println("Michelle Obama: "+ celebrityMatrix.numofPopularity(4));
		System.out.println("Ellen Degeneres: "+ celebrityMatrix.numofPopularity(5));
		System.out.println("Stephen Curry: "+ celebrityMatrix.numofPopularity(6));
		System.out.println("Oprah: "+ celebrityMatrix.numofPopularity(7));
		System.out.println("Leo Dicaprio: "+ celebrityMatrix.numofPopularity(8));
		
		System.out.println("\nDrumroll...The Most Popular Influential is?");
		int max =0;
		int celebrity = -1;
		for(int i = 0 ; i< totalVertex;i++){
			int popularity = celebrityMatrix.numofPopularity(i);
			if(popularity > max){
				max = popularity;
				celebrity = i;
			}
		}
		System.out.println(celebrity + ", Chuck Norris! -- which is the fourth celebrity in the matrix!");
	}

}
