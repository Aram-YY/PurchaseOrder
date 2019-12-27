package com.csdj.lyn.controller;

import com.alibaba.fastjson.JSON;
import com.csdj.lyn.entity.Orderform;
import com.csdj.lyn.service.OrderformService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: PurchaseOrder
 * <p>
 * Created by mi on 2019/12/16 8:46
 */
@Controller
public class OrderformController {
    @Resource
    private OrderformService orderformService;

    @RequestMapping("findOrderform.do")
    @ResponseBody
    public Object findOrderform(@RequestParam(value = "start", required = false)String start){
        List<Orderform>orderformList=orderformService.findOrderForm(start);
        System.out.println("-->："+ JSON.toJSON(orderformList));
        System.out.println("---->23232323"+start);
        return JSON.toJSON(orderformList);
    }

}
