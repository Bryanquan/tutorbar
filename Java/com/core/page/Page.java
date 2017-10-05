package com.core.page;
import java.util.Iterator;
import java.util.List;

/**
 *The interface of page
 */
public interface Page<E> extends Iterable<E>{
    boolean isEmpty();

    /**
     * get the total size of element of page
     * @return int
     */
    int size();

    Iterator iterator();

    /**
     * judging the current page is the first page?
     * @return int
     */
    boolean isFirstPage();

    /**
     * is the last page
     * @return boolean
     */
    boolean isLastPage();

    /**
     * get the number of page
     * @return  int
     */
    int getPageNum();

    /**
     * get all the elements of page
     * @return all the elements of page
     */
    List<E> getItems();
}
