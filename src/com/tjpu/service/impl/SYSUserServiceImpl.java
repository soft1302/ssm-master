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

import com.tjpu.dao.SysuserMapper;
import com.tjpu.pojo.Sysuser;
import com.tjpu.service.SYSUserService;
import com.tjpu.util.MD5Util;

@Transactional
@Service("sysUserService")
public class SYSUserServiceImpl implements SYSUserService {
	// Database persistence layer injection
	@Autowired
	private SysuserMapper sysuserMapper;

	/**
	 * @param id
	 *            user id,get user message by id
	 */
	public Sysuser getSYSUserById(int id) {
		return sysuserMapper.selectByPrimaryKey(id);
	}

	/**
	 * @param sysUser
	 *            sysUser javaBean,insert into the SYSUser by javaBean
	 */
	public int insertSYSUser(Sysuser sysUser) {
		sysUser.setPassword(MD5Util.MD5(sysUser.getPassword()));
		return sysuserMapper.insert(sysUser);
	}

}
