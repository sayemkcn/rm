package net.toracode.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by sayemkcn on 3/11/17.
 */
@Entity(name = "apps")
public class App extends BaseEntity {
    @Column(name = "app_name")
    private String name;
    @Column(name = "app_logo", length = 10000000)
    private byte[] logo;
    @Column(name = "app_version")
    private String version;
    @Column(name = "app_url")
    private String url;
    @Column(name = "app_desc")
    private String description;
    @Column(name = "app_package")
    private String packageName;
    @Column(name = "app_build_name")
    private String buildName;
    @Column(name = "delete_flag")
    private boolean deleted;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "app")
    private Collection<AppCategory> categoryList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "app")
    private Collection<User> userList;

    public App(String name, byte[] logo, String version, String url, String description, String packageName, String buildName, boolean deleted, Collection<AppCategory> categoryList, Collection<User> userList) {
        this.name = name;
        this.logo = logo;
        this.version = version;
        this.url = url;
        this.description = description;
        this.packageName = packageName;
        this.buildName = buildName;
        this.deleted = deleted;
        this.categoryList = categoryList;
        this.userList = userList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Collection<AppCategory> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(Collection<AppCategory> categoryList) {
        this.categoryList = categoryList;
    }

    public Collection<User> getUserList() {
        return userList;
    }

    public void setUserList(Collection<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", logo=" + Arrays.toString(logo) +
                ", version='" + version + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", packageName='" + packageName + '\'' +
                ", buildName='" + buildName + '\'' +
                ", deleted=" + deleted +
                ", categoryList=" + categoryList +
                ", userList=" + userList +
                "} " + super.toString();
    }
}
