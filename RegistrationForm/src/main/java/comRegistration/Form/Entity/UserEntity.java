package comRegistration.Form.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "user_details")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String date;
	private String address;
	private String email;
	private String pass;
	private String gender;
	

	public UserEntity(int id, String name, String date, String address, String email, String pass, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.address = address;
		this.email = email;
		this.pass = pass;
		this.gender = gender;
	}
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", date=" + date + ", address=" + address + ", email="
				+ email + ", pass=" + pass + ", gender=" + gender + "]";
	}
	

}
