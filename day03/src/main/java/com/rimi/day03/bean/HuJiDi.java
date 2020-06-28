package com.rimi.day03.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author luc
 * @Date 2020/6/28
 */

@Data
public class HuJiDi {

    private Integer id;

    private String huJiDi;

    private String paiChuSuo;

    private String idcard;

    private Date joinTime;
}
