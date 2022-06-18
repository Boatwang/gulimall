package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author laowang
 * @email 1584460297@qq.com
 * @date 2022-06-18 19:06:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
