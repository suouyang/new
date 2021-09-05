package com.gaotong.smart.mapper;

import com.gaotong.smart.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author suouyang
 * @since 2021-08-07
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select user_name,password from user where user_name=#{username} and password=#{password}" )
    public User login(@Param("username") String username,@Param("password") String password);

}
