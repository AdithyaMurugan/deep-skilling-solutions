package BuilderPattern;

public class ComputerTest {
	 public static void main(String[] args) {
		 
	        Computer basicPC = new Computer.Builder()
	                .setCPU("Intel i3")
	                .setRAM("4GB")
	                .setStorage("500GB HDD")
	                .build();

	       
	        Computer gamingPC = new Computer.Builder()
	                .setCPU("AMD Ryzen 7")
	                .setRAM("16GB")
	                .setStorage("1TB SSD")
	                .setGraphicsCard("NVIDIA RTX 3060")
	                .setWiFi(true)
	                .setBluetooth(true)
	                .build();

	        
	        System.out.println("Basic PC: " + basicPC);
	        System.out.println("Gaming PC: " + gamingPC);
	    }
	}
