package com.tjpu.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tjpu.dao.SysuserMapper;
import com.tjpu.util.JSONUtils;

@RunWith(SpringJUnit4ClassRunner.class) // 整合
@ContextConfiguration(locations = "classpath:config/spring-mybatis.xml") // 加载配置
public class MainTest {
	@Autowired
	private SysuserMapper sysuserMapper;

	@Test
	public void test() {
		System.out.println(JSONUtils.objectToJsonString(sysuserMapper.selectByPrimaryKey(1)));
	}
}
