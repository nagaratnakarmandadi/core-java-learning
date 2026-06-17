package com.oops;

public class Student {

	private int sid = 12;
	private String sname = "balaji";
	private int sage = 43;
	private int smarks = 49;

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public int getSage() {
		return sage;
	} 

	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}

	public int getSmarks() {
		return smarks;
	}

	public static void main(String[] args) {
		System.out.println("main  metohd ");
		Student s = new Student();
		System.out.println(s.sid);
	}

}
