package com.rimi.day03.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 *  用来生产mybatis的sqlsession
 * @Author luc
 * @Date 2020/6/24
 */
public class SqlSessionUtil {

    private static  SqlSessionFactory factory = null;

//     通过静态代码块，初始化工厂
    static {

        try (InputStream resource = Resources.getResourceAsStream("mybatis.xml");) {
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(resource);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    从工厂获取一个全新的session
    public  static SqlSession openSession() {
        return factory.openSession(true);
    }
}
