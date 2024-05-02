package com.entity.vo;

import com.entity.JiankangdakaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 健康信息打卡
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("jiankangdakai")
public class JiankangdakaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 姓名
     */

    @TableField(value = "jiankangdakai_name")
    private String jiankangdakaiName;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 当天体温
     */

    @TableField(value = "jiankangdakai_tiwen")
    private String jiankangdakaiTiwen;


    /**
     * 有无咳嗽
     */

    @TableField(value = "keshou_types")
    private Integer keshouTypes;


    /**
     * 有无外出
     */

    @TableField(value = "wuaichu_types")
    private Integer wuaichuTypes;


    /**
     * 外出地点
     */

    @TableField(value = "jiankangdakai_didian")
    private String jiankangdakaiDidian;


    /**
     * 是否接触病患
     */

    @TableField(value = "binghuan_types")
    private Integer binghuanTypes;


    /**
     * 是否出入高风险区域
     */

    @TableField(value = "gaofengxian_types")
    private Integer gaofengxianTypes;


    /**
     * 照片
     */

    @TableField(value = "jiankangdakai_photo")
    private String jiankangdakaiPhoto;


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
	 * 设置：姓名
	 */
    public String getJiankangdakaiName() {
        return jiankangdakaiName;
    }


    /**
	 * 获取：姓名
	 */

    public void setJiankangdakaiName(String jiankangdakaiName) {
        this.jiankangdakaiName = jiankangdakaiName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：当天体温
	 */
    public String getJiankangdakaiTiwen() {
        return jiankangdakaiTiwen;
    }


    /**
	 * 获取：当天体温
	 */

    public void setJiankangdakaiTiwen(String jiankangdakaiTiwen) {
        this.jiankangdakaiTiwen = jiankangdakaiTiwen;
    }
    /**
	 * 设置：有无咳嗽
	 */
    public Integer getKeshouTypes() {
        return keshouTypes;
    }


    /**
	 * 获取：有无咳嗽
	 */

    public void setKeshouTypes(Integer keshouTypes) {
        this.keshouTypes = keshouTypes;
    }
    /**
	 * 设置：有无外出
	 */
    public Integer getWuaichuTypes() {
        return wuaichuTypes;
    }


    /**
	 * 获取：有无外出
	 */

    public void setWuaichuTypes(Integer wuaichuTypes) {
        this.wuaichuTypes = wuaichuTypes;
    }
    /**
	 * 设置：外出地点
	 */
    public String getJiankangdakaiDidian() {
        return jiankangdakaiDidian;
    }


    /**
	 * 获取：外出地点
	 */

    public void setJiankangdakaiDidian(String jiankangdakaiDidian) {
        this.jiankangdakaiDidian = jiankangdakaiDidian;
    }
    /**
	 * 设置：是否接触病患
	 */
    public Integer getBinghuanTypes() {
        return binghuanTypes;
    }


    /**
	 * 获取：是否接触病患
	 */

    public void setBinghuanTypes(Integer binghuanTypes) {
        this.binghuanTypes = binghuanTypes;
    }
    /**
	 * 设置：是否出入高风险区域
	 */
    public Integer getGaofengxianTypes() {
        return gaofengxianTypes;
    }


    /**
	 * 获取：是否出入高风险区域
	 */

    public void setGaofengxianTypes(Integer gaofengxianTypes) {
        this.gaofengxianTypes = gaofengxianTypes;
    }
    /**
	 * 设置：照片
	 */
    public String getJiankangdakaiPhoto() {
        return jiankangdakaiPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setJiankangdakaiPhoto(String jiankangdakaiPhoto) {
        this.jiankangdakaiPhoto = jiankangdakaiPhoto;
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
