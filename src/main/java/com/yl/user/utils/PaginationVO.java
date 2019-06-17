package com.yl.user.utils;

import java.util.List;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;



public class PaginationVO<T> {
	
	private Long pageNumber;
	
	private Long pageSize;
	
	private Long total;
	
	private List<T> list;

	
	public PaginationVO() {

	}


	public PaginationVO(Long pageNumber, Long pageSize, Long total, List<T> list) {
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.total = total;
		this.list = list;
	}


	public Long getPageNumber() {
		return pageNumber;
	}


	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}


	public Long getPageSize() {
		return pageSize;
	}


	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}


	public Long getTotal() {
		return total;
	}


	public void setTotal(Long total) {
		this.total = total;
	}


	public List<T> getList() {
		return list;
	}


	public void setList(List<T> list) {
		this.list = list;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
