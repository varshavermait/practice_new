package test;

import java.util.stream.Stream;

public class StreamsPractice {
	
	public Stream<Integer> getIntStream()
	{
		return Stream.iterate(0, i->i+2).limit(10);
	}
	
	public Stream<String> getStringStream() {
		return Stream.of("one", "two", "three", "four", "five", "six");
	}
	
	public Stream<User> getUserStream() {
		return Stream.of(new User(1, "Varsha", "Verma"),
				new User(2, "Ajinkya", "Bambal"),
				new User(3, "Aadvik", "Bambal"),
				new User(4, "Shilpa", "Verma"),
				new User(5, "Aditi", "Sherma"));
	}
	
	
	public static void main(String args[]) {
		System.out.println("Java example");
		StreamsPractice sp = new StreamsPractice();
		System.out.println("******");
		// print all int number
		sp.getIntStream().forEach(n -> System.out.print(n+" "));
		
		System.out.println("******");
		sp.getIntStream().filter(n -> n<5).forEach(n -> System.out.print(n+" "));
		System.out.println("******");
		sp.getIntStream().filter(n -> n>5).skip(1).limit(2).forEach(n -> System.out.print(n+" "));
		System.out.println("******");
		System.out.print(sp.getIntStream().filter(n -> n>5).findFirst().orElse(-1));
		System.out.println("******");
		sp.getUserStream().forEach(user -> System.out.print(user.getfName()+" "));
		System.out.println("******");
		
		
		sp.getUserStream()
		.filter(user -> sp.getIntStream().anyMatch(n -> n == user.getId()))
		.forEach(user -> System.out.print(user.getfName()+" "));
		System.out.println("******");
		
		sp.getIntStream().flatMap(n -> sp.getUserStream().filter(u -> u.getId() == n))
		.forEach(user -> System.out.print(user.getfName()+" "));
		System.out.println("******");
	}
	
	
	
	
}

