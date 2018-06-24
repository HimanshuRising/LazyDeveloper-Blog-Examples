package in.lazydeveloper.objectcloning;
public class Computer implements Cloneable{  // Here Computer class is registered in JVM to become Cloneable
	
	private String brand;
	private int ram;
	private int hdd;
	private Motherboard motherBoard;   
	
	public Computer(String brand, int ram, int hdd, Motherboard motherBoard) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.hdd = hdd;
		this.motherBoard = motherBoard;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {  //We are overriding the default implementation
		Computer computer = (Computer)super.clone();									   //Always returns deep copy of object
		computer.motherBoard =(Motherboard)motherBoard.clone();
		return computer;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public Motherboard getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(Motherboard motherBoard) {
		this.motherBoard = motherBoard;
	}

	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", ram=" + ram + " GB, hdd=" + hdd + " GB, motherBoard=" + motherBoard + "]";
	}
}
