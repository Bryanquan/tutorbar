package com.core.page;

import java.util.*;

/**
 * the abstract class of  page
 * which is used for pagination
 * when we just need the data
 * of  a particular  page  in database
 *created by bryan quan
 *
 */
public class AbstractPage<E> implements Page<E>{

    public static  final  int DEFAULT_PAGE_SIZE=10;

    public static final   int DEFAULT_FIRST_PAGENUM=1;

    protected  int pageSize=DEFAULT_PAGE_SIZE;

    protected int pageNum=DEFAULT_FIRST_PAGENUM;

    protected  List<E> items;

    public void setItems(Collection<E> items) {
        if (items==null) items=Collections.emptyList();
        this.items=new ArrayList<E>(items);
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getFisrtPageNum() {
        return DEFAULT_FIRST_PAGENUM;
    }

    /**
     *
     * @return the start number of each page
     */
    public int getStartIndex()
    {
        return (getPageNum()-1)*pageSize;
    }

    public int getEndIndex()
    {
        return getStartIndex()+pageSize-1;
    }

    public boolean isEmpty()
    {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public Iterator iterator() {
        return items.iterator();
    }

    public boolean isFirstPage() {
        return (getPageNum() <= getFisrtPageNum());
    }

    public boolean isLastPage() {
        return this.items.size()<this.pageSize;
    }

    public void setPageNum(int pageNum) {
        if (pageNum<DEFAULT_FIRST_PAGENUM){
            this.pageNum=DEFAULT_FIRST_PAGENUM;
        }else {
            this.pageNum=pageNum;
        }
    }

    public int getPageNum() {
        return pageNum;
    }

    public int getPrePageEndIndex()
    {
        return getStartIndex()-1;
    }

    public int getNextPageStartIndex()
    {
        return getEndIndex()+1;
    }

    public List<E> getItems() {
        return  items;
    }
}
