package quanlicuahangdienthoai.model.FrontEnd.FormHienThi;


import quanlicuahangdienthoai.model.BackEnd.QuanLyNhanVien.NhanVien;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HienThiNhanVien{

   
    
  
    public static void AddRowToTable(Object[] dataRow,JTable table)
    {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addRow(dataRow);
    }
    public static void AddTable(ArrayList<NhanVien> data,JTable table){
        int stt = 1;
        for (NhanVien nv : data) {
            AddRowToTable(new Object[]{
                    stt,
                    nv.getMaNV(),
                    nv.getTenNV(),
                    nv.getNgaySinh().toString(),
                    nv.getDiaChi(),
                    nv.getSDT(),
                    (nv.getTrangThai() == 0 ? "Hiện" : "Ẩn")},table);
            stt++;
        }
    }
}
