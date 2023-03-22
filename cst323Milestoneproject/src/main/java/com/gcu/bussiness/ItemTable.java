package com.gcu.bussiness;



import jakarta.persistence.*;


@Entity
@Table(name = "cst323")
public class ItemTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String itemName;
	private int amount;
	private int price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ItemTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemTable(int id, String itemName, int amount, int price) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.amount = amount;
		this.price = price;
	}
	




}
