package com.atguigu.mbg.mapper;

import com.atguigu.bean.Address;
import java.util.List;

public interface AddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    int insert(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    Address selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    List<Address> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    int updateByPrimaryKey(Address record);
}