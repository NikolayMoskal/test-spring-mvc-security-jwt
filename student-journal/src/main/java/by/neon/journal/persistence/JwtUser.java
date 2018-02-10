/**
 * User.java
 */
package by.neon.journal.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Nikolay Moskal
 *
 */
@Entity
@Table(name = "type_user")
public class JwtUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_id")
	@JsonIgnore
	private int id;
	
	@Column(name = "username")
	private String username;

	@Column(name = "role")
	private String role;

	/**
	 * Builds a new object of User
	 * 
	 */
	public JwtUser() {
	}

	/**
	 * Builds a new object of User
	 * 
	 * @param name
	 *            the username
	 * @param password
	 *            the user role
	 */
	public JwtUser(String name, String role) {
		this.username = name;
		this.role = role;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return role
	 */
	public String getRole() {
		return role;
	}
}
