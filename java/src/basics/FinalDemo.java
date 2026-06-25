package basics;

	final class Spec {

	    void displaySpecs() {
	        System.out.println("Minimum RAM Requirement: 8 GB");
	    }
	}
	
	class Computer3 {

	    final String OS = "Windows 11";

	    final void displayOS() {
	        System.out.println("Operating System: " + OS);
	    }
	}
	
	/*
	class Laptop extends Computer {

	    void displayOS() {   // error: Cannot override final method
	        System.out.println("Windows 11");
	    }
	}

	class GamingComputer extends Spec {
	    // error: Cannot inherit from final class
	}
	*/
	public class FinalDemo {

	public static void main(String[] args) {
		
        Computer3 comp = new Computer3();

        comp.displayOS();

        System.out.println("final var: "+ comp.OS);
        // computer.OS = "Linux"; error: Cannot modify final var

	}

}
