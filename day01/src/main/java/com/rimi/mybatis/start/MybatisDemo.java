package com.rimi.mybatis.start;

import com.rimi.mybatis.start.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @Author luc
 * @Date 2020/6/23
 */
public class MybatisDemo {


    public static void main(String[] args) {

//        利用XML创建mybatis工厂

//        读取配置文件

        try (InputStream resource = Resources.getResourceAsStream("mybatis.xml");) {
//        创建一个builder建造器，用来创建sql session工厂，避免用户自己手动new sqlsession工厂，造成的错误
//        设计模式—建造者模式
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

//        利用构造器创建工厂
            SqlSessionFactory factory = builder.build(resource);

//        利用工厂创建sqlsession
            SqlSession sqlSession = factory.openSession();

//         执行sql，获取结果

            List<User> users = sqlSession.selectList("aaa.findAll");

            System.out.println(users);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
