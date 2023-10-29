package com.ssafy.ems.user.domain;

import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select name,empId,email,nickname,message from user")
    public List<User> select();
    @Select("select name,empId,email,nickname,message " +
            "from user where userId = #{userId}")
    public List<User> selectByUserId(String userId);

    @Select("select name,empId,email,nickname,message " +
            "from user where empId = #{empId}")
    public User selectByEmpId(String empId);

    @Insert("insert into user (userId,userPass,name,email,nickname,message) " +
            "values (#{userId},#{userPass},#{name},#{email},#{nickname},#{message})")
    public int insert(User user);

    @Update("update user set userPass = #{userPass} where userId = #{userId}")
    public int updatePass(User user);

    @Update("update user set nickname = #{nickname},email = #{email},message = #{message} where userId = #{userId}")
    public int update(User user);

    @Delete("delete from user where empId = #{empId}")
    public int delete(String userId);
}
