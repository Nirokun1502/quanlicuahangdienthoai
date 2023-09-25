package quanlicuahangdienthoai.model.FrontEnd.FormHienThi;

import quanlicuahangdienthoai.model.BackEnd.QuanLyLoaiSanPham.LoaiSanPham;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HienThiLoaiSanPham{

  

   
    public static void AddRowToTable(Object[] dataRow,JTable table)
    {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addRow(dataRow);
    }
    public static void AddTable(ArrayList<LoaiSanPham> data,JTable table){
        int stt = 1;
        for (LoaiSanPham lsp : data) {
            AddRowToTable(new Object[]{
            stt,
            lsp.getMaLSP(), 
            lsp.getTenLSP(), 
            lsp.getMoTa()},table);
            stt++;
        }
    }
}
