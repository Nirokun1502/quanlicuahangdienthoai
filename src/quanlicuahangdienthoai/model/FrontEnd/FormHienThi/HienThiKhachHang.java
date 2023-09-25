package quanlicuahangdienthoai.model.FrontEnd.FormHienThi;

import quanlicuahangdienthoai.model.BackEnd.QuanLyKhachHang.KhachHang;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class HienThiKhachHang{
  
    public static void AddRowToTable(Object[] dataRow,JTable table)
    {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addRow(dataRow);
    }
    public static void AddTable(ArrayList<KhachHang> data,JTable table){
        int stt = 1;
        for (KhachHang kh : data) {
            AddRowToTable(new Object[]{
                    stt,
                    kh.getMaKH(),
                    kh.getTenKH(),
                    kh.getDiaChi(),
                    kh.getSDT(),
                    (kh.getTrangThai() == 0 ? "Hiện" : "Ẩn")
                },table);
            stt++;
        }
    }
}
