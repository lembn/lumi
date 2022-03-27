package com.redg.lumi.gui.ui;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class UI extends VBox {
    private static final Image HAMBURGER_ICON = new Image(UI.class.getResource("hamburger.png").toString());
    private static final int HAMBURGER_SIZE = 30;

    private static final float INITIAL_HAMBURGER_OPACITY = 0.6f;
    private static final float INITIAL_HAMBURGER_SCALE = 0.8f;

    private static final int SIDEBAR_TRANSLATION = 250;

    private static final Duration ANIMATION_DURATION = Duration.millis(200);

    private Menu menu = new Menu();
    private boolean menuOpen;

    public UI() {
        setPadding(new Insets(10, 10, 10, 10));
        setSpacing(12);
        setAlignment(Pos.TOP_LEFT);
        setMaxHeight(280);
        setMaxWidth(250);

        ImageView hamburger = new ImageView(HAMBURGER_ICON);
        hamburger.setFitWidth(HAMBURGER_SIZE);
        hamburger.setFitHeight(HAMBURGER_SIZE);
        hamburger.setOpacity(INITIAL_HAMBURGER_OPACITY);
        hamburger.setScaleX(INITIAL_HAMBURGER_SCALE);
        hamburger.setScaleY(INITIAL_HAMBURGER_SCALE);

        Pane hamburgerContainer = new Pane(hamburger);
        hamburgerContainer.setMaxWidth(HAMBURGER_SIZE);
        hamburgerContainer.setMaxHeight(HAMBURGER_SIZE);

        menu.setTranslateX(-SIDEBAR_TRANSLATION);
        hamburgerContainer.setOnMouseClicked(new EventHandler<MouseEvent>() {
            TranslateTransition tt = new TranslateTransition(ANIMATION_DURATION, menu);

            @Override
            public void handle(MouseEvent event) {
                menuOpen = !menuOpen;
                tt.setFromX(menuOpen ? -SIDEBAR_TRANSLATION : 0);
                tt.setToX(menuOpen ? 0 : -SIDEBAR_TRANSLATION);
                tt.play();
            }
        });

        hamburgerContainer.hoverProperty().addListener(new ChangeListener<Boolean>() {
            FadeTransition ft = new FadeTransition(ANIMATION_DURATION, hamburger);
            ScaleTransition st = new ScaleTransition(ANIMATION_DURATION, hamburger);
            ParallelTransition pt = new ParallelTransition(ft, st);

            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                setCursor(newValue ? Cursor.HAND : Cursor.DEFAULT);
                ft.setFromValue(newValue ? INITIAL_HAMBURGER_OPACITY : 1);
                st.setFromX(newValue ? INITIAL_HAMBURGER_SCALE : 1);
                st.setFromY(newValue ? INITIAL_HAMBURGER_SCALE : 1);
                ft.setToValue(newValue ? 1 : INITIAL_HAMBURGER_OPACITY);
                st.setToX(newValue ? 1 : INITIAL_HAMBURGER_SCALE);
                st.setToY(newValue ? 1 : INITIAL_HAMBURGER_SCALE);
                pt.play();
            }
        });

        getChildren().addAll(hamburgerContainer, menu);
    }
}
