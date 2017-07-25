package com.imooc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sssj02 {
    @Id
    @GeneratedValue
    private Integer xh;
    private String jh;
    private String yy;
    private String jkwd;
    private String status;
    private String sftb;
    private String jdyl;
    private String jtyl;
    private String btyl;
    private String tw;

    public Sssj02() {
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getJh() {
        return jh;
    }

    public void setJh(String jh) {
        this.jh = jh;
    }

    public String getYy() {
        return yy;
    }

    public void setYy(String yy) {
        this.yy = yy;
    }

    public String getJkwd() {
        return jkwd;
    }

    public void setJkwd(String jkwd) {
        this.jkwd = jkwd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSftb() {
        return sftb;
    }

    public void setSftb(String sftb) {
        this.sftb = sftb;
    }

    public String getJdyl() {
        return jdyl;
    }

    public void setJdyl(String jdyl) {
        this.jdyl = jdyl;
    }

    public String getJtyl() {
        return jtyl;
    }

    public void setJtyl(String jtyl) {
        this.jtyl = jtyl;
    }

    public String getBtyl() {
        return btyl;
    }

    public void setBtyl(String btyl) {
        this.btyl = btyl;
    }

    public String getTw() {
        return tw;
    }

    public void setTw(String tw) {
        this.tw = tw;
    }
}
