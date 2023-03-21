package ustbatchno3.di_constructorinjection;

public class Role {
	private String char_name;
	private String response;
	public Role(String char_name, String response) {
		super();
		this.char_name = char_name;
		this.response = response;
	}
	public void display()
	{
		System.out.println("My name is "+char_name+" My responsibility is "+response);
	}

}
