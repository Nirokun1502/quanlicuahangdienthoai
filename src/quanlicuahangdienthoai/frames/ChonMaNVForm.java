package quanlicuahangdienthoai.frames;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import quanlicuahangdienthoai.MainPage;
import static quanlicuahangdienthoai.MainPage.NVTable;
import quanlicuahangdienthoai.frames.addForm;
import quanlicuahangdienthoai.frames.editForm;
import quanlicuahangdienthoai.model.BackEnd.QuanLyLoaiSanPham.QuanLyLoaiSanPhamBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyNhanVien.QuanLyNhanVienBUS;
import quanlicuahangdienthoai.model.FrontEnd.FormHienThi.HienThiLoaiSanPham;
import quanlicuahangdienthoai.model.FrontEnd.FormHienThi.HienThiNhanVien;

public class ChonMaNVForm extends javax.swing.JFrame {
    
    
    public ChonMaNVForm() {
        initComponents();        
        MainPage.Tabledesign(SubNVTable);
        QuanLyNhanVienBUS dsnvBUS = new QuanLyNhanVienBUS();
        HienThiNhanVien.AddTable(dsnvBUS.getDsnv(), SubNVTable);
        MainPage.setTableCellAlignment(JLabel.CENTER, SubNVTable);    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SubNVTable = new javax.swing.JTable();
        BHthem = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        BHxoa = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        FilterSearch = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        SearchType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        SubNVTable.setAutoCreateRowSorter(true);
        SubNVTable.setBackground(new java.awt.Color(255, 255, 255));
        SubNVTable.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        SubNVTable.setForeground(new java.awt.Color(0, 0, 0));
        SubNVTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã nhân viên", "Tên nhân viên", "Ngày sinh", "Địa chỉ", "Số điện thoại", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        SubNVTable.setFocusable(false);
        SubNVTable.setGridColor(new java.awt.Color(128, 128, 128));
        SubNVTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        SubNVTable.setRowHeight(25);
        SubNVTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        SubNVTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        SubNVTable.setShowVerticalLines(false);
        SubNVTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(SubNVTable);
        if (SubNVTable.getColumnModel().getColumnCount() > 0) {
            SubNVTable.getColumnModel().getColumn(0).setMaxWidth(70);
            SubNVTable.getColumnModel().getColumn(1).setPreferredWidth(1);
            SubNVTable.getColumnModel().getColumn(2).setPreferredWidth(1);
        }

        BHthem.setBackground(new java.awt.Color(0, 204, 204));
        BHthem.setPreferredSize(new java.awt.Dimension(80, 24));
        BHthem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHthemMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHthemMouseReleased(evt);
            }
        });

        jLabel67.setBackground(new java.awt.Color(255, 255, 255));
        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-done-25.png"))); // NOI18N
        jLabel67.setText("Thêm");

        javax.swing.GroupLayout BHthemLayout = new javax.swing.GroupLayout(BHthem);
        BHthem.setLayout(BHthemLayout);
        BHthemLayout.setHorizontalGroup(
            BHthemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );
        BHthemLayout.setVerticalGroup(
            BHthemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BHxoa.setBackground(new java.awt.Color(255, 0, 0));
        BHxoa.setPreferredSize(new java.awt.Dimension(80, 24));
        BHxoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHxoaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHxoaMouseReleased(evt);
            }
        });

        jLabel62.setBackground(new java.awt.Color(255, 255, 255));
        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-close-25.png"))); // NOI18N
        jLabel62.setText("Hủy");

        javax.swing.GroupLayout BHxoaLayout = new javax.swing.GroupLayout(BHxoa);
        BHxoa.setLayout(BHxoaLayout);
        BHxoaLayout.setHorizontalGroup(
            BHxoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        BHxoaLayout.setVerticalGroup(
            BHxoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        FilterSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        FilterSearch.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FilterSearch.setMinimumSize(new java.awt.Dimension(28, 25));
        FilterSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterSearchActionPerformed(evt);
            }
        });
        FilterSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterSearchKeyReleased(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-search-25.png"))); // NOI18N

        SearchType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SearchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã nhân viên", "Tên nhân viên", "Ngày sinh", "Địa chỉ", "Số điện thoại", "Trạng thái" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(89, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(336, 336, 336)
                                .addComponent(BHthem, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(BHxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FilterSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchType, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(SearchType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(FilterSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BHxoa, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(BHthem, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 890, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BHthemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthemMousePressed
        MainPage.changecolor(BHthem,new Color(0,163,163));
    }//GEN-LAST:event_BHthemMousePressed

    private void BHthemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthemMouseReleased

        MainPage.changecolor(BHthem,new Color(0,204,204));
        
        if (editNV.txMaNV !=null)
        {
            editNV.setText();
        }
        else
        {
            addNV.setText();
        }
        
        this.dispose();
    }//GEN-LAST:event_BHthemMouseReleased

    private void BHxoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoaMousePressed
        MainPage.changecolor(BHxoa,new Color(221,0,0));
    }//GEN-LAST:event_BHxoaMousePressed

    private void BHxoaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoaMouseReleased
        MainPage.changecolor(BHxoa,new Color(255,0,0));
        this.dispose();
    }//GEN-LAST:event_BHxoaMouseReleased

    private void FilterSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearchActionPerformed

    private void FilterSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterSearchKeyReleased
        String query = FilterSearch.getText().toLowerCase();
        
        MainPage.filterTable(SubNVTable, query, SearchType.getSelectedIndex()-1);
    }//GEN-LAST:event_FilterSearchKeyReleased

    
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChonMaNVForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BHthem;
    private javax.swing.JPanel BHxoa;
    private java.awt.TextField FilterSearch;
    public static javax.swing.JComboBox<String> SearchType;
    public static javax.swing.JTable SubNVTable;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
