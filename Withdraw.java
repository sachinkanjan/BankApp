package banking;

import java.io.IOException;

class Withdraw implements Runnable{
    int amount;
    Account acc;
    public Withdraw(Account acc, int amount)
    {
        this.acc = acc;
        this.amount = amount;
        new Thread(this).start();
    }
    
    public void run() {
        try {
			acc.withdraw(amount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}