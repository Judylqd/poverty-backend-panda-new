package com.graduation.panda.service;

import com.graduation.panda.model.Apply;

import java.util.List;

public interface ApplyService {
    void insertApply(Apply apply);

    List<Apply> findApplyLimit(int pageNum);

    int selectCount();
}
