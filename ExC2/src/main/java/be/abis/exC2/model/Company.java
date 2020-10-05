package be.abis.exC2.model;

public class Company {
	
	private String name;
	private Address address;
	
	public Company(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double calculateTaxToPay() {
		double taxToPay = 35.0;
		if (address != null) {
			if (address.getCountryCode().equals("BE")) {
				taxToPay = 51;
			}
			else if (address.getCountryCode().equals("NL")) {
				taxToPay = 47;
			}
		}
		return taxToPay;
	}
	
	

}
