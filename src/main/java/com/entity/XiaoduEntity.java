package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 消毒记录
 *
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("xiaodu")
public class XiaoduEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiaoduEntity() {

	}

	public XiaoduEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 消毒区域
     */
    @TableField(value = "xiaodu_name")

    private String xiaoduName;


    /**
     * 消毒时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 详情信息
     */
    @TableField(value = "xiaodu_content")

    private String xiaoduContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：消毒区域
	 */
    public String getXiaoduName() {
        return xiaoduName;
    }


    /**
	 * 获取：消毒区域
	 */

    public void setXiaoduName(String xiaoduName) {
        this.xiaoduName = xiaoduName;
    }
    /**
	 * 设置：消毒时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：消毒时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：详情信息
	 */
    public String getXiaoduContent() {
        return xiaoduContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setXiaoduContent(String xiaoduContent) {
        this.xiaoduContent = xiaoduContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xiaodu{" +
            "id=" + id +
            ", xiaoduName=" + xiaoduName +
            ", insertTime=" + insertTime +
            ", xiaoduContent=" + xiaoduContent +
            ", createTime=" + createTime +
        "}";
    }
}
