package quanlicuahangdienthoai.model.FrontEnd.FormHienThi;

import quanlicuahangdienthoai.model.BackEnd.QuanLyTaiKhoan.QuanLyTaiKhoanBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyTaiKhoan.TaiKhoan;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HienThiTaiKhoan {

    public static void AddRowToTable(Object[] dataRow,JTable table)
    {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addRow(dataRow);
    }
    public static void AddTable(ArrayList<TaiKhoan> data,JTable table){
        int stt = 1;
        for (TaiKhoan tk : data) {
            AddRowToTable(new Object[]{stt,tk.getUsername(), tk.getPassword(), tk.getMaNV(), tk.getMaQuyen()},table);
            stt++;
        }
    }
}
