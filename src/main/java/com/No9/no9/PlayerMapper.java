package com.No9.no9;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface PlayerMapper {
    @Select("SELECT * FROM players WHERE uniformNumber = #{uniformNumber}")
    Optional<Player> findByUniformNumber(int uniformNumber);

}
