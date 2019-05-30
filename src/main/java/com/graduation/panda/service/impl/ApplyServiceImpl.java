package com.graduation.panda.service.impl;

import com.graduation.panda.dao.ApplyMapper;
import com.graduation.panda.model.Apply;
import com.graduation.panda.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyServiceImpl implements ApplyService {

    @Autowired
    ApplyMapper applyMapper;

    @Override
    public void insertApply(Apply apply) {
         applyMapper.insertApply(apply);
    }

    @Override
    public List<Apply> findApplyLimit(int pageNum) {
        return applyMapper.findApplyLimit(pageNum);
    }

    @Override
    public int selectCount() {
        return applyMapper.selectCount();
    }
}
