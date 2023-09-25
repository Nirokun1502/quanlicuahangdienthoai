/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlicuahangdienthoai.model.FrontEnd.FormHienThi;


import quanlicuahangdienthoai.model.BackEnd.PriceFormatter;
import quanlicuahangdienthoai.model.BackEnd.QuanLyChiTietPN.ChiTietPhieuNhap;
import quanlicuahangdienthoai.model.BackEnd.QuanLyChiTietPN.QuanLyChiTietPhieuNhapBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLySanPham.QuanLySanPhamBUS;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import quanlicuahangdienthoai.model.BackEnd.QuanLyPhieuNhap.QuanLyPhieuNhapBUS;

/**
 *
 * @author Admin
 */
public class HienThiChiTietPN {

    static QuanLySanPhamBUS qlspBUS = new QuanLySanPhamBUS();

    
    public static void AddRowToTable(Object[] dataRow,JTable table)
    {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addRow(dataRow);
    }
  
    public static void AddTable(ArrayList<ChiTietPhieuNhap> data,JTable table){
        int stt = 1;
        for (ChiTietPhieuNhap pn : data) {           
                AddRowToTable(new Object[]{
                stt,
                pn.getMa(),
                pn.getMaSP(),
                qlspBUS.getSanPham(pn.getMaSP()).getTenSP(),
                String.valueOf(pn.getSoLuong()),
                PriceFormatter.format(pn.getDonGia()),
                PriceFormatter.format(pn.getSoLuong() * pn.getDonGia())
        },table);
        stt++;
}
}

}
