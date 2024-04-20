package com.mu.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class people {
    @Autowired
    private cat petcat ;
    @Autowired
    private dog petdog;
    private String name;

    public cat getPetcat() {
        return petcat;
    }

    public void setPetcat(cat petcat) {
        this.petcat = petcat;
    }

    public dog getPetdog() {
        return petdog;
    }

    public void setPetdog(dog petdog) {
        this.petdog = petdog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "people{" +
                "petcat=" + petcat +
                ", petdog=" + petdog +
                ", name='" + name + '\'' +
                '}';
    }
}
