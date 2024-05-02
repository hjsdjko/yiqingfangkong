package com.dao;

import com.entity.DaigouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DaigouView;

/**
 * 代购记录 Dao 接口
 *
 * @author 
 * @since 2021-04-16
 */
public interface DaigouDao extends BaseMapper<DaigouEntity> {

   List<DaigouView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
