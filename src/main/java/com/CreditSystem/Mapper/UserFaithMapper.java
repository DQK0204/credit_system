package com.CreditSystem.Mapper;

import com.CreditSystem.pojo.UserFaith;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserFaithMapper extends BaseMapper<UserFaith> {
}
