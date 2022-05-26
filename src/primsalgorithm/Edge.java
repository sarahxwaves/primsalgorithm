/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primsalgorithm;

/**
 *
 * @author Sarah
 */
public class Edge {
	
	public char vertex1,vertex2;
	public int weight = 0;
	
	public Edge(char vertex1, char vertex2, int weight)
	{
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
		this.weight = weight;	
		
	}

}
