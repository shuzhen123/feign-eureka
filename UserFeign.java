package com.shulian.slt.crystalball.feign;

import com.shulian.slt.crystalball.res.Resp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@Repository
@FeignClient("CRYSTALUSER-SERVICE")
public interface UserFeign {

    @RequestMapping(value = "/modifyUSDT", method = RequestMethod.POST)
    @ResponseBody
    public Resp modifyUSDT(@RequestParam("mobile") String mobile, @RequestParam("USDT") double USDT, @RequestParam(value = "details", required = false) String details, @RequestParam(value = "mytype", required = false) Integer mytype) throws Exception;

    @GetMapping("/getBalanceAndList")
    public String getBalanceAndList(@RequestParam("mobile") String mobile);
}
