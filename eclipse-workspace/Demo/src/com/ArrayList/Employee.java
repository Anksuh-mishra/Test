package com.ArrayList;

public class Employee {
	private int enumber;
	private String ename;
	private String eid;

	public int getEnumber() {
		return enumber;
	}

	public void setEnumber(int enumber) {
		this.enumber = enumber;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}
	
	@Override
	public String toString() {
		return "Employee [enumber=" + enumber + ", ename=" + ename + ", eid=" + eid + "]";
	}

	public Employee(int enumber, String ename, String eid) {
		super();
		this.enumber = enumber;
		this.ename = ename;
		this.eid = eid;
	}

	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
