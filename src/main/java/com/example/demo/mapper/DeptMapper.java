package com.example.demo.mapper;

import com.example.demo.model.Dept;
import java.util.List;

public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Mar 12 20:06:28 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Mar 12 20:06:28 CST 2018
     */
    int insert(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Mar 12 20:06:28 CST 2018
     */
    Dept selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Mar 12 20:06:28 CST 2018
     */
    List<Dept> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Mar 12 20:06:28 CST 2018
     */
    int updateByPrimaryKey(Dept record);
}