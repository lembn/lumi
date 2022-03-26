package com.redg.lumi.gui.simulation;

import javafx.scene.Group;
import javafx.scene.Node;

public class Space extends Group {
    public void add(Node... nodes) {
        this.getChildren().addAll(nodes);
    }
}
