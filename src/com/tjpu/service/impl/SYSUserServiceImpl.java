package com.tjpu.service.impl;

/**
 * user interfaceImpl
 * 
 * @author guohu
 * @date 2016.12.6
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tjpu.dao.SYSUserDao;
import com.tjpu.pojo.SYSUser;
import com.tjpu.service.SYSUserService;
import com.tjpu.util.MD5Util;

@Transactional
@Service("sysUserService")
public class SYSUserServiceImpl implements SYSUserService {
	// Database persistence layer injection
	@Autowired
	private SYSUserDao sYSUserDao;

	/**
	 * @param id
	 *            user id,get user message by id
	 */
	public SYSUser getSYSUserById(int id) {
		return sYSUserDao.getSYSUserById(id);
	}

	/**
	 * @param sysUser
	 *            sysUser javaBean,insert into the SYSUser by javaBean
	 */
	public int insertSYSUser(SYSUser sysUser) {
		sysUser.setPassword(MD5Util.MD5(sysUser.getPassword()));
		return sYSUserDao.insertSYSUser(sysUser);
	}

}
