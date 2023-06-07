package com.CampusMall.Mapper;

import com.CampusMall.Pojo.Cart;
import com.CampusMall.Pojo.CartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Tue May 30 06:52:35 CST 2023
     */
    int countByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Tue May 30 06:52:35 CST 2023
     */
    int deleteByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Tue May 30 06:52:35 CST 2023
     */
    int deleteByPrimaryKey(Long tcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Tue May 30 06:52:35 CST 2023
     */
    int insert(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Tue May 30 06:52:35 CST 2023
     */
    int insertSelective(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Tue May 30 06:52:35 CST 2023
     */
    List<Cart> selectByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Tue May 30 06:52:35 CST 2023
     */
    Cart selectByPrimaryKey(Long tcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Tue May 30 06:52:35 CST 2023
     */
    int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Tue May 30 06:52:35 CST 2023
     */
    int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Tue May 30 06:52:35 CST 2023
     */
    int updateByPrimaryKeySelective(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Tue May 30 06:52:35 CST 2023
     */
    int updateByPrimaryKey(Cart record);
}