package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @CreateTime 2022/6/19-19 15:11
 * @Author laowang
 * @Description
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @LoadBalanced
    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupon();
}
