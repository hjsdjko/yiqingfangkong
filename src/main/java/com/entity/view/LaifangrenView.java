package com.entity.view;

import com.entity.LaifangrenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 来访人员记录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("laifangren")
public class LaifangrenView extends LaifangrenEntity implements Serializable {
    private static final long serialVersionUID = 1L;



	public LaifangrenView() {

	}

	public LaifangrenView(LaifangrenEntity laifangrenEntity) {
		try {
			BeanUtils.copyProperties(this, laifangrenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

















}
