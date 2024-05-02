package com.entity.view;

import com.entity.JiankangdakaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 健康信息打卡
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("jiankangdakai")
public class JiankangdakaiView extends JiankangdakaiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 性别的值
		*/
		private String sexValue;
		/**
		* 有无咳嗽的值
		*/
		private String keshouValue;
		/**
		* 有无外出的值
		*/
		private String wuaichuValue;
		/**
		* 是否接触病患的值
		*/
		private String binghuanValue;
		/**
		* 是否出入高风险区域的值
		*/
		private String gaofengxianValue;



	public JiankangdakaiView() {

	}

	public JiankangdakaiView(JiankangdakaiEntity jiankangdakaiEntity) {
		try {
			BeanUtils.copyProperties(this, jiankangdakaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}
			/**
			* 获取： 有无咳嗽的值
			*/
			public String getKeshouValue() {
				return keshouValue;
			}
			/**
			* 设置： 有无咳嗽的值
			*/
			public void setKeshouValue(String keshouValue) {
				this.keshouValue = keshouValue;
			}
			/**
			* 获取： 有无外出的值
			*/
			public String getWuaichuValue() {
				return wuaichuValue;
			}
			/**
			* 设置： 有无外出的值
			*/
			public void setWuaichuValue(String wuaichuValue) {
				this.wuaichuValue = wuaichuValue;
			}
			/**
			* 获取： 是否接触病患的值
			*/
			public String getBinghuanValue() {
				return binghuanValue;
			}
			/**
			* 设置： 是否接触病患的值
			*/
			public void setBinghuanValue(String binghuanValue) {
				this.binghuanValue = binghuanValue;
			}
			/**
			* 获取： 是否出入高风险区域的值
			*/
			public String getGaofengxianValue() {
				return gaofengxianValue;
			}
			/**
			* 设置： 是否出入高风险区域的值
			*/
			public void setGaofengxianValue(String gaofengxianValue) {
				this.gaofengxianValue = gaofengxianValue;
			}














}
