    package quanlicuahangdienthoai.model.FrontEnd.FormHienThi;

import quanlicuahangdienthoai.model.BackEnd.PriceFormatter;
import quanlicuahangdienthoai.model.BackEnd.QuanLySanPham.SanPham;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HienThiSanPham  {



   public static void AddRowToTable(Object[] dataRow,JTable table)
    {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addRow(dataRow);
    }
  
    public static void AddTable(ArrayList<SanPham> data,JTable table){
        int stt = 1;
        for (SanPham sp : data) {
            AddRowToTable(new Object[]{
                              stt,
                              sp.getMaSP(),
                              sp.getMaLSP(), 
                              sp.getTenSP(),
                              PriceFormatter.format(sp.getDonGia()),
                              String.valueOf(sp.getSoLuong()),
                              (sp.getTrangThai() == 0 ? "Hiện" : "Ẩn"),
                              sp.getFileNameHinhAnh()
                              },table);
            stt++;
        }
    }
    
    
    
}
