package designpatterns.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffieneBaverage{

	@Override
	public void brew() {
		System.out.println("Adding tea");
	}

	@Override
	public void addCondeminent() {
		System.out.println("Adding lemon");
		
	}

	@Override
	public boolean customerWantsCondeminent() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String ans = null;
		try {
			System.out.println("Do you want to add lemon?");
			ans = bf.readLine();
			if(ans.equalsIgnoreCase("yes")) return true;
			else return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
