package designpatterns.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffieneBaverage {
	
	@Override
	public void brew() {
		System.out.println("Adding coffee");
	}

	@Override
	public void addCondeminent() {
		System.out.println("Adding sugar and milk");
		
	}

	@Override
	public boolean customerWantsCondeminent() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String ans = null;
		try {
			System.out.println("Do you want to add mild and sugar?");
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