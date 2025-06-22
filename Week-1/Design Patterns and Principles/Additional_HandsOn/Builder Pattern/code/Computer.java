package BuilderPattern;

public class Computer {
	 private String CPU;
	    private String RAM;
	    private String storage;
	    private String graphicsCard;
	    private boolean hasWiFi;
	    private boolean hasBluetooth;

	  
	    private Computer(Builder builder) {
	        this.CPU = builder.CPU;
	        this.RAM = builder.RAM;
	        this.storage = builder.storage;
	        this.graphicsCard = builder.graphicsCard;
	        this.hasWiFi = builder.hasWiFi;
	        this.hasBluetooth = builder.hasBluetooth;
	    }

	    public String toString() {
	        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage +
	                ", GraphicsCard=" + graphicsCard + ", WiFi=" + hasWiFi + ", Bluetooth=" + hasBluetooth + "]";
	    }

	  
	    public static class Builder {
	        private String CPU;
	        private String RAM;
	        private String storage;
	        private String graphicsCard;
	        private boolean hasWiFi;
	        private boolean hasBluetooth;

	        public Builder setCPU(String CPU) {
	            this.CPU = CPU;
	            return this;
	        }

	        public Builder setRAM(String RAM) {
	            this.RAM = RAM;
	            return this;
	        }

	        public Builder setStorage(String storage) {
	            this.storage = storage;
	            return this;
	        }

	        public Builder setGraphicsCard(String graphicsCard) {
	            this.graphicsCard = graphicsCard;
	            return this;
	        }

	        public Builder setWiFi(boolean hasWiFi) {
	            this.hasWiFi = hasWiFi;
	            return this;
	        }

	        public Builder setBluetooth(boolean hasBluetooth) {
	            this.hasBluetooth = hasBluetooth;
	            return this;
	        }

	        public Computer build() {
	            return new Computer(this);
	        }
	    }
}
