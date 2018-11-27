package br.com.fiap.carona2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_countries")
public class Countries {
	
	public Countries() {
		super();
	}

	public Countries(String countryCode, String countryNameBr, String countryNameEn) {
		super();
		this.countryCode = countryCode;
		this.countryNameBr = countryNameBr;
		this.countryNameEn = countryNameEn;
	}

	//FK
	@Id
	@Column(name="country_code",length=2)
	private String countryCode;
	
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryNameBr() {
		return countryNameBr;
	}

	public void setCountryNameBr(String countryNameBr) {
		this.countryNameBr = countryNameBr;
	}

	public String getCountryNameEn() {
		return countryNameEn;
	}

	public void setCountryNameEn(String countryNameEn) {
		this.countryNameEn = countryNameEn;
	}

	@Column(name="country_name_br",length=255)
	private String countryNameBr;
	
	@Column(name="country_name_en",length=45)
	private String countryNameEn;

}
