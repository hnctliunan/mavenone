package com.entity.security;

import com.base.entity.BaseEntity;
import java.util.Date;

public class TbSecurityCustomer extends BaseEntity {
    private String userName;

    private String userCid;

    private String userCidType;

    private Date userBirthday;

    private String userMobile;

    private String userMail;

    private String userWithdrawPassword;

    private String userWithdrawSalt;

    private Date userRegTime;

    private String userProv;

    private String userCity;

    private String userCountry;

    private String userHometown;

    private String userAddress;

    private String userPhoto;

    private String userReferralCode;

    private String userCertification;

    private Integer userCertificationNumber;

    private Integer userCertificationCount;

    private String userCertificateType;

    private static final long serialVersionUID = 1L;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserCid() {
        return userCid;
    }

    public void setUserCid(String userCid) {
        this.userCid = userCid == null ? null : userCid.trim();
    }

    public String getUserCidType() {
        return userCidType;
    }

    public void setUserCidType(String userCidType) {
        this.userCidType = userCidType == null ? null : userCidType.trim();
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail == null ? null : userMail.trim();
    }

    public String getUserWithdrawPassword() {
        return userWithdrawPassword;
    }

    public void setUserWithdrawPassword(String userWithdrawPassword) {
        this.userWithdrawPassword = userWithdrawPassword == null ? null : userWithdrawPassword.trim();
    }

    public String getUserWithdrawSalt() {
        return userWithdrawSalt;
    }

    public void setUserWithdrawSalt(String userWithdrawSalt) {
        this.userWithdrawSalt = userWithdrawSalt == null ? null : userWithdrawSalt.trim();
    }

    public Date getUserRegTime() {
        return userRegTime;
    }

    public void setUserRegTime(Date userRegTime) {
        this.userRegTime = userRegTime;
    }

    public String getUserProv() {
        return userProv;
    }

    public void setUserProv(String userProv) {
        this.userProv = userProv == null ? null : userProv.trim();
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry == null ? null : userCountry.trim();
    }

    public String getUserHometown() {
        return userHometown;
    }

    public void setUserHometown(String userHometown) {
        this.userHometown = userHometown == null ? null : userHometown.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    public String getUserReferralCode() {
        return userReferralCode;
    }

    public void setUserReferralCode(String userReferralCode) {
        this.userReferralCode = userReferralCode == null ? null : userReferralCode.trim();
    }

    public String getUserCertification() {
        return userCertification;
    }

    public void setUserCertification(String userCertification) {
        this.userCertification = userCertification == null ? null : userCertification.trim();
    }

    public Integer getUserCertificationNumber() {
        return userCertificationNumber;
    }

    public void setUserCertificationNumber(Integer userCertificationNumber) {
        this.userCertificationNumber = userCertificationNumber;
    }

    public Integer getUserCertificationCount() {
        return userCertificationCount;
    }

    public void setUserCertificationCount(Integer userCertificationCount) {
        this.userCertificationCount = userCertificationCount;
    }

    public String getUserCertificateType() {
        return userCertificateType;
    }

    public void setUserCertificateType(String userCertificateType) {
        this.userCertificateType = userCertificateType == null ? null : userCertificateType.trim();
    }
}