package com.deodata.model;

import java.util.List;

public class MovementClass {

    private String cameraDirectory;
    private List<Double> entryLine;
    private List<Double> exitLine;
    private String name;
    private int snapshotIndex;

    public String getCameraDirectory() {
        return cameraDirectory;
    }

    public void setCameraDirectory(String cameraDirectory) {
        this.cameraDirectory = cameraDirectory;
    }

    public List<Double> getEntryLine() {
        return entryLine;
    }

    public void setEntryLine(List<Double> entryLine) {
        this.entryLine = entryLine;
    }

    public List<Double> getExitLine() {
        return exitLine;
    }

    public void setExitLine(List<Double> exitLine) {
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
