package com.CampusMall.Mapper;

import com.CampusMall.Pojo.ProductType;
import com.CampusMall.Pojo.ProductTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_type
     *
     * @mbggenerated Mon May 29 15:48:29 CST 2023
     */
    int countByExample(ProductTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_type
     *
     * @mbggenerated Mon May 29 15:48:29 CST 2023
     */
    int deleteByExample(ProductTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_type
     *
     * @mbggenerated Mon May 29 15:48:29 CST 2023
     */
    int insert(ProductType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_type
     *
     * @mbggenerated Mon May 29 15:48:29 CST 2023
     */
    int insertSelective(ProductType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_type
     *
     * @mbggenerated Mon May 29 15:48:29 CST 2023
     */
    List<ProductType> selectByExample(ProductTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_type
     *
     * @mbggenerated Mon May 29 15:48:29 CST 2023
     */
    int updateByExampleSelective(@Param("record") ProductType record, @Param("example") ProductTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_type
     *
     * @mbggenerated Mon May 29 15:48:29 CST 2023
     */
    int updateByExample(@Param("record") ProductType record, @Param("example") ProductTypeExample example);
}