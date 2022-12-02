package com.sperdian.dependencyInjection;

public class MemberShip {
	private int membershipId;
	private int visitsPerYear;
	private Customer customer;
	private String membershipType;
	public int getMembershipId() {
		return membershipId;
	}
	public void setMembershipId(int membershipId) {
		this.membershipId = membershipId;
	}
	public int getVisitsPerYear() {
		return visitsPerYear;
	}
	public void setVisitsPerYear(int visitsPerYear) {
		this.visitsPerYear = visitsPerYear;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
//	public String getMembershipType() {
//		return membershipType;
//	}
//	public void setMembershipType(String membershipType) {
//		this.membershipType = membershipType;
//	}
	public MemberShip(int membershipId, String membershipType , int visitsPerYear, Customer customer) {  // for constructor index needs to be specified 
		this.membershipId = membershipId;
		this.visitsPerYear = visitsPerYear;
		this.customer = customer;
		this.membershipType = membershipType;
	}
	@Override
	public String toString() {
		return "MemberShip [membershipId=" + membershipId + ", visitsPerYear=" + visitsPerYear + ", customer="
				+ customer + ", membershipType=" + membershipType + "]";
	}
}
