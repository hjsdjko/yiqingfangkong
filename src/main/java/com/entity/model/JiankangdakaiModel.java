package com.entity.model;

import com.entity.JiankangdakaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 健康信息打卡
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-16
 */
public class JiankangdakaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 姓名
     */
    private String jiankangdakaiName;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 当天体温
     */
    private String jiankangdakaiTiwen;


    /**
     * 有无咳嗽
     */
    private Integer keshouTypes;


    /**
     * 有无外出
     */
    private Integer wuaichuTypes;


    /**
     * 外出地点
     */
    private String jiankangdakaiDidian;


    /**
     * 是否接触病患
     */
    private Integer binghuanTypes;


    /**
     * 是否出入高风险区域
     */
    private Integer gaofengxianTypes;


    /**
     * 照片
     */
    private String jiankangdakaiPhoto;


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
	 * 获取：姓名
	 */
    public String getJiankangdakaiName() {
        return jiankangdakaiName;
    }


    /**
	 * 设置：姓名
	 */
    public void setJiankangdakaiName(String jiankangdakaiName) {
        this.jiankangdakaiName = jiankangdakaiName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：当天体温
	 */
    public String getJiankangdakaiTiwen() {
        return jiankangdakaiTiwen;
    }


    /**
	 * 设置：当天体温
	 */
    public void setJiankangdakaiTiwen(String jiankangdakaiTiwen) {
        this.jiankangdakaiTiwen = jiankangdakaiTiwen;
    }
    /**
	 * 获取：有无咳嗽
	 */
    public Integer getKeshouTypes() {
        return keshouTypes;
    }


    /**
	 * 设置：有无咳嗽
	 */
    public void setKeshouTypes(Integer keshouTypes) {
        this.keshouTypes = keshouTypes;
    }
    /**
	 * 获取：有无外出
	 */
    public Integer getWuaichuTypes() {
        return wuaichuTypes;
    }


    /**
	 * 设置：有无外出
	 */
    public void setWuaichuTypes(Integer wuaichuTypes) {
        this.wuaichuTypes = wuaichuTypes;
    }
    /**
	 * 获取：外出地点
	 */
    public String getJiankangdakaiDidian() {
        return jiankangdakaiDidian;
    }


    /**
	 * 设置：外出地点
	 */
    public void setJiankangdakaiDidian(String jiankangdakaiDidian) {
        this.jiankangdakaiDidian = jiankangdakaiDidian;
    }
    /**
	 * 获取：是否接触病患
	 */
    public Integer getBinghuanTypes() {
        return binghuanTypes;
    }


    /**
	 * 设置：是否接触病患
	 */
    public void setBinghuanTypes(Integer binghuanTypes) {
        this.binghuanTypes = binghuanTypes;
    }
    /**
	 * 获取：是否出入高风险区域
	 */
    public Integer getGaofengxianTypes() {
        return gaofengxianTypes;
    }


    /**
	 * 设置：是否出入高风险区域
	 */
    public void setGaofengxianTypes(Integer gaofengxianTypes) {
        this.gaofengxianTypes = gaofengxianTypes;
    }
    /**
	 * 获取：照片
	 */
    public String getJiankangdakaiPhoto() {
        return jiankangdakaiPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setJiankangdakaiPhoto(String jiankangdakaiPhoto) {
        this.jiankangdakaiPhoto = jiankangdakaiPhoto;
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
