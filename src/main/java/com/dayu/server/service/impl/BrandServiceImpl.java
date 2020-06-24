package com.dayu.server.service.impl;

import com.dayu.server.mbg.mapper.BrandMapper;
import com.dayu.server.mbg.model.Brand;
import com.dayu.server.mbg.model.BrandExample;
import com.dayu.server.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> getBrandList() {
        return brandMapper.selectByExample(new BrandExample());
    }
}
