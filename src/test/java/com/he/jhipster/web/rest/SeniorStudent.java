package com.he.jhipster.web.rest;

public class SeniorStudent extends Student {
    private Integer height;

    public SeniorStudent(String name) {
        super(name);
    }

    public SeniorStudent(String name, Integer height) {
        super(name);
        this.height = height;
    }
}
