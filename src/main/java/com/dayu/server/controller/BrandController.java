package com.dayu.server.controller;

import com.dayu.server.common.CommonResult;
import com.dayu.server.mbg.model.Brand;
import com.dayu.server.mbg.model.V_UserFishcoinLog;
import com.dayu.server.service.BrandService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("api/")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @PostMapping("listbrand")
    @ResponseBody
    public CommonResult<List<Brand>> listBrand() {
        List<Brand> brandList = brandService.getBrandList();
        return CommonResult.success(brandList);
    }
}
