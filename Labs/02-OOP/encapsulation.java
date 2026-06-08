package Oops;

class account{
	private int balance=1000;
	
	public int getBalance(){         //public can be accessed anywhere within the whole package.
		return balance;
	}
	
	protected void deposit(int amount){
		if(amount>0) {               //protected can be accessed within the class and sub class.
			balance+=amount;
		}
	}
	
	private void audit() {
		System.out.println("Auditing...");    //private can be accessed only within the class  
	}
}

public class encapsulation {
    public static void main(String[] arg) {
    	 account a= new account();
    	 System.out.println("Balance:"+a.getBalance());
    	 a.deposit(5000);
    	 System.out.println("Balance:"+a.getBalance());
     }
}
