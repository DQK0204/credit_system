package com.CreditSystem.Mapper;

import com.CreditSystem.pojo.LoanPawnRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoanPawnRecordMapper extends BaseMapper<LoanPawnRecord> {
}
