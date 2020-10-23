package banking;
import java.io.IOException;
import java.util.*;
public class BankApp {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account abc = new Account();
        
        abc.balance = 10000;
        abc.accountNo = 111;
//        Deposit de = new Deposit(abc, 500);
//        Withdraw wd = new Withdraw(abc, 900);
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	System.out.println("Welcome to BankApp");
        	System.out.println("1.Deposit\t 2.Withdraw\t 3.Statement\t 4.Balance\t 5.Exit");
        	
        	int op=sc.nextInt();
        	
        	if(op==1)
				try {
					{
						System.out.println("Enter the amount to be deposited");
						int damt=sc.nextInt();
						abc.deposit(damt);
						
						
						
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else if(op==2)
				try {
					{
						System.out.println("Enter the amount to be withdrawn");
						int wamt=sc.nextInt();
						abc.withdraw(wamt);
						
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else if(op==3) {
				abc.displayStatement();
        		
        	}
        	else if(op==4) {
        		abc.displayBalance();
        	}
        	else {
        		System.exit(0);
        	}
        }
       
        
    }
}
