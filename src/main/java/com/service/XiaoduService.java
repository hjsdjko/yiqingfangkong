package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoduEntity;
import java.util.Map;

/**
 * 消毒记录 服务类
 * @author 
 * @since 2021-04-16
 */
public interface XiaoduService extends IService<XiaoduEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}