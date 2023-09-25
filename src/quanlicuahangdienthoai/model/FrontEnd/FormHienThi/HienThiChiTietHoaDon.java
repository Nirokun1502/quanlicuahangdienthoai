
package quanlicuahangdienthoai.model.FrontEnd.FormHienThi;

import quanlicuahangdienthoai.model.BackEnd.PriceFormatter;
import quanlicuahangdienthoai.model.BackEnd.QuanLyChiTietHoaDon.ChiTietHoaDon;
import quanlicuahangdienthoai.model.BackEnd.QuanLySanPham.QuanLySanPhamBUS;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class HienThiChiTietHoaDon {

  
    static QuanLySanPhamBUS qlspBUS = new QuanLySanPhamBUS();

   
    
    public static void AddRowToTable(Object[] dataRow,JTable table)
    {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addRow(dataRow);
    }
  
    public static void AddTable(ArrayList<ChiTietHoaDon> data,JTable table){
        int stt = 1;
        for (ChiTietHoaDon cthd : data) {
                AddRowToTable(new Object[]{
                stt,
                cthd.getMaSanPham(),
                qlspBUS.getSanPham(cthd.getMaSanPham()).getTenSP(),
                String.valueOf(cthd.getSoLuong()),
                PriceFormatter.format(cthd.getDonGia()),
                PriceFormatter.format(cthd.getSoLuong() * cthd.getDonGia())
               
        },table);
            stt++;
}
}
}



