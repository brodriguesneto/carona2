package br.com.fiap.carona2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_states")
public class States {
	
	public States() {
		super();
	}

	public States(int stateId, String countryCode, String stateName) {
		super();
		this.stateId = stateId;
		this.countryCode = countryCode;
		this.stateName = stateName;
	}

	@Id
	@Column(name="state_id")
	@SequenceGenerator(name="state_id",sequenceName="sq_tb_state_id",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="state_id")
	private int stateId;
	
	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	// FK
	@Column(name="country_code",length=2)
	private String countryCode;
	
	@Column(name="state_name",length=45)
	private String stateName;

}
