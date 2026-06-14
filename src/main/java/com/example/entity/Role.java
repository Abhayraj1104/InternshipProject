package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long roleId;
	private String rolename;
	
	@OneToMany(mappedBy="role")
	private List<User> users;

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", rolename=" + rolename + "]";
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(long roleId, String rolename, List<User> users) {
		super();
		this.roleId = roleId;
		this.rolename = rolename;
		this.users = users;
	}

}
