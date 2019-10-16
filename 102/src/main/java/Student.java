
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity 
 class Student {
	@Id
	private int ID;
	private String Name;
	private int Age;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	

}
