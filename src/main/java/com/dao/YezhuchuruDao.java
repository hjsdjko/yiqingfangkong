package com.dao;

import com.entity.YezhuchuruEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YezhuchuruView;

/**
 * 业主出入记录 Dao 接口
 *
 * @author 
 * @since 2021-04-16
 */
public interface YezhuchuruDao extends BaseMapper<YezhuchuruEntity> {

   List<YezhuchuruView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
