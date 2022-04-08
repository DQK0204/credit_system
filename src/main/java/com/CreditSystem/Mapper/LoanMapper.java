package com.CreditSystem.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.CreditSystem.pojo.Loan;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoanMapper extends BaseMapper<Loan>{
}
