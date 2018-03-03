
public class FixedDeposit {
	
	/**
	Learning global and class variables
	Learning method with Void and return type
	Calling method and setting class value
	**/
	
	String name = "";  // Global variable declaration
	int amount = 1000;
	static int total = 0; // Class variable declaration
	
	// method return type is void
	public void setName(String name) {
		this.name = name;
	}
	
	// method return type is a integer
	public int getAmount(){
		return this.amount;
	}
	
	// method return type is a integer
	public int displayTotalFixedDeposit(){
		return total;
	}

	public static void main(String[] args) {
		
		// Created 3 Object of type FixedDeposit Class
		FixedDeposit fd1 = new FixedDeposit();
		FixedDeposit fd2 = new FixedDeposit();
		FixedDeposit fd3 = new FixedDeposit();
		
		fd1.setName("Subha"); // Calling a method name using . operator
		fd1.amount = 2000; // setting global values using . operator
		fd1.total++; //Incrementing the static variable
		
		fd2.setName("Kajol");
		fd2.amount = 3000;
		fd2.total++;
		
		fd3.setName("Pinki Apa");
		fd3.amount = 5000;
		fd3.total++;
		
		// Fetching class values using varable and method
		System.out.println(fd1.name + ":- " + fd1.getAmount());
		System.out.println(fd2.name + ":- " + fd2.getAmount());
		System.out.println(fd3.name + ":- " + fd3.getAmount());
		
		// Displaying class variable output
		System.out.println("Total Fixed Deposit: " + fd1.displayTotalFixedDeposit());;

	}

	
}
