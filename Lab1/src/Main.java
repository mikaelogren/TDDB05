
public class Main {
	
	public static void main(String[] args) {
	
		Storage<BankAccount> aStorage = new Storage<BankAccount>();
		Storage<String> sStorage = new Storage<String>();
		
	
		Class<BankAccount> baCls = BankAccount.class;
		
		try {
		BankAccount myAccount =  baCls.newInstance();
		aStorage.setValue( myAccount );
		// Deposit
		myAccount.deposit( 15 );
		}
		
		catch ( InstantiationException e ) {
		}
		catch ( IllegalAccessException e ) {
		} 
		
		//Do a simple output

		System.out.println( aStorage.getValue().showSaldo() );
		
		// Now try to compare
		if( aStorage.getClass() == sStorage.getClass() ) {
			System.out.println( "EQUAL" );
		} else {
			System.out.println( "NOT EQUAL" );
		}
		DataCarrier dc = new DataCarrier(1,1,1,1,1,"Hello");
		System.out.println(dc.getValue());
		
		dc.setState(1, 0, 1, 0, 1);
		dc.setValue("State two");
		System.out.println(dc.getValue());
		dc.setState(1, 1, 1, 1, 1);
		System.out.println(dc.getValue());
	 }
	
}
