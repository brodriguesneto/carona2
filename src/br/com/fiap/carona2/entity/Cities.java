package br.com.fiap.carona2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_cities")
public class Cities {
	
	public Cities() {
		super();
	}

	public Cities(int cityId, int stateId, String cityName) {
		super();
		this.cityId = cityId;
		this.stateId = stateId;
		this.cityName = cityName;
	}

	@Id
	@Column(name="city_id")
	@SequenceGenerator(name="city_id",sequenceName="sq_city_id",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="city_id")
	private int cityId;
	
	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	// FK
	@Column(name="state_id")
	private int stateId;
	
	@Column(name="city_name",length=255)
	private String cityName;

}
