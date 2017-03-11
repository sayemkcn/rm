package net.toracode.domains;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by sayemkcn on 3/11/17.
 */
@Entity(name = "users")
public class User extends BaseEntity{
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_mail")
    private String email;
    @Column(name = "user_phn")
    private String phone;
    @Column(name = "user_pass")
    private String password;
    @Column(name = "user_country")
    private String country;
    @Column(name = "gcm")
    private String gcm;
    private boolean deleted;
    @Column(name = "user_type")
    private String type;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private Collection<Resource> resourceList;
    @ElementCollection(fetch = FetchType.LAZY)
    private Collection<SocialMediaType> socialMediaTypeList;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private Collection<Report> reportList;
    @ManyToOne
    private App app;

    @OneToOne(mappedBy = "user")
    private UserAuth userAuth;

    public User(String name, String email, String phone, String password, String country, String gcm, boolean deleted, String type, Collection<Resource> resourceList, Collection<SocialMediaType> socialMediaTypeList, Collection<Report> reportList, App app, UserAuth userAuth) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.country = country;
        this.gcm = gcm;
        this.deleted = deleted;
        this.type = type;
        this.resourceList = resourceList;
        this.socialMediaTypeList = socialMediaTypeList;
        this.reportList = reportList;
        this.app = app;
        this.userAuth = userAuth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGcm() {
        return gcm;
    }

    public void setGcm(String gcm) {
        this.gcm = gcm;
    }

    public UserAuth getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(UserAuth userAuth) {
        this.userAuth = userAuth;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Collection<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(Collection<Resource> resourceList) {
        this.resourceList = resourceList;
    }

    public Collection<SocialMediaType> getSocialMediaTypeList() {
        return socialMediaTypeList;
    }

    public void setSocialMediaTypeList(Collection<SocialMediaType> socialMediaTypeList) {
        this.socialMediaTypeList = socialMediaTypeList;
    }

    public Collection<Report> getReportList() {
        return reportList;
    }

    public void setReportList(Collection<Report> reportList) {
        this.reportList = reportList;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", country='" + country + '\'' +
                ", gcm='" + gcm + '\'' +
                ", deleted=" + deleted +
                ", type='" + type + '\'' +
                ", resourceList=" + resourceList +
                ", socialMediaTypeList=" + socialMediaTypeList +
                ", reportList=" + reportList +
                ", app=" + app +
                ", userAuth=" + userAuth +
                "} " + super.toString();
    }
}
