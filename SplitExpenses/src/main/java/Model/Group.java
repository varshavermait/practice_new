package Model;

import java.util.List;

public class Group {
	private int id;
	// there will be image, name etc. Ignoring for now
	private List<Integer> users; // list of int because it will be used for cache so let's have min info
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Integer> getUsers() {
		return users;
	}
	public void setUsers(List<Integer> users) {
		this.users = users;
	}
}
