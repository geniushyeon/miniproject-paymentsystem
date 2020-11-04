package payment;

public class Member {
	private String name;
	private String personNumber;
	private String address;
		
	public Member() {
		
	}
	
	public Member(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}
	
	public Member(String address) {
		this.address = address;
	}
	
<<<<<<< HEAD
//	
//	public String getNewAddress() {
//		return newAddress;
//	}
	
=======
	public String getNewAddress() {
		return newAddress;
	}
	public void setNewAddress(String newAddress) {
		this.newAddress = newAddress;
	}
>>>>>>> 9eb1e719e001154c1a63a7527da2eaee6d50adb5
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

	@Override
	public String toString() {
		return "이름: " + name + "\t생년월일: " + personNumber + "\t주소: " + address;
	}


}
