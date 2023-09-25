package quanlicuahangdienthoai.model.FrontEnd.FormThemSua;

import quanlicuahangdienthoai.model.BackEnd.QuanLyKhachHang.KhachHang;
import quanlicuahangdienthoai.model.BackEnd.QuanLyKhachHang.QuanLyKhachHangBUS;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import quanlicuahangdienthoai.frames.addKH;
import quanlicuahangdienthoai.frames.editKH;

public class ThemSuaKhachHangForm extends JFrame {


    static QuanLyKhachHangBUS qlkhBUS = new QuanLyKhachHangBUS();
  
   

    public static void btnThemMouseClicked() {
        if (checkEmptyAdd()) {
            String makh = addKH.txMaKH.getText();
            String tenkh = addKH.txTenKH.getText();
            String diachi = addKH.txDiaChi.getText();
            String sdt = addKH.txSDT.getText();
            int trangthai = (addKH.cbChonTrangThai.getSelectedItem().toString().equals("Hiện") ? 0 : 1);

            if (qlkhBUS.add(makh, tenkh, diachi, sdt, trangthai)) {
                JOptionPane.showMessageDialog(addKH.cbChonTrangThai, "Thêm " + tenkh + " thành công!");
                
            }
        }
    }

    public static void btnSuaMouseClicked() {
        if (checkEmptyEdit()) {
            String makh = editKH.txMaKH.getText();
            String tenkh = editKH.txTenKH.getText();
            String diachi = editKH.txDiaChi.getText();
            String sdt = editKH.txSDT.getText();
            int trangthai = (editKH.cbChonTrangThai.getSelectedItem().toString().equals("Hiện") ? 0 : 1);

            if (qlkhBUS.update(makh, tenkh, diachi, sdt, trangthai)) {
                JOptionPane.showMessageDialog(editKH.cbChonTrangThai, "Sửa " + makh + " thành công!");
                
            }
        }
    }

    private static Boolean checkEmptyAdd() {
        String makh = addKH.txMaKH.getText();
        String tenkh = addKH.txTenKH.getText();
        String diachi = addKH.txDiaChi.getText();
        String sdt = addKH.txSDT.getText();

        if (makh.trim().equals("")) {
            return showErrorTx(addKH.txMaKH, "Mã khách hàng không được để trống");

        } else if (tenkh.trim().equals("")) {
            return showErrorTx(addKH.txTenKH, "Tên khách hàng không được để trống");

        } else if (diachi.trim().equals("")) {
            return showErrorTx(addKH.txDiaChi, "Địa chỉ không được để trống");

        } else if (sdt.trim().equals("")) {
            return showErrorTx(addKH.txSDT, "Số điện thoại không được để trống");
        }

        return true;
    }
        
        private static Boolean checkEmptyEdit() {
        String makh = editKH.txMaKH.getText();
        String tenkh = editKH.txTenKH.getText();
        String diachi = editKH.txDiaChi.getText();
        String sdt = editKH.txSDT.getText();

        if (makh.trim().equals("")) {
            return showErrorTx(editKH.txMaKH, "Mã khách hàng không được để trống");

        } else if (tenkh.trim().equals("")) {
            return showErrorTx(editKH.txTenKH, "Tên khách hàng không được để trống");

        } else if (diachi.trim().equals("")) {
            return showErrorTx(editKH.txDiaChi, "Địa chỉ không được để trống");

        } else if (sdt.trim().equals("")) {
            return showErrorTx(editKH.txSDT, "Số điện thoại không được để trống");
        }

        return true;
    }

    private static Boolean showErrorTx(JTextField tx, String errorInfo) {
        JOptionPane.showMessageDialog(tx, errorInfo);
        tx.requestFocus();
        return false;
    }
}
