package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.JiankangdakaiDao;
import com.entity.JiankangdakaiEntity;
import com.service.JiankangdakaiService;
import com.entity.view.JiankangdakaiView;

/**
 * 健康信息打卡 服务实现类
 * @author 
 * @since 2021-04-16
 */
@Service("jiankangdakaiService")
@Transactional
public class JiankangdakaiServiceImpl extends ServiceImpl<JiankangdakaiDao, JiankangdakaiEntity> implements JiankangdakaiService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<JiankangdakaiView> page =new Query<JiankangdakaiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
