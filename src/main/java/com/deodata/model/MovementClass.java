package com.deodata.model;

import java.util.List;

public class MovementClass {

    private String cameraDirectory;
    private List<List<Double>> entryLine;
    private List<List<Double>> exitLine;
    private String name;
    private int snapshotIndex;

    public String getCameraDirectory() {
        return cameraDirectory;
    }

    public void setCameraDirectory(String cameraDirectory) {
        this.cameraDirectory = cameraDirectory;
    }

    public List<List<Double>> getEntryLine() {
        return entryLine;
    }

    public void setEntryLine(List<List<Double>> entryLine) {
        this.entryLine = entryLine;
    }

    public List<List<Double>> getExitLine() {
        return exitLine;
    }

    public void setExitLine(List<List<Double>> exitLine) {
        this.exitLine = exitLine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSnapshotIndex() {
        return snapshotIndex;
    }

    public void setSnapshotIndex(int snapshotIndex) {
        this.snapshotIndex = snapshotIndex;
    }
}
