package com.CreditSystem.Mapper;

import com.CreditSystem.pojo.Operator;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OperatorMapper extends BaseMapper<Operator> {
}
