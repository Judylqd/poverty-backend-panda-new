package com.graduation.panda.dao;

import com.graduation.panda.model.Apply;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplyMapper {
    void insertApply(Apply apply);

    List<Apply> findApplyLimit(int pageNum);

    int selectCount();

    void deleteByApplyId(int id);
}
