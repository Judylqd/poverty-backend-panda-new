package com.graduation.panda.dao;

import com.graduation.panda.model.Investor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvestorMapper {
    void insertInvestor(Investor investor);
    List<Investor> findInvestorLimit(int pageNum);
    int selectCount();
}
