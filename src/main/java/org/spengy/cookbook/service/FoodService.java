package org.spengy.cookbook.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.spengy.cookbook.domain.Food;
import org.spengy.cookbook.mapper.FoodMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService extends ServiceImpl<FoodMapper, Food> {

    public List<Food> selectByClazzId(String clazzId){
        Wrapper<Food> wrapper = new EntityWrapper<>();
        wrapper.eq("class_id", clazzId);
        return selectList(wrapper);
    }
}
