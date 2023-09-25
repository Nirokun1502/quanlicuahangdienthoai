/*
 Không thêm chi tiết hóa đơn được, chỉ có chi tiết hóa đơn nếu có hóa đơn từ trước
 */

package quanlicuahangdienthoai.model.FrontEnd.FormThemSua;

import quanlicuahangdienthoai.model.BackEnd.QuanLyChiTietHoaDon.ChiTietHoaDon;
import quanlicuahangdienthoai.model.BackEnd.QuanLyChiTietHoaDon.QuanLyChiTietHoaDonBUS;
import javax.swing.JFrame;

public class ThemSuaChiTietHoaDonForm extends JFrame {

    QuanLyChiTietHoaDonBUS qlcthdBUS = new QuanLyChiTietHoaDonBUS();

    String type, mahd, masp;
    int soLuongMax;
    ChiTietHoaDon cthdSua;
    public ThemSuaChiTietHoaDonForm(String _type, String _mahd, String _masp) {
        this.type = _type;
        this.mahd = _mahd;
        this.masp = _masp;


        this.setVisible(true);
    }

//    private void btnThemChiTietHoaDonMouseClicked() {
//        if (checkEmpty()) {
//            String maspThem = addForm.txMasp.getText();
//            float dongia = Float.parseFloat(addForm.txGia.getText());
//            int soluong = Integer.parseInt(addForm.txSoLuong.getText());
//
//            if (soluong > soLuongMax) {
//                JOptionPane.showMessageDialog(this, "Số lượng sản phẩm trong kho không đủ (" + soLuongMax + ")");
//                addForm.txSoLuong.setText(String.valueOf(soLuongMax));
//                return;
//
//            } else if (soluong <= 0) {
//                JOptionPane.showMessageDialog(this, "Số lượng sản phẩm không hợp lệ");
//                addForm.txSoLuong.setText(String.valueOf(soLuongMax));
//                return;
//            }
//
//            if (qlcthdBUS.add(mahd, maspThem, soluong, dongia)) {
//                JOptionPane.showMessageDialog(this, "Thêm chi tiết cho " + mahd + " thành công!");
//                this.dispose();
//            }
//        }
//    }
//
//    private Boolean checkEmpty() {
//        String mssp = addForm.txMasp.getText();
//        String mahd = addForm.txMahd.getText();
//        String dongia = addForm.txGia.getText();
//        String soluong = addForm.txSoLuong.getText();
//
//        if (mssp.trim().equals("")) {
//            return showErrorTx(addForm.txMasp, "Mã sp không được để trống");
//
//        } else if (mahd.trim().equals("")) {
//            return showErrorTx(addForm.txMahd, "Mã loại không được để trống");
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
