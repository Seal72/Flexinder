package com;

public class SampleClass {

    private String name;

    public String execute() throws Exception {
        setName("123");
        return "success";
    }

    public String test() throws Exception {
        setName("456");
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
