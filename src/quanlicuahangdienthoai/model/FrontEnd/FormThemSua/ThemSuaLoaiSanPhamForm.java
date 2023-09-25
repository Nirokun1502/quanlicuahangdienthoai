package quanlicuahangdienthoai.model.FrontEnd.FormThemSua;


import quanlicuahangdienthoai.model.BackEnd.QuanLyLoaiSanPham.QuanLyLoaiSanPhamBUS;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import quanlicuahangdienthoai.frames.addLSP;
import quanlicuahangdienthoai.frames.editLSP;

public class ThemSuaLoaiSanPhamForm extends JFrame {

    
    static QuanLyLoaiSanPhamBUS qllspBUS = new QuanLyLoaiSanPhamBUS();
   
   
    public static void btnThemMouseClicked() {
        if (checkEmptyAdd()) {
            String malsp = addLSP.txMalsp.getText();
            String tenlsp = addLSP.txTenlsp.getText();
            String mota = addLSP.txMota.getText();

            if (qllspBUS.add(malsp, tenlsp, mota)) {
                JOptionPane.showMessageDialog(addLSP.txMota, "Thêm " + tenlsp + " thành công!");
            }
        }
    }

    public static void btnSuaMouseClicked() {
        if (checkEmptyEdit()) {
            String malsp = editLSP.txMalsp.getText();
            String tenlsp = editLSP.txTenlsp.getText();
            String mota = editLSP.txMota.getText();

            if (qllspBUS.update(malsp, tenlsp, mota)) {
                JOptionPane.showMessageDialog(addLSP.txMota, "Sửa " + malsp + " thành công!");
             
            }
        }
    }

    private static Boolean checkEmptyAdd() {
        String malsp = addLSP.txMalsp.getText();
        String tenlsp = addLSP.txTenlsp.getText();
        String mota = addLSP.txMota.getText();

        if (malsp.trim().equals("")) {
            return showErrorTx(addLSP.txMalsp, "Mã loại không được để trống");

        } else if (tenlsp.trim().equals("")) {
            return showErrorTx(addLSP.txTenlsp, "Tên loại không được để trống");

        } else if (mota.trim().equals("")) {
            return showErrorTx(addLSP.txTenlsp, "Mô tả không được để trống");
        }

        return true;
    }
    
     private static Boolean checkEmptyEdit() {
        String malsp = editLSP.txMalsp.getText();
        String tenlsp = editLSP.txTenlsp.getText();
        String mota = editLSP.txMota.getText();

        if (malsp.trim().equals("")) {
            return showErrorTx(editLSP.txMalsp, "Mã loại không được để trống");

        } else if (tenlsp.trim().equals("")) {
            return showErrorTx(editLSP.txTenlsp, "Tên loại không được để trống");

        } else if (mota.trim().equals("")) {
            return showErrorTx( editLSP.txTenlsp, "Mô tả không được để trống");
        }

        return true;
    }

    private static Boolean showErrorTx(JTextField tx, String errorInfo) {
        JOptionPane.showMessageDialog(tx, errorInfo);
        tx.requestFocus();
        return false;
    }

}
