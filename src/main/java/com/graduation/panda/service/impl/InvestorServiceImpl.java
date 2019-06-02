package com.graduation.panda.service.impl;

import com.graduation.panda.dao.InvestorMapper;
import com.graduation.panda.model.Investor;
import com.graduation.panda.service.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestorServiceImpl implements InvestorService {
    @Autowired
    InvestorMapper investorMapper;

    @Override
    public void insertInvestor(Investor investor) {
        investorMapper.insertInvestor(investor);
    }

    @Override
    public List<Investor> findInvestorLimit(int pageNum) {
        return investorMapper.findInvestorLimit(pageNum);
    }

    @Override
    public int selectCount() {
        return investorMapper.selectCount();
    }

    @Override
    public void deleteByInvestorId(int id) {
        investorMapper.deleteByInvestorId(id);
    }
}
