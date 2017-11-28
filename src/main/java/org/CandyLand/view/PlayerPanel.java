package org.CandyLand.view;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends JPanel {

    private static final Color ACTIVE_BACKGROUND = Color.WHITE;
    private static final Color INACTIVE_BACKGROUND = Color.GRAY;
    private static boolean isActive;

    public PlayerPanel(String playerName, boolean active){
        //leave a space for finish
        JLabel playerNameLabel = new JLabel(playerName, 0);
        this.setLayout(new BorderLayout());
        this.add(playerNameLabel);
        if(active){
            this.setBackground(ACTIVE_BACKGROUND);
            this.isActive = true;
        }
        else{
            this.setBackground(INACTIVE_BACKGROUND);
            this.isActive = false;
        }
    }
    public void activatePlayer(){
        this.setBackground(ACTIVE_BACKGROUND);
    }
    public void deactivatePlayer(){
        this.setBackground(INACTIVE_BACKGROUND);
    }
    public boolean isActive() {
        return this.getBackground().equals(ACTIVE_BACKGROUND);
    }
}
