package hw6IfElseCondition01;


public class Voter {
	public static void main(String[] args) {
		int age = 30;
		if (age == 18) {
		System.out.println("I am a Voter");
	
		}else if (age < 18) {
		System.out.println("I am not a Voter");
		
		}else if (age > 18) {
		System.out.println("I am a Voter");
		
		}else {
		System.out.println("please enter a valid age");
		
		}
		
		}
}