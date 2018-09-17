package cn.bitflash.vip.buy.feign;

import cn.bitflash.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "bkc-model")
public interface PendingPayFeign {

    @PostMapping("/inner/userBuy/selectById")
    UserBuyEntity selectBuyById(@RequestParam("id") String id);

    @PostMapping("/inner/userBuy/updateById")
    void updateById(@RequestBody UserBuyEntity entity);

    @PostMapping("/inner/userBuyHistory/selectById")
    UserBuyHistoryEntity selectHistoryById(@RequestParam("id")String id);

    @PostMapping("/inner/userBuyHistory/updateById")
    void updateHistoryById(@RequestBody UserBuyHistoryEntity entity);

    @PostMapping("/inner/userAccount/selectById")
    UserAccountEntity selectAccountById(@RequestParam("id")String id);

    @PostMapping("/inner/userAccount/updateById")
    void updateAccountById(@RequestBody UserAccountEntity entity);

    @PostMapping("/inner/tradePoundage/deleteById")
    void deletePoundageById(@RequestParam("id")String id);

    @PostMapping("/inner/userBuy/deleteById")
    void deleteBuyById(@RequestParam("id")String id);

    @PostMapping("/inner/userBuyHistory/deleteById")
    void deleteHistoryById(@RequestParam("id")String id);

    @PostMapping("/inner/tradePoundage/selectById")
    TradePoundageEntity selectPoundageById(@RequestParam("id")String id);


}