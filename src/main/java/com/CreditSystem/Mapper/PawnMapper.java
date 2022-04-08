package com.CreditSystem.Mapper;

import com.CreditSystem.pojo.Pawn;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PawnMapper extends BaseMapper<Pawn> {
}
