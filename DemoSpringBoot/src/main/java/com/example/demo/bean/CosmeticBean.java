package com.example.demo.bean;

public class CosmeticBean {
	
	private String id;
    private String name;
    private int    amount;
    
    public CosmeticBean(String id, String name, int amount){
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
