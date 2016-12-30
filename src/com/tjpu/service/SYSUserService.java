package com.tjpu.service;

import com.tjpu.pojo.Sysuser;

public interface SYSUserService {
	public Sysuser getSYSUserById(int id);

	public int insertSYSUser(Sysuser sysUser);
}
