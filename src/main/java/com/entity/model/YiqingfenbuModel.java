package com.entity.model;

import com.entity.YiqingfenbuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 疫情分布
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-16
 */
public class YiqingfenbuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 城市(区)
     */
    private String yiqingfenbuChengshi;


    /**
     * 省市(区)
     */
    private String yiqingfenbuShengshi;


    /**
     * 新增确诊
     */
    private Integer yiqingfenbuXinzheng;


    /**
     * 新增无症状
     */
    private Integer yiqingfenbuWuzhengzhuang;


    /**
     * 风险区域
     */
    private Integer yiqingfenbuFengxina;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：城市(区)
	 */
    public String getYiqingfenbuChengshi() {
        return yiqingfenbuChengshi;
    }


    /**
	 * 设置：城市(区)
	 */
    public void setYiqingfenbuChengshi(String yiqingfenbuChengshi) {
        this.yiqingfenbuChengshi = yiqingfenbuChengshi;
    }
    /**
	 * 获取：省市(区)
	 */
    public String getYiqingfenbuShengshi() {
        return yiqingfenbuShengshi;
    }


    /**
	 * 设置：省市(区)
	 */
    public void setYiqingfenbuShengshi(String yiqingfenbuShengshi) {
        this.yiqingfenbuShengshi = yiqingfenbuShengshi;
    }
    /**
	 * 获取：新增确诊
	 */
    public Integer getYiqingfenbuXinzheng() {
        return yiqingfenbuXinzheng;
    }


    /**
	 * 设置：新增确诊
	 */
    public void setYiqingfenbuXinzheng(Integer yiqingfenbuXinzheng) {
        this.yiqingfenbuXinzheng = yiqingfenbuXinzheng;
    }
    /**
	 * 获取：新增无症状
	 */
    public Integer getYiqingfenbuWuzhengzhuang() {
        return yiqingfenbuWuzhengzhuang;
    }


    /**
	 * 设置：新增无症状
	 */
    public void setYiqingfenbuWuzhengzhuang(Integer yiqingfenbuWuzhengzhuang) {
        this.yiqingfenbuWuzhengzhuang = yiqingfenbuWuzhengzhuang;
    }
    /**
	 * 获取：风险区域
	 */
    public Integer getYiqingfenbuFengxina() {
        return yiqingfenbuFengxina;
    }


    /**
	 * 设置：风险区域
	 */
    public void setYiqingfenbuFengxina(Integer yiqingfenbuFengxina) {
        this.yiqingfenbuFengxina = yiqingfenbuFengxina;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
