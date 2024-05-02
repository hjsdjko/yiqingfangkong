package com.entity.vo;

import com.entity.YiqingfenbuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 疫情分布
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("yiqingfenbu")
public class YiqingfenbuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
