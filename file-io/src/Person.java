import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private transient int age;	//it do not serializable bcoz of transient
	
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [Name=" + name + ", Age=" + age + "]";
	}
}
