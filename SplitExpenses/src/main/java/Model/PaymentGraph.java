package Model;

import java.util.List;
import java.util.Map;

public class PaymentGraph {
	Map<User, List<UserExpMap>> graph;

	public Map<User, List<UserExpMap>> getGraph() {
		return graph;
	}

	public void setGraph(Map<User, List<UserExpMap>> graph) {
		this.graph = graph;
	}
	
	
}
