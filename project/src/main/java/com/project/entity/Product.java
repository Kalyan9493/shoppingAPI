package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="product")
@Table(name="product")
public class Product{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pid")
	private Long pid;
	private String name;
	private String catagory;
	private Double  price;
	private String os;
	private Integer memory;
	private Integer ram;
	@OneToOne(mappedBy = "user")
	private Cart cart;
	

	
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Product(String name, String catagory, Double price, String os, Integer memory, Integer ram) {
		super();
		this.name = name;
		this.catagory = catagory;
		this.price = price;
		this.os = os;
		this.memory = memory;
		this.ram = ram;
	}
	public Product() {
	
	}
	
	public Long getPid() {
		return pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public Integer getMemory() {
		return memory;
	}
	public void setMemory(Integer memory) {
		this.memory = memory;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Product [productid=" + pid + ", name=" + name + ", catagory=" + catagory + ", price=" + price
				+ ", os=" + os + ", memory=" + memory + ", ram=" + ram + "]";
	}
	
}
