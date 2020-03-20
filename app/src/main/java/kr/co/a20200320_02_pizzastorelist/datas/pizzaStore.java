package kr.co.a20200320_02_pizzastorelist.datas;

import java.io.Serializable;

public class pizzaStore implements Serializable {

    private String storeName;
    private String logUrl;
    private String phoneNum;

    public pizzaStore(String storeName, String logUrl, String phoneNum) {
        this.storeName = storeName;
        this.logUrl = logUrl;
        this.phoneNum = phoneNum;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
