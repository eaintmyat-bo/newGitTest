package sg.edu.iss.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private long id;
 private String productName;
 private String productDescription;
 @OneToOne(cascade= {CascadeType.ALL})
 @JoinColumn(name="SUPP_ID")
 private Supplier supplier;
 private long qoh;
 private Double price;
 private long rol;
 private Date dolr; //date of last reordered
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(String productName, String productDescription, Supplier supplier, long qoh, Double price, long rol,
		Date dolr) {
	super();
	this.productName = productName;
	this.productDescription = productDescription;
	this.supplier = supplier;
	this.qoh = qoh;
	this.price = price;
	this.rol = rol;
	this.dolr = dolr;
}
public Product(String productName, String productDescription, long qoh, Double price, long rol, Date dolr) {
	super();
	this.productName = productName;
	this.productDescription = productDescription;
	this.qoh = qoh;
	this.price = price;
	this.rol = rol;
	this.dolr = dolr;
}
@Override
public String toString() {
	return "Product [id=" + id + ", productName=" + productName + ", productDescription=" + productDescription
			+ ", supplier=" + supplier + ", qoh=" + qoh + ", price=" + price + ", rol=" + rol + ", dolr=" + dolr
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
public Supplier getSupplier() {
	return supplier;
}
public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}
public long getQoh() {
	return qoh;
}
public void setQoh(long qoh) {
	this.qoh = qoh;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public long getRol() {
	return rol;
}
public void setRol(long rol) {
	this.rol = rol;
}
public Date getDolr() {
	return dolr;
}
public void setDolr(Date dolr) {
	this.dolr = dolr;
}
 
 
}
