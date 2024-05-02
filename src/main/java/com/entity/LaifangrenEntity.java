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
 * 来访人员记录
 *
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("laifangren")
public class LaifangrenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LaifangrenEntity() {

	}

	public LaifangrenEntity(T t) {
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
     * 来访人员名称
     */
    @TableField(value = "laifangren_name")

    private String laifangrenName;


    /**
     * 来访目的
     */
    @TableField(value = "laifangren_mudi")

    private String laifangrenMudi;


    /**
     * 来访时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 详情信息
     */
    @TableField(value = "yiqingcelve_content")

    private String yiqingcelveContent;


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
	 * 设置：来访人员名称
	 */
    public String getLaifangrenName() {
        return laifangrenName;
    }


    /**
	 * 获取：来访人员名称
	 */

    public void setLaifangrenName(String laifangrenName) {
        this.laifangrenName = laifangrenName;
    }
    /**
	 * 设置：来访目的
	 */
    public String getLaifangrenMudi() {
        return laifangrenMudi;
    }


    /**
	 * 获取：来访目的
	 */

    public void setLaifangrenMudi(String laifangrenMudi) {
        this.laifangrenMudi = laifangrenMudi;
    }
    /**
	 * 设置：来访时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：来访时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：详情信息
	 */
    public String getYiqingcelveContent() {
        return yiqingcelveContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setYiqingcelveContent(String yiqingcelveContent) {
        this.yiqingcelveContent = yiqingcelveContent;
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
        return "Laifangren{" +
            "id=" + id +
            ", laifangrenName=" + laifangrenName +
            ", laifangrenMudi=" + laifangrenMudi +
            ", insertTime=" + insertTime +
            ", yiqingcelveContent=" + yiqingcelveContent +
            ", createTime=" + createTime +
        "}";
    }
}
