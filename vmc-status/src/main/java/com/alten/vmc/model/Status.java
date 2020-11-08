package com.alten.vmc.model;

public enum Status {
    CONNECTED ("1", "Vehicle Connected"),
    DISCONNECTED ("0", "Vehicle Disconnected");

    private String statusCode;
    private String statusDesc;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    Status(String statusCode, String statusDesc) {
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }
}
