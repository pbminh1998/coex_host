package com.upit.coex.host.screen.addco.adapter.service;

public class Service {
    int id;
    String detail;

    public Service() {
    }

    public Service(String detail) {
        this.detail = detail;
    }

    public Service(int id, String detail) {
        this.id = id;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
