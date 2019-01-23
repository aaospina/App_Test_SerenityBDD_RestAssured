package com.deodata.model;

import java.util.List;

public class AnalysisClass {

    private int id;
    private String directory;
    private List<Double> latlng;
    private String name;
    private String type;

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public List<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Double> latlng) { this.latlng = latlng; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
