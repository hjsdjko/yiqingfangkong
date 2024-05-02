package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.JiankangdakaiEntity;

import com.service.JiankangdakaiService;
import com.entity.view.JiankangdakaiView;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 健康信息打卡
 * 后端接口
 * @author
 * @email
 * @date 2021-04-16
*/
@RestController
@Controller
@RequestMapping("/jiankangdakai")
public class JiankangdakaiController {
    private static final Logger logger = LoggerFactory.getLogger(JiankangdakaiController.class);

    @Autowired
    private JiankangdakaiService jiankangdakaiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "业主".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = jiankangdakaiService.queryPage(params);

        //字典表数据转换
        List<JiankangdakaiView> list =(List<JiankangdakaiView>)page.getList();
        for(JiankangdakaiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JiankangdakaiEntity jiankangdakai = jiankangdakaiService.selectById(id);
        if(jiankangdakai !=null){
            //entity转view
            JiankangdakaiView view = new JiankangdakaiView();
            BeanUtils.copyProperties( jiankangdakai , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JiankangdakaiEntity jiankangdakai, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jiankangdakai:{}",this.getClass().getName(),jiankangdakai.toString());
        Wrapper<JiankangdakaiEntity> queryWrapper = new EntityWrapper<JiankangdakaiEntity>()
            .eq("jiankangdakai_name", jiankangdakai.getJiankangdakaiName())
            .eq("sex_types", jiankangdakai.getSexTypes())
            .eq("jiankangdakai_tiwen", jiankangdakai.getJiankangdakaiTiwen())
            .eq("keshou_types", jiankangdakai.getKeshouTypes())
            .eq("wuaichu_types", jiankangdakai.getWuaichuTypes())
            .eq("jiankangdakai_didian", jiankangdakai.getJiankangdakaiDidian())
            .eq("binghuan_types", jiankangdakai.getBinghuanTypes())
            .eq("gaofengxian_types", jiankangdakai.getGaofengxianTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiankangdakaiEntity jiankangdakaiEntity = jiankangdakaiService.selectOne(queryWrapper);
        if(jiankangdakaiEntity==null){
            jiankangdakai.setCreateTime(new Date());
            if(jiankangdakai.getGaofengxianTypes() == 1){
                jiankangdakai.setYanzheng(1);
            }else if(jiankangdakai.getBinghuanTypes() ==1){
                jiankangdakai.setYanzheng(1);
            }else if(jiankangdakai.getJiankangdakaiTiwen() < 36.2 || jiankangdakai.getJiankangdakaiTiwen() > 37.7){
                jiankangdakai.setYanzheng(1);
            }else{
                jiankangdakai.setYanzheng(0);
            }
            jiankangdakaiService.insert(jiankangdakai);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JiankangdakaiEntity jiankangdakai, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,jiankangdakai:{}",this.getClass().getName(),jiankangdakai.toString());
        //根据字段查询是否有相同数据
        Wrapper<JiankangdakaiEntity> queryWrapper = new EntityWrapper<JiankangdakaiEntity>()
            .notIn("id",jiankangdakai.getId())
            .andNew()
            .eq("jiankangdakai_name", jiankangdakai.getJiankangdakaiName())
            .eq("sex_types", jiankangdakai.getSexTypes())
            .eq("jiankangdakai_tiwen", jiankangdakai.getJiankangdakaiTiwen())
            .eq("keshou_types", jiankangdakai.getKeshouTypes())
            .eq("wuaichu_types", jiankangdakai.getWuaichuTypes())
            .eq("jiankangdakai_didian", jiankangdakai.getJiankangdakaiDidian())
            .eq("binghuan_types", jiankangdakai.getBinghuanTypes())
            .eq("gaofengxian_types", jiankangdakai.getGaofengxianTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiankangdakaiEntity jiankangdakaiEntity = jiankangdakaiService.selectOne(queryWrapper);
        if("".equals(jiankangdakai.getJiankangdakaiPhoto()) || "null".equals(jiankangdakai.getJiankangdakaiPhoto())){
                jiankangdakai.setJiankangdakaiPhoto(null);
        }
        if(jiankangdakaiEntity==null){
            if(jiankangdakai.getGaofengxianTypes() == 1){
                jiankangdakai.setYanzheng(1);
            }else if(jiankangdakai.getBinghuanTypes() ==1){
                jiankangdakai.setYanzheng(1);
            }else if(jiankangdakai.getJiankangdakaiTiwen() < 36.2 || jiankangdakai.getJiankangdakaiTiwen() > 37.7){
                jiankangdakai.setYanzheng(1);
            }else{
                jiankangdakai.setYanzheng(0);
            }

            jiankangdakaiService.updateById(jiankangdakai);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        jiankangdakaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "业主".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = jiankangdakaiService.queryPage(params);

        //字典表数据转换
        List<JiankangdakaiView> list =(List<JiankangdakaiView>)page.getList();
        for(JiankangdakaiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JiankangdakaiEntity jiankangdakai = jiankangdakaiService.selectById(id);
            if(jiankangdakai !=null){
                //entity转view
        JiankangdakaiView view = new JiankangdakaiView();
                BeanUtils.copyProperties( jiankangdakai , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody JiankangdakaiEntity jiankangdakai, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,jiankangdakai:{}",this.getClass().getName(),jiankangdakai.toString());
        Wrapper<JiankangdakaiEntity> queryWrapper = new EntityWrapper<JiankangdakaiEntity>()
            .eq("jiankangdakai_name", jiankangdakai.getJiankangdakaiName())
            .eq("sex_types", jiankangdakai.getSexTypes())
            .eq("jiankangdakai_tiwen", jiankangdakai.getJiankangdakaiTiwen())
            .eq("keshou_types", jiankangdakai.getKeshouTypes())
            .eq("wuaichu_types", jiankangdakai.getWuaichuTypes())
            .eq("jiankangdakai_didian", jiankangdakai.getJiankangdakaiDidian())
            .eq("binghuan_types", jiankangdakai.getBinghuanTypes())
            .eq("gaofengxian_types", jiankangdakai.getGaofengxianTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
    JiankangdakaiEntity jiankangdakaiEntity = jiankangdakaiService.selectOne(queryWrapper);
        if(jiankangdakaiEntity==null){
            jiankangdakai.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      jiankangdakai.set
        //  }
        jiankangdakaiService.insert(jiankangdakai);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}

