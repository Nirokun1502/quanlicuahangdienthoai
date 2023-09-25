package quanlicuahangdienthoai.model.FrontEnd.FormThemSua;

import quanlicuahangdienthoai.model.BackEnd.QuanLySanPham.QuanLySanPhamBUS;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import quanlicuahangdienthoai.frames.addForm;
import quanlicuahangdienthoai.frames.editForm;
import static quanlicuahangdienthoai.MainPage.BHSPTable;


public class ThemSuaSanPhamForm {

    
    

    public static void btnThemMouseClicked() {
        QuanLySanPhamBUS qlspBUS = new QuanLySanPhamBUS();
        if (checkEmptyAdd()) {
            String masp = addForm.txMasp.getText();
            String maloai = addForm.txMalsp.getText();
            String ten = addForm.txTen.getText();
            float dongia = Float.parseFloat(addForm.txGia.getText());
            int soluong = Integer.parseInt(addForm.txSoLuong.getText());
            String url = addForm.txHinhAnh.getText();
            int trangthai = (addForm.cbChonTrangThai.getSelectedItem().toString().equals("Hiện") ? 0 : 1);

            if (qlspBUS.add(masp, maloai, ten, dongia, soluong, url, trangthai)) {
                JOptionPane.showMessageDialog( addForm.txGia,"Thêm " + ten + " thành công!");
                
//                return true;
              
            }
        }

//        return false;
    }

    public static void btnSuaMouseClicked() {
        QuanLySanPhamBUS qlspBUS = new QuanLySanPhamBUS();
        if (checkEmptyEdit()) {
            String masp = editForm.txMasp.getText();
            String maloai = editForm.txMalsp.getText();
            String ten = editForm.txTen.getText();
            float dongia = Float.parseFloat(editForm.txGia.getText());
            int soluong = Integer.parseInt(editForm.txSoLuong.getText());
            String url = editForm.txHinhAnh.getText();
            int trangthai = (editForm.cbChonTrangThai.getSelectedItem().toString().equals("Hiện") ? 0 : 1);

            if (qlspBUS.update(masp, maloai, ten, dongia, soluong, url, trangthai)) {
                JOptionPane.showMessageDialog(editForm.txGia, "Sửa " + masp + " thành công!");
//                return true;
            }
        }
        

//        return false;
    }
    
    public static void btnXoaMouseClicked() {
        String masp = null;
        masp = (String) BHSPTable.getValueAt(BHSPTable.getSelectedRow(), 1);
        if (masp != null) {
            QuanLySanPhamBUS qlspBUS = new QuanLySanPhamBUS();
            if (qlspBUS.getSanPham(masp).getTrangThai() == 0) {
                if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa sản phẩm " + masp + " ? "
                        + "Sản phẩm sẽ được TẠM ẨN", "Chú ý", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    qlspBUS.updateTrangThai(masp, 1);
                    
                }
            } else {
                if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn XÓA HOÀN TOÀN sản phẩm " + masp + " ?", 
                        "Chú ý", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    qlspBUS.delete(masp);
                   
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Chưa chọn sản phẩm nào để xóa");
        }
    }

//    private void btnChonLoaiMouseClicked() {
//        ChonLoaiSanPhamForm clsp = new ChonLoaiSanPhamForm(txMalsp); // truyền vào textfield
//    }
//
//    private void btnChonAnhMouseClicked() {
//        FileDialog fd = new FileDialog(this);
//        fd.setVisible(true);
//        String filename = fd.getFile();
//        if (filename != null) {
//            addForm.txHinhAnh.setText(filename);
//        }
//    }

    public static Boolean checkEmptyAdd() {
        String mssp = addForm.txMasp.getText();
        String maloai = addForm.txMalsp.getText();
        String ten = addForm.txTen.getText();
        String dongia = addForm.txGia.getText();
        String soluong = addForm.txSoLuong.getText();
        String url = addForm.txHinhAnh.getText();

        if (mssp.trim().equals("")) {
            return showErrorTx(addForm.txMasp, "Mã sp không được để trống");

        } else if (maloai.trim().equals("")) {
            return showErrorTx(addForm.txMalsp, "Mã loại không được để trống");

        } else if (ten.trim().equals("")) {
            return showErrorTx(addForm.txTen, "Tên không được để trống");

        } else if (dongia.trim().equals("")) {
            return showErrorTx(addForm.txGia, "Đơn giá không được để trống");

        } else if (soluong.trim().equals("")) {
            return showErrorTx(addForm.txSoLuong, "Số lượng không được để trống");

        } else if (url.trim().equals("")) {
            return showErrorTx(addForm.txHinhAnh, "Đường dẫn ảnh không được để trống");

        } else {
            try {
                float dg = Float.parseFloat(dongia);
            } catch (NumberFormatException e) {
                return showErrorTx(addForm.txGia, "Đơn giá không hợp lệ (phải là số thực)");
            }

            try {
                int sl = Integer.parseInt(soluong);
                if (sl < 0) {
                    return showErrorTx(addForm.txSoLuong, "Số lượng không hợp lệ (phải là số duơng)");
                }
            } catch (NumberFormatException e) {
                return showErrorTx(addForm.txSoLuong, "Số lượng không hợp lệ (phải là số nguyên)");
            }
        }
        return true;
    }

    
     public static Boolean checkEmptyEdit() {
        String mssp = editForm.txMasp.getText();
        String maloai = editForm.txMalsp.getText();
        String ten = editForm.txTen.getText();
        String dongia = editForm.txGia.getText();
        String soluong = editForm.txSoLuong.getText();
        String url = editForm.txHinhAnh.getText();

        if (mssp.trim().equals("")) {
            return showErrorTx(editForm.txMasp, "Mã sp không được để trống");

        } else if (maloai.trim().equals("")) {
            return showErrorTx(editForm.txMalsp, "Mã loại không được để trống");

        } else if (ten.trim().equals("")) {
            return showErrorTx(editForm.txTen, "Tên không được để trống");

        } else if (dongia.trim().equals("")) {
            return showErrorTx(editForm.txGia, "Đơn giá không được để trống");

        } else if (soluong.trim().equals("")) {
            return showErrorTx(editForm.txSoLuong, "Số lượng không được để trống");

        } else if (url.trim().equals("")) {
            return showErrorTx(editForm.txHinhAnh, "Đường dẫn ảnh không được để trống");

        } else {
            try {
                float dg = Float.parseFloat(dongia);
            } catch (NumberFormatException e) {
                return showErrorTx(editForm.txGia, "Đơn giá không hợp lệ (phải là số thực)");
            }

            try {
                int sl = Integer.parseInt(soluong);
                if (sl < 0) {
                    return showErrorTx(editForm.txSoLuong, "Số lượng không hợp lệ (phải là số duơng)");
                }
            } catch (NumberFormatException e) {
                return showErrorTx(editForm.txSoLuong, "Số lượng không hợp lệ (phải là số nguyên)");
            }
        }
        return true;
    }
    
    public static Boolean showErrorTx(JTextField tx, String errorInfo) {
        JOptionPane.showMessageDialog(tx, errorInfo);
        tx.requestFocus();
        return false;
    }
}
