package com.graduation.panda.controller;

import com.graduation.panda.model.Apply;
import com.graduation.panda.model.Investor;
import com.graduation.panda.service.ApplyService;
import com.graduation.panda.service.InvestorService;
import com.graduation.panda.utils.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * 此类用于加盟商加盟
 */
@Controller
public class AddController {
    @Autowired
    ApplyService applyService;

    @Autowired
    InvestorService investorService;

    @PostMapping("/InsertApply")
    @ResponseBody
    public HttpResult InsertApply(@RequestBody Apply apply){
        applyService.insertApply(apply);
        return HttpResult.ok("新添成功");
    }

    @PostMapping("/InsertInvetor")
    @ResponseBody
    public HttpResult InsertInvetor(@RequestBody Investor investor){
        investorService.insertInvestor(investor);
        return HttpResult.ok("新添成功");
    }

    @PostMapping("/findApplyLimit")
    @ResponseBody
    public HttpResult findApplyLimit(@RequestBody HashMap map){
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
//        int pageSize = Integer.parseInt(map.get("pageSize").toString());
        pageNum = (pageNum - 1) * 10 ;
        List<Apply> applies = applyService.findApplyLimit(pageNum);
        int totalSize = applyService.selectCount();
        return HttpResult.ok(totalSize,applies);
    }

    @PostMapping("/findInvestorLimit")
    @ResponseBody
    public HttpResult findInvestorLimit(@RequestBody HashMap map){
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
//        int pageSize = Integer.parseInt(map.get("pageSize").toString());
        pageNum = (pageNum - 1) * 10 ;
        List<Investor> investors = investorService.findInvestorLimit(pageNum);
        int totalSize = investorService.selectCount();
        return HttpResult.ok(totalSize,investors);
    }
}
