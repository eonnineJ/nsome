package com.app.nsome.member.domain;

public enum GenderType {
    Male("M"),
    Female("F");

    private String gender;

    GenderType(String gender) {
        this.gender = gender;
    }

    public String getValue() {
        return gender;
    }

}
