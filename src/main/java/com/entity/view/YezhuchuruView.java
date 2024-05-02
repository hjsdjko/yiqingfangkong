package com.entity.view;

import com.entity.YezhuchuruEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 业主出入记录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("yezhuchuru")
public class YezhuchuruView extends YezhuchuruEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 出入类型的值
		*/
		private String yezhuchuruValue;



		//级联表 yonghu
			/**
			* 业主姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 住址
			*/
			private String yonghuZhuzhi;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public YezhuchuruView() {

	}

	public YezhuchuruView(YezhuchuruEntity yezhuchuruEntity) {
		try {
			BeanUtils.copyProperties(this, yezhuchuruEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 出入类型的值
			*/
			public String getYezhuchuruValue() {
				return yezhuchuruValue;
			}
			/**
			* 设置： 出入类型的值
			*/
			public void setYezhuchuruValue(String yezhuchuruValue) {
				this.yezhuchuruValue = yezhuchuruValue;
			}
























				//级联表的get和set yonghu
					/**
					* 获取： 业主姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 业主姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
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
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 住址
					*/
					public String getYonghuZhuzhi() {
						return yonghuZhuzhi;
					}
					/**
					* 设置： 住址
					*/
					public void setYonghuZhuzhi(String yonghuZhuzhi) {
						this.yonghuZhuzhi = yonghuZhuzhi;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}


}
