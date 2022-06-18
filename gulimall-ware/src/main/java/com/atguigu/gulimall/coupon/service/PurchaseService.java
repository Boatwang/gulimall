package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author laowang
 * @email 1584460297@qq.com
 * @date 2022-06-18 17:22:24
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

