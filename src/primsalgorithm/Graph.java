/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primsalgorithm;

import primsalgorithm.Edge;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	public static List<Character> vertices;
	public static List<Edge> edges;
	
	public Graph(List<Character> v, List<Edge> e){
		
		vertices = v;
		edges = e;		
	}
	
	public static int getWeight(char v1,char v2){
		
		for(Edge e : edges){
			if((e.vertex1 == v1 && e.vertex2 == v2)||(e.vertex2 == v1 && e.vertex1 == v2))
                            return e.weight;
                        
		}
                 
		return 0; // retorna zero para os vertices que nao estao conectados
	}
	
	public static Edge getMinimumWeightEdge(List<Character> v1, List<Character> v2 ){
		
		Edge e;

		int min = Integer.MAX_VALUE; //valor infinito
		
		char vertex1 = 0, vertex2 = 0;
		
		for(Character visited : v1){
			
			for(Character nonVisted : v2){
				
				int temp = getWeight(visited, nonVisted);
				if(temp != 0){
					if(temp < min){
						min = temp; //armazena a menor aresta atual
						vertex1 = visited;
						vertex2 = nonVisted;
					}
				}
			}	
		}
		e = new Edge(vertex1, vertex2, min);
		return e;
	}
	
	public  List<Edge> Prims(){
		
		List<Edge> MintreeEdge = new ArrayList<>();
		
		List<Character> VisitedVertex = new ArrayList<Character>();
		List<Character> NonVisitedVertex = new ArrayList<>();
		NonVisitedVertex = vertices;        
		Character start = NonVisitedVertex.remove(0); // remove o vertice inicial porque ja foi visitado        
		VisitedVertex.add(start);  //adiciona o vertice na lista de visitados   
                
		while(!NonVisitedVertex.isEmpty()){ // enquanto houverem vertices nao visitados
			Edge temp = getMinimumWeightEdge(VisitedVertex, NonVisitedVertex);
			MintreeEdge.add(temp);	
			VisitedVertex.add(NonVisitedVertex.remove(NonVisitedVertex.indexOf(temp.vertex2)));			
		}		
		return MintreeEdge;
	}	
}
