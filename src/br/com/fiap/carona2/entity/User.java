package br.com.fiap.carona2.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="tb_user")
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}

	public User(String userId, String phoneNumber, String email, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public User(String userId, String phoneNumber, String email, String firstName, String lastName, String dateOfBirth,
			String nationalId, PhoneValidated phoneValidated, EmailConfirmed emailValidated, Calendar create_time,
			String passwordEnc, String passwordSalt) {
		super();
		this.userId = userId;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalId = nationalId;
		this.phoneValidated = phoneValidated;
		this.emailValidated = emailValidated;
		this.create_time = create_time;
		this.passwordEnc = passwordEnc;
		this.passwordSalt = passwordSalt;
	}

	@Id
	@Column(name="user_id",nullable=false,length=45)
	private String userId;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public PhoneValidated getPhoneValidated() {
		return phoneValidated;
	}

	public void setPhoneValidated(PhoneValidated phoneValidated) {
		this.phoneValidated = phoneValidated;
	}

	public EmailConfirmed getEmailValidated() {
		return emailValidated;
	}

	public void setEmailValidated(EmailConfirmed emailValidated) {
		this.emailValidated = emailValidated;
	}

	public Calendar getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Calendar create_time) {
		this.create_time = create_time;
	}

	public String getPasswordEnc() {
		return passwordEnc;
	}

	public void setPasswordEnc(String passwordEnc) {
		this.passwordEnc = passwordEnc;
	}

	public String getPasswordSalt() {
		return passwordSalt;
	}

	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}

	@Column(name="phone_number",nullable=false,length=20)
	private String phoneNumber;
	
	@Column(name="email",nullable=false,length=255)
    private String email;

	@Column(name="first_name",nullable=false,length=100)
    private String firstName;
	
	@Column(name="last_name",nullable=false,length=100)
    private String lastName;
	
	@Column(name="date_of_birth",length=45)
    private String dateOfBirth;

	@Column(name="national_id",length=15)
    private String nationalId;
	
	@Column(name="phone_validated",length=1)
	@Enumerated(EnumType.ORDINAL)
    private PhoneValidated phoneValidated;

	@Column(name="email_validated",length=1)
	@Enumerated(EnumType.ORDINAL)
    private EmailConfirmed emailValidated;

	@CreationTimestamp
	@Column(name="create_time")
    private Calendar create_time;

	@Column(name="password_enc",length=100)
    private String passwordEnc;
    
	@Column(name="password_salt",length=50)
    private String passwordSalt;
	
}
