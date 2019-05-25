package com.itemsharing.userservice.model;

import javax.persistence.*;

@Entity
@Table(name="userw_role")
public class UserRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userRoleId;
	
	public UserRole() {}
	public UserRole(User user, Role role) {
		this.user = user;
		this.role = role;
	}
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.ALL})
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
	private Role role;

	public long getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(long userRoleId) {
		this.userRoleId = userRoleId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	

}
