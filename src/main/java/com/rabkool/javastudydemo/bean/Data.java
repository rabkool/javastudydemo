package com.rabkool.javastudydemo.bean;

/**
 * @author RabKool
 */
public class Data {
    private String serverName;
    private String databaseName;
    private String userId;
    private String passWord;
    private String boatNumber;
    private String fileAddress1;
    private String fileAddress2;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getBoatNumber() {
        return boatNumber;
    }

    public void setBoatNumber(String boatNumber) {
        this.boatNumber = boatNumber;
    }

    public String getFileAddress1() {
        return fileAddress1;
    }

    public void setFileAddress1(String fileAddress1) {
        this.fileAddress1 = fileAddress1;
    }

    public String getFileAddress2() {
        return fileAddress2;
    }

    public void setFileAddress2(String fileAddress2) {
        this.fileAddress2 = fileAddress2;
    }

    @Override
    public String toString() {
        System.out.println("123123123");

        return serverName + databaseName + userId + passWord + boatNumber + fileAddress1 + fileAddress2;
    }
}

