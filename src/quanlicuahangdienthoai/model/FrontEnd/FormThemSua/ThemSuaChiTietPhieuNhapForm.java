/*
 Không thêm chi tiết phiếu nhập được, chỉ có chi tiết phiếu nhập nếu có phiếu nhập từ trước
 */
package quanlicuahangdienthoai.model.FrontEnd.FormThemSua;

import quanlicuahangdienthoai.model.BackEnd.QuanLyChiTietPN.QuanLyChiTietPhieuNhapBUS;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class ThemSuaChiTietPhieuNhapForm extends JFrame {

    QuanLyChiTietPhieuNhapBUS qlctpnBUS = new QuanLyChiTietPhieuNhapBUS();
    String type, mapn, masp;
    public ThemSuaChiTietPhieuNhapForm(String _type, String _mapn, String _masp) {
        this.type = _type;
        this.mapn = _mapn;
        this.masp = _masp;

        // inputs
        
//
//        addForm.txMapn.setEditable(false);
//        addForm.txGia.setEditable(false);
//
//
//        // 2 case Thêm - Sửa
//        if (this.type.equals("Thêm")) {
//            addForm.txMapn.setText(this.mapn);
//        } else {
//            this.ctpnSua = qlctpnBUS.getChiTiet(this.mapn, this.masp); //cai này sao bằng null ??
//
//            if (this.ctpnSua == null) {
//                JOptionPane.showMessageDialog(null, "Lỗi, không tìm thấy chi tiết hóa đơn");
//                this.dispose();
//            }
//            addForm.txMapn.setText(this.ctpnSua.getMa());
//            addForm.txMapn.setEditable(false);
//            addForm.txSoLuong.setText(String.valueOf(this.ctpnSua.getSoLuong()));
//            addForm.txMasp.setText(this.masp);
//        } 
//        this.setVisible(true);
//    }
//
//    private void btnThemChiTietPhieuNhapMouseClicked() {
//        if (checkEmpty()) {
//            String maSP = addForm.txMasp.getText();
//            float dongia = Float.parseFloat(addForm.txGia.getText());
//            int soluong = Integer.parseInt(addForm.txSoLuong.getText());
//
//            if (soluong <= 0) {
//                JOptionPane.showMessageDialog(this, "Số lượng sản phẩm không hợp lệ");
//                return;
//            }
//
//            if (qlctpnBUS.add(mapn, maSP, soluong, dongia)) {
//                JOptionPane.showMessageDialog(this, "Thêm chi tiết cho " + mapn + " thành công!");
//                this.dispose();
//            }
//        }
//    }
//
//    private void btnSuaChiTietPhieuNhapMouseClicked() {
//        if (checkEmpty()) {
//            float dongia = Float.parseFloat(addForm.txGia.getText());
//            int soluong = Integer.parseInt(addForm.txSoLuong.getText());
//
//            if (qlctpnBUS.update(this.mapn, this.masp, soluong, dongia)) {
//                JOptionPane.showMessageDialog(this, "Sửa " + mapn + " thành công!");
//                this.dispose();
//            }
//        }
//    }
//
//    
//
//    private Boolean checkEmpty() {
//        String mssp = addForm.txMasp.getText();
//        String mapn = addForm.txMapn.getText();
//        String dongia = addForm.txGia.getText();
//        String soluong = addForm.txSoLuong.getText();
//
//        if (mssp.trim().equals("")) {
//            return showErrorTx(addForm.txMasp, "Mã sp không được để trống");
//
//        } else if (mapn.trim().equals("")) {
//            return showErrorTx(addForm.txMapn, "Mã loại không được để trống");
//
//        } else if (dongia.trim().equals("")) {
//            return showErrorTx(addForm.txGia, "Đơn giá không được để trống");
//
//        } else if (soluong.trim().equals("")) {
//            return showErrorTx(addForm.txSoLuong, "Số lượng không được để trống");
//
//        } else {
//            try {
//                float dg = Float.parseFloat(dongia);
//            } catch (NumberFormatException e) {
//                return showErrorTx(addForm.txGia, "Đơn giá không hợp lệ (phải là số thực)");
//            }
//
//            try {
//                int sl = Integer.parseInt(soluong);
//                if (sl < 0) {
//                    return showErrorTx(addForm.txSoLuong, "Số lượng không hợp lệ (phải là số duơng)");
//                }
//            } catch (NumberFormatException e) {
//                return showErrorTx(addForm.txSoLuong, "Số lượng không hợp lệ (phải là số nguyên)");
//            }
//        }
//        return true;
//    }
//
//    private Boolean showErrorTx(JTextField tx, String errorInfo) {
//        JOptionPane.showMessageDialog(tx, errorInfo);
//        tx.requestFocus();
//        return false;
//    }

}
}
