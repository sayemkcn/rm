package net.toracode.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by sayemkcn on 3/11/17.
 */
@Entity
public class AppCategory extends BaseEntity {
    @Column(name = "app_cat_name")
    private String name;
    @Column(name = "app_cat_logo")
    private byte[] logo;
    @Column(name = "app_cat_desc")
    private String description;
    @OneToMany(mappedBy = "category")
    private Collection<Resource> resourceList;
    @ManyToOne
    private App app;

    public AppCategory(String name, byte[] logo, String description, Collection<Resource> resourceList, App app) {
        this.name = name;
        this.logo = logo;
        this.description = description;
        this.resourceList = resourceList;
        this.app = app;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(Collection<Resource> resourceList) {
        this.resourceList = resourceList;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    @Override
    public String toString() {
        return "AppCategory{" +
                "name='" + name + '\'' +
                ", logo=" + Arrays.toString(logo) +
                ", description='" + description + '\'' +
                ", resourceList=" + resourceList +
                ", app=" + app +
                "} " + super.toString();
    }
}
