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
 * 疫情分布
 *
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("yiqingfenbu")
public class YiqingfenbuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YiqingfenbuEntity() {

	}

	public YiqingfenbuEntity(T t) {
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
     * 城市(区)
     */
    @TableField(value = "yiqingfenbu_chengshi")

    private String yiqingfenbuChengshi;


    /**
     * 省市(区)
     */
    @TableField(value = "yiqingfenbu_shengshi")

    private String yiqingfenbuShengshi;


    /**
     * 新增确诊
     */
    @TableField(value = "yiqingfenbu_xinzheng")

    private Integer yiqingfenbuXinzheng;


    /**
     * 新增无症状
     */
    @TableField(value = "yiqingfenbu_wuzhengzhuang")

    private Integer yiqingfenbuWuzhengzhuang;


    /**
     * 风险区域
     */
    @TableField(value = "yiqingfenbu_fengxina")

    private Integer yiqingfenbuFengxina;


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
	 * 设置：城市(区)
	 */
    public String getYiqingfenbuChengshi() {
        return yiqingfenbuChengshi;
    }


    /**
	 * 获取：城市(区)
	 */

    public void setYiqingfenbuChengshi(String yiqingfenbuChengshi) {
        this.yiqingfenbuChengshi = yiqingfenbuChengshi;
    }
    /**
	 * 设置：省市(区)
	 */
    public String getYiqingfenbuShengshi() {
        return yiqingfenbuShengshi;
    }


    /**
	 * 获取：省市(区)
	 */

    public void setYiqingfenbuShengshi(String yiqingfenbuShengshi) {
        this.yiqingfenbuShengshi = yiqingfenbuShengshi;
    }
    /**
	 * 设置：新增确诊
	 */
    public Integer getYiqingfenbuXinzheng() {
        return yiqingfenbuXinzheng;
    }


    /**
	 * 获取：新增确诊
	 */

    public void setYiqingfenbuXinzheng(Integer yiqingfenbuXinzheng) {
        this.yiqingfenbuXinzheng = yiqingfenbuXinzheng;
    }
    /**
	 * 设置：新增无症状
	 */
    public Integer getYiqingfenbuWuzhengzhuang() {
        return yiqingfenbuWuzhengzhuang;
    }


    /**
	 * 获取：新增无症状
	 */

    public void setYiqingfenbuWuzhengzhuang(Integer yiqingfenbuWuzhengzhuang) {
        this.yiqingfenbuWuzhengzhuang = yiqingfenbuWuzhengzhuang;
    }
    /**
	 * 设置：风险区域
	 */
    public Integer getYiqingfenbuFengxina() {
        return yiqingfenbuFengxina;
    }


    /**
	 * 获取：风险区域
	 */

    public void setYiqingfenbuFengxina(Integer yiqingfenbuFengxina) {
        this.yiqingfenbuFengxina = yiqingfenbuFengxina;
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
        return "Yiqingfenbu{" +
            "id=" + id +
            ", yiqingfenbuChengshi=" + yiqingfenbuChengshi +
            ", yiqingfenbuShengshi=" + yiqingfenbuShengshi +
            ", yiqingfenbuXinzheng=" + yiqingfenbuXinzheng +
            ", yiqingfenbuWuzhengzhuang=" + yiqingfenbuWuzhengzhuang +
            ", yiqingfenbuFengxina=" + yiqingfenbuFengxina +
            ", createTime=" + createTime +
        "}";
    }
}
