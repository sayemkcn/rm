package net.toracode.domains;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by sayemkcn on 3/11/17.
 */
@Entity
public class SocialMediaType extends BaseEntity {
    @Column(name = "social_media_name")
    private String name;
    @Column(name = "social_media_url")
    private String url;

    public SocialMediaType(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "SocialMediaType{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                "} " + super.toString();
    }
}
