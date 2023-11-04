package com.wly.gulimall.member.feign;

import com.wly.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
@Service
public interface CouponFeignService {


    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();

}
