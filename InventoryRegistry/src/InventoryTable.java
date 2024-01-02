import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InventoryTable {
	private static JTextField textFieldName;
	private static JTextField textFieldUnitPrice;
	private static JTextField textFieldQuantityInHand;
	private static JTextField textFieldSoldQuantity;
	private static JTextField textFieldReorderStatus;
	private static JTextField textFieldInventoryValue;
	private static JTextField textFieldSalesValue;
	private static JTextField textFieldRemainingStock;
	private static JLabel lblQuantityInHand;
	private static JLabel lblJobPosition;
	private static JLabel lblQuantityInHand_1;
	private static JLabel lblInventoryValue;
	private static JLabel lblSalesValue;
	private static JLabel lblRemainingStock;
	private static JLabel R;

	public static void main(String[] args) {
        Object[] columns = {"Name", "Unit Price", "Quantity In Hand", "Sold Quantity", "Inventory Value", "Sales Value", "Remaining Stock", "Reorder Status"}; 
        DefaultTableModel model = new DefaultTableModel();
        
        JFrame frame = new JFrame("WINDOW");
        frame.getContentPane().setBackground(new Color(0,0,0));
        frame.getContentPane().setForeground(Color.WHITE);
        frame.setBounds(100,100,869,538);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        
        model.setColumnIdentifiers(columns);
        JTable table = new JTable(8, 8);
		table.setModel(model);
        frame.getContentPane().add(table);
        table.setBackground(Color.white);
        table.setForeground(Color.black);
        table.setSelectionBackground(Color.green);
        table.setGridColor(Color.blue);
        table.setSelectionForeground(Color.white);
        table.setFont(new Font("Tahoma", Font.PLAIN,17));
        table.setRowHeight(30);
        table.setAutoCreateRowSorter(true);
        
        JScrollPane pane = new JScrollPane(table);
        pane.setForeground(Color.RED);
        pane.setBackground(Color.WHITE);
        pane.setBounds(10,10,835,238);
        frame.getContentPane().add(pane);
        
        textFieldName = new JTextField();
        textFieldName.setBounds(10, 290, 170, 42);
        frame.getContentPane().add(textFieldName);
        textFieldName.setColumns(10);
        
        textFieldUnitPrice = new JTextField();
        textFieldUnitPrice.setColumns(10);
        textFieldUnitPrice.setBounds(226, 290, 170, 42);
        frame.getContentPane().add(textFieldUnitPrice);
        
        textFieldQuantityInHand = new JTextField();
        textFieldQuantityInHand.setColumns(10);
        textFieldQuantityInHand.setBounds(469, 290, 170, 42);
        frame.getContentPane().add(textFieldQuantityInHand);
        
        textFieldSoldQuantity = new JTextField();
        textFieldSoldQuantity.setColumns(10);
        textFieldSoldQuantity.setBounds(675, 290, 170, 42);
        frame.getContentPane().add(textFieldSoldQuantity);
        
        textFieldReorderStatus = new JTextField();
        textFieldReorderStatus.setColumns(10);
        textFieldReorderStatus.setBounds(675, 365, 170, 42);
        frame.getContentPane().add(textFieldReorderStatus);
        
        textFieldInventoryValue = new JTextField();
        textFieldInventoryValue.setColumns(10);
        textFieldInventoryValue.setBounds(10, 365, 170, 42);
        frame.getContentPane().add(textFieldInventoryValue);
        
        textFieldSalesValue = new JTextField();
        textFieldSalesValue.setColumns(10);
        textFieldSalesValue.setBounds(226, 365, 170, 42);
        frame.getContentPane().add(textFieldSalesValue);
        
        textFieldRemainingStock = new JTextField();
        textFieldRemainingStock.setColumns(10);
        textFieldRemainingStock.setBounds(469, 365, 170, 42);
        frame.getContentPane().add(textFieldRemainingStock);
        
        JLabel lblNewLaw3el3434 = new JLabel("Name");
        lblNewLaw3el3434.setBackground(new Color(0, 64, 128));
        lblNewLaw3el3434.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        lblNewLaw3el3434.setForeground(new Color(255, 255, 255));
        lblNewLaw3el3434.setBounds(65, 258, 86, 31);
        frame.getContentPane().add(lblNewLaw3el3434);
        
        lblQuantityInHand = new JLabel("Unit Price");
        lblQuantityInHand.setForeground(Color.WHITE);
        lblQuantityInHand.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        lblQuantityInHand.setBounds(270, 258, 163, 31);
        frame.getContentPane().add(lblQuantityInHand);
        
        lblJobPosition = new JLabel("Sold Quantity");
        lblJobPosition.setForeground(Color.WHITE);
        lblJobPosition.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        lblJobPosition.setBounds(713, 258, 142, 31);
        frame.getContentPane().add(lblJobPosition);
        
        lblQuantityInHand_1 = new JLabel("Quantity In Hand");
        lblQuantityInHand_1.setForeground(Color.WHITE);
        lblQuantityInHand_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        lblQuantityInHand_1.setBounds(494, 258, 163, 31);
        frame.getContentPane().add(lblQuantityInHand_1);
        
        lblInventoryValue = new JLabel("Inventory Value");
        lblInventoryValue.setForeground(Color.WHITE);
        lblInventoryValue.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        lblInventoryValue.setBounds(37, 342, 163, 19);
        frame.getContentPane().add(lblInventoryValue);
        
        lblSalesValue = new JLabel("Sales Value");
        lblSalesValue.setForeground(Color.WHITE);
        lblSalesValue.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        lblSalesValue.setBounds(270, 342, 163, 19);
        frame.getContentPane().add(lblSalesValue);
        
        lblRemainingStock = new JLabel("Remaining Stock");
        lblRemainingStock.setForeground(Color.WHITE);
        lblRemainingStock.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        lblRemainingStock.setBounds(494, 342, 163, 19);
        frame.getContentPane().add(lblRemainingStock);
        
        R = new JLabel("Reorder Status");
        R.setForeground(Color.WHITE);
        R.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        R.setBounds(707, 342, 163, 19);
        frame.getContentPane().add(R);
        
        // ADD ENTRY BUTTON
        JButton btnNewButton = new JButton("Add Entry");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		Object[] row = new Object[8];
				row[0] = textFieldName.getText();
        		row[1] = textFieldUnitPrice.getText();
        		row[2] = textFieldQuantityInHand.getText();
        		row[3] = textFieldSoldQuantity.getText();
        		row[4] = textFieldInventoryValue.getText();
        		row[5] = textFieldSalesValue.getText();
        		row[6] = textFieldRemainingStock.getText();
        		row[7] = textFieldReorderStatus.getText();
        		
        		
        		model.addRow(row);
        	}
        });
        btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        btnNewButton.setBounds(135, 436, 142, 42);
        frame.getContentPane().add(btnNewButton);
        	
        // DELETE ENTRY BUTTON
        JButton btnDeleteEntry = new JButton("Delete Entry");
        btnDeleteEntry.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		int i = table.getSelectedRow();
        		if(i>=0) {
        			model.removeRow(i);
        		} else {
        			JOptionPane.showMessageDialog(frame, "No item has been selected for deletion. Select a row and then try again.");
        		}
        		
        		
        	}
        });
        btnDeleteEntry.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        btnDeleteEntry.setBounds(360, 436, 142, 42);
        frame.getContentPane().add(btnDeleteEntry);
        
        // DELETE ALL ENTRIES BUTTON
        JButton btnClearAllEntries = new JButton("Clear All Entries");
        btnClearAllEntries.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        btnClearAllEntries.setBounds(583, 436, 142, 42);
        frame.getContentPane().add(btnClearAllEntries);
        
        //ROWS
        Object[] row = new Object[8];
        
        frame.revalidate();
        frame.setVisible(true);
        
	}
}