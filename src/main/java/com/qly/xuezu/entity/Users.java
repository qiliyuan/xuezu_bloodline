package com.qly.xuezu.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Users implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name = "id", unique = true, nullable = false)
	private Long id;//自增;主键;唯一标识,  序号
	private String userName;//用户名
	private String passWord;//密码
	private String name;//姓名
	private String sex;//性别
	private String phone;//电话
	private Integer flag = 1;

	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY, mappedBy = "users")
    //级联保存、更新、删除、刷新;延迟加载。当删除用户，会级联删除该用户的所有角色
    //拥有mappedBy注解的实体类为关系被维护端
	//mappedBy=”users”中的users是Role中的users属性
	private List<Role> role = new ArrayList<Role>();


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Integer getFlag() {
		return flag;
	}


	public void setFlag(Integer flag) {
		this.flag = flag;
	}


	public List<Role> getRole() {
		return role;
	}


	public void setRole(List<Role> role) {
		this.role = role;
	}
	
	
}
