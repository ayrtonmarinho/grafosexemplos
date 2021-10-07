package grafos.solution01;

import java.util.ArrayList;
import java.util.List;

public class Node {

	int value;
	List<Node> neighbors;

	public Node(int value) {
		this.value = value;
		neighbors = new ArrayList<>();
	}
	
	public void addEdge(Node to) {
		neighbors.add(to);
	}
}
