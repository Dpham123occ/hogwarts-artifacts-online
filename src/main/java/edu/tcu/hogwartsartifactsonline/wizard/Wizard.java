package edu.tcu.hogwartsartifactsonline.wizard;

import java.io.Serializable;

public class Wizard implements Serializable {

    private Integer id;

    private String name;

    public Wizard(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
