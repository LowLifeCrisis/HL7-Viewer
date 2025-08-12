package hl7Viewer.gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Utilities {
    public static final Color TRANSPARENT_COLOR = new Color(0,0,0,0);
    public static final Color PRIMARY_COLOR = Color.decode("#2F2D2D");
    public static final Color SECONDARY_COLOR = Color.decode("#484444");
    public static final Color TERCIARY_COLOR = Color.decode("#616161");
    public static final Color TEXT_COLOR = Color.decode("#1aab00");
    //method that allows you to specify how much padding you want
    public static EmptyBorder addPadding(int top, int left, int bottom, int right ){
        return new EmptyBorder(top, left, bottom, right);
    }
    //preconfigured Title boarder, just need panel obj and Title name
    public static void applyTitledBorder(JPanel panel, String titleText) {
        TitledBorder border = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Utilities.SECONDARY_COLOR, 1),
                titleText,
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("SansSerif", Font.ITALIC, 12),
                Utilities.TEXT_COLOR
        );
        panel.setBorder(border);
        panel.setBackground(Utilities.PRIMARY_COLOR);
        panel.setOpaque(true);
    }
    //used to set the background and text color for any panel jtext obj
    public static void setPanelColors(JComponent component) {
        component.setBackground(Utilities.PRIMARY_COLOR);
        component.setOpaque(true);
        component.setForeground(Utilities.TEXT_COLOR);
    }
}
