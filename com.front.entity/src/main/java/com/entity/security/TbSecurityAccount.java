package com.entity.security;

import com.base.entity.BaseEntity;

public class TbSecurityAccount extends BaseEntity {
    private String loginName;

    private String loginPass;

    private String loginSalt;

    private String loginType;

    private String loginClassify;

    private String loginDetail;

    private String loginBackLock;

    private String loginErrorLock;

    private Integer loginErrorCount;

    private static final long serialVersionUID = 1L;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass == null ? null : loginPass.trim();
    }

    public String getLoginSalt() {
        return loginSalt;
    }

    public void setLoginSalt(String loginSalt) {
        this.loginSalt = loginSalt == null ? null : loginSalt.trim();
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType == null ? null : loginType.trim();
    }

    public String getLoginClassify() {
        return loginClassify;
    }

    public void setLoginClassify(String loginClassify) {
        this.loginClassify = loginClassify == null ? null : loginClassify.trim();
    }

    public String getLoginDetail() {
        return loginDetail;
    }

    public void setLoginDetail(String loginDetail) {
        this.loginDetail = loginDetail == null ? null : loginDetail.trim();
    }

    public String getLoginBackLock() {
        return loginBackLock;
    }

    public void setLoginBackLock(String loginBackLock) {
        this.loginBackLock = loginBackLock == null ? null : loginBackLock.trim();
    }

    public String getLoginErrorLock() {
        return loginErrorLock;
    }

    public void setLoginErrorLock(String loginErrorLock) {
        this.loginErrorLock = loginErrorLock == null ? null : loginErrorLock.trim();
    }

    public Integer getLoginErrorCount() {
        return loginErrorCount;
    }

    public void setLoginErrorCount(Integer loginErrorCount) {
        this.loginErrorCount = loginErrorCount;
    }
}