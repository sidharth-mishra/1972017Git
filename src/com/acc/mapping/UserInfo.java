package com.acc.mapping;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
///------------------------------At sts--------------------------------------
/////////again in sts1
////At ................Git
@Entity
@Table(name="USER_INFO")
public class UserInfo {

	@Id	@GeneratedValue(strategy=GenerationType.AUTO)
	private	int userId;
	@Column(name="USER_NAME")
	private	String username;
	/*//////////OneToOneMapping////////////////........................
	---------------------------------------------@OneToOne-------------------------------------
	@JoinColumn(name="VEHICLE_ID")
	private Vehicle  vehicle;
	
	
	//-------------------------------------ONE TO MANY----------------------------------------------
	/*@OneToMany
	@JoinColumn(name="VEHICLE_ID")
	@JoinTable(name="USERINFO_VEHICLE",joinColumns=@JoinColumn(name="USER_ID"),
	                                           inverseJoinColumns=@JoinColumn(name="VEHICLE_ID")                               )
	private Collection<Vehicle> vehicle=new  ArrayList<Vehicle>();
	*/
	
	//................................................ManyToOne....................................
	
	@OneToMany(mappedBy="userInfo")
	private Collection<Vehicle> vehicle=new  ArrayList<Vehicle>();

	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	///////This is for one to one
	/*public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}*/
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
