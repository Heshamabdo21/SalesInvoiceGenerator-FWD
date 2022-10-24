package View;

import Controller.ActionController;
import Controller.LoaderController;
import javax.swing.JLabel;
import javax.swing.JTable;


public class SIGFrame extends javax.swing.JFrame {

    LoaderController loader;
    ActionController action_controller;

    /**
     * Creates new form SIGFrame
     */
    public SIGFrame() {
        super("Sales Invoice Generator");
        initComponents();
        this.loader = new LoaderController(this);
        this.action_controller = new ActionController(this.loader, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoice_headers_table = new javax.swing.JTable();
        invoice_no = new javax.swing.JLabel();
        invoice_number_label = new javax.swing.JLabel();
        inv_table = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        inv_date = new javax.swing.JLabel();
        cus_name = new javax.swing.JLabel();
        inv_total = new javax.swing.JLabel();
        invc_itemlabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        invoice_lines_table = new javax.swing.JTable();
        create_invoice_header = new javax.swing.JButton();
        delete_invoice_header = new javax.swing.JButton();
        create_invoice_line = new javax.swing.JButton();
        delete_invoice_line = new javax.swing.JButton();
        invoice_total_label = new javax.swing.JLabel();
        invoice_date_label = new javax.swing.JLabel();
        customer_name_label = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        file_menu = new javax.swing.JMenu();
        load = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Sales Invoice Generator"); // NOI18N

        invoice_headers_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ));
        invoice_headers_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                invoice_headers_tableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(invoice_headers_table);

        invoice_no.setText("InvoicenNumber");

        inv_table.setText("Invoice Table");

        inv_date.setText("Invoice Date");

        cus_name.setText("Customer Name");

        inv_total.setText("Invoice Total");

        invc_itemlabel.setText("Invoice Items");

        invoice_lines_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Item Total"
            }
        ));
        invoice_lines_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                invoice_lines_tableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(invoice_lines_table);

        create_invoice_header.setText("Create New Invoice");
        create_invoice_header.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_invoice_headerActionPerformed(evt);
            }
        });

        delete_invoice_header.setText("Delete Invoice");
        delete_invoice_header.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_invoice_headerActionPerformed(evt);
            }
        });

        create_invoice_line.setText("Create New Item");
        create_invoice_line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_invoice_lineActionPerformed(evt);
            }
        });

        delete_invoice_line.setText("Delete Item");
        delete_invoice_line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_invoice_lineActionPerformed(evt);
            }
        });

        file_menu.setText("File");

        load.setMnemonic('L');
        load.setText("Load");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });
        file_menu.add(load);

        save.setMnemonic('S');
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        file_menu.add(save);

        MenuBar.add(file_menu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(inv_table)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invc_itemlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cus_name)
                                    .addComponent(inv_total)
                                    .addComponent(inv_date, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(invoice_no))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(invoice_number_label, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(invoice_total_label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customer_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(invoice_date_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(create_invoice_header)
                        .addGap(33, 33, 33)
                        .addComponent(delete_invoice_header, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(317, 317, 317)
                                .addComponent(delete_invoice_line, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(create_invoice_line, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(inv_table))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoice_no)
                            .addComponent(invoice_number_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inv_date)
                            .addComponent(invoice_date_label))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cus_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inv_total)
                                .addGap(18, 18, 18)
                                .addComponent(invc_itemlabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(customer_name_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(invoice_total_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(create_invoice_header)
                        .addComponent(delete_invoice_header))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(create_invoice_line)
                        .addComponent(delete_invoice_line)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        action_controller.fillTables(null, null);
    }//GEN-LAST:event_loadActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        action_controller.save();
    }//GEN-LAST:event_saveActionPerformed

    private void create_invoice_headerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_invoice_headerActionPerformed
        action_controller.showCreateInvoice(evt);
    }//GEN-LAST:event_create_invoice_headerActionPerformed

    private void delete_invoice_headerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_invoice_headerActionPerformed
        action_controller.deleteInvoice(evt);
    }//GEN-LAST:event_delete_invoice_headerActionPerformed

    private void invoice_headers_tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoice_headers_tableMousePressed
        action_controller.clickInvoiceTable(evt);
     }//GEN-LAST:event_invoice_headers_tableMousePressed

    private void create_invoice_lineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_invoice_lineActionPerformed
 action_controller.showCreateLine(evt);    }//GEN-LAST:event_create_invoice_lineActionPerformed

    private void invoice_lines_tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoice_lines_tableMousePressed
   action_controller.clickLineTable(evt);    }//GEN-LAST:event_invoice_lines_tableMousePressed

    private void delete_invoice_lineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_invoice_lineActionPerformed
        action_controller.deleteInvoiceLine(evt);
    }//GEN-LAST:event_delete_invoice_lineActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SIGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIGFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton create_invoice_header;
    private javax.swing.JButton create_invoice_line;
    private javax.swing.JLabel cus_name;
    private javax.swing.JLabel customer_name_label;
    private javax.swing.JButton delete_invoice_header;
    private javax.swing.JButton delete_invoice_line;
    private javax.swing.JMenu file_menu;
    private javax.swing.JLabel inv_date;
    private javax.swing.JLabel inv_table;
    private javax.swing.JLabel inv_total;
    private javax.swing.JLabel invc_itemlabel;
    private javax.swing.JLabel invoice_date_label;
    private javax.swing.JTable invoice_headers_table;
    private javax.swing.JTable invoice_lines_table;
    private javax.swing.JLabel invoice_no;
    private javax.swing.JLabel invoice_number_label;
    private javax.swing.JLabel invoice_total_label;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem load;
    private javax.swing.JMenuItem save;
    // End of variables declaration//GEN-END:variables

    public JTable getInvoiceHeaderTable() {
        return this.invoice_headers_table;
    }

    public JTable getInvoiceLineTable() {
        return this.invoice_lines_table;
    }

    public JLabel getInvoiceNumberLabel() {
        return this.invoice_number_label;
    }

    public JLabel getInvoiceDateLabel() {
        return this.invoice_date_label;
    }

    public JLabel getInvoiceCustomerNameLabel() {
        return this.customer_name_label;
    }

    public JLabel getInvoiceTotalLabel() {
        return this.invoice_total_label;
    }
}
