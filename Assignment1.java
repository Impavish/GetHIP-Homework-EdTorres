import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		//Check for PIN.
			Scanner input = new Scanner(System.in);
				int pin;
				double balance = 00.00;
				int choice;
				double moneychange;


				System.out.print("Please enter your pin:\n");
				pin = input.nextInt();
					if (pin == 7885){
					System.out.print("Welcome to HugeBank!");
							}	
							else while(pin != 7885) 
							{
								System.out.print("Invalid PIN! Please try again.\n");
								pin = input.nextInt();
							}	
		//At this point, the PIN has been verified and the user is now in the main section of the script.
			do{
			System.out.print("Your current balance is \n$" + balance);
			System.out.print("\nWhat would you like to do?\n1. Make a deposit\n2. Make a withdrawal\n3. Exit\nYour selection: ");
					choice = input.nextInt();
					if (choice == 1){
						//Deposit
						System.out.print("Please enter an amount to deposit: \n$");
							moneychange = input.nextDouble();
								balance = balance + moneychange;	
						System.out.print("Deposit successful!\n");
					}
					if (choice == 2){
						//Withdrawal
						System.out.print("Please enter an amount to withdraw: \n$");
							moneychange = input.nextDouble();
								if (moneychange <= balance){
									balance = balance - moneychange;
								System.out.print("Withdrawal successful!\n");
										   }
								else if (moneychange > balance);{ //Checks if the user has sufficient funds, prevents overdrafts
									System.out.print("You have insufficient funds.\n");
					}
				}
					if (choice > 3){ //Catches if the user has entered a choice greater than five.
						System.out.print("Unxecpected input.");
						continue;
			}
					 }while (choice < 3);
		}
	}


				
