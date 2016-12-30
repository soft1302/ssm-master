package com.tjpu.test;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tjpu.dao.SysuserMapper;
import com.tjpu.pojo.Sysuser;
import com.tjpu.pojo.SysuserExample;
import com.tjpu.util.JSONUtils;

@RunWith(SpringJUnit4ClassRunner.class) // 整合
@ContextConfiguration(locations = "classpath:config/spring-mybatis.xml") // 加载配置
public class MainTest {
	@Resource
	private SysuserMapper sysuserMapper;

	@Test
	public void test() {
		SysuserExample sysuserExample = new SysuserExample();
		SysuserExample.Criteria criteria = sysuserExample.createCriteria();
		criteria.andIdEqualTo(4);
		SysuserExample.Criteria criteria2 = sysuserExample.createCriteria();
		criteria2.andIdBetween(1, 3);
		sysuserExample.or(criteria2);
		List<Sysuser> lSysusers = sysuserMapper.selectByExample(sysuserExample);
		System.out.println(JSONUtils.objectToJsonString(lSysusers));
	}
}
