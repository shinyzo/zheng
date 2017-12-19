package com.zheng.hospital.dao.mapper;

import com.zheng.hospital.dao.model.ChcProductCategory;
import com.zheng.hospital.dao.model.ChcProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChcProductCategoryMapper {
    long countByExample(ChcProductCategoryExample example);

    int deleteByExample(ChcProductCategoryExample example);

    int deleteByPrimaryKey(String categoryId);

    int insert(ChcProductCategory record);

    int insertSelective(ChcProductCategory record);

    List<ChcProductCategory> selectByExample(ChcProductCategoryExample example);

    ChcProductCategory selectByPrimaryKey(String categoryId);

    int updateByExampleSelective(@Param("record") ChcProductCategory record, @Param("example") ChcProductCategoryExample example);

    int updateByExample(@Param("record") ChcProductCategory record, @Param("example") ChcProductCategoryExample example);

    int updateByPrimaryKeySelective(ChcProductCategory record);

    int updateByPrimaryKey(ChcProductCategory record);
}