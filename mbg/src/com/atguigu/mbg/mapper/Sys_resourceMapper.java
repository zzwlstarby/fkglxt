package com.atguigu.mbg.mapper;

import com.atguigu.bean.Sys_resource;
import java.util.List;

public interface Sys_resourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    int insert(Sys_resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    Sys_resource selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    List<Sys_resource> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    int updateByPrimaryKey(Sys_resource record);
}