package com.rimi.mybatis.start;

import com.rimi.mybatis.start.bean.User;
import com.rimi.mybatis.start.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.InputStream;
import java.util.List;

/**
 * @Author luc
 * @Date 2020/6/23
 */
public class MybatisDemo {

//    启用自定义的log4j2 输出日志,推荐初始化logger时，指定当前类的字节码文件
    static Logger logger = LogManager.getLogger(MybatisDemo.class);

    public static void main(String[] args) {

//        利用XML创建mybatis工厂

//        读取配置文件

//        info日志，通常记录程序本身应该存在的输出信息
        logger.info("mybatis开始执行");

        try (InputStream resource = Resources.getResourceAsStream("mybatis.xml");) {
//          debug日志，通常记录线上环境不需要，而开发调试过程中需要使用的日志
            logger.debug("读取mybatis配置文件结束");
//        创建一个builder建造器，用来创建sql session工厂，避免用户自己手动new sqlsession工厂，造成的错误
//        设计模式—建造者模式
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//            warn日志，通常用于输出警告的日志信息
            logger.warn("还没有创建工厂，请注意");

//        利用构造器创建工厂
            SqlSessionFactory factory = builder.build(resource);
//           errpr, 通常用于输出错误日志信息
            logger.error("你忘了创建sql session");
//        利用工厂创建sqlsession
            SqlSession sqlSession = factory.openSession();
//           trace 记录复杂对象内部调式跟踪信息
            logger.trace("我开始检查哪里有错");
//         执行sql，获取结果
//           方案一
//            List<User> users = sqlSession.selectList("aaa.findAll");


//           方案二, 利用mapper接口进行数据库的增删改查

            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = userMapper.findAll();
            System.out.println(users);

//            User user = User.builder()
//                    .username("luc")
//                    .password("123")
//                    .nickname("cc")
//                    .build();
//            System.out.println(user);

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
