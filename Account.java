package banking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable{
    public int balance;
    public int accountNo;
    
    public Account() {}
    public Account(int balance) {
    	this.balance=balance;
    
    	
    }
    
//    public class Statement implements Serializable {
//    	public int balance;
//    	public Statement(int balance) {
//    		this.balance=balance;
//    		}
//    	try {
//    	FileOutputStream fos = new FileOutputStream("stmt.txt");
//    	ObjectOutputStream oos = new ObjectOutputStream(fos);
//    	oos.writeObject(e);
//    	oos.close();
//    	fos.close();
//    }
//    	catch(Exception e1) {
//    		
//    	}
    void displayStatement() throws IOException, ClassNotFoundException {
    	FileInputStream fin = new FileInputStream("stmt.txt");
     	ObjectInputStream oin = new ObjectInputStream(fin);
     	//oos.writeObject(a);
     	Account c = (Account)oin.readObject();
     	System.out.println(c.balance);
     	oin.close();
     	fin.close();
        
    }

    void displayBalance() {
        System.out.println("Account NO :"+accountNo+" Balance: "+balance);
    }
    synchronized void deposit(int amount) throws IOException {

        balance = balance + amount;
        Account a = new Account(amount);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+amount + " is deposited!!!!!!!!!!!!!!!!!!!!!!!!!");
        //displayBalance();
        FileOutputStream fos = new FileOutputStream("stmt.txt");
    	ObjectOutputStream oos = new ObjectOutputStream(fos);
    	oos.writeObject(a);
    	oos.close();
    	fos.close();
    }
    synchronized void withdraw(int amount) throws IOException {
        balance = balance - amount;
        Account b = new Account(amount);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+amount + " is withdrawn!!!!!!!!!!!!!!!!!!!!!!!!!");
        //displayBalance();
        FileOutputStream fos = new FileOutputStream("stmt.txt");
    	ObjectOutputStream oos = new ObjectOutputStream(fos);
    	oos.writeObject(b);
    	oos.close();
    	fos.close();
    }
}