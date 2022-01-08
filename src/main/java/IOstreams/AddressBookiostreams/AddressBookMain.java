package IOstreams.AddressBookiostreams;

import java.util.Scanner;

public class AddressBookMain {
	 public static Scanner scannerObject = new Scanner(System.in);

	    public static void main(String[] args) {

	        System.out.println("Address book main");
	        AddressBookDirectory addressBookDirectory = new AddressBookDirectory();
	        addressBookDirectory.operationDirectory();

	    }

}
