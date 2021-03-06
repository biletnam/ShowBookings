package com.damienksandoval.www.showbookings;


import java.io.Serializable;

/**
 * ShowItem class is used for creating events. Events are currently stored in an ArrayList with
 * future plans of implementing a remote database
 */

public class ShowItem implements Serializable {
    private String showName;
    private int capacity;
    private int sday;
    private int smonth;
    private int syear;
    private int eday;
    private int emonth;
    private int eyear;
    private int shour;
    private int sminute;
    private int ehour;
    private int eminute;


    public ShowItem(String name, int venCapacity, int sday, int smonth, int syear, int eday, int emonth, int eyear,
                    int shour, int sminute, int ehour, int eminute) {
        this.showName = name;
        this.capacity = venCapacity;
        this.sday = sday;
        this.smonth = smonth;
        this.syear = syear;
        this.eday = eday;
        this.emonth = emonth;
        this.eyear = eyear;
        this.shour = shour;
        this.sminute = sminute;
        this.ehour = ehour;
        this.eminute = eminute;
    }


    public String getShowName() {
        return showName;
    }

    public void setShowName(String newShowName) {
        this.showName = newShowName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int newCapacity) {
        this.capacity = newCapacity;
    }

    public int getShour() {
        return shour;
    }

    public void setShour(int shour) {
        this.shour = shour;
    }

    public int getSminute() {
        return sminute;
    }

    public void setSminute(int sminute) {
        this.sminute = sminute;
    }

    public int getEhour() {
        return ehour;
    }

    public void setEhour(int ehour) {
        this.ehour = ehour;
    }

    public int getEminute() {
        return eminute;
    }

    public void setEminute(int eminute) {
        this.eminute = eminute;
    }

    public int getSday() {
        return sday;
    }

    public void setSday(int sday) {
        this.sday = sday;
    }

    public int getSmonth() {
        return smonth;
    }

    public void setSmonth(int smonth) {
        this.smonth = smonth;
    }

    public int getSyear() {
        return syear;
    }

    public void setSyear(int syear) {
        this.syear = syear;
    }

    public int getEday() {
        return eday;
    }

    public void setEday(int eday) {
        this.eday = eday;
    }

    public int getEmonth() {
        return emonth;
    }

    public void setEmonth(int emonth) {
        this.emonth = emonth;
    }

    public int getEyear() {
        return eyear;
    }

    public void setEyear(int eyear) {
        this.eyear = eyear;
    }
}