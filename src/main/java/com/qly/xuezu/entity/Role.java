package com.qly.xuezu.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name = "id" )
	private Long id;//自增;主键;唯一标识
	private String roleName;//角色名称
	private String roleType;//角色类型
	private String accessLevel;//角色级别
	private String description;//描述
	private Integer flag = 1;
	
	
	@ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)
	//可选属性optional=false,表示users不能为空。删除角色，不影响用户
    @JoinColumn(name="users_id")//设置在role表中的关联字段(外键)
	private Users users = new Users();


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public String getRoleType() {
		return roleType;
	}


	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}


	public String getAccessLevel() {
		return accessLevel;
	}


	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getFlag() {
		return flag;
	}


	public void setFlag(Integer flag) {
		this.flag = flag;
	}


	public Users getUsers() {
		return users;
	}


	public void setUsers(Users users) {
		this.users = users;
	}
	
}
