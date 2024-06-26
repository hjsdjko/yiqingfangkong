package com.entity.view;

import com.entity.XiaoduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 消毒记录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("xiaodu")
public class XiaoduView extends XiaoduEntity implements Serializable {
    private static final long serialVersionUID = 1L;



	public XiaoduView() {

	}

	public XiaoduView(XiaoduEntity xiaoduEntity) {
		try {
			BeanUtils.copyProperties(this, xiaoduEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

















}
