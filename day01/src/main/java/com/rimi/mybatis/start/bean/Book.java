package com.rimi.mybatis.start.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author luc
 * @Date 2020/6/11
 */

@Data
public class Book {
//

    // 图书ID
    private Integer id;

    private String bookName;

    private String bookAuthor;

    private Double bookPrice;

    private Date insertTime;

    private Date lastModifiedTime;


}
