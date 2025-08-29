package com.bit2025.mysite.vo;

import java.sql.Date;

public class BoardVo {
	private Long id;
	private String title;
	private String contents;
	private int hit;
	private Date reg_time;
	private int g_no;
	private int o_no;
	private int depth;
	private Long user_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public Date getReg_time() {
		return reg_time;
	}
	public void setReg_time(Date reg_time) {
		this.reg_time = reg_time;
	}
	public int getG_no() {
		return g_no;
	}
	public void setG_no(int g_no) {
		this.g_no = g_no;
	}
	public int getO_no() {
		return o_no;
	}
	public void setN_no(int n_no) {
		this.o_no = n_no;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	
	@Override
	public String toString() {
		return "BoardVo [id=" + id + ", title=" + title + ", contents=" + contents + ", hit=" + hit + ", reg_time="
				+ reg_time + ", g_no=" + g_no + ", o_no=" + o_no + ", depth=" + depth + ", user_id=" + user_id + "]";
	}
	
	
}
