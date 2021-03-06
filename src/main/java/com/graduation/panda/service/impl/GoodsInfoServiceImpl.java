package com.graduation.panda.service.impl;

import com.graduation.panda.dao.GoodsInfoMapper;
import com.graduation.panda.model.GoodsInfo;
import com.graduation.panda.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService{
    @Autowired
    GoodsInfoMapper goodsInfoMapper;

    @Override
    public List<GoodsInfo> findByKeyword(String keyword){
        return goodsInfoMapper.findByKeyword(keyword);
    }

    @Override
    public List<GoodsInfo> findByKeywordPriceAsc(String keyword){
        return goodsInfoMapper.findByKeywordPriceAsc(keyword);
    }

    @Override
    public List<GoodsInfo> findByKeywordPriceDesc(String keyword){
        return goodsInfoMapper.findByKeywordPriceDesc(keyword);
    }

    @Override
    public int findByKeywordCount(String keyword){
        return goodsInfoMapper.findByKeywordCount(keyword);
    }


    @Override
    public List<GoodsInfo> findByKeywordLimit(Map map){
        return goodsInfoMapper.findByKeywordLimit(map);
    }

    @Override
    public List<GoodsInfo> findByKeywordPriceAscLimit(Map map){
        return goodsInfoMapper.findByKeywordPriceAscLimit(map);
    }

    @Override
    public List<GoodsInfo> findByKeywordPriceDescLimit(Map map){
        return goodsInfoMapper.findByKeywordPriceDescLimit(map);
    }

    @Override
    public List<GoodsInfo> findGoodsLimit(Map map) {
        return goodsInfoMapper.findGoodsLimit(map);
    }

    @Override
    public int selectCount(String goodsId) {
        return goodsInfoMapper.selectCount(goodsId);
    }

    @Override
    public void deleteByGoodsId(String goodsId) {
        goodsInfoMapper.deleteByGoodsId(goodsId);
    }

    @Override
    public void updateByPrimaryKey(GoodsInfo goodsInfo) {
        goodsInfoMapper.updateByPrimaryKey(goodsInfo);
    }

    @Override
    public GoodsInfo findByGoodsId(String goodsId) {
        return goodsInfoMapper.findByGoodsId(goodsId);
    }

    @Override
    public void insertGoods(GoodsInfo goodsInfo) {
        goodsInfoMapper.insertGoods(goodsInfo);
    }

}
