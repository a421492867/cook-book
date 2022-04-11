package org.spengy.cookbook.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.spengy.cookbook.domain.Food;

@Mapper
public interface FoodMapper extends BaseMapper<Food> {
}
