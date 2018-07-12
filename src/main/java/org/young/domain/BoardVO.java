package org.young.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

	private int bno, viewcnt;
	private String title, content, writer;
	private Date regdate, updatedate;
	
}
