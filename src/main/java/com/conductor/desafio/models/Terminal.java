package com.conductor.desafio.models;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;



@Entity
@Table(name="TB_TERMINAL")
public class Terminal implements Serializable {
    @Id
    @NotNull
    private Integer logic;
    @NotNull
    private String serial;
    @NotNull
    private String model;
    private Integer sam;
    private String ptid;
    private Integer plat;
    @NotNull
    private String version;
    private Integer mxr;
    private Integer mxf;
    private String  VERFM;

    public Integer getLogic() {
        return logic;
    }

    public String getSerial() {
        return serial;
    }

    public String getModel() {
        return model;
    }

    public Integer getSam() {
        return sam;
    }

    public String getPtid() {
        return ptid;
    }

    public Integer getPlat() {
        return plat;
    }

    public String getVersion() {
        return version;
    }

    public Integer getMxr() {
        return mxr;
    }

    public Integer getMxf() {
        return mxf;
    }

    public String getVERFM() {
        return VERFM;
    }

    public void setLogic(Integer logic) {
        this.logic = logic;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSam(Integer sam) {
        this.sam = sam;
    }

    public void setPtid(String ptid) {
        this.ptid = ptid;
    }

    public void setPlat(Integer plat) {
        this.plat = plat;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setMxr(Integer mxr) {
        this.mxr = mxr;
    }

    public void setMxf(Integer mxf) {
        this.mxf = mxf;
    }

    public void setVERFM(String VERFM) {
        this.VERFM = VERFM;
    }

    @Override
    public String toString() {
        return "{" +
                "logic:" + logic + "" +
                ", serial:" + '\"' +  serial + '\"'  +
                ", model:" + '\"' + model + '\"' +
                ", sam:" + sam  +
                ", ptid:" + '\"' + ptid + '\"' +
                ", plat:" + plat +
                ", version:" + '\"' + version + '\"' +
                ", mxr:" + mxr +
                ", mxf:" + mxf +
                ", VERFM:"+ '\"'  + VERFM + '\"' +
                '}';
    }
}
