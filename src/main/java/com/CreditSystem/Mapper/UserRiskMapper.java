package com.CreditSystem.Mapper;

import com.CreditSystem.pojo.UserRisk;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserRiskMapper extends BaseMapper<UserRisk> {
}
