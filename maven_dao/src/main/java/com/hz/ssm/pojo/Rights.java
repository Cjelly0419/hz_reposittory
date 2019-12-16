package com.hz.ssm.pojo;

public class Rights {
    private String rightsid;

    private String rightsparentid;

    private String rightsname;

    private String rightsUrl;

    public String getRightsid() {
        return rightsid;
    }

    public void setRightsid(String rightsid) {
        this.rightsid = rightsid == null ? null : rightsid.trim();
    }

    public String getRightsparentid() {
        return rightsparentid;
    }

    public void setRightsparentid(String rightsparentid) {
        this.rightsparentid = rightsparentid == null ? null : rightsparentid.trim();
    }

    public String getRightsname() {
        return rightsname;
    }

    public void setRightsname(String rightsname) {
        this.rightsname = rightsname == null ? null : rightsname.trim();
    }

    public String getRightsUrl() {
        return rightsUrl;
    }

    public void setRightsUrl(String rightsUrl) {
        this.rightsUrl = rightsUrl == null ? null : rightsUrl.trim();
    }
}