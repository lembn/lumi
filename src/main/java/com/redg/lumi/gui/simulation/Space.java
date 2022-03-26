package com.redg.lumi.gui.simulation;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class Space extends Group {
    public Space() {
        this.setOnMouseMoved(this::handleMouseMoved);
    }

    private void handleMouseMoved(MouseEvent event) {
        System.out.println(event.getScreenX());
    }

    public void add(Node... nodes) {
        this.getChildren().addAll(nodes);
    }
}
