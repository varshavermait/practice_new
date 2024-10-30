package Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Model.Group;
import Model.PaymentGraph;
import Model.UserExpMap;

public class GroupService {
	private ExpenseService expService;
	private UserService userService;
	Map<Integer, Group> map;
	
	public GroupService(){
		
	}
	
	public GroupService(ExpenseService expService, UserService userService){
		this.expService = expService;
		this.userService = userService;
		map = new HashMap<Integer, Group>(); // this can be cached
	}
	
	public List<UserExpMap> getGroupExpenses(int grpId, int userId) 
	{
		if(map.get(grpId).getUsers().contains(userId))
		{
			return expService.getGroupExpenses(grpId);
		} else return null; // we need to retun Error;
	}
	
	public List<User>sumExpenses(List<UserExpMap> map) {
		for()
	}
	
	public PaymentGraph getPaymentGraph(int grpId, int userId) 
	{
		return expService.getPaymentGraph();
	}
}
