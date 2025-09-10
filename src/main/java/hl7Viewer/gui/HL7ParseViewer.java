package hl7Viewer.gui;

import hl7Viewer.nonGui.parser.HL7Node;
import hl7Viewer.nonGui.parser.HL7Parser;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class HL7ParseViewer {
    private HL7TableViewer hl7TableViewer;

    public JPanel createPanel() {
        JPanel outerPanel = new JPanel(new BorderLayout());
        outerPanel.setOpaque(false);
        Utilities.setTitle(outerPanel, "HL7 Viewer");

        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.setOpaque(false);

        hl7TableViewer = new HL7TableViewer();
        JPanel messagePanel = createMessageInputPanel();

        mainPanel.add(messagePanel);
        mainPanel.add(hl7TableViewer);
        outerPanel.add(mainPanel, BorderLayout.CENTER);

        return outerPanel;
    }

    private JPanel createMessageInputPanel() {
        JPanel messagePanel = new JPanel(new BorderLayout());
        messagePanel.setOpaque(false);
        Utilities.setTitledBorder(messagePanel, "HL7 message to Parse");

        JTextArea inputField = new JTextArea();
        Utilities.setTextBox(inputField, true, false);
        inputField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Utilities.SECONDARY_COLOR, 2),
                Utilities.addPadding(10, 10, 10, 10)
        ));

        inputField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER && e.isControlDown()) {
                    String input = inputField.getText();
                    parseAndDisplay(input);
                    inputField.setText("");
                    e.consume();
                }
            }
        });

        Utilities.createScrollPane(inputField, messagePanel);
        return messagePanel;
    }

    private void parseAndDisplay(String input) {
        try {
            HL7Parser parser = new HL7Parser();
            HL7Node root = parser.parse(input);

            List<String[]> tableData = new ArrayList<>();
            root.flatten(tableData);
            hl7TableViewer.displayParsedHl7((ArrayList<String[]>) tableData);

        } catch (Exception ex) {
            SwingUtilities.invokeLater(() -> {
                JOptionPane.showMessageDialog(null,
                        "Failed to parse HL7 message:\n" + ex.getMessage(),
                        "Parsing Error",
                        JOptionPane.ERROR_MESSAGE);
            });
        }
    }
}


// -----------------------------
// Package-private table viewer
// -----------------------------
class HL7TableViewer extends JPanel {
    private JTable hl7Tablecomponent;
    private DefaultTableModel hl7TableData;

    public HL7TableViewer() {
        setLayout(new BorderLayout());
        setOpaque(false);
        initializeTable();
    }

    private void initializeTable() {
        String[] columnNames = {"Segment-Field", "Value"};
        hl7TableData = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        hl7Tablecomponent = new JTable(hl7TableData);
        hl7Tablecomponent.setOpaque(false);
        hl7Tablecomponent.setBackground(Utilities.TRANSPARENT_COLOR);
        hl7Tablecomponent.setForeground(Utilities.TEXT_COLOR);
        hl7Tablecomponent.setGridColor(Utilities.TERCIARY_COLOR);
        hl7Tablecomponent.setFont(new Font("SansSerif", Font.PLAIN, 12));
        hl7Tablecomponent.setRowHeight(22);
        hl7Tablecomponent.setFillsViewportHeight(true);
        setupHeaderRenderer(hl7Tablecomponent);

        var header = hl7Tablecomponent.getTableHeader();
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);
        header.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Utilities.TERCIARY_COLOR));
        Utilities.setPanelColors(header);

        var scrollPane = getJScrollPane();
        add(scrollPane, BorderLayout.CENTER);
    }

    private JScrollPane getJScrollPane() {
        var scrollPane = new JScrollPane(hl7Tablecomponent);
        scrollPane.setOpaque(false);
        scrollPane.setBackground(Utilities.TRANSPARENT_COLOR);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.getViewport().setOpaque(false);
        scrollPane.getViewport().setBackground(Utilities.TRANSPARENT_COLOR);
        scrollPane.setViewportBorder(null);
        return scrollPane;
    }

    public void displayParsedHl7(ArrayList<String[]> tableData) {
        hl7TableData.setRowCount(0);
        if (!displayEachRow(tableData)) {
            JOptionPane.showMessageDialog(this,
                    "Failed to display HL7 fields.",
                    "Parsing Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean displayEachRow(ArrayList<String[]> tableData) {
        for (String[] row : tableData) {
            hl7TableData.addRow(row);
        }
        return hl7TableData.getRowCount() != 0;
    }

    private void setupHeaderRenderer(JTable table) {
        table.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus,
                                                           int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                Utilities.setPanelColors(label);
                label.setHorizontalAlignment(SwingConstants.CENTER);

                if (column < table.getColumnCount() - 1) {
                    label.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Utilities.TERCIARY_COLOR));
                } else {
                    label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
                }
                return label;
            }
        });
    }
}
