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
 * 代购记录
 *
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("daigou")
public class DaigouEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DaigouEntity() {

	}

	public DaigouEntity(T t) {
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
     * 代购商品
     */
    @TableField(value = "daigou_name")

    private String daigouName;


    /**
     * 发布业主
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 需求数量
     */
    @TableField(value = "daigou_number")

    private Integer daigouNumber;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 详情信息
     */
    @TableField(value = "daigou_content")

    private String daigouContent;


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
	 * 设置：代购商品
	 */
    public String getDaigouName() {
        return daigouName;
    }


    /**
	 * 获取：代购商品
	 */

    public void setDaigouName(String daigouName) {
        this.daigouName = daigouName;
    }
    /**
	 * 设置：发布业主
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：发布业主
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：需求数量
	 */
    public Integer getDaigouNumber() {
        return daigouNumber;
    }


    /**
	 * 获取：需求数量
	 */

    public void setDaigouNumber(Integer daigouNumber) {
        this.daigouNumber = daigouNumber;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：详情信息
	 */
    public String getDaigouContent() {
        return daigouContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setDaigouContent(String daigouContent) {
        this.daigouContent = daigouContent;
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
        return "Daigou{" +
            "id=" + id +
            ", daigouName=" + daigouName +
            ", yonghuId=" + yonghuId +
            ", daigouNumber=" + daigouNumber +
            ", insertTime=" + insertTime +
            ", daigouContent=" + daigouContent +
            ", createTime=" + createTime +
        "}";
    }
}
