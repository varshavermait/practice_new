package Service;

import java.util.ArrayList;
import java.util.List;

import Model.PaymentGraph;
import Model.UserExpMap;


// exp_tbl
// id, grpId, userId, some details about expense 
public class ExpenseService {

	public ExpenseService() {
		
	}
	
	public List<UserExpMap> getGroupExpenses(int grpId) {
		// connect db and get from expenses_tbl --> all expenses for this group
		// we need to join user_tbl and group table the get all info
		return new ArrayList<UserExpMap>();
	}
	
	public PaymentGraph getPaymentGraph(int grpId) {
		// connect db and get from expenses_tbl --> all expenses for this group
		// we need to join user_tbl and group table the get all info
		return new ArrayList<UserExpMap>();
	}
}
