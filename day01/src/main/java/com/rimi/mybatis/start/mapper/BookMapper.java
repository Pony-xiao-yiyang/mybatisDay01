package com.rimi.mybatis.start.mapper;

import com.rimi.mybatis.start.bean.Book;

import java.util.List;

/**
 * @Author luc
 * @Date 2020/6/23
 */
public interface BookMapper {

    List<Book> findAll();
}
