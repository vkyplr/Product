package com.goforsys.Product.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
	private String first_name;
	private String last_name;
	private String guardian;
	private String dob;
	private String gender;
	private String religion;
	private String email;
	private String phone;
	private String address;
	private String country;
	private String state;
	private String student_class;
	private String section;
	private String group;
	private String optional_subject;
	private String registration_no;
	private String roll_no;
	private String photo;
	private String extra_curricular_activity;
	private String remarks;
	private String username;
	private String password;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGuardian() {
		return guardian;
	}
	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStudent_class() {
		return student_class;
	}
	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getOptional_subject() {
		return optional_subject;
	}
	public void setOptional_subject(String optional_subject) {
		this.optional_subject = optional_subject;
	}
	public String getRegistration_no() {
		return registration_no;
	}
	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}
	public String getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getExtra_curricular_activity() {
		return extra_curricular_activity;
	}
	public void setExtra_curricular_activity(String extra_curricular_activity) {
		this.extra_curricular_activity = extra_curricular_activity;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Student [first_name=" + first_name + ", last_name=" + last_name + ", guardian=" + guardian + ", dob="
				+ dob + ", gender=" + gender + ", religion=" + religion + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", country=" + country + ", state=" + state + ", student_class="
				+ student_class + ", section=" + section + ", group=" + group + ", optional_subject=" + optional_subject
				+ ", registration_no=" + registration_no + ", roll_no=" + roll_no + ", photo=" + photo
				+ ", extra_curricular_activity=" + extra_curricular_activity + ", remarks=" + remarks + ", username="
				+ username + ", password=" + password + "]";
	}
}
