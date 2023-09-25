package quanlicuahangdienthoai.model.FrontEnd.FormHienThi;

import quanlicuahangdienthoai.model.BackEnd.QuanLyHoaDon.HoaDon;
import java.util.ArrayList;
import quanlicuahangdienthoai.model.BackEnd.PriceFormatter;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class HienThiHoaDon{

  
     public static void AddRowToTable(Object[] dataRow,JTable table)
    {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addRow(dataRow);
    }
  
    public static void AddTable(ArrayList<HoaDon> data,JTable table){
        int stt = 1;
        for (HoaDon hd : data) {
                AddRowToTable(new Object[]{
                    stt,
                hd.getMaHoaDon(),
                hd.getMaNhanVien(),
                hd.getMaKhachHang(),
                hd.getMaKhuyenMai(),
                String.valueOf(hd.getNgayLap()),
                String.valueOf(hd.getGioLap()),
                PriceFormatter.format(hd.getTongTien())},table);
                stt++;
}
}
}


