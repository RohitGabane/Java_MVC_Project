package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Tour")
public class Tour 
{
	private int Tourid;
	private String Tourname,Tourtype;
	private double cost;
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	public int getTourid() {
		return Tourid;
	}
	public void setTourid(int tourid) {
		Tourid = tourid;
	}
	public String getTourname() {
		return Tourname;
	}
	@Column
	public void setTourname(String tourname) {
		Tourname = tourname;
	}
	public String getTourtype() {
		return Tourtype;
	}
	@Column
	public void setTourtype(String tourtype) {
		Tourtype = tourtype;
	}
	public double getCost() {
		return cost;
	}
	@Column
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Tour [Tourid=" + Tourid + ", Tourname=" + Tourname + ", Tourtype=" + Tourtype + ", cost=" + cost + "]";
	}
	

	
}
