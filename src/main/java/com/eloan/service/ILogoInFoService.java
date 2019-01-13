package com.eloan.service;

import com.eloan.dao.ILogoInFoDao;

/**
 * Created by Administrator on 2019/1/13.
 */
public interface ILogoInFoService {

    public ILogoInFoDao adminORuserLogin(String username, String password);


}
