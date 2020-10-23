package banking;

import java.io.IOException;

class Deposit implements Runnable{
    int amount;
    Account acc;
    public Deposit(Account acc, int amount)
    {
        this.acc = acc;
        this.amount = amount;
        new Thread(this).start();
    }
    
    public void run() {
        try {
			acc.deposit(amount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}