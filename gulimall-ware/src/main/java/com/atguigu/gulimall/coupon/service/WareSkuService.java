package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author laowang
 * @email 1584460297@qq.com
 * @date 2022-06-18 17:22:24
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

