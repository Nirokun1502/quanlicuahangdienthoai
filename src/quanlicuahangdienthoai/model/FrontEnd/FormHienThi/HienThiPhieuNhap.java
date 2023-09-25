/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlicuahangdienthoai.model.FrontEnd.FormHienThi;


import quanlicuahangdienthoai.model.BackEnd.PriceFormatter;
import quanlicuahangdienthoai.model.BackEnd.QuanLyNCC.QuanLyNhaCungCapBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyNhanVien.QuanLyNhanVienBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyPhieuNhap.PhieuNhap;
import quanlicuahangdienthoai.model.BackEnd.QuanLyPhieuNhap.QuanLyPhieuNhapBUS;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class HienThiPhieuNhap {

  
        public static void AddRowToTable(Object[] dataRow,JTable table)
    {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addRow(dataRow);
    }
    public static void AddTable(ArrayList<PhieuNhap> data,JTable table){
        int stt = 1;
        for (PhieuNhap pn : data) {
            AddRowToTable(new Object[]{
                stt,
                pn.getMaPN(),
                pn.getMaNCC(),
                pn.getMaNV(),
                String.valueOf(pn.getNgayNhap()),
                String.valueOf(pn.getGioNhap()),
                PriceFormatter.format(pn.getTongTien())},table);
            stt++;
        }
    }

}
