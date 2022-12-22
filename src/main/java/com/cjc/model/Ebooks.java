package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ebooks {
	@Id
private int bid;
private String bname;
private String author;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	return "Ebooks [bid=" + bid + ", bname=" + bname + ", author=" + author + "]";
}
public Ebooks(int bid, String bname, String author) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.author = author;
}
public Ebooks() {
	super();
	// TODO Auto-generated constructor stub
}

}
