package com.dao;

import com.entity.YiqingcelveEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YiqingcelveView;

/**
 * 疫情策略 Dao 接口
 *
 * @author 
 * @since 2021-04-16
 */
public interface YiqingcelveDao extends BaseMapper<YiqingcelveEntity> {

   List<YiqingcelveView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
