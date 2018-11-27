package br.com.fiap.carona2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_address")
public class Address {
	
	public Address() {
		super();
	}

	public Address(int addressId, String userId, String streetName, String streetNumber, String complement,
			String neighborhood, int cityId, String postalCode, String addressName) {
		super();
		this.addressId = addressId;
		this.userId = userId;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.complement = complement;
		this.neighborhood = neighborhood;
		this.cityId = cityId;
		this.postalCode = postalCode;
		this.addressName = addressName;
	}

	@Id
	@SequenceGenerator(name="address_id",sequenceName="sq_tb_address_id",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="address_id")
	@Column(name="address_id")
	private int addressId;
	
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	// FK
	@Column(name="user_id",nullable=false,length=45)
	private String userId;
	
	@Column(name="street_name",length=255)
	private String streetName;
	
	@Column(name="street_number",length=6)
	private String streetNumber;
	
	@Column(name="complement",length=100)
	private String complement;
	
	@Column(name="neighborhood",length=100)
	private String neighborhood;
	
	//FK
	@Column(name="city_id")
	private int cityId;
	
	@Column(name="postal_code",length=10)
	private String postalCode;
	
	@Column(name="address_name",length=45)
	private String addressName;

}
