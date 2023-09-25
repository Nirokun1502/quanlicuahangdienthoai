package quanlicuahangdienthoai.frames;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import quanlicuahangdienthoai.MainPage;
import static quanlicuahangdienthoai.MainPage.changecolor;
import quanlicuahangdienthoai.frames.addForm;
import quanlicuahangdienthoai.frames.editForm;
import quanlicuahangdienthoai.model.BackEnd.QuanLyChiTietHoaDon.QuanLyChiTietHoaDonBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyHoaDon.QuanLyHoaDonBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyLoaiSanPham.QuanLyLoaiSanPhamBUS;
import quanlicuahangdienthoai.model.FrontEnd.FormHienThi.HienThiChiTietHoaDon;
import quanlicuahangdienthoai.model.FrontEnd.FormHienThi.HienThiLoaiSanPham;

public class ChonCTHDForm extends javax.swing.JFrame {
    
    
    public ChonCTHDForm(String mahd) {
        initComponents();       
        MainPage.Tabledesign(CTHDTable);
        MainPage.setTableCellAlignment(JLabel.CENTER, CTHDTable);
        QuanLyChiTietHoaDonBUS dscthdBUS = new QuanLyChiTietHoaDonBUS();
        HienThiChiTietHoaDon.AddTable(dscthdBUS.search("Mã hóa đơn",mahd, -1, -1, -1, -1),CTHDTable);
              
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CTHDTable = new javax.swing.JTable();
        FilterSearch = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        SearchType = new javax.swing.JComboBox<>();
        BHhuy = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        CTHDTable.setAutoCreateRowSorter(true);
        CTHDTable.setBackground(new java.awt.Color(255, 255, 255));
        CTHDTable.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        CTHDTable.setForeground(new java.awt.Color(0, 0, 0));
        CTHDTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CTHDTable.setFocusable(false);
        CTHDTable.setGridColor(new java.awt.Color(128, 128, 128));
        CTHDTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        CTHDTable.setRowHeight(25);
        CTHDTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        CTHDTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        CTHDTable.setShowVerticalLines(false);
        CTHDTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(CTHDTable);
        if (CTHDTable.getColumnModel().getColumnCount() > 0) {
            CTHDTable.getColumnModel().getColumn(0).setMaxWidth(70);
        }

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
        SearchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã loại", "Tên loại", "Mô tả" }));

        BHhuy.setBackground(new java.awt.Color(255, 0, 0));
        BHhuy.setPreferredSize(new java.awt.Dimension(80, 24));
        BHhuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BHhuyMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHhuyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHhuyMouseReleased(evt);
            }
        });

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-close-15.png"))); // NOI18N
        jLabel59.setText("Thoát");

        javax.swing.GroupLayout BHhuyLayout = new javax.swing.GroupLayout(BHhuy);
        BHhuy.setLayout(BHhuyLayout);
        BHhuyLayout.setHorizontalGroup(
            BHhuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BHhuyLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        BHhuyLayout.setVerticalGroup(
            BHhuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

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
                        .addGap(115, 115, 115)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilterSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchType, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 393, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BHhuy, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(341, 341, 341))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(BHhuy, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 890, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FilterSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearchActionPerformed

    private void FilterSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterSearchKeyReleased
        String query = FilterSearch.getText().toLowerCase();
        
        MainPage.filterTable(CTHDTable, query, SearchType.getSelectedIndex()-1);
    }//GEN-LAST:event_FilterSearchKeyReleased

    private void BHhuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHhuyMouseClicked

    }//GEN-LAST:event_BHhuyMouseClicked

    private void BHhuyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHhuyMousePressed
        changecolor(BHhuy,new Color(221,0,0));
    }//GEN-LAST:event_BHhuyMousePressed

    private void BHhuyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHhuyMouseReleased
        changecolor(BHhuy,new Color(255,0,0));
        this.dispose();
    }//GEN-LAST:event_BHhuyMouseReleased

    
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ChonCTHDForm(mahd).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BHhuy;
    public static javax.swing.JTable CTHDTable;
    private java.awt.TextField FilterSearch;
    public static javax.swing.JComboBox<String> SearchType;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
