package primsalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class PrimsAlgorithm {

	public static void main(String[] args) {
		
		List<Character> vertices = new ArrayList<>(Arrays.asList('A','B','C','D','E','F'));
		List<Edge> edges = new ArrayList<>();
		
		edges.add(new Edge('A','B',7));
		edges.add(new Edge('A','C',8));
		edges.add(new Edge('B','C',3));
		edges.add(new Edge('C','D',6));
		edges.add(new Edge('E','C',3));
        edges.add(new Edge('B','D',5));
		edges.add(new Edge('D','E',2));
		edges.add(new Edge('E','F',2));
                edges.add(new Edge('D','F',4));
                edges.add(new Edge('D','D',1)); //chamada recursiva
                edges.add(new Edge('F','D',6)); //mesmo caminho que D para E mas com peso maior
                                		

		
		Graph graph = new Graph(vertices, edges);
		
		List<Edge> MST = graph.Prims();
		
		for(Edge e : MST)
		{
			System.out.println(e.vertex1+" "+e.weight+" "+e.vertex2);
		}
	}

}