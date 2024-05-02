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
 * 举报记录
 *
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("jubao")
public class JubaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JubaoEntity() {

	}

	public JubaoEntity(T t) {
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
     * 标题
     */
    @TableField(value = "jubao_name")

    private String jubaoName;


    /**
     * 举报人
     */
    @TableField(value = "jubaoren")

    private String jubaoren;


    /**
     * 被举报人
     */
    @TableField(value = "beijubaoren")
    private String beijubaoren;


    /**
     * 举报时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 举报原因
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
	 * 设置：标题
	 */
    public String getJubaoName() {
        return jubaoName;
    }


    /**
	 * 获取：标题
	 */

    public void setJubaoName(String jubaoName) {
        this.jubaoName = jubaoName;
    }
    /**
	 * 设置：举报人
	 */
    public String getJubaoren() {
        return jubaoren;
    }


    /**
	 * 获取：举报人
	 */

    public void setJubaoren(String jubaoren) {
        this.jubaoren = jubaoren;
    }
    /**
	 * 设置：被举报人
	 */
    public String getBeijubaoren() {
        return beijubaoren;
    }


    /**
	 * 获取：被举报人
	 */

    public void setBeijubaoren(String beijubaoren) {
        this.beijubaoren = beijubaoren;
    }
    /**
	 * 设置：举报时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：举报时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：举报原因
	 */
    public String getYiqingcelveContent() {
        return yiqingcelveContent;
    }


    /**
	 * 获取：举报原因
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
        return "Jubao{" +
            "id=" + id +
            ", jubaoName=" + jubaoName +
            ", jubaoren=" + jubaoren +
            ", beijubaoren=" + beijubaoren +
            ", insertTime=" + insertTime +
            ", yiqingcelveContent=" + yiqingcelveContent +
            ", createTime=" + createTime +
        "}";
    }
}
