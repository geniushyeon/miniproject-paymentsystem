package payment;

public class Member {
	private String name;
	private String personNumber;
	private String address;
	private String newAddress;
	
	public Member() {
		
	}
	
	public Member(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}
	
	public Member(String address) {
		this.address = address;
	}
	
	public String getNewAddress() {
		return newAddress;
	}
	public void setNewAddress(String newAddress) {
		this.newAddress = newAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersonNumber() {
		return personNumber;
	}
	public void setPersonNumber(String personNumber) {
		this.personNumber = personNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


}
