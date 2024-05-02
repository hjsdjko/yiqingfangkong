package com.entity.view;

import com.entity.JubaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 举报记录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("jubao")
public class JubaoView extends JubaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;



	public JubaoView() {

	}

	public JubaoView(JubaoEntity jubaoEntity) {
		try {
			BeanUtils.copyProperties(this, jubaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

















}
