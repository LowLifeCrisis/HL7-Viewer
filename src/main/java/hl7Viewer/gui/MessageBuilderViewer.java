package hl7Viewer.gui;

import javax.swing.*;
import java.awt.*;

public class MessageBuilderViewer {

    private JTextArea _outputArea;
    //main panel creation
    public JPanel createMessageBuilderPanel() {
        JPanel mainPanel = new JPanel(new BorderLayout());
        // Title at the top
        setTitle(mainPanel);
        // Split panel with two columns
        JPanel splitPanel = new JPanel(new GridLayout(1, 2));
        splitPanel.add(messageCustomizationPanel());
        splitPanel.add(generatedMessagePanel());

        mainPanel.add(splitPanel, BorderLayout.CENTER);
        return mainPanel;
    }
    //Sets Title for message builder
    private static void setTitle(JPanel mainPanel) {
        var titleLabel = new JLabel("HL7 Message Builder", SwingConstants.CENTER);
        Utilities.setPanelColors(titleLabel);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        titleLabel.setBorder(Utilities.addPadding(8, 0, 8, 0));
        mainPanel.add(titleLabel, BorderLayout.NORTH);
    }

    //creates message picker panel
    private JPanel messageCustomizationPanel() {
        var customizationPanel = new JPanel();
        customizationPanel.setLayout(new BoxLayout(customizationPanel, BoxLayout.Y_AXIS));
        customizationPanel.setBorder(BorderFactory.createTitledBorder("Customization"));
        Utilities.applyTitledBorder(customizationPanel, "Hl7 Message Picker");
        return customizationPanel;
    }
    //creates panel that will show generated message
    private JPanel generatedMessagePanel() {
        JPanel messagePanel = new JPanel(new BorderLayout());
        Utilities.applyTitledBorder(messagePanel, "Message Output");

        _outputArea = new JTextArea();
        Utilities.setPanelColors(_outputArea);
        _outputArea.setEditable(false);
        _outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(_outputArea);
        messagePanel.add(scrollPane, BorderLayout.CENTER);

        return messagePanel;
    }
    //will be used to set the output message
    public void setOutputMessage(String message) {
        _outputArea.setText(message);
    }
}
