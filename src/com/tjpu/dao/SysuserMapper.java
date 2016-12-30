package com.tjpu.dao;

import com.tjpu.pojo.Sysuser;
import com.tjpu.pojo.SysuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated Fri Dec 30 09:42:54 CST 2016
     */
    int countByExample(SysuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated Fri Dec 30 09:42:54 CST 2016
     */
    int deleteByExample(SysuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated Fri Dec 30 09:42:54 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated Fri Dec 30 09:42:54 CST 2016
     */
    int insert(Sysuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated Fri Dec 30 09:42:54 CST 2016
     */
    int insertSelective(Sysuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated Fri Dec 30 09:42:54 CST 2016
     */
    List<Sysuser> selectByExample(SysuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated Fri Dec 30 09:42:54 CST 2016
     */
    Sysuser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated Fri Dec 30 09:42:54 CST 2016
     */
    int updateByExampleSelective(@Param("record") Sysuser record, @Param("example") SysuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated Fri Dec 30 09:42:54 CST 2016
     */
    int updateByExample(@Param("record") Sysuser record, @Param("example") SysuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated Fri Dec 30 09:42:54 CST 2016
     */
    int updateByPrimaryKeySelective(Sysuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated Fri Dec 30 09:42:54 CST 2016
     */
    int updateByPrimaryKey(Sysuser record);
}