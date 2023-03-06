

public class Principal {

	public static void main(String[] args) {
		Student std = new Student();
		System.out.println("INFO\n");
		System.out.println(std.stuId+std.name+std.stuStatus+"\n");
		Person prs = new Person("Lisa Palombo", 15);
		
		
		Person p1= new Person("Arial", 37);
		Person p2= new Person("Joseph", 15);
	
		if (p1.getEdad()==p2.getEdad()) {
			System.out.println(p1.getName()+" tiene el mismo nombre que "+p2.getName());
		}
		else {
			System.out.println(p1.getName()+" NO tiene el mismo nombre que "+p2.getName());
		}
}
	}
