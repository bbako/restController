package org.young.domain;

public class BaseVO {
	
	public int page, startPage, endPage;
	public String searchWord, searchKey;
	public Boolean pagePre, pageNext;
	
	public BaseVO() {
		
	}
	
	public BaseVO(int page, int total) {
        this.page = page;
        this.startPage = ((int)((page-1)/10))*10+1;
        int tempEnd = startPage + 9;
        int totalEnd =(int)Math.ceil(((double)total/20.0));
        this.endPage = totalEnd > tempEnd ? tempEnd: totalEnd;
        this.pagePre = startPage == 1 ? false : true;
        this.pageNext = endPage*20 < total ? true : false;
    }
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public Boolean getPagePre() {
		return pagePre;
	}
	public void setPagePre(Boolean pagePre) {
		this.pagePre = pagePre;
	}
	public Boolean getPageNext() {
		return pageNext;
	}
	public void setPageNext(Boolean pageNext) {
		this.pageNext = pageNext;
	}
	
	@Override
	public String toString() {
		return "BaseVO [page=" + page + ", searchWord=" + searchWord + ", searchKey=" + searchKey + "]";
	}
	
	
}
