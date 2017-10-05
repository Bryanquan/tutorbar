package com.core.page;
/**
 * the implementation of page
 * extends AbstractPage
 */
public class Pagination<E> extends AbstractPage<E>{

    private  int start;
    private  int totalItemCount;

    private  int totalPageCount;

    public void setTotalItemCount(int totalItemCount) {
        this.totalItemCount = totalItemCount;
    }

    public int getTotalItemCount() {
        return totalItemCount;
    }

    public int getTotalPageCount() {
        return this.getTotalItemCount()/pageSize+getFisrtPageNum();
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getStart() {
        return start;
    }
}
