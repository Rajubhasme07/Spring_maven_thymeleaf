package com.example.demo.model;

public class Customer {

	
	private int cid;
	private String cname;
	private String cpr;
	
	
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String cname, String cpr) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cpr = cpr;
	}
	
	
	public Customer(String cname, String cpr) {
		super();
		this.cname = cname;
		this.cpr = cpr;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCpr() {
		return cpr;
	}
	public void setCpr(String cpr) {
		this.cpr = cpr;
	}
	
	
	
	
}
