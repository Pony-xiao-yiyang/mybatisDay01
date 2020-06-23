package com.rimi.mybatis.start.mapper;

import com.rimi.mybatis.start.bean.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author luc
 * @Date 2020/6/23
 */
public class BookMapperTest {

    @Test
    public void test() {

        try (InputStream resource = Resources.getResourceAsStream("mybatis.xml");) {

            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

            SqlSessionFactory build = sqlSessionFactoryBuilder.build(resource);
//          默认开启事务，不自动提交
//            SqlSession sqlSession = build.openSession();
//            开启事务的自动提交
            SqlSession sqlSession = build.openSession(true);

            BookMapper mapper = sqlSession.getMapper(BookMapper.class);

            List<Book> books = mapper.findAll();
            System.out.println(books);
//          手动提交事务
//            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}