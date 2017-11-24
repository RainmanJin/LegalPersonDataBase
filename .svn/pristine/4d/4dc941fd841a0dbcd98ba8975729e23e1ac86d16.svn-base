package com.icinfo.frk.sso.model;

/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */

import com.icinfo.framework.mybatis.mapper.annotation.Before;
import java.io.Serializable;
import javax.persistence.*;

/**
 * 描述:  SYS_USER_INFO 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年04月18日
 */
@Table(name = "frk.sso_user")
public class SsoUser implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @Before
    private String id;

    /**
     * 用户主键id
     */
    @Column(name = "UI_USERID")
    private String userid;

    /**
     * 组织机构编码 顶级目录为”001” (如:浙江省公安厅编码为 001002，每3位数字代表一个组织.001代表浙江省，002代表公安厅，依次类推)
     */
    @Column(name = "UI_ORG_CODING")
    private String orgCoding;

    /**
     * 旧组织机构编码 如果不调换组织机构，不要传该参数
     */
    @Column(name = "UI_OLDORG_CODING")
    private String oldorgCoding;

    /**
     * 附属组织机构编码 多个附属组织以”;” (英文输入法、半角)分号隔开
     */
    @Column(name = "UI_EXTEND_ORG_CODING")
    private String extendOrgCoding;

    /**
     * 附属组织排序 组织编码:排序号. 多个附属组织以”;” (英文输入法、半角)分号隔开.如：001:1;002:3;003:14
     */
    @Column(name = "UI_EXTEND_ORDERBY")
    private String extendOrderby;

    /**
     * 用户的真实姓名 新增时不能为空
     */
    @Column(name = "UI_USERNAME")
    private String username;

    /**
     * 登录名
     */
    @Column(name = "UI_LOGINNAME")
    private String loginname;

    /**
     * 密码加密类型 1. 表示明文2. 表示Base64(UTF-8字符集操作)3 .MD5 （标准32位小写）4 .AES （sun自带库加密，密钥【servicepwd】为SSO提供）
     */
    @Column(name = "UI_ENCRYPTION_TYPE")
    private String encryptionType;

    /**
     * 密码编辑统一用户时为空默认为原密码
     */
    @Column(name = "UI_LOGINPWD")
    private String loginpwd;

    /**
     * 邮件
     */
    @Column(name = "UI_EMAIL")
    private String email;

    /**
     * 手机号码（常用手机）
     */
    @Column(name = "UI_MOBILE")
    private String mobile;

    /**
     * 手机号码2（备用手机）
     */
    @Column(name = "UI_MOBILE2")
    private String mobile2;

    /**
     * 座机号码（常用电话）
     */
    @Column(name = "UI_TELEPHONE")
    private String telephone;

    /**
     * 座机号码2（备用电话）
     */
    @Column(name = "UI_TELEPHONE2")
    private String telephone2;

    /**
     * 虚拟网号
     */
    @Column(name = "UI_VIRTUAL_NUM")
    private String virtualNum;

    /**
     * 职务 多个职务之间用半角字符“;”隔开
     */
    @Column(name = "UI_USER_POSITION")
    private String userPosition;

    /**
     * 职称
     */
    @Column(name = "UI_USERTITLE")
    private String usertitle;

    /**
     * 邮编
     */
    @Column(name = "UI_POSTCODE")
    private String postcode;

    /**
     * CA证书KEY
     */
    @Column(name = "UI_CAKEY")
    private String cakey;

    /**
     * 性别 1男 2女
     */
    @Column(name = "UI_SEX")
    private String sex;

    /**
     * 生日
     */
    @Column(name = "UI_BIRTHDAY")
    private String birthday;

    /**
     * 国籍
     */
    @Column(name = "UI_COUNTRY")
    private String country;

    /**
     * 省籍
     */
    @Column(name = "UI_PROVINCE")
    private String province;

    /**
     * 城市
     */
    @Column(name = "UI_CITY")
    private String city;

    /**
     * 办公地址
     */
    @Column(name = "UI_OFFICE_ADDRESS")
    private String officeAddress;

    /**
     * 办公室号
     */
    @Column(name = "UI_OFFICE_NUM")
    private String officeNum;

    /**
     * 办公电话
     */
    @Column(name = "UI_OFFICE_PHONE")
    private String officePhone;

    /**
     * 办公传真
     */
    @Column(name = "UI_OFFICE_FAX")
    private String officeFax;

    /**
     * 家庭电话
     */
    @Column(name = "UI_HOME_PHONE")
    private String homePhone;

    /**
     * 家庭地址
     */
    @Column(name = "UI_HOME_ADDRESS")
    private String homeAddress;

    /**
     * 是否在编 1 在编2 不在编
     */
    @Column(name = "UI_OFFICIAL")
    private String official;

    /**
     * 编制类别 1：行政编制  2：事业编制
     */
    @Column(name = "UI_OFFICIAL_TYPE")
    private String officialType;

    /**
     * 证件类型证件类型 1身份证2.护照3.军官证4.士兵证5.户口簿 默认为 1.身份证
     */
    @Column(name = "UI_IDTYPE")
    private String idtype;

    /**
     * 证件号码
     */
    @Column(name = "UI_IDNUM")
    private String idnum;

    /**
     * 用户激活状态 1激活，2未激活  默认为：1激活
     */
    @Column(name = "UI_USEABLE")
    private String useable;

    /**
     * 排序
     */
    @Column(name = "UI_ORDERBY")
    private Integer orderby;

    /**
     * 头像地址 http://[sso4]/[ headpicture]    注意：该地址为外网能访问的地址
     */
    @Column(name = "UI_HEADPICTURE")
    private String headpicture;

    /**
     * 添加时间
     */
    @Column(name = "UI_ADDTIME")
    private String addTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户主键id
     *
     * @return UI_USERID - 用户主键id
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置用户主键id
     *
     * @param userid 用户主键id
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取组织机构编码 顶级目录为”001” (如:浙江省公安厅编码为 001002，每3位数字代表一个组织.001代表浙江省，002代表公安厅，依次类推)
     *
     * @return UI_ORG_CODING - 组织机构编码 顶级目录为”001” (如:浙江省公安厅编码为 001002，每3位数字代表一个组织.001代表浙江省，002代表公安厅，依次类推)
     */
    public String getOrgCoding() {
        return orgCoding;
    }

    /**
     * 设置组织机构编码 顶级目录为”001” (如:浙江省公安厅编码为 001002，每3位数字代表一个组织.001代表浙江省，002代表公安厅，依次类推)
     *
     * @param orgCoding 组织机构编码 顶级目录为”001” (如:浙江省公安厅编码为 001002，每3位数字代表一个组织.001代表浙江省，002代表公安厅，依次类推)
     */
    public void setOrgCoding(String orgCoding) {
        this.orgCoding = orgCoding;
    }

    /**
     * 获取旧组织机构编码 如果不调换组织机构，不要传该参数
     *
     * @return UI_OLDORG_CODING - 旧组织机构编码 如果不调换组织机构，不要传该参数
     */
    public String getOldorgCoding() {
        return oldorgCoding;
    }

    /**
     * 设置旧组织机构编码 如果不调换组织机构，不要传该参数
     *
     * @param oldorgCoding 旧组织机构编码 如果不调换组织机构，不要传该参数
     */
    public void setOldorgCoding(String oldorgCoding) {
        this.oldorgCoding = oldorgCoding;
    }

    /**
     * 获取附属组织机构编码 多个附属组织以”;” (英文输入法、半角)分号隔开
     *
     * @return UI_EXTEND_ORG_CODING - 附属组织机构编码 多个附属组织以”;” (英文输入法、半角)分号隔开
     */
    public String getExtendOrgCoding() {
        return extendOrgCoding;
    }

    /**
     * 设置附属组织机构编码 多个附属组织以”;” (英文输入法、半角)分号隔开
     *
     * @param extendOrgCoding 附属组织机构编码 多个附属组织以”;” (英文输入法、半角)分号隔开
     */
    public void setExtendOrgCoding(String extendOrgCoding) {
        this.extendOrgCoding = extendOrgCoding;
    }

    /**
     * 获取附属组织排序 组织编码:排序号. 多个附属组织以”;” (英文输入法、半角)分号隔开.如：001:1;002:3;003:14
     *
     * @return UI_EXTEND_ORDERBY - 附属组织排序 组织编码:排序号. 多个附属组织以”;” (英文输入法、半角)分号隔开.如：001:1;002:3;003:14
     */
    public String getExtendOrderby() {
        return extendOrderby;
    }

    /**
     * 设置附属组织排序 组织编码:排序号. 多个附属组织以”;” (英文输入法、半角)分号隔开.如：001:1;002:3;003:14
     *
     * @param extendOrderby 附属组织排序 组织编码:排序号. 多个附属组织以”;” (英文输入法、半角)分号隔开.如：001:1;002:3;003:14
     */
    public void setExtendOrderby(String extendOrderby) {
        this.extendOrderby = extendOrderby;
    }

    /**
     * 获取用户的真实姓名 新增时不能为空
     *
     * @return UI_USERNAME - 用户的真实姓名 新增时不能为空
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户的真实姓名 新增时不能为空
     *
     * @param username 用户的真实姓名 新增时不能为空
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取登录名
     *
     * @return UI_LOGINNAME - 登录名
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * 设置登录名
     *
     * @param loginname 登录名
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    /**
     * 获取密码加密类型 1. 表示明文2. 表示Base64(UTF-8字符集操作)3 .MD5 （标准32位小写）4 .AES （sun自带库加密，密钥【servicepwd】为SSO提供）
     *
     * @return UI_ENCRYPTION_TYPE - 密码加密类型 1. 表示明文2. 表示Base64(UTF-8字符集操作)3 .MD5 （标准32位小写）4 .AES （sun自带库加密，密钥【servicepwd】为SSO提供）
     */
    public String getEncryptionType() {
        return encryptionType;
    }

    /**
     * 设置密码加密类型 1. 表示明文2. 表示Base64(UTF-8字符集操作)3 .MD5 （标准32位小写）4 .AES （sun自带库加密，密钥【servicepwd】为SSO提供）
     *
     * @param encryptionType 密码加密类型 1. 表示明文2. 表示Base64(UTF-8字符集操作)3 .MD5 （标准32位小写）4 .AES （sun自带库加密，密钥【servicepwd】为SSO提供）
     */
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * 获取密码编辑统一用户时为空默认为原密码
     *
     * @return UI_LOGINPWD - 密码编辑统一用户时为空默认为原密码
     */
    public String getLoginpwd() {
        return loginpwd;
    }

    /**
     * 设置密码编辑统一用户时为空默认为原密码
     *
     * @param loginpwd 密码编辑统一用户时为空默认为原密码
     */
    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }

    /**
     * 获取邮件
     *
     * @return UI_EMAIL - 邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮件
     *
     * @param email 邮件
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取手机号码（常用手机）
     *
     * @return UI_MOBILE - 手机号码（常用手机）
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号码（常用手机）
     *
     * @param mobile 手机号码（常用手机）
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取手机号码2（备用手机）
     *
     * @return UI_MOBILE2 - 手机号码2（备用手机）
     */
    public String getMobile2() {
        return mobile2;
    }

    /**
     * 设置手机号码2（备用手机）
     *
     * @param mobile2 手机号码2（备用手机）
     */
    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    /**
     * 获取座机号码（常用电话）
     *
     * @return UI_TELEPHONE - 座机号码（常用电话）
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置座机号码（常用电话）
     *
     * @param telephone 座机号码（常用电话）
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取座机号码2（备用电话）
     *
     * @return UI_TELEPHONE2 - 座机号码2（备用电话）
     */
    public String getTelephone2() {
        return telephone2;
    }

    /**
     * 设置座机号码2（备用电话）
     *
     * @param telephone2 座机号码2（备用电话）
     */
    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

    /**
     * 获取虚拟网号
     *
     * @return UI_VIRTUAL_NUM - 虚拟网号
     */
    public String getVirtualNum() {
        return virtualNum;
    }

    /**
     * 设置虚拟网号
     *
     * @param virtualNum 虚拟网号
     */
    public void setVirtualNum(String virtualNum) {
        this.virtualNum = virtualNum;
    }

    /**
     * 获取职务 多个职务之间用半角字符“;”隔开
     *
     * @return UI_USER_POSITION - 职务 多个职务之间用半角字符“;”隔开
     */
    public String getUserPosition() {
        return userPosition;
    }

    /**
     * 设置职务 多个职务之间用半角字符“;”隔开
     *
     * @param userPosition 职务 多个职务之间用半角字符“;”隔开
     */
    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    /**
     * 获取职称
     *
     * @return UI_USERTITLE - 职称
     */
    public String getUsertitle() {
        return usertitle;
    }

    /**
     * 设置职称
     *
     * @param usertitle 职称
     */
    public void setUsertitle(String usertitle) {
        this.usertitle = usertitle;
    }

    /**
     * 获取邮编
     *
     * @return UI_POSTCODE - 邮编
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 设置邮编
     *
     * @param postcode 邮编
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * 获取CA证书KEY
     *
     * @return UI_CAKEY - CA证书KEY
     */
    public String getCakey() {
        return cakey;
    }

    /**
     * 设置CA证书KEY
     *
     * @param cakey CA证书KEY
     */
    public void setCakey(String cakey) {
        this.cakey = cakey;
    }

    /**
     * 获取性别 1男 2女
     *
     * @return UI_SEX - 性别 1男 2女
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别 1男 2女
     *
     * @param sex 性别 1男 2女
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取生日
     *
     * @return UI_BIRTHDAY - 生日
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取国籍
     *
     * @return UI_COUNTRY - 国籍
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国籍
     *
     * @param country 国籍
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取省籍
     *
     * @return UI_PROVINCE - 省籍
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省籍
     *
     * @param province 省籍
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取城市
     *
     * @return UI_CITY - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取办公地址
     *
     * @return UI_OFFICE_ADDRESS - 办公地址
     */
    public String getOfficeAddress() {
        return officeAddress;
    }

    /**
     * 设置办公地址
     *
     * @param officeAddress 办公地址
     */
    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    /**
     * 获取办公室号
     *
     * @return UI_OFFICE_NUM - 办公室号
     */
    public String getOfficeNum() {
        return officeNum;
    }

    /**
     * 设置办公室号
     *
     * @param officeNum 办公室号
     */
    public void setOfficeNum(String officeNum) {
        this.officeNum = officeNum;
    }

    /**
     * 获取办公电话
     *
     * @return UI_OFFICE_PHONE - 办公电话
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * 设置办公电话
     *
     * @param officePhone 办公电话
     */
    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    /**
     * 获取办公传真
     *
     * @return UI_OFFICE_FAX - 办公传真
     */
    public String getOfficeFax() {
        return officeFax;
    }

    /**
     * 设置办公传真
     *
     * @param officeFax 办公传真
     */
    public void setOfficeFax(String officeFax) {
        this.officeFax = officeFax;
    }

    /**
     * 获取家庭电话
     *
     * @return UI_HOME_PHONE - 家庭电话
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * 设置家庭电话
     *
     * @param homePhone 家庭电话
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * 获取家庭地址
     *
     * @return UI_HOME_ADDRESS - 家庭地址
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * 设置家庭地址
     *
     * @param homeAddress 家庭地址
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * 获取是否在编 1 在编2 不在编
     *
     * @return UI_OFFICIAL - 是否在编 1 在编2 不在编
     */
    public String getOfficial() {
        return official;
    }

    /**
     * 设置是否在编 1 在编2 不在编
     *
     * @param official 是否在编 1 在编2 不在编
     */
    public void setOfficial(String official) {
        this.official = official;
    }

    /**
     * 获取编制类别 1：行政编制  2：事业编制
     *
     * @return UI_OFFICIAL_TYPE - 编制类别 1：行政编制  2：事业编制
     */
    public String getOfficialType() {
        return officialType;
    }

    /**
     * 设置编制类别 1：行政编制  2：事业编制
     *
     * @param officialType 编制类别 1：行政编制  2：事业编制
     */
    public void setOfficialType(String officialType) {
        this.officialType = officialType;
    }

    /**
     * 获取证件类型证件类型 1身份证2.护照3.军官证4.士兵证5.户口簿 默认为 1.身份证
     *
     * @return UI_IDTYPE - 证件类型证件类型 1身份证2.护照3.军官证4.士兵证5.户口簿 默认为 1.身份证
     */
    public String getIdtype() {
        return idtype;
    }

    /**
     * 设置证件类型证件类型 1身份证2.护照3.军官证4.士兵证5.户口簿 默认为 1.身份证
     *
     * @param idtype 证件类型证件类型 1身份证2.护照3.军官证4.士兵证5.户口簿 默认为 1.身份证
     */
    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    /**
     * 获取证件号码
     *
     * @return UI_IDNUM - 证件号码
     */
    public String getIdnum() {
        return idnum;
    }

    /**
     * 设置证件号码
     *
     * @param idnum 证件号码
     */
    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    /**
     * 获取用户激活状态 1激活，2未激活  默认为：1激活
     *
     * @return UI_USEABLE - 用户激活状态 1激活，2未激活  默认为：1激活
     */
    public String getUseable() {
        return useable;
    }

    /**
     * 设置用户激活状态 1激活，2未激活  默认为：1激活
     *
     * @param useable 用户激活状态 1激活，2未激活  默认为：1激活
     */
    public void setUseable(String useable) {
        this.useable = useable;
    }

    /**
     * 获取排序
     *
     * @return UI_ORDERBY - 排序
     */
    public Integer getOrderby() {
        return orderby;
    }

    /**
     * 设置排序
     *
     * @param orderby 排序
     */
    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
    }

    /**
     * 获取头像地址 http://[sso4]/[ headpicture]    注意：该地址为外网能访问的地址
     *
     * @return UI_HEADPICTURE - 头像地址 http://[sso4]/[ headpicture]    注意：该地址为外网能访问的地址
     */
    public String getHeadpicture() {
        return headpicture;
    }

    /**
     * 设置头像地址 http://[sso4]/[ headpicture]    注意：该地址为外网能访问的地址
     *
     * @param headpicture 头像地址 http://[sso4]/[ headpicture]    注意：该地址为外网能访问的地址
     */
    public void setHeadpicture(String headpicture) {
        this.headpicture = headpicture;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }
}