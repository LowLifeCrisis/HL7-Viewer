package hl7Viewer.gui;

import ca.uhn.hl7v2.model.Message;
import hl7Viewer.nonGui.parser.Hl7FieldIterator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Hl7TablePanel extends JPanel {
    private JTable parsedTable;
    private DefaultTableModel tableModel;

    public Hl7TablePanel() {
        setLayout(new BorderLayout());
        setOpaque(false);
        initializeTable();
    }

    private void initializeTable() {
        String[] columnNames = {"Segment-Field", "Value"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        parsedTable = new JTable(tableModel);
        parsedTable.setOpaque(false);
        parsedTable.setBackground(Utilities.TRANSPARENT_COLOR);
        parsedTable.setForeground(Utilities.TEXT_COLOR);
        parsedTable.setGridColor(Utilities.TERCIARY_COLOR);
        parsedTable.setFont(new Font("SansSerif", Font.PLAIN, 12));
        parsedTable.setRowHeight(22);
        parsedTable.setFillsViewportHeight(true);
        parsedTable.getTableHeader().setReorderingAllowed(false);
        parsedTable.getTableHeader().setResizingAllowed(false);

        var header = parsedTable.getTableHeader();
        header.setOpaque(true);
        header.setBackground(Utilities.PRIMARY_COLOR);
        header.setForeground(Utilities.TEXT_COLOR);
        header.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Utilities.TERCIARY_COLOR));

        var scrollPane = new JScrollPane(parsedTable);
        scrollPane.setOpaque(false);
        scrollPane.setBackground(Utilities.TRANSPARENT_COLOR);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.getViewport().setOpaque(false);
        scrollPane.getViewport().setBackground(Utilities.TRANSPARENT_COLOR);
        scrollPane.setViewportBorder(null);

        add(scrollPane, BorderLayout.CENTER);
    }

    public void updateFromInput(Message hl7Message) {
        tableModel.setRowCount(0); // Clear previous data

        try {
            Object[][] tableData = Hl7FieldIterator.getSegmentFieldTableData(hl7Message);

            for (Object[] row : tableData) {
                tableModel.addRow(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed to extract HL7 fields:\n" + e.getMessage(),
                    "Parsing Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
