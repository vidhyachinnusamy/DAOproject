package User.Registration.Basic;

public class RegisterInit {
	private int roll;
	private String name;
public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public RegisterInit(String name,int roll)
{
	this.roll=roll;
	this.name=name;
}

}
