package com.graduation.panda.service;

import com.graduation.panda.model.Investor;

import java.util.List;

public interface InvestorService {
    void insertInvestor(Investor investor);

    List<Investor> findInvestorLimit(int pageNum);
    int selectCount();

    void deleteByInvestorId(int id);

}
