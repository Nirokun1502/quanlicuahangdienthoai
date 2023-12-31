/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlicuahangdienthoai.frames;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JOptionPane;

import quanlicuahangdienthoai.MainPage;

import quanlicuahangdienthoai.model.FrontEnd.FormThemSua.ThemSuaSanPhamForm;
import quanlicuahangdienthoai.model.BackEnd.QuanLySanPham.QuanLySanPhamBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLySanPham.SanPham;
import static quanlicuahangdienthoai.MainPage.LSPTable;
import quanlicuahangdienthoai.model.BackEnd.QuanLyLoaiSanPham.LoaiSanPham;
import quanlicuahangdienthoai.model.BackEnd.QuanLyLoaiSanPham.QuanLyLoaiSanPhamBUS;
import quanlicuahangdienthoai.model.FrontEnd.FormThemSua.ThemSuaLoaiSanPhamForm;
import static quanlicuahangdienthoai.MainPage.BHSPTable;
/**
 *
 * @author ACER
 */
public class editLSP extends javax.swing.JFrame {
    
    /**
     * Creates new form NewJFrame
     */ 
    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
    public editLSP() {
       
        initComponents();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txMalsp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txTenlsp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txMota = new javax.swing.JTextArea();
        BHsua = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        BHhuy = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mã loại");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txMalsp, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMalsp, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txTenlsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTenlspActionPerformed(evt);
            }
        });
        jPanel3.add(txTenlsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên loại");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 83, 30));

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Mô tả");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 79, 16));

        txMota.setColumns(20);
        txMota.setRows(5);
        jScrollPane1.setViewportView(txMota);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, 100));

        BHsua.setBackground(new java.awt.Color(0, 204, 204));
        BHsua.setPreferredSize(new java.awt.Dimension(80, 24));
        BHsua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHsuaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHsuaMouseReleased(evt);
            }
        });

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-pen-15.png"))); // NOI18N
        jLabel58.setText("Sửa");

        javax.swing.GroupLayout BHsuaLayout = new javax.swing.GroupLayout(BHsua);
        BHsua.setLayout(BHsuaLayout);
        BHsuaLayout.setHorizontalGroup(
            BHsuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BHsuaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        BHsuaLayout.setVerticalGroup(
            BHsuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

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
        jLabel59.setText("Hủy");

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(BHsua, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(BHhuy, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BHsua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BHhuy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void GetInput(){
        String maLSP = "";
               maLSP  =  (String)LSPTable.getValueAt(LSPTable.getSelectedRow(), 1);
        if(maLSP == "")
        {
        JOptionPane.showMessageDialog(null, "Chưa chọn loại sản phẩm nào để sửa");
        }
        else
        {
        SuaLSP(maLSP);
        }
    }
    
//    public static void setText()
//    {
//        String text = (String) LSPTable.getValueAt(LSPTable.getSelectedRow(), 1);
//        
//        txTenlsp.setText(text);
//    }
 
    public static void SuaLSP (String malsp)
    {   LoaiSanPham lspSua = null;
        QuanLyLoaiSanPhamBUS qllspBUS = new QuanLyLoaiSanPhamBUS();
        for (LoaiSanPham lsp : qllspBUS.getDslsp()) {
                if (lsp.getMaLSP().equals(malsp)) {
                    lspSua = lsp;
                }
            }
//            if (spSua == null) {
//                JOptionPane.showMessageDialog(null, "Lỗi, không tìm thấy sản phẩm");
//                this.dispose();
//            }

           
            txMalsp.setText(lspSua.getMaLSP());
            txTenlsp.setText(lspSua.getTenLSP());
            txMota.setText(lspSua.getMoTa());
    }
    
    public static void XoaLSP(String malsp){
        QuanLyLoaiSanPhamBUS qllspBUS = new QuanLyLoaiSanPhamBUS();
         
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa loại sản phẩm " + malsp + " ?", 
                        "Chú ý", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    qllspBUS.delete(malsp);
                   
                }
                     
    }
    
    public static void ThemLSP()
    {   
        QuanLyLoaiSanPhamBUS qllspBUS = new QuanLyLoaiSanPhamBUS();
        addLSP.txMalsp.setText(qllspBUS.getNextID());
     
    }
    
    private void BHsuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsuaMousePressed
        changecolor(BHsua,new Color(0,163,163));
    }//GEN-LAST:event_BHsuaMousePressed

    private void BHsuaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsuaMouseReleased
        changecolor(BHsua,new Color(0,204,204));
        
        ThemSuaLoaiSanPhamForm.btnSuaMouseClicked();
        
//        setTableCellAlignment(JLabel.CENTER,pTable);       
    }//GEN-LAST:event_BHsuaMouseReleased

    private void BHhuyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHhuyMousePressed
        changecolor(BHhuy,new Color(221,0,0));
    }//GEN-LAST:event_BHhuyMousePressed

    private void BHhuyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHhuyMouseReleased
        changecolor(BHhuy,new Color(255,0,0));
        this.dispose();
    }//GEN-LAST:event_BHhuyMouseReleased

    private void BHhuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHhuyMouseClicked
        
    }//GEN-LAST:event_BHhuyMouseClicked

    private void txTenlspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTenlspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTenlspActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        GetInput();
    }//GEN-LAST:event_formWindowOpened

    
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new editLSP().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BHhuy;
    private javax.swing.JPanel BHsua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txMalsp;
    public static javax.swing.JTextArea txMota;
    public static javax.swing.JTextField txTenlsp;
    // End of variables declaration//GEN-END:variables
}
