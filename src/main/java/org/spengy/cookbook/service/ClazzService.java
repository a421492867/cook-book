package org.spengy.cookbook.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.spengy.cookbook.domain.Clazz;
import org.spengy.cookbook.mapper.ClazzMapper;
import org.springframework.stereotype.Service;

@Service
public class ClazzService extends ServiceImpl<ClazzMapper, Clazz> {
}
