package less4.Model;
public class User{
	private String name;
  private String lastname;
	

	public User(String name, String lastname) {
		this.name = name;
		this.lastname = lastname;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getname(){
		return name;
	}
	
	public String getLastname(){
		return lastname;
	}
	
	
	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", lastname='" + lastname + '\'' +
				'}';
	}

}