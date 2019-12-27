package com.csdj.lyn.controller;

import com.alibaba.fastjson.JSON;
import com.csdj.lyn.entity.Purchasea;
import com.csdj.lyn.service.PurchaseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: PurchaseOrder
 * <p>
 * Created by mi on 2019/12/13 8:38
 */
@Controller
public class PurchaseController {
    @Resource
    private PurchaseService purchaseService;

    @RequestMapping("wd.htmls")
    public Object wd() {

        return "show";
    }
    @RequestMapping("addcri.do")
    @ResponseBody
    public Object addCri(Purchasea purchasea) {
        int a = purchaseService.addCri(purchasea);
        return a;
    }

    @RequestMapping("ad.htmls")
    public Object ad() {
        return "add";
    }

    @RequestMapping("findshow.do")
    @ResponseBody
    public Object findshow(@RequestParam(value = "page", required = false) Integer currPage,
                           @RequestParam(value = "limit", required = false) Integer pageSize,
                           @RequestParam(value = "project", required = false) String project) {
        System.out.println(project);
        if (currPage == null) { //如果当前页为空，则默认为第1页

            currPage = 1;
        }
        if (pageSize == null) {//如果每页条数为空，则默认为每页10条
            pageSize = 10;
        }
        int limitOne = (currPage - 1) * pageSize;//计算出从哪一条开始显示
        int count = purchaseService.count (project);
        List<Purchasea> list = purchaseService.findCriName(project, limitOne, pageSize);
        System.out.println("总记录数:" + count);
        System.out.println("总记录数:" + project);
        String strjson = JSON.toJSONString(list);
        String json = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + strjson + "}";
        return json;
    }
    @RequestMapping("editCri.do")
    @ResponseBody
    public Object editCri(@RequestParam(value = "id", required = false) int id) {
        int count = purchaseService.delId(id);
        return count;
    }
    @RequestMapping("findCarById.do")
    @ResponseBody
    public Object findCarById(@RequestParam(value = "id", required = false) int id) {
        System.out.println("AAAAAAAAAA---");
        Purchasea objCri = purchaseService.findCarById(id);
        System.out.println(JSON.toJSON(objCri));
        return JSON.toJSON(objCri);
    }

    @RequestMapping("findupdate.do")
    @ResponseBody
    public Object findupdate(Purchasea producta) {
        int count = purchaseService.findupdate(producta);
        return count;
    }
}
