package com.atguigu.mbg.mapper;

import com.atguigu.bean.Phone_record;
import java.util.List;

public interface Phone_recordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    int insert(Phone_record record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    Phone_record selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    List<Phone_record> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    int updateByPrimaryKey(Phone_record record);
}