package com.redis.model;

import java.io.Serializable;

public class Role implements Serializable{

    private static final long serialVersionUID = -5441450700658826765L;

    private long id;
    private String rolename;
    private String note;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getRolename() {
        return rolename;
    }
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    @Override
    public String toString() {
        return "Role [id=" + id + ", rolename=" + rolename + ", note=" + note + "]";
    }

}
