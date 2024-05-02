package com.dao;

import com.entity.XiaoduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoduView;

/**
 * 消毒记录 Dao 接口
 *
 * @author 
 * @since 2021-04-16
 */
public interface XiaoduDao extends BaseMapper<XiaoduEntity> {

   List<XiaoduView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
