package com.donkee.house.entity;

public class House {
        private int hid;
        private int sid;
        private int aid;
        private int mid;
        private String haddress;
        private String hfh;
        private String hhx;
        private String hmj;
        private String hcx;
        private Float hmoney;
        private Float hwf ;
        private Float hdx ;
        private Float hsf;
        private Float hmq ;
        private Float dkd;
        private Float skd;
        private Float mkd;
        private String hjp;
        private String hremark;
        private String himg;
        private String hflag;
        private String mdate;
        private Float myj;
        private Float myzj;
        private String cname;
        private String ctel;
        private String erealname;
        private String sname;
        private String aname;

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    public Float getMyj() {
        return myj;
    }

    public void setMyj(Float myj) {
        this.myj = myj;
    }

    public Float getMyzj() {
        return myzj;
    }

    public void setMyzj(Float myzj) {
        this.myzj = myzj;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCtel() {
        return ctel;
    }

    public void setCtel(String ctel) {
        this.ctel = ctel;
    }

    public String getErealname() {
        return erealname;
    }

    public void setErealname(String erealname) {
        this.erealname = erealname;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getHaddress() {
        return haddress;
    }

    public void setHaddress(String haddress) {
        this.haddress = haddress;
    }

    public String getHfh() {
        return hfh;
    }

    public void setHfh(String hfh) {
        this.hfh = hfh;
    }

    public String getHhx() {
        return hhx;
    }

    public void setHhx(String hhx) {
        this.hhx = hhx;
    }

    public String getHmj() {
        return hmj;
    }

    public void setHmj(String hmj) {
        this.hmj = hmj;
    }

    public String getHcx() {
        return hcx;
    }

    public void setHcx(String hcx) {
        this.hcx = hcx;
    }

    public Float getHmoney() {
        return hmoney;
    }

    public void setHmoney(Float hmoney) {
        this.hmoney = hmoney;
    }

    public Float getHwf() {
        return hwf;
    }

    public void setHwf(Float hwf) {
        this.hwf = hwf;
    }

    public Float getHdx() {
        return hdx;
    }

    public void setHdx(Float hdx) {
        this.hdx = hdx;
    }

    public Float getHsf() {
        return hsf;
    }

    public void setHsf(Float hsf) {
        this.hsf = hsf;
    }

    public Float getHmq() {
        return hmq;
    }

    public void setHmq(Float hmq) {
        this.hmq = hmq;
    }

    public Float getDkd() {
        return dkd;
    }

    public void setDkd(Float dkd) {
        this.dkd = dkd;
    }

    public double getSkd() {
        return skd;
    }

    public void setSkd(Float skd) {
        this.skd = skd;
    }

    public double getMkd() {
        return mkd;
    }

    public void setMkd(Float mkd) {
        this.mkd = mkd;
    }

    public String getHjp() {
        return hjp;
    }

    public void setHjp(String hjp) {
        this.hjp = hjp;
    }

    public String getHremark() {
        return hremark;
    }

    public void setHremark(String hremark) {
        this.hremark = hremark;
    }

    public String getHimg() {
        return himg;
    }

    public void setHimg(String himg) {
        this.himg = himg;
    }

    public String getHflag() {
        return hflag;
    }

    public void setHflag(String hflag) {
        this.hflag = hflag;
    }

    public House() {
        super();
    }

    @Override
    public String toString() {
        return "House{" +
                "hid=" + hid +
                ", sid=" + sid +
                ", aid=" + aid +
                ", haddress='" + haddress + '\'' +
                ", hfh='" + hfh + '\'' +
                ", hhx='" + hhx + '\'' +
                ", hmj='" + hmj + '\'' +
                ", hcx='" + hcx + '\'' +
                ", hmoney=" + hmoney +
                ", hwf=" + hwf +
                ", hdx=" + hdx +
                ", hsf=" + hsf +
                ", hmq=" + hmq +
                ", dkd=" + dkd +
                ", skd=" + skd +
                ", mkd=" + mkd +
                ", hjp='" + hjp + '\'' +
                ", hremark='" + hremark + '\'' +
                ", himg='" + himg + '\'' +
                ", hflag='" + hflag + '\'' +
                ", sname='" + sname + '\'' +
                ", aname='" + aname + '\'' +
                '}';
    }
}
