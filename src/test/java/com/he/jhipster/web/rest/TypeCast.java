package com.he.jhipster.web.rest;

public class TypeCast {

    public static void main(String[] args) {

        SeniorStudent seniorStudent = new SeniorStudent("alan", 177);

        System.out.println(seniorStudent.toString());

        System.out.println((Student) seniorStudent);

    }
}
