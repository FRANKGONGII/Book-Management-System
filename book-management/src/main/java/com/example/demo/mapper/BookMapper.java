package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.books;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface BookMapper extends BaseMapper<books> {

}
