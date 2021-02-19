package com.spring.testpro.vm;

public class BookSearchVm {
	
	private Integer yearOfPublication;
    private String bookType;
    private String search;
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
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	@Override
	public String toString() {
		return "BookSearchVm [yearOfPublication=" + yearOfPublication + ", bookType=" + bookType + ", search=" + search
				+ "]";
	}    
}
