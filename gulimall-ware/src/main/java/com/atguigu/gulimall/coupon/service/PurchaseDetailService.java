package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author laowang
 * @email 1584460297@qq.com
 * @date 2022-06-18 17:22:24
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

