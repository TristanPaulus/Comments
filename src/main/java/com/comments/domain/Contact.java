package com.comments.domain;

/**
 * Created by Tristan on 2017/05/30.
 */
public class Contact {

    private String cellphone;
    private String address;
    private String postalcode;

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalcode() {
        return postalcode;
    }



}
