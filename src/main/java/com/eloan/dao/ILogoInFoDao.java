package com.eloan.dao;

import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2019/1/13.
 */
public interface ILogoInFoDao {


    /**
     * 用户或者管理员登录
     * @return
     */

    @Select("SELECT * FROM logininfo WHERE username=#{username} and `password`=MD5(#{password})")
    public ILogoInFoDao adminORuserLogin(String username, String password);

}
