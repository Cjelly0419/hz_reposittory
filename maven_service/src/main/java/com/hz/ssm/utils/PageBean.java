package com.hz.ssm.utils;

import java.util.List;

/**
 * 分页的工具类
 * @author Administrator
 *
 * @param <T> 任意类型
 */
public class PageBean<T> {
	
	private Integer indexpage;//当前页
	
	private Integer beginRows;//起始行
	
	private Integer pageSize;//每页大小
	
	private Long totalSize;//总的记录数
	
	private Integer totalPage;//总页数
	
	private List<T> datas; //保存查询出数据
	
	public PageBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	


	public PageBean(Integer pageSize, Long totalSize) {
		super();
		this.pageSize = pageSize;
		this.totalSize = totalSize;
	}






	public Integer getIndexpage() {
		return indexpage;
	}
	public void setIndexpage(Integer indexpage) {
		this.indexpage = indexpage;
	}
	//因为起始行是自己计算出来的
	public Integer getBeginRows() {
		//(n-1)*Size();
		
		return (getIndexpage()-1)*getPageSize();
	}

	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public Long getTotalSize() {
		return totalSize;
	}






	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}






	//总页数又是自己计算出来的
	public Integer getTotalPage() {
		
		
		return this.totalPage = (int) ((totalSize%pageSize ==0)?(totalSize/pageSize):(totalSize/pageSize)+1);
	}
	
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	
	
	
	
	
	
	
	
}
