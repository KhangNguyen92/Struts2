package net.roseindia.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userinfo")
public class AddInformation implements Serializable {
	private String firstname;
	private String lastname;
	private String age;
	private String address;
	private String gender;
	private int id;

	@Id
	@GeneratedValue
	@Column(name = "id")
	public int getId() {
		return id;
	}

	@Column(name = "firstname")
	public String getFirstname() {
		return firstname;
	}

	@Column(name = "lastname")
	public String getLastname() {
		return lastname;
	}

	@Column(name = "age")
	public String getAge() {
		return age;
	}

	@Column(name = "address")
	public String getAddress() {
		return address;
	}

	@Column(name = "gender")
	public String getGender() {
		return gender;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
