package in.lazydeveloper.objectcloning;

public class Motherboard implements Cloneable{ //Here Motherboard class is registered to become Cloneable
	
	private int code;
	private String name;
	
	public Motherboard(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Motherboard [code=" + code + ", name=" + name + "]";
	}
}
