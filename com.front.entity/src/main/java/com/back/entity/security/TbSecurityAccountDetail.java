package com.back.entity.security;

import com.base.entity.BaseEntity;
import java.util.Date;

public class TbSecurityAccountDetail extends BaseEntity {
    private String detName;

    private String detSex;

    private String detCid;

    private String detWrokNumber;

    private String detMail;

    private String detQq;

    private String detAddress;

    private Date detBirthday;

    private static final long serialVersionUID = 1L;

    public String getDetName() {
        return detName;
    }

    public void setDetName(String detName) {
        this.detName = detName == null ? null : detName.trim();
    }

    public String getDetSex() {
        return detSex;
    }

    public void setDetSex(String detSex) {
        this.detSex = detSex == null ? null : detSex.trim();
    }

    public String getDetCid() {
        return detCid;
    }

    public void setDetCid(String detCid) {
        this.detCid = detCid == null ? null : detCid.trim();
    }

    public String getDetWrokNumber() {
        return detWrokNumber;
    }

    public void setDetWrokNumber(String detWrokNumber) {
        this.detWrokNumber = detWrokNumber == null ? null : detWrokNumber.trim();
    }

    public String getDetMail() {
        return detMail;
    }

    public void setDetMail(String detMail) {
        this.detMail = detMail == null ? null : detMail.trim();
    }

    public String getDetQq() {
        return detQq;
    }

    public void setDetQq(String detQq) {
        this.detQq = detQq == null ? null : detQq.trim();
    }

    public String getDetAddress() {
        return detAddress;
    }

    public void setDetAddress(String detAddress) {
        this.detAddress = detAddress == null ? null : detAddress.trim();
    }

    public Date getDetBirthday() {
        return detBirthday;
    }

    public void setDetBirthday(Date detBirthday) {
        this.detBirthday = detBirthday;
    }
}