package quanlicuahangdienthoai.model.FrontEnd.FormHienThi;

import quanlicuahangdienthoai.model.BackEnd.QuanLyQuyen.Quyen;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HienThiQuyen{


    public static void AddRowToTable(Object[] dataRow,JTable table)
    {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addRow(dataRow);
    }
    public static void AddTable(ArrayList<Quyen> data,JTable table){
        int stt = 1;
        for (Quyen q : data) {
            AddRowToTable(new Object[]{
                stt,
                q.getMaQuyen(),
                q.getTenQuyen(),
                q.getChiTietQuyen()},table);
            stt++;
        }
    }
}
