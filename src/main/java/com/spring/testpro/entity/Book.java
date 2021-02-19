package com.spring.testpro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String name;
	    @Column(name = "description")
	    private String desc;
	    private Integer yearOfPublication;
	    private String bookType;	    
	    private float price;	    
	    
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public Integer getYearOfPublication() {
			return yearOfPublication;
		}
		public void setYearOfPublication(Integer yearOfPublication) {
			this.yearOfPublication = yearOfPublication;
		}
		public String getBookType() {
			return bookType;
		}
		public void setBookType(String bookType) {
			this.bookType = bookType;
		}
		@Override
		public String toString() {
			return "Book [id=" + id + ", name=" + name + ", desc=" + desc + ", yearOfPublication=" + yearOfPublication
					+ ", bookType=" + bookType + ", price=" + price + "]";
		}	
}
