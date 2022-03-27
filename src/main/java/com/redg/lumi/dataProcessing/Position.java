package com.redg.lumi.dataProcessing;

import javafx.beans.property.SimpleDoubleProperty;

public class Position {
    private SimpleDoubleProperty x;
    private SimpleDoubleProperty y;
    private SimpleDoubleProperty z;

    public Position(double x, double y, double z) {
        this.x = new SimpleDoubleProperty(x);
        this.y = new SimpleDoubleProperty(y);
        this.z = new SimpleDoubleProperty(z);
    }

    public void setX(double x) { this.x.setValue(x); }
    public void setY(double y) { this.y.setValue(y); }
    public void setZ(double z) { this.z.setValue(z); }
    public SimpleDoubleProperty getXProperty() { return this.x; }
    public SimpleDoubleProperty getYProperty() { return this.y; }
    public SimpleDoubleProperty getZProperty() { return this.z; }
}
