package org.young.domain;

import java.util.Date;

public class BoardVO  {

	private int bno, viewcnt;
	private String title, content, writer;
	private Date regdate, updatedate;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", viewcnt=" + viewcnt + ", title=" + title + ", content=" + content
				+ ", writer=" + writer + ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}
	
	
}
