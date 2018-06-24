package in.lazydeveloper.objectcloning;
public class TestObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Computer dell = new Computer("Dell", 3, 500, new Motherboard(100, "Intel"));
		Computer clonedDell = null;
		clonedDell = (Computer)dell.clone();
		System.out.println("Original Object Before Cloning: "+dell);
		clonedDell.setBrand("Asus");
		clonedDell.getMotherBoard().setName("MSI");
		System.out.println("Cloned Object: "+clonedDell);
		System.out.println("Original Object After Cloning: "+dell);
		
	}

}
