/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlicuahangdienthoai;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import quanlicuahangdienthoai.frames.ChonCTHDForm;
import quanlicuahangdienthoai.frames.ChonCTPNForm;
import quanlicuahangdienthoai.frames.ChonKHForm;
import quanlicuahangdienthoai.frames.ChonKMForm;
import quanlicuahangdienthoai.frames.ChonLSPForm;
import quanlicuahangdienthoai.frames.ChonNCCForm;
import quanlicuahangdienthoai.frames.LoginForm;
import quanlicuahangdienthoai.frames.addForm;
import quanlicuahangdienthoai.frames.addKH;
import quanlicuahangdienthoai.frames.addKM;
import quanlicuahangdienthoai.frames.addLSP;
import quanlicuahangdienthoai.frames.addNCC;
import quanlicuahangdienthoai.frames.addNV;
import quanlicuahangdienthoai.frames.addQuyen;
import quanlicuahangdienthoai.frames.addTK;
import quanlicuahangdienthoai.frames.editForm;
import quanlicuahangdienthoai.frames.editKH;
import quanlicuahangdienthoai.frames.editKM;
import quanlicuahangdienthoai.frames.editLSP;
import quanlicuahangdienthoai.frames.editNCC;
import quanlicuahangdienthoai.frames.editNV;
import quanlicuahangdienthoai.frames.editQuyen;
import quanlicuahangdienthoai.frames.editTK;
import quanlicuahangdienthoai.model.BackEnd.PriceFormatter;
import quanlicuahangdienthoai.model.BackEnd.QuanLyChiTietHoaDon.ChiTietHoaDon;
import quanlicuahangdienthoai.model.BackEnd.QuanLyChiTietHoaDon.QuanLyChiTietHoaDonBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyChiTietPN.ChiTietPhieuNhap;
import quanlicuahangdienthoai.model.BackEnd.QuanLyChiTietPN.QuanLyChiTietPhieuNhapBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyHoaDon.QuanLyHoaDonBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyKhachHang.QuanLyKhachHangBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLySanPham.QuanLySanPhamBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLySanPham.SanPham;
import quanlicuahangdienthoai.model.FrontEnd.FormHienThi.HienThiSanPham;
import quanlicuahangdienthoai.model.BackEnd.QuanLyKhuyenMai.KhuyenMai;
import quanlicuahangdienthoai.model.BackEnd.QuanLyKhuyenMai.QuanLyKhuyenMaiBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyLoaiSanPham.QuanLyLoaiSanPhamBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyNCC.QuanLyNhaCungCapBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyNhanVien.QuanLyNhanVienBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyPhieuNhap.QuanLyPhieuNhapBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyQuyen.QuanLyQuyenBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyKhachHang.KhachHang;
import quanlicuahangdienthoai.model.BackEnd.QuanLyTaiKhoan.QuanLyTaiKhoanBUS;
import quanlicuahangdienthoai.model.BackEnd.QuanLyHoaDon.HoaDon;
import quanlicuahangdienthoai.model.BackEnd.QuanLyNCC.NhaCungCap;
import quanlicuahangdienthoai.model.BackEnd.QuanLyPhieuNhap.PhieuNhap;
import quanlicuahangdienthoai.model.FrontEnd.FormHienThi.HienThiHoaDon;
import quanlicuahangdienthoai.model.FrontEnd.FormHienThi.HienThiKhachHang;
import quanlicuahangdienthoai.model.FrontEnd.FormHienThi.HienThiKhuyenMai;
import quanlicuahangdienthoai.model.FrontEnd.FormHienThi.HienThiLoaiSanPham;
import quanlicuahangdienthoai.model.FrontEnd.FormHienThi.HienThiNhaCungCap;
import quanlicuahangdienthoai.model.FrontEnd.FormHienThi.HienThiNhanVien;
import quanlicuahangdienthoai.model.FrontEnd.FormHienThi.HienThiPhieuNhap;
import quanlicuahangdienthoai.model.FrontEnd.FormHienThi.HienThiQuyen;
import quanlicuahangdienthoai.model.FrontEnd.FormHienThi.HienThiTaiKhoan;

/**
 *
 * @author ACER
 */



public class MainPage extends javax.swing.JFrame {
    int mouseX;
    int mouseY; 
    public float tongtienBH;
    public float tongtienKMBH;
    public float tongtienNH;
    public static KhachHang KhachHang = null;
    public static KhuyenMai KhuyenMai = null;
    public static NhaCungCap NhaCungCap = null;
    public static Calendar calendar;
    public static SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
    public static SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
    public static String time;
    public static String day;
    public static String date;
        
     
    /**
     * Creates new form MainPage
     */
    public MainPage() {
        
        initComponents();
        SetIcon();
        
        txNhanVienDangNhap.setText(LoginForm.nhanVienLogin.getMaNV()+" - "+LoginForm.nhanVienLogin.getTenNV());
//        setBackground(new Color(0,0,0,0));
        
        
        //Table design
        Tabledesign(BHSPTable);
        Tabledesign(NHSPTable);
        Tabledesign(BHTTTable);
        Tabledesign(NHTTTable);
        Tabledesign(SPTable);
        Tabledesign(LSPTable);
        Tabledesign(HDTable);
        Tabledesign(PNTable);
        Tabledesign(KMTable);
        Tabledesign(NVTable);
        Tabledesign(KHTable);
        Tabledesign(NCCTable);
        Tabledesign(TKTable);
        Tabledesign(QuyenTable);
        
        //End Table design
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formcontainer = new javax.swing.JPanel();
        TabContainer = new javax.swing.JTabbedPane();
        TabBH = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BHSPTable = new javax.swing.JTable();
        FilterSearchBH = new java.awt.TextField();
        BHthem = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        BHxoa = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        searchTypeBH = new javax.swing.JComboBox<>();
        ImageLabelBH = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txMaSPBH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txLSPBH = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txTenSPBH = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txDonGiaBH = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txSoLuongBH = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        txMaHDBH = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txKhachHang = new javax.swing.JTextField();
        txTongTienBH = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txMaNVBH = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txNgayLapHD = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        ChonMaLoai = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txGioLapHD = new javax.swing.JTextField();
        txKhuyenMai = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        ChonMaLoai1 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        BHTTTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txTongtiensauKM = new javax.swing.JTextField();
        txTienTong = new javax.swing.JTextField();
        BHxoa7 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        LamMoiSP2 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        TabNH = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txMaSPNH = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txLSPNH = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txTenSPNH = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txDonGiaNH = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txSoLuongNH = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        NHSPTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        txMaPNNH = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txNhaCungCap = new javax.swing.JTextField();
        txTongTienNH = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txMaNVNH = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        txNgayLapPN = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        ChonMaLoai2 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        txGioLapPN = new javax.swing.JTextField();
        BHthem11 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        BHxoa10 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        NHTTTable = new javax.swing.JTable();
        jLabel108 = new javax.swing.JLabel();
        txTongtiensauKM1 = new javax.swing.JTextField();
        txTienTong1 = new javax.swing.JTextField();
        FilterSearchBH1 = new java.awt.TextField();
        jLabel109 = new javax.swing.JLabel();
        searchTypeBH1 = new javax.swing.JComboBox<>();
        BHxoa11 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        ImageLabelNH = new javax.swing.JLabel();
        LamMoiSP4 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        TabHD = new javax.swing.JPanel();
        FilterSearch7 = new java.awt.TextField();
        jLabel27 = new javax.swing.JLabel();
        searchType7 = new javax.swing.JComboBox<>();
        LamMoiSP9 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        BHthem7 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        HDTable = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        HDSubButton = new com.k33ptoo.components.KButton();
        PNSubButton = new com.k33ptoo.components.KButton();
        TabSP = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        FilterSearch1 = new java.awt.TextField();
        searchType1 = new javax.swing.JComboBox<>();
        LamMoiSP1 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        BHsua1 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        BHxoa1 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        BHthem1 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SPTable = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        SPSubButton = new com.k33ptoo.components.KButton();
        LSPSubButton = new com.k33ptoo.components.KButton();
        ImageLabel = new javax.swing.JLabel();
        TabKM = new javax.swing.JPanel();
        FilterSearch3 = new java.awt.TextField();
        jLabel14 = new javax.swing.JLabel();
        searchType3 = new javax.swing.JComboBox<>();
        LamMoiSP3 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        BHsua3 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        BHxoa3 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        BHthem3 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        KMTable = new javax.swing.JTable();
        TabKH = new javax.swing.JPanel();
        FilterSearch2 = new java.awt.TextField();
        jLabel13 = new javax.swing.JLabel();
        searchType2 = new javax.swing.JComboBox<>();
        LamMoiSP5 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        BHsua2 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        BHxoa2 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        BHthem2 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        KHTable = new javax.swing.JTable();
        TabNV = new javax.swing.JPanel();
        FilterSearch4 = new java.awt.TextField();
        jLabel21 = new javax.swing.JLabel();
        searchType4 = new javax.swing.JComboBox<>();
        LamMoiSP6 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        BHsua4 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        BHxoa4 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        BHthem4 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        NVTable = new javax.swing.JTable();
        TabNCC = new javax.swing.JPanel();
        FilterSearch5 = new java.awt.TextField();
        jLabel23 = new javax.swing.JLabel();
        searchType5 = new javax.swing.JComboBox<>();
        LamMoiSP7 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        BHsua5 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        BHxoa5 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        BHthem5 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        NCCTable = new javax.swing.JTable();
        TabTK = new javax.swing.JPanel();
        FilterSearch6 = new java.awt.TextField();
        jLabel25 = new javax.swing.JLabel();
        searchType6 = new javax.swing.JComboBox<>();
        LamMoiSP8 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        BHsua6 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        BHxoa6 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        BHthem6 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TKTable = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        TKSubButton = new com.k33ptoo.components.KButton();
        QuyenSubButton = new com.k33ptoo.components.KButton();
        TabLSP = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        LSPTable = new javax.swing.JTable();
        searchType8 = new javax.swing.JComboBox<>();
        BHthem8 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        FilterSearch8 = new java.awt.TextField();
        BHxoa8 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        BHsua8 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        LamMoiSP10 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        SPSubButton1 = new com.k33ptoo.components.KButton();
        LSPSubButton1 = new com.k33ptoo.components.KButton();
        TabPN = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        PNTable = new javax.swing.JTable();
        searchType9 = new javax.swing.JComboBox<>();
        FilterSearch9 = new java.awt.TextField();
        LamMoiSP11 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        HDSubButton1 = new com.k33ptoo.components.KButton();
        PNSubButton1 = new com.k33ptoo.components.KButton();
        BHthem12 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        TabQuyen = new javax.swing.JPanel();
        BHthem10 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        searchType10 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        FilterSearch10 = new java.awt.TextField();
        BHxoa9 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        BHsua9 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        LamMoiSP12 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        QuyenTable = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        TKSubButton1 = new com.k33ptoo.components.KButton();
        QuyenSubButton1 = new com.k33ptoo.components.KButton();
        TabTrangChu = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        timeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        dayLabel = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        menu2 = new javax.swing.JPanel();
        Nutbanhang = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Nutnhaphang = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Nuthoadon = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Nutsanpham = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Nutkhuyenmai = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Nutkhachhang = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Nutnhanvien = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        Nutnhacungcap = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Nuttaikhoan = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        header = new keeptoo.KGradientPanel();
        minclose = new javax.swing.JPanel();
        Nutthunho = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nutdong = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        txNhanVienDangNhap = new javax.swing.JLabel();
        txCurrentPage = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        formcontainer.setBackground(new java.awt.Color(35, 33, 77));
        formcontainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabContainer.setBackground(new java.awt.Color(255, 255, 255));
        TabContainer.setPreferredSize(new java.awt.Dimension(900, 639));

        TabBH.setBackground(new java.awt.Color(255, 255, 255));
        TabBH.setPreferredSize(new java.awt.Dimension(768, 639));
        TabBH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TabBHMousePressed(evt);
            }
        });
        TabBH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        BHSPTable.setAutoCreateRowSorter(true);
        BHSPTable.setBackground(new java.awt.Color(255, 255, 255));
        BHSPTable.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        BHSPTable.setForeground(new java.awt.Color(0, 0, 0));
        BHSPTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã", "Loại", "Tên", "Đơn giá", "Số lượng", "Trạng thái", "Hình ảnh"
            }
        ));
        BHSPTable.setFocusable(false);
        BHSPTable.setGridColor(new java.awt.Color(128, 128, 128));
        BHSPTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BHSPTable.setRowHeight(25);
        BHSPTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        BHSPTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        BHSPTable.setShowVerticalLines(false);
        BHSPTable.getTableHeader().setReorderingAllowed(false);
        BHSPTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BHSPTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BHSPTable);
        if (BHSPTable.getColumnModel().getColumnCount() > 0) {
            BHSPTable.getColumnModel().getColumn(0).setMinWidth(10);
            BHSPTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            BHSPTable.getColumnModel().getColumn(1).setMaxWidth(800);
            BHSPTable.getColumnModel().getColumn(2).setPreferredWidth(20);
            BHSPTable.getColumnModel().getColumn(6).setMinWidth(0);
            BHSPTable.getColumnModel().getColumn(6).setPreferredWidth(0);
            BHSPTable.getColumnModel().getColumn(6).setMaxWidth(0);
            BHSPTable.getColumnModel().getColumn(7).setMinWidth(0);
            BHSPTable.getColumnModel().getColumn(7).setPreferredWidth(0);
            BHSPTable.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        TabBH.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 530, 380));

        FilterSearchBH.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FilterSearchBH.setMinimumSize(new java.awt.Dimension(28, 25));
        FilterSearchBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterSearchBHActionPerformed(evt);
            }
        });
        FilterSearchBH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterSearchBHKeyReleased(evt);
            }
        });
        TabBH.add(FilterSearchBH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 220, 30));

        BHthem.setBackground(new java.awt.Color(0, 204, 204));
        BHthem.setPreferredSize(new java.awt.Dimension(80, 24));
        BHthem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHthemMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHthemMouseReleased(evt);
            }
        });

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-plus-20.png"))); // NOI18N
        jLabel66.setText("Thêm");

        javax.swing.GroupLayout BHthemLayout = new javax.swing.GroupLayout(BHthem);
        BHthem.setLayout(BHthemLayout);
        BHthemLayout.setHorizontalGroup(
            BHthemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BHthemLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        BHthemLayout.setVerticalGroup(
            BHthemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        TabBH.add(BHthem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, 320, 30));

        BHxoa.setBackground(new java.awt.Color(51, 204, 0));
        BHxoa.setPreferredSize(new java.awt.Dimension(80, 24));
        BHxoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHxoaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHxoaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout BHxoaLayout = new javax.swing.GroupLayout(BHxoa);
        BHxoa.setLayout(BHxoaLayout);
        BHxoaLayout.setHorizontalGroup(
            BHxoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        BHxoaLayout.setVerticalGroup(
            BHxoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        TabBH.add(BHxoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 650, 130, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-search-25.png"))); // NOI18N
        TabBH.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 30, 30));

        searchTypeBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchTypeBH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã", "Loại", "Tên", "Đơn giá", "Số lượng" }));
        TabBH.add(searchTypeBH, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 110, 30));

        ImageLabelBH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TabBH.add(ImageLabelBH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 190, 240));

        txMaSPBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txMaSPBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaSPBHActionPerformed(evt);
            }
        });

        jLabel3.setText("Mã sản phẩm");

        txLSPBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txLSPBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txLSPBHActionPerformed(evt);
            }
        });

        jLabel26.setText("Loại sản phẩm");

        txTenSPBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txTenSPBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTenSPBHActionPerformed(evt);
            }
        });

        jLabel29.setText("Tên sản phẩm");

        txDonGiaBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txDonGiaBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDonGiaBHActionPerformed(evt);
            }
        });

        jLabel31.setText("Đơn giá");

        txSoLuongBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txSoLuongBH.setText("1");
        txSoLuongBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txSoLuongBHActionPerformed(evt);
            }
        });

        jLabel42.setText("Số lượng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txSoLuongBH)
                                .addGap(49, 49, 49))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txMaSPBH)
                                .addComponent(txTenSPBH, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txLSPBH, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)))
                            .addComponent(txDonGiaBH)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txMaSPBH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txLSPBH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txTenSPBH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDonGiaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txSoLuongBH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        TabBH.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 320, 210));

        jLabel43.setText("Mã hóa đơn");

        txMaHDBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txMaHDBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaHDBHActionPerformed(evt);
            }
        });

        jLabel46.setText("Khách hàng");

        txKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txKhachHangActionPerformed(evt);
            }
        });

        txTongTienBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txTongTienBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTongTienBHActionPerformed(evt);
            }
        });

        jLabel47.setText("Tổng tiền");

        txMaNVBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txMaNVBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaNVBHActionPerformed(evt);
            }
        });

        jLabel49.setText("Nhân viên");

        txNgayLapHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txNgayLapHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNgayLapHDActionPerformed(evt);
            }
        });

        jLabel50.setText("Ngày lập");

        ChonMaLoai.setBackground(new java.awt.Color(204, 204, 204));
        ChonMaLoai.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ChonMaLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ChonMaLoaiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ChonMaLoaiMouseReleased(evt);
            }
        });

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-pen-15.png"))); // NOI18N

        javax.swing.GroupLayout ChonMaLoaiLayout = new javax.swing.GroupLayout(ChonMaLoai);
        ChonMaLoai.setLayout(ChonMaLoaiLayout);
        ChonMaLoaiLayout.setHorizontalGroup(
            ChonMaLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );
        ChonMaLoaiLayout.setVerticalGroup(
            ChonMaLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel53.setText("Giờ lập");

        txGioLapHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txGioLapHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txGioLapHDActionPerformed(evt);
            }
        });

        txKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txKhuyenMaiActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel48.setText("Khuyến mãi");

        ChonMaLoai1.setBackground(new java.awt.Color(204, 204, 204));
        ChonMaLoai1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ChonMaLoai1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ChonMaLoai1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ChonMaLoai1MouseReleased(evt);
            }
        });

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-pen-15.png"))); // NOI18N

        javax.swing.GroupLayout ChonMaLoai1Layout = new javax.swing.GroupLayout(ChonMaLoai1);
        ChonMaLoai1.setLayout(ChonMaLoai1Layout);
        ChonMaLoai1Layout.setHorizontalGroup(
            ChonMaLoai1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );
        ChonMaLoai1Layout.setVerticalGroup(
            ChonMaLoai1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txMaHDBH, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTongTienBH, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txMaNVBH))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNgayLapHD, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txGioLapHD))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ChonMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ChonMaLoai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(jLabel46))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txMaHDBH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ChonMaLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addGap(41, 41, 41)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txTongTienBH, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(ChonMaLoai1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txKhuyenMai))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txMaNVBH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txNgayLapHD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txGioLapHD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        TabBH.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 590, -1));

        jScrollPane12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane12.setForeground(new java.awt.Color(255, 255, 255));

        BHTTTable.setAutoCreateRowSorter(true);
        BHTTTable.setBackground(new java.awt.Color(255, 255, 255));
        BHTTTable.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        BHTTTable.setForeground(new java.awt.Color(0, 0, 0));
        BHTTTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã", "Tên", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        BHTTTable.setFocusable(false);
        BHTTTable.setGridColor(new java.awt.Color(128, 128, 128));
        BHTTTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BHTTTable.setRowHeight(25);
        BHTTTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        BHTTTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        BHTTTable.setShowVerticalLines(false);
        BHTTTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(BHTTTable);
        if (BHTTTable.getColumnModel().getColumnCount() > 0) {
            BHTTTable.getColumnModel().getColumn(0).setMaxWidth(800);
            BHTTTable.getColumnModel().getColumn(1).setPreferredWidth(20);
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tổng tiền:");

        txTienTong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTienTongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txTienTong, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txTongtiensauKM, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 339, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txTongtiensauKM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txTienTong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 67, Short.MAX_VALUE)))
        );

        TabBH.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 590, 380));

        BHxoa7.setBackground(new java.awt.Color(255, 0, 0));
        BHxoa7.setPreferredSize(new java.awt.Dimension(80, 24));
        BHxoa7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHxoa7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHxoa7MouseReleased(evt);
            }
        });

        jLabel64.setBackground(new java.awt.Color(255, 255, 255));
        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-close-15.png"))); // NOI18N
        jLabel64.setText("Hủy");

        javax.swing.GroupLayout BHxoa7Layout = new javax.swing.GroupLayout(BHxoa7);
        BHxoa7.setLayout(BHxoa7Layout);
        BHxoa7Layout.setHorizontalGroup(
            BHxoa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BHxoa7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BHxoa7Layout.setVerticalGroup(
            BHxoa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BHxoa7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TabBH.add(BHxoa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 650, 120, 30));

        LamMoiSP2.setBackground(new java.awt.Color(51, 204, 0));
        LamMoiSP2.setPreferredSize(new java.awt.Dimension(80, 24));
        LamMoiSP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LamMoiSP2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LamMoiSP2MouseReleased(evt);
            }
        });

        jLabel98.setBackground(new java.awt.Color(255, 255, 255));
        jLabel98.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-update-left-rotation-15.png"))); // NOI18N
        jLabel98.setText("Làm mới");

        javax.swing.GroupLayout LamMoiSP2Layout = new javax.swing.GroupLayout(LamMoiSP2);
        LamMoiSP2.setLayout(LamMoiSP2Layout);
        LamMoiSP2Layout.setHorizontalGroup(
            LamMoiSP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LamMoiSP2Layout.createSequentialGroup()
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        LamMoiSP2Layout.setVerticalGroup(
            LamMoiSP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabBH.add(LamMoiSP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 120, -1));

        TabContainer.addTab("BanHang", TabBH);
        TabBH.getAccessibleContext().setAccessibleName("tab1");

        TabNH.setBackground(new java.awt.Color(255, 255, 255));
        TabNH.setPreferredSize(new java.awt.Dimension(768, 639));
        TabNH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TabNHMouseReleased(evt);
            }
        });
        TabNH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txMaSPNH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txMaSPNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaSPNHActionPerformed(evt);
            }
        });

        jLabel54.setText("Mã sản phẩm");

        txLSPNH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txLSPNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txLSPNHActionPerformed(evt);
            }
        });

        jLabel55.setText("Loại sản phẩm");

        txTenSPNH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txTenSPNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTenSPNHActionPerformed(evt);
            }
        });

        jLabel56.setText("Tên sản phẩm");

        txDonGiaNH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txDonGiaNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDonGiaNHActionPerformed(evt);
            }
        });

        jLabel57.setText("Đơn giá");

        txSoLuongNH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txSoLuongNH.setText("1");
        txSoLuongNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txSoLuongNHActionPerformed(evt);
            }
        });

        jLabel58.setText("Số lượng");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txSoLuongNH)
                                .addGap(49, 49, 49))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txMaSPNH)
                                .addComponent(txTenSPNH, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                            .addComponent(jLabel54)
                            .addComponent(jLabel56))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txLSPNH, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel55)))
                            .addComponent(txDonGiaNH)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txMaSPNH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txLSPNH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel55)
                        .addComponent(jLabel54)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txTenSPNH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDonGiaNH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txSoLuongNH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        TabNH.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 320, 210));

        jScrollPane13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane13.setForeground(new java.awt.Color(255, 255, 255));

        NHSPTable.setAutoCreateRowSorter(true);
        NHSPTable.setBackground(new java.awt.Color(255, 255, 255));
        NHSPTable.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        NHSPTable.setForeground(new java.awt.Color(0, 0, 0));
        NHSPTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã", "Loại", "Tên", "Đơn giá", "Số lượng", "Trạng thái", "Hình ảnh"
            }
        ));
        NHSPTable.setFocusable(false);
        NHSPTable.setGridColor(new java.awt.Color(128, 128, 128));
        NHSPTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        NHSPTable.setRowHeight(25);
        NHSPTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        NHSPTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        NHSPTable.setShowVerticalLines(false);
        NHSPTable.getTableHeader().setReorderingAllowed(false);
        NHSPTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NHSPTableMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(NHSPTable);
        if (NHSPTable.getColumnModel().getColumnCount() > 0) {
            NHSPTable.getColumnModel().getColumn(0).setMinWidth(10);
            NHSPTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            NHSPTable.getColumnModel().getColumn(1).setMaxWidth(800);
            NHSPTable.getColumnModel().getColumn(2).setPreferredWidth(20);
            NHSPTable.getColumnModel().getColumn(6).setMinWidth(0);
            NHSPTable.getColumnModel().getColumn(6).setPreferredWidth(0);
            NHSPTable.getColumnModel().getColumn(6).setMaxWidth(0);
            NHSPTable.getColumnModel().getColumn(7).setMinWidth(0);
            NHSPTable.getColumnModel().getColumn(7).setPreferredWidth(0);
            NHSPTable.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        TabNH.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 530, 380));

        jLabel59.setText("Mã phiếu nhập");

        txMaPNNH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txMaPNNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaPNNHActionPerformed(evt);
            }
        });

        jLabel60.setText("Nhà cung cấp");

        txNhaCungCap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNhaCungCapActionPerformed(evt);
            }
        });

        txTongTienNH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txTongTienNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTongTienNHActionPerformed(evt);
            }
        });

        jLabel61.setText("Tổng tiền");

        txMaNVNH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txMaNVNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaNVNHActionPerformed(evt);
            }
        });

        jLabel65.setText("Nhân viên");

        txNgayLapPN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txNgayLapPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNgayLapPNActionPerformed(evt);
            }
        });

        jLabel91.setText("Ngày lập");

        ChonMaLoai2.setBackground(new java.awt.Color(204, 204, 204));
        ChonMaLoai2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ChonMaLoai2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ChonMaLoai2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ChonMaLoai2MouseReleased(evt);
            }
        });

        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-pen-15.png"))); // NOI18N

        javax.swing.GroupLayout ChonMaLoai2Layout = new javax.swing.GroupLayout(ChonMaLoai2);
        ChonMaLoai2.setLayout(ChonMaLoai2Layout);
        ChonMaLoai2Layout.setHorizontalGroup(
            ChonMaLoai2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel92, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );
        ChonMaLoai2Layout.setVerticalGroup(
            ChonMaLoai2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel105.setText("Giờ lập");

        txGioLapPN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txGioLapPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txGioLapPNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txMaPNNH, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTongTienNH, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txMaNVNH))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNgayLapPN, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txGioLapPN))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ChonMaLoai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ChonMaLoai2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addGap(74, 74, 74))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txMaPNNH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txTongTienNH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txMaNVNH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txNgayLapPN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txGioLapPN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        TabNH.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 590, 210));

        BHthem11.setBackground(new java.awt.Color(0, 204, 204));
        BHthem11.setPreferredSize(new java.awt.Dimension(80, 24));
        BHthem11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHthem11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHthem11MouseReleased(evt);
            }
        });

        jLabel106.setBackground(new java.awt.Color(255, 255, 255));
        jLabel106.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-plus-20.png"))); // NOI18N
        jLabel106.setText("Thêm");

        javax.swing.GroupLayout BHthem11Layout = new javax.swing.GroupLayout(BHthem11);
        BHthem11.setLayout(BHthem11Layout);
        BHthem11Layout.setHorizontalGroup(
            BHthem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BHthem11Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        BHthem11Layout.setVerticalGroup(
            BHthem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        TabNH.add(BHthem11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, 320, 30));

        BHxoa10.setBackground(new java.awt.Color(51, 204, 0));
        BHxoa10.setPreferredSize(new java.awt.Dimension(80, 24));
        BHxoa10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHxoa10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHxoa10MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout BHxoa10Layout = new javax.swing.GroupLayout(BHxoa10);
        BHxoa10.setLayout(BHxoa10Layout);
        BHxoa10Layout.setHorizontalGroup(
            BHxoa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        BHxoa10Layout.setVerticalGroup(
            BHxoa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        TabNH.add(BHxoa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 650, 130, 30));

        jScrollPane14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane14.setForeground(new java.awt.Color(255, 255, 255));

        NHTTTable.setAutoCreateRowSorter(true);
        NHTTTable.setBackground(new java.awt.Color(255, 255, 255));
        NHTTTable.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        NHTTTable.setForeground(new java.awt.Color(0, 0, 0));
        NHTTTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã", "Tên", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        NHTTTable.setFocusable(false);
        NHTTTable.setGridColor(new java.awt.Color(128, 128, 128));
        NHTTTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        NHTTTable.setRowHeight(25);
        NHTTTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        NHTTTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        NHTTTable.setShowVerticalLines(false);
        NHTTTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane14.setViewportView(NHTTTable);
        if (NHTTTable.getColumnModel().getColumnCount() > 0) {
            NHTTTable.getColumnModel().getColumn(0).setMaxWidth(800);
            NHTTTable.getColumnModel().getColumn(1).setPreferredWidth(20);
        }

        jLabel108.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("Tổng tiền:");

        txTienTong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTienTong1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(txTienTong1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txTongtiensauKM1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 339, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txTongtiensauKM1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txTienTong1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 67, Short.MAX_VALUE)))
        );

        TabNH.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 590, 380));

        FilterSearchBH1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FilterSearchBH1.setMinimumSize(new java.awt.Dimension(28, 25));
        FilterSearchBH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterSearchBH1ActionPerformed(evt);
            }
        });
        FilterSearchBH1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterSearchBH1KeyReleased(evt);
            }
        });
        TabNH.add(FilterSearchBH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 220, 30));

        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-search-25.png"))); // NOI18N
        TabNH.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 30, 30));

        searchTypeBH1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchTypeBH1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã", "Loại", "Tên", "Đơn giá", "Số lượng" }));
        TabNH.add(searchTypeBH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 110, 30));

        BHxoa11.setBackground(new java.awt.Color(255, 0, 0));
        BHxoa11.setPreferredSize(new java.awt.Dimension(80, 24));
        BHxoa11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHxoa11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHxoa11MouseReleased(evt);
            }
        });

        jLabel110.setBackground(new java.awt.Color(255, 255, 255));
        jLabel110.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-close-15.png"))); // NOI18N
        jLabel110.setText("Hủy");

        javax.swing.GroupLayout BHxoa11Layout = new javax.swing.GroupLayout(BHxoa11);
        BHxoa11.setLayout(BHxoa11Layout);
        BHxoa11Layout.setHorizontalGroup(
            BHxoa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BHxoa11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BHxoa11Layout.setVerticalGroup(
            BHxoa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BHxoa11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TabNH.add(BHxoa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 650, 120, 30));

        ImageLabelNH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TabNH.add(ImageLabelNH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 190, 240));

        LamMoiSP4.setBackground(new java.awt.Color(51, 204, 0));
        LamMoiSP4.setPreferredSize(new java.awt.Dimension(80, 24));
        LamMoiSP4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LamMoiSP4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LamMoiSP4MouseReleased(evt);
            }
        });

        jLabel107.setBackground(new java.awt.Color(255, 255, 255));
        jLabel107.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-update-left-rotation-15.png"))); // NOI18N
        jLabel107.setText("Làm mới");

        javax.swing.GroupLayout LamMoiSP4Layout = new javax.swing.GroupLayout(LamMoiSP4);
        LamMoiSP4.setLayout(LamMoiSP4Layout);
        LamMoiSP4Layout.setHorizontalGroup(
            LamMoiSP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        LamMoiSP4Layout.setVerticalGroup(
            LamMoiSP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabNH.add(LamMoiSP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 120, -1));

        TabContainer.addTab("NhapHang", TabNH);

        TabHD.setBackground(new java.awt.Color(255, 255, 255));
        TabHD.setPreferredSize(new java.awt.Dimension(768, 639));
        TabHD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FilterSearch7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FilterSearch7.setMinimumSize(new java.awt.Dimension(28, 25));
        FilterSearch7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterSearch7ActionPerformed(evt);
            }
        });
        FilterSearch7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterSearch7KeyReleased(evt);
            }
        });
        TabHD.add(FilterSearch7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, 220, 30));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-search-25.png"))); // NOI18N
        TabHD.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 120, 30, 40));

        searchType7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchType7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã hóa đơn", "Mã nhân viên", "Mã khách hàng", "Mã khuyến mãi", "Ngày lập", "Giờ lập", "Tổng tiền", " " }));
        TabHD.add(searchType7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 126, 110, 30));

        LamMoiSP9.setBackground(new java.awt.Color(51, 204, 0));
        LamMoiSP9.setPreferredSize(new java.awt.Dimension(80, 24));
        LamMoiSP9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LamMoiSP9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LamMoiSP9MouseReleased(evt);
            }
        });

        jLabel90.setBackground(new java.awt.Color(255, 255, 255));
        jLabel90.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-update-left-rotation-15.png"))); // NOI18N
        jLabel90.setText("Làm mới");

        javax.swing.GroupLayout LamMoiSP9Layout = new javax.swing.GroupLayout(LamMoiSP9);
        LamMoiSP9.setLayout(LamMoiSP9Layout);
        LamMoiSP9Layout.setHorizontalGroup(
            LamMoiSP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LamMoiSP9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        LamMoiSP9Layout.setVerticalGroup(
            LamMoiSP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LamMoiSP9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TabHD.add(LamMoiSP9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 120, -1));

        BHthem7.setBackground(new java.awt.Color(0, 204, 204));
        BHthem7.setPreferredSize(new java.awt.Dimension(80, 24));
        BHthem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHthem7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHthem7MouseReleased(evt);
            }
        });

        jLabel93.setBackground(new java.awt.Color(255, 255, 255));
        jLabel93.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-search-20.png"))); // NOI18N
        jLabel93.setText("Xem chi tiết");

        javax.swing.GroupLayout BHthem7Layout = new javax.swing.GroupLayout(BHthem7);
        BHthem7.setLayout(BHthem7Layout);
        BHthem7Layout.setHorizontalGroup(
            BHthem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHthem7Layout.setVerticalGroup(
            BHthem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabHD.add(BHthem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, -1));

        jScrollPane8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane8.setForeground(new java.awt.Color(255, 255, 255));

        HDTable.setAutoCreateRowSorter(true);
        HDTable.setBackground(new java.awt.Color(255, 255, 255));
        HDTable.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        HDTable.setForeground(new java.awt.Color(0, 0, 0));
        HDTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã hóa đơn", "Mã nhân viên", "Mã khách hàng", "Mã khuyến mãi", "Ngày lập", "Giờ lập", "Tổng tiền"
            }
        ));
        HDTable.setFocusable(false);
        HDTable.setGridColor(new java.awt.Color(128, 128, 128));
        HDTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        HDTable.setRowHeight(25);
        HDTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        HDTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        HDTable.setShowVerticalLines(false);
        HDTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(HDTable);
        if (HDTable.getColumnModel().getColumnCount() > 0) {
            HDTable.getColumnModel().getColumn(0).setMaxWidth(100);
            HDTable.getColumnModel().getColumn(6).setPreferredWidth(20);
        }

        TabHD.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1110, 500));

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-cheque-48.png"))); // NOI18N
        jLabel33.setText("Hóa đơn");
        TabHD.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 60));

        jLabel37.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-truck-48.png"))); // NOI18N
        jLabel37.setText("Phiếu nhập");
        TabHD.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 130, 60));

        HDSubButton.setkHoverColor(new java.awt.Color(55, 213, 214));
        HDSubButton.setkHoverEndColor(new java.awt.Color(54, 9, 109));
        HDSubButton.setkHoverStartColor(new java.awt.Color(55, 213, 214));
        HDSubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HDSubButtonActionPerformed(evt);
            }
        });
        TabHD.add(HDSubButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 60));

        PNSubButton.setkHoverEndColor(new java.awt.Color(54, 9, 109));
        PNSubButton.setkHoverStartColor(new java.awt.Color(55, 213, 214));
        PNSubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNSubButtonActionPerformed(evt);
            }
        });
        TabHD.add(PNSubButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 140, 60));

        TabContainer.addTab("HoaDon", TabHD);

        TabSP.setBackground(new java.awt.Color(255, 255, 255));
        TabSP.setPreferredSize(new java.awt.Dimension(768, 639));
        TabSP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-search-25.png"))); // NOI18N
        TabSP.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 120, 30, 40));

        FilterSearch1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FilterSearch1.setMinimumSize(new java.awt.Dimension(28, 25));
        FilterSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterSearch1ActionPerformed(evt);
            }
        });
        FilterSearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterSearch1KeyReleased(evt);
            }
        });
        TabSP.add(FilterSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, 220, 30));

        searchType1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchType1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã sản phẩm", "Mã loại", "Tên", "Đơn giá", "Số lượng", "Trạng Thái ", " " }));
        TabSP.add(searchType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 126, 110, 30));

        LamMoiSP1.setBackground(new java.awt.Color(51, 204, 0));
        LamMoiSP1.setPreferredSize(new java.awt.Dimension(80, 24));
        LamMoiSP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LamMoiSP1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LamMoiSP1MouseReleased(evt);
            }
        });

        jLabel67.setBackground(new java.awt.Color(255, 255, 255));
        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-update-left-rotation-15.png"))); // NOI18N
        jLabel67.setText("Làm mới");

        javax.swing.GroupLayout LamMoiSP1Layout = new javax.swing.GroupLayout(LamMoiSP1);
        LamMoiSP1.setLayout(LamMoiSP1Layout);
        LamMoiSP1Layout.setHorizontalGroup(
            LamMoiSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        LamMoiSP1Layout.setVerticalGroup(
            LamMoiSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabSP.add(LamMoiSP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 120, -1));

        BHsua1.setBackground(new java.awt.Color(255, 204, 0));
        BHsua1.setPreferredSize(new java.awt.Dimension(80, 24));
        BHsua1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHsua1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHsua1MouseReleased(evt);
            }
        });

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-pen-15.png"))); // NOI18N
        jLabel68.setText("Sửa");

        javax.swing.GroupLayout BHsua1Layout = new javax.swing.GroupLayout(BHsua1);
        BHsua1.setLayout(BHsua1Layout);
        BHsua1Layout.setHorizontalGroup(
            BHsua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHsua1Layout.setVerticalGroup(
            BHsua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabSP.add(BHsua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 120, -1));

        BHxoa1.setBackground(new java.awt.Color(255, 0, 0));
        BHxoa1.setPreferredSize(new java.awt.Dimension(80, 24));
        BHxoa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHxoa1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHxoa1MouseReleased(evt);
            }
        });

        jLabel63.setBackground(new java.awt.Color(255, 255, 255));
        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-close-15.png"))); // NOI18N
        jLabel63.setText("Xóa");

        javax.swing.GroupLayout BHxoa1Layout = new javax.swing.GroupLayout(BHxoa1);
        BHxoa1.setLayout(BHxoa1Layout);
        BHxoa1Layout.setHorizontalGroup(
            BHxoa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHxoa1Layout.setVerticalGroup(
            BHxoa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabSP.add(BHxoa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 120, -1));

        BHthem1.setBackground(new java.awt.Color(0, 204, 204));
        BHthem1.setPreferredSize(new java.awt.Dimension(80, 24));
        BHthem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHthem1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHthem1MouseReleased(evt);
            }
        });

        jLabel69.setBackground(new java.awt.Color(255, 255, 255));
        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-plus-20.png"))); // NOI18N
        jLabel69.setText("Thêm");

        javax.swing.GroupLayout BHthem1Layout = new javax.swing.GroupLayout(BHthem1);
        BHthem1.setLayout(BHthem1Layout);
        BHthem1Layout.setHorizontalGroup(
            BHthem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHthem1Layout.setVerticalGroup(
            BHthem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabSP.add(BHthem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        SPTable.setAutoCreateRowSorter(true);
        SPTable.setBackground(new java.awt.Color(255, 255, 255));
        SPTable.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        SPTable.setForeground(new java.awt.Color(0, 0, 0));
        SPTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã sản phẩm", "Mã loại", "Tên", "Đơn giá", "Số lượng", "Trạng thái", "tenfile"
            }
        ));
        SPTable.setFocusable(false);
        SPTable.setGridColor(new java.awt.Color(128, 128, 128));
        SPTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        SPTable.setRowHeight(25);
        SPTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        SPTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        SPTable.setShowVerticalLines(false);
        SPTable.getTableHeader().setReorderingAllowed(false);
        SPTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SPTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(SPTable);
        if (SPTable.getColumnModel().getColumnCount() > 0) {
            SPTable.getColumnModel().getColumn(0).setMaxWidth(100);
            SPTable.getColumnModel().getColumn(1).setMinWidth(10);
            SPTable.getColumnModel().getColumn(1).setPreferredWidth(10);
            SPTable.getColumnModel().getColumn(2).setMinWidth(10);
            SPTable.getColumnModel().getColumn(2).setPreferredWidth(10);
            SPTable.getColumnModel().getColumn(5).setMinWidth(10);
            SPTable.getColumnModel().getColumn(5).setPreferredWidth(10);
            SPTable.getColumnModel().getColumn(6).setPreferredWidth(20);
            SPTable.getColumnModel().getColumn(7).setMinWidth(0);
            SPTable.getColumnModel().getColumn(7).setPreferredWidth(0);
            SPTable.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        TabSP.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 780, 500));

        jLabel38.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-aliexpress-48.png"))); // NOI18N
        jLabel38.setText("Sản phẩm");
        TabSP.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 60));

        jLabel39.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-bookshelf-48.png"))); // NOI18N
        jLabel39.setText("Loại sản phẩm");
        TabSP.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 150, 60));

        SPSubButton.setkHoverColor(new java.awt.Color(55, 213, 214));
        SPSubButton.setkHoverEndColor(new java.awt.Color(54, 9, 109));
        SPSubButton.setkHoverStartColor(new java.awt.Color(55, 213, 214));
        SPSubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPSubButtonActionPerformed(evt);
            }
        });
        TabSP.add(SPSubButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 60));

        LSPSubButton.setkHoverEndColor(new java.awt.Color(54, 9, 109));
        LSPSubButton.setkHoverStartColor(new java.awt.Color(55, 213, 214));
        LSPSubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LSPSubButtonActionPerformed(evt);
            }
        });
        TabSP.add(LSPSubButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 160, 60));

        ImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TabSP.add(ImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 360, 500));

        TabContainer.addTab("SanPham", TabSP);

        TabKM.setBackground(new java.awt.Color(255, 255, 255));
        TabKM.setPreferredSize(new java.awt.Dimension(768, 639));
        TabKM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FilterSearch3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FilterSearch3.setMinimumSize(new java.awt.Dimension(28, 25));
        FilterSearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterSearch3ActionPerformed(evt);
            }
        });
        FilterSearch3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterSearch3KeyReleased(evt);
            }
        });
        TabKM.add(FilterSearch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, 220, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-search-25.png"))); // NOI18N
        TabKM.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 120, 30, 40));

        searchType3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchType3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã KM", "Điều kiện", "Phầm trăm KM", "Ngày bắt đầu", "Ngày kết thúc", "Trạng thái" }));
        TabKM.add(searchType3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 126, 110, 30));

        LamMoiSP3.setBackground(new java.awt.Color(51, 204, 0));
        LamMoiSP3.setPreferredSize(new java.awt.Dimension(80, 24));
        LamMoiSP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LamMoiSP3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LamMoiSP3MouseReleased(evt);
            }
        });

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-update-left-rotation-15.png"))); // NOI18N
        jLabel74.setText("Làm mới");

        javax.swing.GroupLayout LamMoiSP3Layout = new javax.swing.GroupLayout(LamMoiSP3);
        LamMoiSP3.setLayout(LamMoiSP3Layout);
        LamMoiSP3Layout.setHorizontalGroup(
            LamMoiSP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        LamMoiSP3Layout.setVerticalGroup(
            LamMoiSP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabKM.add(LamMoiSP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 120, -1));

        BHsua3.setBackground(new java.awt.Color(255, 204, 0));
        BHsua3.setPreferredSize(new java.awt.Dimension(80, 24));
        BHsua3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHsua3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHsua3MouseReleased(evt);
            }
        });

        jLabel75.setBackground(new java.awt.Color(255, 255, 255));
        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-pen-15.png"))); // NOI18N
        jLabel75.setText("Sửa");

        javax.swing.GroupLayout BHsua3Layout = new javax.swing.GroupLayout(BHsua3);
        BHsua3.setLayout(BHsua3Layout);
        BHsua3Layout.setHorizontalGroup(
            BHsua3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHsua3Layout.setVerticalGroup(
            BHsua3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabKM.add(BHsua3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 120, -1));

        BHxoa3.setBackground(new java.awt.Color(255, 0, 0));
        BHxoa3.setPreferredSize(new java.awt.Dimension(80, 24));
        BHxoa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHxoa3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHxoa3MouseReleased(evt);
            }
        });

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-close-15.png"))); // NOI18N
        jLabel76.setText("Xóa");

        javax.swing.GroupLayout BHxoa3Layout = new javax.swing.GroupLayout(BHxoa3);
        BHxoa3.setLayout(BHxoa3Layout);
        BHxoa3Layout.setHorizontalGroup(
            BHxoa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHxoa3Layout.setVerticalGroup(
            BHxoa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabKM.add(BHxoa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 120, -1));

        BHthem3.setBackground(new java.awt.Color(0, 204, 204));
        BHthem3.setPreferredSize(new java.awt.Dimension(80, 24));
        BHthem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHthem3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHthem3MouseReleased(evt);
            }
        });

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-plus-20.png"))); // NOI18N
        jLabel77.setText("Thêm");

        javax.swing.GroupLayout BHthem3Layout = new javax.swing.GroupLayout(BHthem3);
        BHthem3.setLayout(BHthem3Layout);
        BHthem3Layout.setHorizontalGroup(
            BHthem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHthem3Layout.setVerticalGroup(
            BHthem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabKM.add(BHthem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, -1));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane5.setForeground(new java.awt.Color(255, 255, 255));

        KMTable.setAutoCreateRowSorter(true);
        KMTable.setBackground(new java.awt.Color(255, 255, 255));
        KMTable.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        KMTable.setForeground(new java.awt.Color(0, 0, 0));
        KMTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã khuyến mãi", "Tên", "Điều kiện", "Giảm giá", "Ngày bắt đầu", "Ngày kết thúc", "Trạng thái"
            }
        ));
        KMTable.setFocusable(false);
        KMTable.setGridColor(new java.awt.Color(128, 128, 128));
        KMTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        KMTable.setRowHeight(25);
        KMTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        KMTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        KMTable.setShowVerticalLines(false);
        KMTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(KMTable);
        if (KMTable.getColumnModel().getColumnCount() > 0) {
            KMTable.getColumnModel().getColumn(0).setMaxWidth(100);
            KMTable.getColumnModel().getColumn(6).setPreferredWidth(20);
        }

        TabKM.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1110, 500));

        TabContainer.addTab("KhuyenMai", TabKM);

        TabKH.setBackground(new java.awt.Color(255, 255, 255));
        TabKH.setPreferredSize(new java.awt.Dimension(768, 639));
        TabKH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FilterSearch2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FilterSearch2.setMinimumSize(new java.awt.Dimension(28, 25));
        FilterSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterSearch2ActionPerformed(evt);
            }
        });
        FilterSearch2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterSearch2KeyReleased(evt);
            }
        });
        TabKH.add(FilterSearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, 220, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-search-25.png"))); // NOI18N
        TabKH.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 120, 30, 40));

        searchType2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchType2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã khách hàng", "Tên khách hàng", "Địa chỉ", "Số điện thoại", "Trạng thái" }));
        TabKH.add(searchType2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 126, 110, 30));

        LamMoiSP5.setBackground(new java.awt.Color(51, 204, 0));
        LamMoiSP5.setPreferredSize(new java.awt.Dimension(80, 24));
        LamMoiSP5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LamMoiSP5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LamMoiSP5MouseReleased(evt);
            }
        });

        jLabel70.setBackground(new java.awt.Color(255, 255, 255));
        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-update-left-rotation-15.png"))); // NOI18N
        jLabel70.setText("Làm mới");

        javax.swing.GroupLayout LamMoiSP5Layout = new javax.swing.GroupLayout(LamMoiSP5);
        LamMoiSP5.setLayout(LamMoiSP5Layout);
        LamMoiSP5Layout.setHorizontalGroup(
            LamMoiSP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        LamMoiSP5Layout.setVerticalGroup(
            LamMoiSP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabKH.add(LamMoiSP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 120, -1));

        BHsua2.setBackground(new java.awt.Color(255, 204, 0));
        BHsua2.setPreferredSize(new java.awt.Dimension(80, 24));
        BHsua2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHsua2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHsua2MouseReleased(evt);
            }
        });

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-pen-15.png"))); // NOI18N
        jLabel71.setText("Sửa");

        javax.swing.GroupLayout BHsua2Layout = new javax.swing.GroupLayout(BHsua2);
        BHsua2.setLayout(BHsua2Layout);
        BHsua2Layout.setHorizontalGroup(
            BHsua2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHsua2Layout.setVerticalGroup(
            BHsua2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabKH.add(BHsua2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 120, -1));

        BHxoa2.setBackground(new java.awt.Color(255, 0, 0));
        BHxoa2.setPreferredSize(new java.awt.Dimension(80, 24));
        BHxoa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHxoa2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHxoa2MouseReleased(evt);
            }
        });

        jLabel72.setBackground(new java.awt.Color(255, 255, 255));
        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-close-15.png"))); // NOI18N
        jLabel72.setText("Xóa");

        javax.swing.GroupLayout BHxoa2Layout = new javax.swing.GroupLayout(BHxoa2);
        BHxoa2.setLayout(BHxoa2Layout);
        BHxoa2Layout.setHorizontalGroup(
            BHxoa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHxoa2Layout.setVerticalGroup(
            BHxoa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabKH.add(BHxoa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 120, -1));

        BHthem2.setBackground(new java.awt.Color(0, 204, 204));
        BHthem2.setPreferredSize(new java.awt.Dimension(80, 24));
        BHthem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHthem2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHthem2MouseReleased(evt);
            }
        });

        jLabel73.setBackground(new java.awt.Color(255, 255, 255));
        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-plus-20.png"))); // NOI18N
        jLabel73.setText("Thêm");

        javax.swing.GroupLayout BHthem2Layout = new javax.swing.GroupLayout(BHthem2);
        BHthem2.setLayout(BHthem2Layout);
        BHthem2Layout.setHorizontalGroup(
            BHthem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHthem2Layout.setVerticalGroup(
            BHthem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabKH.add(BHthem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, -1));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));

        KHTable.setAutoCreateRowSorter(true);
        KHTable.setBackground(new java.awt.Color(255, 255, 255));
        KHTable.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        KHTable.setForeground(new java.awt.Color(0, 0, 0));
        KHTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã khách hàng", "Tên khách hàng", "Địa chỉ", "Số điện thoại", "Trạng thái"
            }
        ));
        KHTable.setFocusable(false);
        KHTable.setGridColor(new java.awt.Color(128, 128, 128));
        KHTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        KHTable.setRowHeight(25);
        KHTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        KHTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        KHTable.setShowVerticalLines(false);
        KHTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(KHTable);
        if (KHTable.getColumnModel().getColumnCount() > 0) {
            KHTable.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        TabKH.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1110, 500));

        TabContainer.addTab("KhachHang", TabKH);

        TabNV.setBackground(new java.awt.Color(255, 255, 255));
        TabNV.setPreferredSize(new java.awt.Dimension(768, 639));
        TabNV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FilterSearch4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FilterSearch4.setMinimumSize(new java.awt.Dimension(28, 25));
        FilterSearch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterSearch4ActionPerformed(evt);
            }
        });
        FilterSearch4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterSearch4KeyReleased(evt);
            }
        });
        TabNV.add(FilterSearch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, 220, 30));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-search-25.png"))); // NOI18N
        TabNV.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 120, 30, 40));

        searchType4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchType4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã nhân viên", "Tên nhân viên", "Ngày sinh", "Địa chỉ", "Số điện thoại", "Trạng thái" }));
        TabNV.add(searchType4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 126, 110, 30));

        LamMoiSP6.setBackground(new java.awt.Color(51, 204, 0));
        LamMoiSP6.setPreferredSize(new java.awt.Dimension(80, 24));
        LamMoiSP6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LamMoiSP6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LamMoiSP6MouseReleased(evt);
            }
        });

        jLabel78.setBackground(new java.awt.Color(255, 255, 255));
        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-update-left-rotation-15.png"))); // NOI18N
        jLabel78.setText("Làm mới");

        javax.swing.GroupLayout LamMoiSP6Layout = new javax.swing.GroupLayout(LamMoiSP6);
        LamMoiSP6.setLayout(LamMoiSP6Layout);
        LamMoiSP6Layout.setHorizontalGroup(
            LamMoiSP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        LamMoiSP6Layout.setVerticalGroup(
            LamMoiSP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabNV.add(LamMoiSP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 120, -1));

        BHsua4.setBackground(new java.awt.Color(255, 204, 0));
        BHsua4.setPreferredSize(new java.awt.Dimension(80, 24));
        BHsua4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHsua4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHsua4MouseReleased(evt);
            }
        });

        jLabel79.setBackground(new java.awt.Color(255, 255, 255));
        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-pen-15.png"))); // NOI18N
        jLabel79.setText("Sửa");

        javax.swing.GroupLayout BHsua4Layout = new javax.swing.GroupLayout(BHsua4);
        BHsua4.setLayout(BHsua4Layout);
        BHsua4Layout.setHorizontalGroup(
            BHsua4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHsua4Layout.setVerticalGroup(
            BHsua4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabNV.add(BHsua4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 120, -1));

        BHxoa4.setBackground(new java.awt.Color(255, 0, 0));
        BHxoa4.setPreferredSize(new java.awt.Dimension(80, 24));
        BHxoa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHxoa4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHxoa4MouseReleased(evt);
            }
        });

        jLabel80.setBackground(new java.awt.Color(255, 255, 255));
        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-close-15.png"))); // NOI18N
        jLabel80.setText("Xóa");

        javax.swing.GroupLayout BHxoa4Layout = new javax.swing.GroupLayout(BHxoa4);
        BHxoa4.setLayout(BHxoa4Layout);
        BHxoa4Layout.setHorizontalGroup(
            BHxoa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHxoa4Layout.setVerticalGroup(
            BHxoa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabNV.add(BHxoa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 120, -1));

        BHthem4.setBackground(new java.awt.Color(0, 204, 204));
        BHthem4.setPreferredSize(new java.awt.Dimension(80, 24));
        BHthem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHthem4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHthem4MouseReleased(evt);
            }
        });

        jLabel81.setBackground(new java.awt.Color(255, 255, 255));
        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-plus-20.png"))); // NOI18N
        jLabel81.setText("Thêm");

        javax.swing.GroupLayout BHthem4Layout = new javax.swing.GroupLayout(BHthem4);
        BHthem4.setLayout(BHthem4Layout);
        BHthem4Layout.setHorizontalGroup(
            BHthem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHthem4Layout.setVerticalGroup(
            BHthem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabNV.add(BHthem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, -1));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));

        NVTable.setAutoCreateRowSorter(true);
        NVTable.setBackground(new java.awt.Color(255, 255, 255));
        NVTable.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        NVTable.setForeground(new java.awt.Color(0, 0, 0));
        NVTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã nhân viên", "Tên nhân viên", "Ngày sinh", "Địa chỉ", "Số điện thoại", "Trạng thái"
            }
        ));
        NVTable.setFocusable(false);
        NVTable.setGridColor(new java.awt.Color(128, 128, 128));
        NVTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        NVTable.setRowHeight(25);
        NVTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        NVTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        NVTable.setShowVerticalLines(false);
        NVTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(NVTable);
        if (NVTable.getColumnModel().getColumnCount() > 0) {
            NVTable.getColumnModel().getColumn(0).setMaxWidth(100);
            NVTable.getColumnModel().getColumn(6).setPreferredWidth(20);
        }

        TabNV.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1110, 500));

        TabContainer.addTab("NhanVien", TabNV);

        TabNCC.setBackground(new java.awt.Color(255, 255, 255));
        TabNCC.setPreferredSize(new java.awt.Dimension(768, 639));
        TabNCC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FilterSearch5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FilterSearch5.setMinimumSize(new java.awt.Dimension(28, 25));
        FilterSearch5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterSearch5ActionPerformed(evt);
            }
        });
        FilterSearch5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterSearch5KeyReleased(evt);
            }
        });
        TabNCC.add(FilterSearch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, 220, 30));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-search-25.png"))); // NOI18N
        TabNCC.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 120, 30, 40));

        searchType5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchType5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã NCC", "Tên NCC", "Địa chỉ", "Số điện thoại", "Fax", " " }));
        TabNCC.add(searchType5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 126, 110, 30));

        LamMoiSP7.setBackground(new java.awt.Color(51, 204, 0));
        LamMoiSP7.setPreferredSize(new java.awt.Dimension(80, 24));
        LamMoiSP7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LamMoiSP7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LamMoiSP7MouseReleased(evt);
            }
        });

        jLabel82.setBackground(new java.awt.Color(255, 255, 255));
        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-update-left-rotation-15.png"))); // NOI18N
        jLabel82.setText("Làm mới");

        javax.swing.GroupLayout LamMoiSP7Layout = new javax.swing.GroupLayout(LamMoiSP7);
        LamMoiSP7.setLayout(LamMoiSP7Layout);
        LamMoiSP7Layout.setHorizontalGroup(
            LamMoiSP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        LamMoiSP7Layout.setVerticalGroup(
            LamMoiSP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabNCC.add(LamMoiSP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 120, -1));

        BHsua5.setBackground(new java.awt.Color(255, 204, 0));
        BHsua5.setPreferredSize(new java.awt.Dimension(80, 24));
        BHsua5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHsua5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHsua5MouseReleased(evt);
            }
        });

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-pen-15.png"))); // NOI18N
        jLabel83.setText("Sửa");

        javax.swing.GroupLayout BHsua5Layout = new javax.swing.GroupLayout(BHsua5);
        BHsua5.setLayout(BHsua5Layout);
        BHsua5Layout.setHorizontalGroup(
            BHsua5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHsua5Layout.setVerticalGroup(
            BHsua5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabNCC.add(BHsua5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 120, -1));

        BHxoa5.setBackground(new java.awt.Color(255, 0, 0));
        BHxoa5.setPreferredSize(new java.awt.Dimension(80, 24));
        BHxoa5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHxoa5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHxoa5MouseReleased(evt);
            }
        });

        jLabel84.setBackground(new java.awt.Color(255, 255, 255));
        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-close-15.png"))); // NOI18N
        jLabel84.setText("Xóa");

        javax.swing.GroupLayout BHxoa5Layout = new javax.swing.GroupLayout(BHxoa5);
        BHxoa5.setLayout(BHxoa5Layout);
        BHxoa5Layout.setHorizontalGroup(
            BHxoa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHxoa5Layout.setVerticalGroup(
            BHxoa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabNCC.add(BHxoa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 120, -1));

        BHthem5.setBackground(new java.awt.Color(0, 204, 204));
        BHthem5.setPreferredSize(new java.awt.Dimension(80, 24));
        BHthem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHthem5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHthem5MouseReleased(evt);
            }
        });

        jLabel85.setBackground(new java.awt.Color(255, 255, 255));
        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-plus-20.png"))); // NOI18N
        jLabel85.setText("Thêm");

        javax.swing.GroupLayout BHthem5Layout = new javax.swing.GroupLayout(BHthem5);
        BHthem5.setLayout(BHthem5Layout);
        BHthem5Layout.setHorizontalGroup(
            BHthem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHthem5Layout.setVerticalGroup(
            BHthem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabNCC.add(BHthem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, -1));

        jScrollPane6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane6.setForeground(new java.awt.Color(255, 255, 255));

        NCCTable.setAutoCreateRowSorter(true);
        NCCTable.setBackground(new java.awt.Color(255, 255, 255));
        NCCTable.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        NCCTable.setForeground(new java.awt.Color(0, 0, 0));
        NCCTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã NCC", "Tên NCC", "Địa chỉ", "Số điện thoại", "Fax"
            }
        ));
        NCCTable.setFocusable(false);
        NCCTable.setGridColor(new java.awt.Color(128, 128, 128));
        NCCTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        NCCTable.setRowHeight(25);
        NCCTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        NCCTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        NCCTable.setShowVerticalLines(false);
        NCCTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(NCCTable);
        if (NCCTable.getColumnModel().getColumnCount() > 0) {
            NCCTable.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        TabNCC.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1110, 500));

        TabContainer.addTab("NhaCungCap", TabNCC);

        TabTK.setBackground(new java.awt.Color(255, 255, 255));
        TabTK.setPreferredSize(new java.awt.Dimension(768, 639));
        TabTK.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FilterSearch6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FilterSearch6.setMinimumSize(new java.awt.Dimension(28, 25));
        FilterSearch6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterSearch6ActionPerformed(evt);
            }
        });
        FilterSearch6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterSearch6KeyReleased(evt);
            }
        });
        TabTK.add(FilterSearch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, 220, 30));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-search-25.png"))); // NOI18N
        TabTK.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 120, 30, 40));

        searchType6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchType6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Tên tài khoản", "Mật khẩu", "Mã nhân viên", "Mã quyền" }));
        searchType6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchType6ActionPerformed(evt);
            }
        });
        TabTK.add(searchType6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 126, 110, 30));

        LamMoiSP8.setBackground(new java.awt.Color(51, 204, 0));
        LamMoiSP8.setPreferredSize(new java.awt.Dimension(80, 24));
        LamMoiSP8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LamMoiSP8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LamMoiSP8MouseReleased(evt);
            }
        });

        jLabel86.setBackground(new java.awt.Color(255, 255, 255));
        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-update-left-rotation-15.png"))); // NOI18N
        jLabel86.setText("Làm mới");

        javax.swing.GroupLayout LamMoiSP8Layout = new javax.swing.GroupLayout(LamMoiSP8);
        LamMoiSP8.setLayout(LamMoiSP8Layout);
        LamMoiSP8Layout.setHorizontalGroup(
            LamMoiSP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        LamMoiSP8Layout.setVerticalGroup(
            LamMoiSP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabTK.add(LamMoiSP8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 120, -1));

        BHsua6.setBackground(new java.awt.Color(255, 204, 0));
        BHsua6.setPreferredSize(new java.awt.Dimension(80, 24));
        BHsua6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHsua6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHsua6MouseReleased(evt);
            }
        });

        jLabel87.setBackground(new java.awt.Color(255, 255, 255));
        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-pen-15.png"))); // NOI18N
        jLabel87.setText("Sửa");

        javax.swing.GroupLayout BHsua6Layout = new javax.swing.GroupLayout(BHsua6);
        BHsua6.setLayout(BHsua6Layout);
        BHsua6Layout.setHorizontalGroup(
            BHsua6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHsua6Layout.setVerticalGroup(
            BHsua6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabTK.add(BHsua6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 120, -1));

        BHxoa6.setBackground(new java.awt.Color(255, 0, 0));
        BHxoa6.setPreferredSize(new java.awt.Dimension(80, 24));
        BHxoa6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHxoa6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHxoa6MouseReleased(evt);
            }
        });

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-close-15.png"))); // NOI18N
        jLabel88.setText("Xóa");

        javax.swing.GroupLayout BHxoa6Layout = new javax.swing.GroupLayout(BHxoa6);
        BHxoa6.setLayout(BHxoa6Layout);
        BHxoa6Layout.setHorizontalGroup(
            BHxoa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHxoa6Layout.setVerticalGroup(
            BHxoa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabTK.add(BHxoa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 120, -1));

        BHthem6.setBackground(new java.awt.Color(0, 204, 204));
        BHthem6.setPreferredSize(new java.awt.Dimension(80, 24));
        BHthem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHthem6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHthem6MouseReleased(evt);
            }
        });

        jLabel89.setBackground(new java.awt.Color(255, 255, 255));
        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-plus-20.png"))); // NOI18N
        jLabel89.setText("Thêm");

        javax.swing.GroupLayout BHthem6Layout = new javax.swing.GroupLayout(BHthem6);
        BHthem6.setLayout(BHthem6Layout);
        BHthem6Layout.setHorizontalGroup(
            BHthem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHthem6Layout.setVerticalGroup(
            BHthem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabTK.add(BHthem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, -1));

        jScrollPane7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane7.setForeground(new java.awt.Color(255, 255, 255));

        TKTable.setAutoCreateRowSorter(true);
        TKTable.setBackground(new java.awt.Color(255, 255, 255));
        TKTable.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        TKTable.setForeground(new java.awt.Color(0, 0, 0));
        TKTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên tài khoản", "Mật khẩu", "Mã nhân viên", "Mã quyền"
            }
        ));
        TKTable.setFocusable(false);
        TKTable.setGridColor(new java.awt.Color(128, 128, 128));
        TKTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TKTable.setRowHeight(25);
        TKTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        TKTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TKTable.setShowVerticalLines(false);
        TKTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(TKTable);
        if (TKTable.getColumnModel().getColumnCount() > 0) {
            TKTable.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        TabTK.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1110, 500));

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-unlock-security-lock-with-permission-granted-to-access-48.png"))); // NOI18N
        jLabel34.setText("Quyền");
        TabTK.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 60));

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-user-folder-48.png"))); // NOI18N
        jLabel24.setText("Tài Khoản");
        TabTK.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 60));

        TKSubButton.setkHoverColor(new java.awt.Color(55, 213, 214));
        TKSubButton.setkHoverEndColor(new java.awt.Color(54, 9, 109));
        TKSubButton.setkHoverStartColor(new java.awt.Color(55, 213, 214));
        TKSubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKSubButtonActionPerformed(evt);
            }
        });
        TabTK.add(TKSubButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 60));

        QuyenSubButton.setkHoverEndColor(new java.awt.Color(54, 9, 109));
        QuyenSubButton.setkHoverStartColor(new java.awt.Color(55, 213, 214));
        QuyenSubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuyenSubButtonActionPerformed(evt);
            }
        });
        TabTK.add(QuyenSubButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 60));

        TabContainer.addTab("TaiKhoan", TabTK);

        TabLSP.setBackground(new java.awt.Color(255, 255, 255));
        TabLSP.setPreferredSize(new java.awt.Dimension(768, 639));
        TabLSP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-search-25.png"))); // NOI18N
        TabLSP.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 120, 30, 40));

        jScrollPane9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane9.setForeground(new java.awt.Color(255, 255, 255));

        LSPTable.setAutoCreateRowSorter(true);
        LSPTable.setBackground(new java.awt.Color(255, 255, 255));
        LSPTable.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        LSPTable.setForeground(new java.awt.Color(0, 0, 0));
        LSPTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã loại", "Tên loại", "Mô tả"
            }
        ));
        LSPTable.setFocusable(false);
        LSPTable.setGridColor(new java.awt.Color(128, 128, 128));
        LSPTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        LSPTable.setRowHeight(25);
        LSPTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        LSPTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        LSPTable.setShowVerticalLines(false);
        LSPTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(LSPTable);
        if (LSPTable.getColumnModel().getColumnCount() > 0) {
            LSPTable.getColumnModel().getColumn(0).setMaxWidth(800);
            LSPTable.getColumnModel().getColumn(1).setPreferredWidth(20);
        }

        TabLSP.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1110, 500));

        searchType8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchType8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã loại", "Tên loại", "Mô tả" }));
        TabLSP.add(searchType8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 126, 110, 30));

        BHthem8.setBackground(new java.awt.Color(0, 204, 204));
        BHthem8.setPreferredSize(new java.awt.Dimension(80, 24));
        BHthem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHthem8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHthem8MouseReleased(evt);
            }
        });

        jLabel94.setBackground(new java.awt.Color(255, 255, 255));
        jLabel94.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-plus-20.png"))); // NOI18N
        jLabel94.setText("Thêm");
        jLabel94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel94MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout BHthem8Layout = new javax.swing.GroupLayout(BHthem8);
        BHthem8.setLayout(BHthem8Layout);
        BHthem8Layout.setHorizontalGroup(
            BHthem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHthem8Layout.setVerticalGroup(
            BHthem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabLSP.add(BHthem8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, -1));

        FilterSearch8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FilterSearch8.setMinimumSize(new java.awt.Dimension(28, 25));
        FilterSearch8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterSearch8ActionPerformed(evt);
            }
        });
        FilterSearch8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterSearch8KeyReleased(evt);
            }
        });
        TabLSP.add(FilterSearch8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, 220, 30));

        BHxoa8.setBackground(new java.awt.Color(255, 0, 0));
        BHxoa8.setPreferredSize(new java.awt.Dimension(80, 24));
        BHxoa8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHxoa8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHxoa8MouseReleased(evt);
            }
        });

        jLabel95.setBackground(new java.awt.Color(255, 255, 255));
        jLabel95.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-close-15.png"))); // NOI18N
        jLabel95.setText("Xóa");

        javax.swing.GroupLayout BHxoa8Layout = new javax.swing.GroupLayout(BHxoa8);
        BHxoa8.setLayout(BHxoa8Layout);
        BHxoa8Layout.setHorizontalGroup(
            BHxoa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHxoa8Layout.setVerticalGroup(
            BHxoa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabLSP.add(BHxoa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 120, -1));

        BHsua8.setBackground(new java.awt.Color(255, 204, 0));
        BHsua8.setPreferredSize(new java.awt.Dimension(80, 24));
        BHsua8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHsua8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHsua8MouseReleased(evt);
            }
        });

        jLabel96.setBackground(new java.awt.Color(255, 255, 255));
        jLabel96.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-pen-15.png"))); // NOI18N
        jLabel96.setText("Sửa");

        javax.swing.GroupLayout BHsua8Layout = new javax.swing.GroupLayout(BHsua8);
        BHsua8.setLayout(BHsua8Layout);
        BHsua8Layout.setHorizontalGroup(
            BHsua8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHsua8Layout.setVerticalGroup(
            BHsua8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabLSP.add(BHsua8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 120, -1));

        LamMoiSP10.setBackground(new java.awt.Color(51, 204, 0));
        LamMoiSP10.setPreferredSize(new java.awt.Dimension(80, 24));
        LamMoiSP10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LamMoiSP10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LamMoiSP10MouseReleased(evt);
            }
        });

        jLabel97.setBackground(new java.awt.Color(255, 255, 255));
        jLabel97.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-update-left-rotation-15.png"))); // NOI18N
        jLabel97.setText("Làm mới");

        javax.swing.GroupLayout LamMoiSP10Layout = new javax.swing.GroupLayout(LamMoiSP10);
        LamMoiSP10.setLayout(LamMoiSP10Layout);
        LamMoiSP10Layout.setHorizontalGroup(
            LamMoiSP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        LamMoiSP10Layout.setVerticalGroup(
            LamMoiSP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabLSP.add(LamMoiSP10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 120, -1));

        jLabel44.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-aliexpress-48.png"))); // NOI18N
        jLabel44.setText("Sản phẩm");
        TabLSP.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 60));

        jLabel45.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-bookshelf-48.png"))); // NOI18N
        jLabel45.setText("Loại sản phẩm");
        TabLSP.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 150, 60));

        SPSubButton1.setkHoverColor(new java.awt.Color(55, 213, 214));
        SPSubButton1.setkHoverEndColor(new java.awt.Color(54, 9, 109));
        SPSubButton1.setkHoverStartColor(new java.awt.Color(55, 213, 214));
        SPSubButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPSubButton1ActionPerformed(evt);
            }
        });
        TabLSP.add(SPSubButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 60));

        LSPSubButton1.setkHoverEndColor(new java.awt.Color(54, 9, 109));
        LSPSubButton1.setkHoverStartColor(new java.awt.Color(55, 213, 214));
        LSPSubButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LSPSubButton1ActionPerformed(evt);
            }
        });
        TabLSP.add(LSPSubButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 160, 60));

        TabContainer.addTab("LoaiSanPham", TabLSP);

        TabPN.setBackground(new java.awt.Color(255, 255, 255));
        TabPN.setPreferredSize(new java.awt.Dimension(768, 639));
        TabPN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-search-25.png"))); // NOI18N
        TabPN.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 120, 30, 40));

        jScrollPane10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane10.setForeground(new java.awt.Color(255, 255, 255));

        PNTable.setAutoCreateRowSorter(true);
        PNTable.setBackground(new java.awt.Color(255, 255, 255));
        PNTable.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        PNTable.setForeground(new java.awt.Color(0, 0, 0));
        PNTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã phiếu nhập", "Mã nhà cung cấp", "Mã nhân viên", "Ngày nhập", "Giờ nhập", "Tổng tiền"
            }
        ));
        PNTable.setFocusable(false);
        PNTable.setGridColor(new java.awt.Color(128, 128, 128));
        PNTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        PNTable.setRowHeight(25);
        PNTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        PNTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        PNTable.setShowVerticalLines(false);
        PNTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(PNTable);
        if (PNTable.getColumnModel().getColumnCount() > 0) {
            PNTable.getColumnModel().getColumn(0).setMaxWidth(800);
            PNTable.getColumnModel().getColumn(1).setPreferredWidth(20);
        }

        TabPN.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1110, 500));

        searchType9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchType9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã phiếu nhập", "Mã nhà cung cấp", "Mã nhân viên", "Ngày nhập", "Giờ nhập", "Tổng tiền", " " }));
        TabPN.add(searchType9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 126, 110, 30));

        FilterSearch9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FilterSearch9.setMinimumSize(new java.awt.Dimension(28, 25));
        FilterSearch9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterSearch9ActionPerformed(evt);
            }
        });
        FilterSearch9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterSearch9KeyReleased(evt);
            }
        });
        TabPN.add(FilterSearch9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, 220, 30));

        LamMoiSP11.setBackground(new java.awt.Color(51, 204, 0));
        LamMoiSP11.setPreferredSize(new java.awt.Dimension(80, 24));
        LamMoiSP11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LamMoiSP11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LamMoiSP11MouseReleased(evt);
            }
        });

        jLabel101.setBackground(new java.awt.Color(255, 255, 255));
        jLabel101.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-update-left-rotation-15.png"))); // NOI18N
        jLabel101.setText("Làm mới");

        javax.swing.GroupLayout LamMoiSP11Layout = new javax.swing.GroupLayout(LamMoiSP11);
        LamMoiSP11.setLayout(LamMoiSP11Layout);
        LamMoiSP11Layout.setHorizontalGroup(
            LamMoiSP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LamMoiSP11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        LamMoiSP11Layout.setVerticalGroup(
            LamMoiSP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LamMoiSP11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TabPN.add(LamMoiSP11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 120, -1));

        jLabel40.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-cheque-48.png"))); // NOI18N
        jLabel40.setText("Hóa đơn");
        TabPN.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 60));

        jLabel41.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-truck-48.png"))); // NOI18N
        jLabel41.setText("Phiếu nhập");
        TabPN.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 130, 60));

        HDSubButton1.setkHoverColor(new java.awt.Color(55, 213, 214));
        HDSubButton1.setkHoverEndColor(new java.awt.Color(54, 9, 109));
        HDSubButton1.setkHoverStartColor(new java.awt.Color(55, 213, 214));
        HDSubButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HDSubButton1ActionPerformed(evt);
            }
        });
        TabPN.add(HDSubButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 60));

        PNSubButton1.setkHoverEndColor(new java.awt.Color(54, 9, 109));
        PNSubButton1.setkHoverStartColor(new java.awt.Color(55, 213, 214));
        PNSubButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNSubButton1ActionPerformed(evt);
            }
        });
        TabPN.add(PNSubButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 140, 60));

        BHthem12.setBackground(new java.awt.Color(0, 204, 204));
        BHthem12.setPreferredSize(new java.awt.Dimension(80, 24));
        BHthem12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHthem12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHthem12MouseReleased(evt);
            }
        });

        jLabel104.setBackground(new java.awt.Color(255, 255, 255));
        jLabel104.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-search-20.png"))); // NOI18N
        jLabel104.setText("Xem chi tiết");

        javax.swing.GroupLayout BHthem12Layout = new javax.swing.GroupLayout(BHthem12);
        BHthem12.setLayout(BHthem12Layout);
        BHthem12Layout.setHorizontalGroup(
            BHthem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHthem12Layout.setVerticalGroup(
            BHthem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabPN.add(BHthem12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, -1));

        TabContainer.addTab("PhieuNhap", TabPN);

        TabQuyen.setBackground(new java.awt.Color(255, 255, 255));
        TabQuyen.setPreferredSize(new java.awt.Dimension(768, 639));
        TabQuyen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BHthem10.setBackground(new java.awt.Color(0, 204, 204));
        BHthem10.setPreferredSize(new java.awt.Dimension(80, 24));
        BHthem10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHthem10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHthem10MouseReleased(evt);
            }
        });

        jLabel99.setBackground(new java.awt.Color(255, 255, 255));
        jLabel99.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-plus-20.png"))); // NOI18N
        jLabel99.setText("Thêm");

        javax.swing.GroupLayout BHthem10Layout = new javax.swing.GroupLayout(BHthem10);
        BHthem10.setLayout(BHthem10Layout);
        BHthem10Layout.setHorizontalGroup(
            BHthem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHthem10Layout.setVerticalGroup(
            BHthem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabQuyen.add(BHthem10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, -1));

        searchType10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchType10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã quyền", "Tên quyền", "Chi tiết quyền" }));
        TabQuyen.add(searchType10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 126, 110, 30));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-search-25.png"))); // NOI18N
        TabQuyen.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 120, 30, 40));

        FilterSearch10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FilterSearch10.setMinimumSize(new java.awt.Dimension(28, 25));
        FilterSearch10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterSearch10ActionPerformed(evt);
            }
        });
        FilterSearch10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterSearch10KeyReleased(evt);
            }
        });
        TabQuyen.add(FilterSearch10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, 220, 30));

        BHxoa9.setBackground(new java.awt.Color(255, 0, 0));
        BHxoa9.setPreferredSize(new java.awt.Dimension(80, 24));
        BHxoa9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHxoa9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHxoa9MouseReleased(evt);
            }
        });

        jLabel100.setBackground(new java.awt.Color(255, 255, 255));
        jLabel100.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-close-15.png"))); // NOI18N
        jLabel100.setText("Xóa");

        javax.swing.GroupLayout BHxoa9Layout = new javax.swing.GroupLayout(BHxoa9);
        BHxoa9.setLayout(BHxoa9Layout);
        BHxoa9Layout.setHorizontalGroup(
            BHxoa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHxoa9Layout.setVerticalGroup(
            BHxoa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabQuyen.add(BHxoa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 120, -1));

        BHsua9.setBackground(new java.awt.Color(255, 204, 0));
        BHsua9.setPreferredSize(new java.awt.Dimension(80, 24));
        BHsua9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BHsua9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BHsua9MouseReleased(evt);
            }
        });

        jLabel102.setBackground(new java.awt.Color(255, 255, 255));
        jLabel102.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-pen-15.png"))); // NOI18N
        jLabel102.setText("Sửa");

        javax.swing.GroupLayout BHsua9Layout = new javax.swing.GroupLayout(BHsua9);
        BHsua9.setLayout(BHsua9Layout);
        BHsua9Layout.setHorizontalGroup(
            BHsua9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BHsua9Layout.setVerticalGroup(
            BHsua9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabQuyen.add(BHsua9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 120, -1));

        LamMoiSP12.setBackground(new java.awt.Color(51, 204, 0));
        LamMoiSP12.setPreferredSize(new java.awt.Dimension(80, 24));
        LamMoiSP12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LamMoiSP12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LamMoiSP12MouseReleased(evt);
            }
        });

        jLabel103.setBackground(new java.awt.Color(255, 255, 255));
        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-update-left-rotation-15.png"))); // NOI18N
        jLabel103.setText("Làm mới");

        javax.swing.GroupLayout LamMoiSP12Layout = new javax.swing.GroupLayout(LamMoiSP12);
        LamMoiSP12.setLayout(LamMoiSP12Layout);
        LamMoiSP12Layout.setHorizontalGroup(
            LamMoiSP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        LamMoiSP12Layout.setVerticalGroup(
            LamMoiSP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        TabQuyen.add(LamMoiSP12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 120, -1));

        jScrollPane11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane11.setForeground(new java.awt.Color(255, 255, 255));

        QuyenTable.setAutoCreateRowSorter(true);
        QuyenTable.setBackground(new java.awt.Color(255, 255, 255));
        QuyenTable.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        QuyenTable.setForeground(new java.awt.Color(0, 0, 0));
        QuyenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã quyền", "Tên quyền", "Chi tiết quyền"
            }
        ));
        QuyenTable.setFocusable(false);
        QuyenTable.setGridColor(new java.awt.Color(128, 128, 128));
        QuyenTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        QuyenTable.setRowHeight(25);
        QuyenTable.setSelectionBackground(new java.awt.Color(122, 72, 221));
        QuyenTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        QuyenTable.setShowVerticalLines(false);
        QuyenTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(QuyenTable);
        if (QuyenTable.getColumnModel().getColumnCount() > 0) {
            QuyenTable.getColumnModel().getColumn(0).setMaxWidth(800);
            QuyenTable.getColumnModel().getColumn(1).setPreferredWidth(20);
        }

        TabQuyen.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1110, 500));

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-unlock-security-lock-with-permission-granted-to-access-48.png"))); // NOI18N
        jLabel35.setText("Quyền");
        TabQuyen.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 60));

        jLabel36.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-user-folder-48.png"))); // NOI18N
        jLabel36.setText("Tài Khoản");
        TabQuyen.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 60));

        TKSubButton1.setkHoverColor(new java.awt.Color(55, 213, 214));
        TKSubButton1.setkHoverEndColor(new java.awt.Color(54, 9, 109));
        TKSubButton1.setkHoverStartColor(new java.awt.Color(55, 213, 214));
        TKSubButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKSubButton1ActionPerformed(evt);
            }
        });
        TabQuyen.add(TKSubButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 60));

        QuyenSubButton1.setkHoverEndColor(new java.awt.Color(54, 9, 109));
        QuyenSubButton1.setkHoverStartColor(new java.awt.Color(55, 213, 214));
        QuyenSubButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuyenSubButton1ActionPerformed(evt);
            }
        });
        TabQuyen.add(QuyenSubButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 60));

        TabContainer.addTab("Quyen", TabQuyen);

        TabTrangChu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(229, 93, 135));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(95, 195, 228));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseClicked(evt);
            }
        });

        timeLabel.setForeground(new java.awt.Color(0, 0, 0));

        dateLabel.setForeground(new java.awt.Color(0, 0, 0));

        dayLabel.setForeground(new java.awt.Color(0, 0, 0));

        jLabel116.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("Smartphone Store Management");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(901, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel116)
                .addGap(104, 104, 104)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        TabTrangChu.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -1, 1890, 740));

        TabContainer.addTab("TrangChu", TabTrangChu);

        TabContainer.setSelectedIndex(12);

        formcontainer.add(TabContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1140, 710));

        getContentPane().add(formcontainer, java.awt.BorderLayout.CENTER);

        menu2.setBackground(new java.awt.Color(32, 30, 69));
        menu2.setPreferredSize(new java.awt.Dimension(225, 400));
        menu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nutbanhang.setBackground(new java.awt.Color(32, 30, 69));
        Nutbanhang.setPreferredSize(new java.awt.Dimension(220, 70));
        Nutbanhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NutbanhangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NutbanhangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NutbanhangMouseExited(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-shopping-cart-48 (1).png"))); // NOI18N
        jLabel8.setText("Bán hàng");

        javax.swing.GroupLayout NutbanhangLayout = new javax.swing.GroupLayout(Nutbanhang);
        Nutbanhang.setLayout(NutbanhangLayout);
        NutbanhangLayout.setHorizontalGroup(
            NutbanhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NutbanhangLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 64, Short.MAX_VALUE))
        );
        NutbanhangLayout.setVerticalGroup(
            NutbanhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        menu2.add(Nutbanhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, -1));

        Nutnhaphang.setBackground(new java.awt.Color(32, 30, 69));
        Nutnhaphang.setPreferredSize(new java.awt.Dimension(220, 70));
        Nutnhaphang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NutnhaphangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NutnhaphangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NutnhaphangMouseExited(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-packing-48.png"))); // NOI18N
        jLabel9.setText("Nhập hàng");

        javax.swing.GroupLayout NutnhaphangLayout = new javax.swing.GroupLayout(Nutnhaphang);
        Nutnhaphang.setLayout(NutnhaphangLayout);
        NutnhaphangLayout.setHorizontalGroup(
            NutnhaphangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NutnhaphangLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );
        NutnhaphangLayout.setVerticalGroup(
            NutnhaphangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jLabel9.getAccessibleContext().setAccessibleName("Nhập Hàng");
        jLabel9.getAccessibleContext().setAccessibleDescription("");

        menu2.add(Nutnhaphang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, -1));

        Nuthoadon.setBackground(new java.awt.Color(32, 30, 69));
        Nuthoadon.setPreferredSize(new java.awt.Dimension(220, 70));
        Nuthoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuthoadonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NuthoadonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NuthoadonMouseExited(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-cheque-48.png"))); // NOI18N
        jLabel10.setText("Hóa đơn");

        javax.swing.GroupLayout NuthoadonLayout = new javax.swing.GroupLayout(Nuthoadon);
        Nuthoadon.setLayout(NuthoadonLayout);
        NuthoadonLayout.setHorizontalGroup(
            NuthoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NuthoadonLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 66, Short.MAX_VALUE))
        );
        NuthoadonLayout.setVerticalGroup(
            NuthoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        menu2.add(Nuthoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 230, -1));

        Nutsanpham.setBackground(new java.awt.Color(32, 30, 69));
        Nutsanpham.setPreferredSize(new java.awt.Dimension(220, 70));
        Nutsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NutsanphamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NutsanphamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NutsanphamMouseExited(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-aliexpress-48.png"))); // NOI18N
        jLabel11.setText("Sản phẩm");

        javax.swing.GroupLayout NutsanphamLayout = new javax.swing.GroupLayout(Nutsanpham);
        Nutsanpham.setLayout(NutsanphamLayout);
        NutsanphamLayout.setHorizontalGroup(
            NutsanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NutsanphamLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );
        NutsanphamLayout.setVerticalGroup(
            NutsanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        menu2.add(Nutsanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 230, -1));

        Nutkhuyenmai.setBackground(new java.awt.Color(32, 30, 69));
        Nutkhuyenmai.setPreferredSize(new java.awt.Dimension(220, 70));
        Nutkhuyenmai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NutkhuyenmaiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NutkhuyenmaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NutkhuyenmaiMouseExited(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-price-tag-48.png"))); // NOI18N
        jLabel12.setText("Khuyến mãi");

        javax.swing.GroupLayout NutkhuyenmaiLayout = new javax.swing.GroupLayout(Nutkhuyenmai);
        Nutkhuyenmai.setLayout(NutkhuyenmaiLayout);
        NutkhuyenmaiLayout.setHorizontalGroup(
            NutkhuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NutkhuyenmaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        NutkhuyenmaiLayout.setVerticalGroup(
            NutkhuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        menu2.add(Nutkhuyenmai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 230, -1));

        Nutkhachhang.setBackground(new java.awt.Color(32, 30, 69));
        Nutkhachhang.setPreferredSize(new java.awt.Dimension(220, 70));
        Nutkhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NutkhachhangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NutkhachhangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NutkhachhangMouseExited(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-user-48.png"))); // NOI18N
        jLabel16.setText("Khách hàng");

        javax.swing.GroupLayout NutkhachhangLayout = new javax.swing.GroupLayout(Nutkhachhang);
        Nutkhachhang.setLayout(NutkhachhangLayout);
        NutkhachhangLayout.setHorizontalGroup(
            NutkhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NutkhachhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        NutkhachhangLayout.setVerticalGroup(
            NutkhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        menu2.add(Nutkhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 230, -1));

        Nutnhanvien.setBackground(new java.awt.Color(32, 30, 69));
        Nutnhanvien.setPreferredSize(new java.awt.Dimension(220, 70));
        Nutnhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NutnhanvienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NutnhanvienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NutnhanvienMouseExited(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-id-card-48.png"))); // NOI18N
        jLabel17.setText("Nhân viên");
        jLabel17.setIconTextGap(8);

        javax.swing.GroupLayout NutnhanvienLayout = new javax.swing.GroupLayout(Nutnhanvien);
        Nutnhanvien.setLayout(NutnhanvienLayout);
        NutnhanvienLayout.setHorizontalGroup(
            NutnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NutnhanvienLayout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 57, Short.MAX_VALUE))
        );
        NutnhanvienLayout.setVerticalGroup(
            NutnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        menu2.add(Nutnhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 230, -1));

        Nutnhacungcap.setBackground(new java.awt.Color(32, 30, 69));
        Nutnhacungcap.setPreferredSize(new java.awt.Dimension(220, 70));
        Nutnhacungcap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NutnhacungcapMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NutnhacungcapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NutnhacungcapMouseExited(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-skyscrapers-48.png"))); // NOI18N
        jLabel18.setText("Nhà cung cấp");
        jLabel18.setIconTextGap(6);

        javax.swing.GroupLayout NutnhacungcapLayout = new javax.swing.GroupLayout(Nutnhacungcap);
        Nutnhacungcap.setLayout(NutnhacungcapLayout);
        NutnhacungcapLayout.setHorizontalGroup(
            NutnhacungcapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NutnhacungcapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        NutnhacungcapLayout.setVerticalGroup(
            NutnhacungcapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        menu2.add(Nutnhacungcap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 230, -1));

        Nuttaikhoan.setBackground(new java.awt.Color(32, 30, 69));
        Nuttaikhoan.setPreferredSize(new java.awt.Dimension(220, 70));
        Nuttaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuttaikhoanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NuttaikhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NuttaikhoanMouseExited(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-user-folder-48.png"))); // NOI18N
        jLabel19.setText("Tài khoản");
        jLabel19.setIconTextGap(8);

        javax.swing.GroupLayout NuttaikhoanLayout = new javax.swing.GroupLayout(Nuttaikhoan);
        Nuttaikhoan.setLayout(NuttaikhoanLayout);
        NuttaikhoanLayout.setHorizontalGroup(
            NuttaikhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NuttaikhoanLayout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 59, Short.MAX_VALUE))
        );
        NuttaikhoanLayout.setVerticalGroup(
            NuttaikhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        menu2.add(Nuttaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 230, -1));

        getContentPane().add(menu2, java.awt.BorderLayout.LINE_START);

        header.setkEndColor(new java.awt.Color(92, 37, 141));
        header.setkGradientFocus(650);
        header.setkStartColor(new java.awt.Color(67, 137, 162));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        minclose.setBackground(new java.awt.Color(92, 37, 141));
        minclose.setMinimumSize(new java.awt.Dimension(100, 100));
        minclose.setPreferredSize(new java.awt.Dimension(150, 100));
        minclose.setLayout(new java.awt.BorderLayout());

        Nutthunho.setBackground(new java.awt.Color(92, 37, 141));
        Nutthunho.setMinimumSize(new java.awt.Dimension(75, 50));
        Nutthunho.setPreferredSize(new java.awt.Dimension(50, 50));
        Nutthunho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NutthunhoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NutthunhoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NutthunhoMousePressed(evt);
            }
        });
        Nutthunho.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-subtract-30.png"))); // NOI18N
        Nutthunho.add(jLabel1, java.awt.BorderLayout.CENTER);

        minclose.add(Nutthunho, java.awt.BorderLayout.LINE_START);

        Nutdong.setBackground(new java.awt.Color(92, 37, 141));
        Nutdong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NutdongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NutdongMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NutdongMousePressed(evt);
            }
        });
        Nutdong.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-close-30.png"))); // NOI18N
        Nutdong.add(jLabel2, java.awt.BorderLayout.CENTER);

        minclose.add(Nutdong, java.awt.BorderLayout.CENTER);

        jLabel62.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(204, 204, 204));
        jLabel62.setText("Monga");

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/output-onlinepngtools (2).png"))); // NOI18N

        jLabel112.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(204, 204, 204));
        jLabel112.setText("store management");

        txNhanVienDangNhap.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txNhanVienDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        txNhanVienDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txNhanVienDangNhap.setText("NV1 - Nguyễn Quốc Phi");

        txCurrentPage.setBackground(new java.awt.Color(0, 0, 0));
        txCurrentPage.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txCurrentPage.setForeground(new java.awt.Color(255, 255, 255));
        txCurrentPage.setText("Trang chủ");

        jPanel7.setBackground(new java.awt.Color(92, 37, 141));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-bell-48 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(92, 37, 141));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });

        jLabel114.setBackground(new java.awt.Color(92, 37, 141));
        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlicuahangdienthoai/icons/icons8-male-user-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel112)))
                .addGap(47, 47, 47)
                .addComponent(txCurrentPage, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 520, Short.MAX_VALUE)
                .addComponent(txNhanVienDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(minclose, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(minclose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(headerLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txCurrentPage, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txNhanVienDangNhap)))
                                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel111)
                            .addGroup(headerLayout.createSequentialGroup()
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    //Date time function
  
    
//     public static void setTime() {
//  while(true) {
//  time = timeFormat.format(Calendar.getInstance().getTime());
//  timeLabel.setText(time);
//  
//  day = dayFormat.format(Calendar.getInstance().getTime());
//  dayLabel.setText(day);
//  
//  date = dateFormat.format(Calendar.getInstance().getTime());
//  dateLabel.setText(date);
//  
//  try {
//   Thread.sleep(1000);
//  } catch (InterruptedException e) {
//   // TODO Auto-generated catch block
//   e.printStackTrace();
//  }
//   }
//}
    
    //Date time function
    
    //Table design function
     public void SetIcon() {
      ImageIcon icon = new ImageIcon(getClass().getResource("/quanlicuahangdienthoai/images/icons8-mango-641.png"));
      Image img = icon.getImage().getScaledInstance(48, 48, Image.SCALE_SMOOTH);
      setIconImage(img);
    }
    
    public static void Tabledesign(JTable tab){
        tab.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tab.getTableHeader().setOpaque(false);
        tab.getTableHeader().setBackground(new Color(32,136,203));
        tab.getTableHeader().setForeground(new Color(255,255,255));
        tab.getTableHeader().setBorder(BorderFactory.createEmptyBorder());
        tab.setRowHeight(25);
    }
    public static DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();


    public static void setColumnTableCellAlignment(int alignment, JTable table,int column) {
       renderer.setHorizontalAlignment(alignment);
       
          table.setDefaultRenderer(table.getColumnClass(column),renderer);
       
       // repaint to show table cell changes
       table.updateUI();
      }
    
    public static void setTableCellAlignment(int alignment, JTable table) {
      renderer.setHorizontalAlignment(alignment);
      for (int i=0; i<table.getColumnCount();i++){
         table.setDefaultRenderer(table.getColumnClass(i),renderer);
      }
     }
    
    public static void deleteTable(JTable table){
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
    }
    
    
    public static void filterTable(JTable table, String query, int column)
    {   DefaultTableModel dm = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
        table.setRowSorter(tr);
        if(column<0)
        {
            tr.setRowFilter(RowFilter.regexFilter("(?i)" + query));
        }
        else{tr.setRowFilter(RowFilter.regexFilter("(?i)" + query, column+1));}
    }    
    
    public static void LoadTables()
    {
        QuanLySanPhamBUS qlspBUS = new QuanLySanPhamBUS();
        HienThiSanPham.AddTable(qlspBUS.getDssp(), SPTable);
        HienThiSanPham.AddTable(qlspBUS.getDssp(), BHSPTable);
        HienThiSanPham.AddTable(qlspBUS.getDssp(), NHSPTable);
        
        QuanLyLoaiSanPhamBUS qllspBUS = new QuanLyLoaiSanPhamBUS();
        HienThiLoaiSanPham.AddTable(qllspBUS.getDslsp(), LSPTable);
        
        QuanLyHoaDonBUS qlhdBUS = new QuanLyHoaDonBUS();
        HienThiHoaDon.AddTable(qlhdBUS.getDshd(), HDTable);
        
        QuanLyPhieuNhapBUS qlpnBUS = new QuanLyPhieuNhapBUS();
        HienThiPhieuNhap.AddTable(qlpnBUS.getDspn(), PNTable);
        
        QuanLyKhuyenMaiBUS qlkmBUS = new QuanLyKhuyenMaiBUS();
        HienThiKhuyenMai.AddTable(qlkmBUS.getDskm(), KMTable);
        
        QuanLyNhanVienBUS qlnvBUS = new QuanLyNhanVienBUS();
        HienThiNhanVien.AddTable(qlnvBUS.getDsnv(), NVTable);
        
        QuanLyKhachHangBUS qlkhBUS = new QuanLyKhachHangBUS();
        HienThiKhachHang.AddTable(qlkhBUS.getDskh(), KHTable);
        
        QuanLyNhaCungCapBUS qlnccBUS = new QuanLyNhaCungCapBUS();
        HienThiNhaCungCap.AddTable(qlnccBUS.getDsncc(), NCCTable);
        
        QuanLyTaiKhoanBUS qltkBUS = new QuanLyTaiKhoanBUS();
        HienThiTaiKhoan.AddTable(qltkBUS.getDstk(), TKTable);
        
        QuanLyQuyenBUS qlquyenBUS = new QuanLyQuyenBUS();
        HienThiQuyen.AddTable(qlquyenBUS.getDsq(), QuyenTable);
       
        
        txMaHDBH.setText(qlhdBUS.getNextID());
        txMaNVBH.setText(LoginForm.nhanVienLogin.getMaNV());
        txNgayLapHD.setText(LocalDate.now().toString());
        txGioLapHD.setText(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        
        txMaPNNH.setText(qlpnBUS.getNextID());
        txMaNVNH.setText(LoginForm.nhanVienLogin.getMaNV());
        txNgayLapPN.setText(LocalDate.now().toString());
        txGioLapPN.setText(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        
        CheckQuyen();
    }
    
    public static void CheckQuyen()
    {
        //SanPham
          if( LoginForm.quyenLogin.getChiTietQuyen().contains("xemSanPham") ){
            BHthem1.setVisible(false);
            BHxoa1.setVisible(false);
            BHsua1.setVisible(false);
          }
        //LoaiSanPham
          if( LoginForm.quyenLogin.getChiTietQuyen().contains("xemLoaiSanPham") ){
            BHthem8.setVisible(false);
            BHxoa8.setVisible(false);
            BHsua8.setVisible(false);
          }
        //KhuyenMai
          if( LoginForm.quyenLogin.getChiTietQuyen().contains("xemKhuyenMai") ){
            BHthem3.setVisible(false);
            BHxoa3.setVisible(false);
            BHsua3.setVisible(false);
          }
        //KhachHang
            if( LoginForm.quyenLogin.getChiTietQuyen().contains("xemKhachHang") ){
            BHthem2.setVisible(false);
            BHxoa2.setVisible(false);
            BHsua2.setVisible(false);
          }
        //Nhan Vien
            if( LoginForm.quyenLogin.getChiTietQuyen().contains("xemNhanVien") ){
            BHthem4.setVisible(false);
            BHxoa4.setVisible(false);
            BHsua4.setVisible(false);
          }
        //Nha Cung Cap
            if( LoginForm.quyenLogin.getChiTietQuyen().contains("xemNCC") ){
            BHthem5.setVisible(false);
            BHxoa5.setVisible(false);
            BHsua5.setVisible(false);
          }
        //Tai Khoan
            if( LoginForm.quyenLogin.getChiTietQuyen().contains("xemTaiKhoan") ){
            BHthem6.setVisible(false);
            BHxoa6.setVisible(false);
            BHsua6.setVisible(false);
          }
        //Quyen
            if( LoginForm.quyenLogin.getChiTietQuyen().contains("xemQuyen") ){
            BHthem10.setVisible(false);
            BHxoa9.setVisible(false);
            BHsua9.setVisible(false);
          }
    }
    
    public static void AddRowToTable(Object[] dataRow,JTable table)
    {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addRow(dataRow);
    }
  
    public void AddTableBH(){
        int index = BHSPTable.getSelectedRow();
        if(index<0){ JOptionPane.showMessageDialog(null, "Bạn chưa chọn sản phẩm nào");}
        else if(Integer.parseInt(txSoLuongBH.getText()) > Integer.parseInt(BHSPTable.getModel().getValueAt(index, 5).toString()))
        {JOptionPane.showMessageDialog(null, "Số lượng tồn kho không đủ!");}
  
        else  {
        TableModel model = BHSPTable.getModel();
        String masp = model.getValueAt(index, 1).toString();     
        int insertRow = BHTTTable.getRowCount() + 1;
        
        SanPham spBH = null;
        QuanLySanPhamBUS qlspBUS = new QuanLySanPhamBUS();
        for (SanPham sp : qlspBUS.getDssp()) {
                if (sp.getMaSP().equals(masp)) {
                    spBH = sp;
                }
            }
        
                               
        float dongia = spBH.getDonGia();
        int soluong = Integer.parseInt(txSoLuongBH.getText());
        float thanhtien = dongia * soluong;
//        int soluongtonkho = spBH.getSoLuong();
//        float giamtien = thanhtien * KhuyenMai.getPhanTramKM();
//        float thanhtiensauKM = thanhtien - giamtien;
        
        tongtienBH = tongtienBH + thanhtien;
       
        
        txTongTienBH.setText(PriceFormatter.format(tongtienBH));
        txTienTong.setText(Float.toString(tongtienBH));
      
        
            AddRowToTable(new Object[]{
                              insertRow,
                              masp,
                              spBH.getTenSP(),
                              soluong,
                              PriceFormatter.format(dongia),
                              PriceFormatter.format(thanhtien)
                              },BHTTTable);            
        
        
        
       
        }
       
    }
    public void AddTableNH(){
             int index = NHSPTable.getSelectedRow();
        if(index<0){ JOptionPane.showMessageDialog(null, "Bạn chưa chọn sản phẩm nào");}
        else{
        TableModel model = NHSPTable.getModel();
        String masp = model.getValueAt(index, 1).toString();     
        int insertRow = NHTTTable.getRowCount() + 1;
        
        SanPham spNH = null;
        QuanLySanPhamBUS qlspBUS = new QuanLySanPhamBUS();
        for (SanPham sp : qlspBUS.getDssp()) {
                if (sp.getMaSP().equals(masp)) {
                    spNH = sp;
                }
            }
        
                               
        float dongia = spNH.getDonGia();
        int soluong = Integer.parseInt(txSoLuongNH.getText());
        int soluongtonkho = spNH.getSoLuong();
        float thanhtien = dongia * soluong;
        tongtienNH = tongtienNH + thanhtien;
        txTongTienNH.setText(PriceFormatter.format(tongtienNH));
        txTienTong1.setText(Float.toString(tongtienNH));
//        txTongtiensauKM.setText(PriceFormatter.format(tongtienBH));
         
        
            AddRowToTable(new Object[]{
                              insertRow,
                              masp,
                              spNH.getTenSP(),
                              soluong,
                              PriceFormatter.format(dongia),
                              PriceFormatter.format(thanhtien)
                              },NHTTTable);            
        
        }
    }
    
    
    public void AddCTHD(int row)
    {
//                TableModel model = SPTable.getModel();
//        String imageName = model.getValueAt(index, 7).toString();
        
        
        
        String mahd = txMaHDBH.getText();        
        TableModel model = BHTTTable.getModel();        
        String masp = model.getValueAt(row, 1).toString();
        String soluong = model.getValueAt(row,3).toString();
        String dongia = (model.getValueAt(row, 4).toString()).substring(0, 4) ;
        ChiTietHoaDon cthd = new ChiTietHoaDon(mahd,masp,Integer.parseInt(soluong),Float.parseFloat(dongia));
   
        QuanLyChiTietHoaDonBUS qlcthd = new QuanLyChiTietHoaDonBUS();
        qlcthd.add(cthd);
        
    }
    
    public void AddCTPN(int row)
    {
//                TableModel model = SPTable.getModel();
//        String imageName = model.getValueAt(index, 7).toString();
        
        
        
        String mapn = txMaPNNH.getText();        
        TableModel model = NHTTTable.getModel();        
        String masp = model.getValueAt(row, 1).toString();
        String soluong = model.getValueAt(row,3).toString();
        String dongia = (model.getValueAt(row, 4).toString()).substring(0, 4) ;
        ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap(mapn,masp,Integer.parseInt(soluong),Float.parseFloat(dongia));
   
        QuanLyChiTietPhieuNhapBUS qlctpn = new QuanLyChiTietPhieuNhapBUS();
        qlctpn.add(ctpn);
        
    }
    
        void clearBH()
        {   
            txKhachHang.setText("");
            txTongTienBH.setText("");
            txKhuyenMai.setText("");
            deleteTable(BHTTTable);
        }
        
         void clearNH()
        {         
            txNhaCungCap.setText("");
            txTongTienNH.setText("");
            deleteTable(NHTTTable);
        }
    
    //Table design function
    public static void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
    
    private void NutthunhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutthunhoMouseEntered
       changecolor(Nutthunho, new Color(74,30,113));
    }//GEN-LAST:event_NutthunhoMouseEntered

    private void NutthunhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutthunhoMouseExited
       changecolor(Nutthunho, new Color(92,37,141));
    }//GEN-LAST:event_NutthunhoMouseExited

    private void NutthunhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutthunhoMousePressed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_NutthunhoMousePressed

    private void NutdongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutdongMouseEntered
        changecolor(Nutdong, new Color(74,30,113));
    }//GEN-LAST:event_NutdongMouseEntered

    private void NutdongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutdongMouseExited
        changecolor(Nutdong, new Color(92,37,141));
    }//GEN-LAST:event_NutdongMouseExited

    private void NutdongMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutdongMousePressed
        String[] options = new String[3];
        options[0] = "Thoát";
        options[1] = "Quay lại Đăng nhập";
        options[2] = "Hủy";
        int reply = JOptionPane.showOptionDialog(this.getContentPane(), "Bạn có chắc chắn muốn thoát chương trình?", "Thông báo", 0, JOptionPane.YES_NO_CANCEL_OPTION, null, options, null);
        if(reply == JOptionPane.OK_OPTION){
            System.exit(0);
        }
        else if(reply == JOptionPane.NO_OPTION){       
            new LoginForm().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_NutdongMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
       int cordX = evt.getXOnScreen();
       int cordY = evt.getYOnScreen();
       
       this.setLocation(cordX - mouseX,cordY - mouseY);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void NutnhaphangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutnhaphangMouseEntered
        // TODO add your handling code here:
        changecolor(Nutnhaphang,new Color(37,39,84));
    }//GEN-LAST:event_NutnhaphangMouseEntered

    private void NutnhaphangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutnhaphangMouseExited
        // TODO add your handling code here:
        changecolor(Nutnhaphang,new Color(32,30,69));
    }//GEN-LAST:event_NutnhaphangMouseExited

    private void NutnhaphangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutnhaphangMouseClicked
       if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlNhapHang")){
           txCurrentPage.setText("Nhập hàng");
           TabContainer.setSelectedIndex(1);}
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
       
    }//GEN-LAST:event_NutnhaphangMouseClicked

    private void NuthoadonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuthoadonMouseEntered
        // TODO add your handling code here:
        changecolor(Nuthoadon,new Color(37,39,84));
    }//GEN-LAST:event_NuthoadonMouseEntered

    private void NuthoadonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuthoadonMouseExited
        // TODO add your handling code here:
        changecolor(Nuthoadon,new Color(32,30,69));
    }//GEN-LAST:event_NuthoadonMouseExited

    private void NuthoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuthoadonMouseClicked
        if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlHoaDon") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemHoaDon") ){
             txCurrentPage.setText("Hóa đơn");
            TabContainer.setSelectedIndex(2);}
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
//        TabContainer.setSelectedIndex(2);
    }//GEN-LAST:event_NuthoadonMouseClicked

    private void NutsanphamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutsanphamMouseEntered
        // TODO add your handling code here:
        changecolor(Nutsanpham,new Color(37,39,84));
    }//GEN-LAST:event_NutsanphamMouseEntered

    private void NutsanphamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutsanphamMouseExited
        // TODO add your handling code here:
        changecolor(Nutsanpham,new Color(32,30,69));
    }//GEN-LAST:event_NutsanphamMouseExited

    private void NutsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutsanphamMouseClicked
         if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlSanPham") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemSanPham") ){
              txCurrentPage.setText("Sản phẩm");
             TabContainer.setSelectedIndex(3);}
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
//        TabContainer.setSelectedIndex(3);
    }//GEN-LAST:event_NutsanphamMouseClicked

    private void NutkhuyenmaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutkhuyenmaiMouseEntered
        // TODO add your handling code here:
        changecolor(Nutkhuyenmai,new Color(37,39,84));
    }//GEN-LAST:event_NutkhuyenmaiMouseEntered

    private void NutkhuyenmaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutkhuyenmaiMouseExited
        // TODO add your handling code here:
        changecolor(Nutkhuyenmai,new Color(32,30,69));
    }//GEN-LAST:event_NutkhuyenmaiMouseExited

    private void NutkhuyenmaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutkhuyenmaiMouseClicked
        // TODO add your handling code here:

         if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlKhuyenMai") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemKhuyenMai") ){
             txCurrentPage.setText("Khuyến mãi");
             TabContainer.setSelectedIndex(4);}
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
//        TabContainer.setSelectedIndex(4);
    }//GEN-LAST:event_NutkhuyenmaiMouseClicked

    private void NutkhachhangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutkhachhangMouseEntered
        // TODO add your handling code here:
        changecolor(Nutkhachhang,new Color(37,39,84));
    }//GEN-LAST:event_NutkhachhangMouseEntered

    private void NutkhachhangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutkhachhangMouseExited
        // TODO add your handling code here:
        changecolor(Nutkhachhang,new Color(32,30,69));
    }//GEN-LAST:event_NutkhachhangMouseExited

    private void NutkhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutkhachhangMouseClicked
        if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlKhachHang") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemKhachHang") ){
            txCurrentPage.setText("Khách hàng");
            TabContainer.setSelectedIndex(5);}
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
//        TabContainer.setSelectedIndex(5);
    }//GEN-LAST:event_NutkhachhangMouseClicked

    private void NutnhanvienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutnhanvienMouseEntered
        // TODO add your handling code here:
        changecolor(Nutnhanvien,new Color(37,39,84));
    }//GEN-LAST:event_NutnhanvienMouseEntered

    private void NutnhanvienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutnhanvienMouseExited
        // TODO add your handling code here:
        changecolor(Nutnhanvien,new Color(32,30,69));
    }//GEN-LAST:event_NutnhanvienMouseExited

    private void NutnhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutnhanvienMouseClicked
        if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlNhanVien") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemNhanVien") ){
            txCurrentPage.setText("Nhân viên");
            TabContainer.setSelectedIndex(6);}
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
//        TabContainer.setSelectedIndex(6);
    }//GEN-LAST:event_NutnhanvienMouseClicked

    private void NutnhacungcapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutnhacungcapMouseEntered
        // TODO add your handling code here:
        changecolor(Nutnhacungcap,new Color(37,39,84));
    }//GEN-LAST:event_NutnhacungcapMouseEntered

    private void NutnhacungcapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutnhacungcapMouseExited
        // TODO add your handling code here:
        changecolor(Nutnhacungcap,new Color(32,30,69));
    }//GEN-LAST:event_NutnhacungcapMouseExited

    private void NutnhacungcapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutnhacungcapMouseClicked
         if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlNCC") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemNCC") ){
            txCurrentPage.setText("Nhà cung cấp");
            TabContainer.setSelectedIndex(7);}
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
//        TabContainer.setSelectedIndex(7);
    }//GEN-LAST:event_NutnhacungcapMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LoadTables();
    }//GEN-LAST:event_formWindowOpened

    private void NuttaikhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuttaikhoanMouseExited
        // TODO add your handling code here:
        changecolor(Nuttaikhoan,new Color(32,30,69));
    }//GEN-LAST:event_NuttaikhoanMouseExited

    private void NuttaikhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuttaikhoanMouseEntered
        // TODO add your handling code here:
        changecolor(Nuttaikhoan,new Color(37,39,84));
    }//GEN-LAST:event_NuttaikhoanMouseEntered

    private void NuttaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuttaikhoanMouseClicked
         if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlTaiKhoan") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemTaiKhoan") ){
             txCurrentPage.setText("Tài khoản");
             TabContainer.setSelectedIndex(8);}
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
//        TabContainer.setSelectedIndex(8);
    }//GEN-LAST:event_NuttaikhoanMouseClicked

    private void TabBHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabBHMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TabBHMousePressed

    private void BHxoaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoaMouseReleased
    
        changecolor(BHxoa,new Color(51,204,0));
       
        
            if(txTongTienBH.getText().equals(""))
        {   
            
            JOptionPane.showMessageDialog(null, "Bảng thanh toán trống!");
        }
        else if(txKhachHang.getText().equals(""))
        {   
             
            JOptionPane.showMessageDialog(null, "Chưa chọn khách hàng!");
        }
        else if(txKhuyenMai.getText().equals(""))
        {   
            
            JOptionPane.showMessageDialog(null, "Chưa chọn khuyến mãi");
        }      
        else{        
        float tongtien = Float.parseFloat(txTienTong.getText());
        float tongtiensauKM = tongtien - (tongtien * KhuyenMai.getPhanTramKM());
        
        int reply = JOptionPane.showConfirmDialog(getRootPane(),
                        "Hóa đơn được giảm "+KhuyenMai.getPhanTramKM()*100+"% tổng thanh toán còn" +PriceFormatter.format(tongtiensauKM)+
                                ", Thanh toán ngay?", "Thanh toán",
                        JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.OK_OPTION) {
            QuanLyHoaDonBUS qlhdBUS = new QuanLyHoaDonBUS();
            
                HoaDon hd = new HoaDon(
                txMaHDBH.getText(),
                LoginForm.nhanVienLogin.getMaNV(),
                KhachHang.getMaKH(),
                KhuyenMai.getMaKM(),
                LocalDate.parse(txNgayLapHD.getText()),
                LocalTime.parse(txGioLapHD.getText()),
                tongtiensauKM);
        
        qlhdBUS.add(hd);
        
        TableModel model = BHTTTable.getModel();
        int rowcount = model.getRowCount();
        for(int i = 0; i<rowcount; i++)
        {
            AddCTHD(i);
        }
        
        
        JOptionPane.showMessageDialog(null, "Thanh toán thành công");
        
        txMaHDBH.setText(qlhdBUS.getNextID());
        
        clearBH();
        }
       }
    }//GEN-LAST:event_BHxoaMouseReleased

    private void BHxoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoaMousePressed
         changecolor(BHxoa,new Color(0, 176, 0));
         
    }//GEN-LAST:event_BHxoaMousePressed

    private void BHthemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthemMouseReleased
        
        changecolor(BHthem,new Color(0,204,204));
        AddTableBH();       
//        TableModel model = SPTable.getModel();
//        String imageName = model.getValueAt(index, 7).toString();
    }//GEN-LAST:event_BHthemMouseReleased

    private void BHthemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthemMousePressed
        changecolor(BHthem,new Color(0,163,163));
    }//GEN-LAST:event_BHthemMousePressed

    private void FilterSearchBHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterSearchBHKeyReleased
        String query = FilterSearchBH.getText().toLowerCase();

        filterTable(BHSPTable, query, searchTypeBH.getSelectedIndex()-1);
    }//GEN-LAST:event_FilterSearchBHKeyReleased

    private void FilterSearchBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterSearchBHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearchBHActionPerformed

    private void FilterSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearch1ActionPerformed

    private void FilterSearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterSearch1KeyReleased
       String query = FilterSearch1.getText().toLowerCase();

        filterTable(SPTable, query, searchType1.getSelectedIndex()-1);
    }//GEN-LAST:event_FilterSearch1KeyReleased

    private void LamMoiSP1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP1MousePressed
       changecolor(LamMoiSP1,new Color(0, 176, 0));
    }//GEN-LAST:event_LamMoiSP1MousePressed

    private void LamMoiSP1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP1MouseReleased
        changecolor(LamMoiSP1,new Color(51,204,0));
        deleteTable(SPTable);
        QuanLySanPhamBUS qlspBUS = new QuanLySanPhamBUS();
        HienThiSanPham.AddTable(qlspBUS.getDssp(), SPTable);
        
    }//GEN-LAST:event_LamMoiSP1MouseReleased

    private void BHsua1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua1MousePressed
     
     changecolor(BHsua1,new Color(224,177,0));                                                                
       
    }//GEN-LAST:event_BHsua1MousePressed

    private void BHsua1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua1MouseReleased
         changecolor(BHsua1,new Color(255,204,0));

        if(SPTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn sản phẩm nào để sửa");
        }
        else
        {
            new editForm().setVisible(true);
        }
    }//GEN-LAST:event_BHsua1MouseReleased

    private void BHthem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem1MousePressed
        changecolor(BHthem1,new Color(0,163,163));
    }//GEN-LAST:event_BHthem1MousePressed

    private void BHthem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem1MouseReleased
        changecolor(BHthem1,new Color(0,204,204));
        addForm addform = new addForm();
        addform.setVisible(true);
        addform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        editForm.ThemSP();
    }//GEN-LAST:event_BHthem1MouseReleased

    private void BHxoa1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa1MousePressed
        changecolor(BHxoa1,new Color(221,0,0));
    }//GEN-LAST:event_BHxoa1MousePressed

    private void BHxoa1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa1MouseReleased
         changecolor(BHxoa1,new Color(255,0,0));
        if(SPTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn sản phẩm nào để xóa");
        }
        else
        {
            String masp =    (String) SPTable.getValueAt(SPTable.getSelectedRow(), 1);
            editForm.XoaSP(masp);
        }      
    }//GEN-LAST:event_BHxoa1MouseReleased

    private void FilterSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterSearch3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearch3ActionPerformed

    private void FilterSearch3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterSearch3KeyReleased
        String query = FilterSearch3.getText().toLowerCase();

        filterTable(KMTable, query, searchType3.getSelectedIndex()-1);

    }//GEN-LAST:event_FilterSearch3KeyReleased

    private void LamMoiSP3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP3MousePressed
        changecolor(LamMoiSP3,new Color(0, 176, 0));
    }//GEN-LAST:event_LamMoiSP3MousePressed

    private void LamMoiSP3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP3MouseReleased
        
        changecolor(LamMoiSP3,new Color(51,204,0));
        deleteTable(KMTable);
        QuanLyKhuyenMaiBUS qlkmBUS = new QuanLyKhuyenMaiBUS();
        HienThiKhuyenMai.AddTable(qlkmBUS.getDskm(), KMTable);

    }//GEN-LAST:event_LamMoiSP3MouseReleased

    private void BHsua3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua3MousePressed
        changecolor(BHsua3,new Color(224,177,0));
    }//GEN-LAST:event_BHsua3MousePressed

    private void BHsua3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua3MouseReleased
              
        changecolor(BHsua3,new Color(255,204,0));

        if(KMTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn khuyến mãi nào để sửa");
        }
        else
        {
            new editKM().setVisible(true);
        }

    }//GEN-LAST:event_BHsua3MouseReleased

    private void BHxoa3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa3MousePressed
        changecolor(BHxoa3,new Color(221,0,0));
    }//GEN-LAST:event_BHxoa3MousePressed

    private void BHxoa3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa3MouseReleased
                
        changecolor(BHxoa3,new Color(255,0,0));
        if(KMTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn khuyến mãi nào để xóa");
        }
        else
        {
            String maKM =    (String) KMTable.getValueAt(KMTable.getSelectedRow(), 1);
            editKM.XoaKM(maKM);
        }

    }//GEN-LAST:event_BHxoa3MouseReleased

    private void BHthem3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem3MousePressed
        changecolor(BHthem3,new Color(0,163,163));
    }//GEN-LAST:event_BHthem3MousePressed

    private void BHthem3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem3MouseReleased
               
        changecolor(BHthem3,new Color(0,204,204));
        addKM addKM = new addKM();
        addKM.setVisible(true);
        addKM.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        editKM.ThemKM();  

    }//GEN-LAST:event_BHthem3MouseReleased

    private void FilterSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterSearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearch2ActionPerformed

    private void FilterSearch2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterSearch2KeyReleased
        String query = FilterSearch2.getText().toLowerCase();

        filterTable(KHTable, query, searchType2.getSelectedIndex()-1);

    }//GEN-LAST:event_FilterSearch2KeyReleased

    private void LamMoiSP5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP5MousePressed
        changecolor(LamMoiSP5,new Color(0, 176, 0));
    }//GEN-LAST:event_LamMoiSP5MousePressed

    private void LamMoiSP5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP5MouseReleased
                
        changecolor(LamMoiSP5,new Color(51,204,0));
        deleteTable(KHTable);
        QuanLyKhachHangBUS qlkhBUS = new QuanLyKhachHangBUS();
        HienThiKhachHang.AddTable(qlkhBUS.getDskh(), KHTable);

    }//GEN-LAST:event_LamMoiSP5MouseReleased

    private void BHsua2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua2MousePressed
        changecolor(BHsua2,new Color(224,177,0));
    }//GEN-LAST:event_BHsua2MousePressed

    private void BHsua2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua2MouseReleased
               
        changecolor(BHsua2,new Color(255,204,0));

        if(KHTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn khách hàng nào để sửa");
        }
        else
        {
            new editKH().setVisible(true);
        }

    }//GEN-LAST:event_BHsua2MouseReleased

    private void BHxoa2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa2MousePressed
        changecolor(BHxoa2,new Color(221,0,0));
    }//GEN-LAST:event_BHxoa2MousePressed

    private void BHxoa2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa2MouseReleased
        
              
        changecolor(BHxoa2,new Color(255,0,0));
        if(KHTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn khách hàng nào để xóa");
        }
        else
        {
            String maKH =    (String) KHTable.getValueAt(KHTable.getSelectedRow(), 1);
            editKH.XoaKH(maKH);
        }


    }//GEN-LAST:event_BHxoa2MouseReleased

    private void BHthem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem2MousePressed
        changecolor(BHthem2,new Color(0,163,163));
    }//GEN-LAST:event_BHthem2MousePressed

    private void BHthem2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem2MouseReleased
        changecolor(BHthem2,new Color(0,204,204));
        addKH addKH = new addKH();
        addKH.setVisible(true);
        addKH.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        editKH.ThemKH();
    }//GEN-LAST:event_BHthem2MouseReleased

    private void FilterSearch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterSearch4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearch4ActionPerformed

    private void FilterSearch4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterSearch4KeyReleased
        String query = FilterSearch4.getText().toLowerCase();

        filterTable(NVTable, query, searchType4.getSelectedIndex()-1);

    }//GEN-LAST:event_FilterSearch4KeyReleased

    private void LamMoiSP6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP6MousePressed
        changecolor(LamMoiSP6,new Color(0, 176, 0));
    }//GEN-LAST:event_LamMoiSP6MousePressed

    private void LamMoiSP6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP6MouseReleased
     
        
        changecolor(LamMoiSP6,new Color(51,204,0));
        deleteTable(NVTable);
        QuanLyNhanVienBUS qlnvBUS = new QuanLyNhanVienBUS();
        HienThiNhanVien.AddTable(qlnvBUS.getDsnv(), NVTable);

    }//GEN-LAST:event_LamMoiSP6MouseReleased

    private void BHsua4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua4MousePressed
        changecolor(BHsua4,new Color(224,177,0));
    }//GEN-LAST:event_BHsua4MousePressed

    private void BHsua4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua4MouseReleased
                
        changecolor(BHsua4,new Color(255,204,0));

        if(NVTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn nhân viên nào để sửa");
        }
        else
        {
            new editNV().setVisible(true);
        }

    }//GEN-LAST:event_BHsua4MouseReleased

    private void BHxoa4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa4MousePressed
       changecolor(BHxoa4,new Color(221,0,0));
    }//GEN-LAST:event_BHxoa4MousePressed

    private void BHxoa4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa4MouseReleased
                
        changecolor(BHxoa4,new Color(255,0,0));
        if(NVTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn nhân viên nào để xóa");
        }
        else
        {
            String maNV =    (String) NVTable.getValueAt(NVTable.getSelectedRow(), 1);
            editNV.XoaNV(maNV);
        }

    }//GEN-LAST:event_BHxoa4MouseReleased

    private void BHthem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem4MousePressed
        changecolor(BHthem4,new Color(0,163,163));
    }//GEN-LAST:event_BHthem4MousePressed

    private void BHthem4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem4MouseReleased
                
        changecolor(BHthem4,new Color(0,204,204));
        addNV addNV = new addNV();
        addNV.setVisible(true);
        addNV.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        editNV.ThemNV();

    }//GEN-LAST:event_BHthem4MouseReleased

    private void FilterSearch5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterSearch5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearch5ActionPerformed

    private void FilterSearch5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterSearch5KeyReleased
        String query = FilterSearch5.getText().toLowerCase();

        filterTable(NCCTable, query, searchType5.getSelectedIndex()-1);

    }//GEN-LAST:event_FilterSearch5KeyReleased

    private void LamMoiSP7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP7MousePressed
        changecolor(LamMoiSP7,new Color(0, 176, 0));
    }//GEN-LAST:event_LamMoiSP7MousePressed

    private void LamMoiSP7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP7MouseReleased
        
        changecolor(LamMoiSP7,new Color(51,204,0));
        deleteTable(NCCTable);
        QuanLyNhaCungCapBUS qlnccBUS = new QuanLyNhaCungCapBUS();
        HienThiNhaCungCap.AddTable(qlnccBUS.getDsncc(), NCCTable);

    }//GEN-LAST:event_LamMoiSP7MouseReleased

    private void BHsua5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua5MousePressed
        changecolor(BHsua5,new Color(224,177,0));
    }//GEN-LAST:event_BHsua5MousePressed

    private void BHsua5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua5MouseReleased
        
        changecolor(BHsua5,new Color(255,204,0));

        if(NCCTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn nhà cung cấp nào để sửa");
        }
        else
        {
            new editNCC().setVisible(true);
        }

    }//GEN-LAST:event_BHsua5MouseReleased

    private void BHxoa5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa5MousePressed
        changecolor(BHxoa5,new Color(221,0,0));
    }//GEN-LAST:event_BHxoa5MousePressed

    private void BHxoa5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa5MouseReleased
        
        changecolor(BHxoa5,new Color(255,0,0));
        if(NCCTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn nhà cung cấp nào để xóa");
        }
        else
        {
            String maNCC =    (String) NCCTable.getValueAt(NCCTable.getSelectedRow(), 1);
            editNCC.XoaNCC(maNCC);
        }

    }//GEN-LAST:event_BHxoa5MouseReleased

    private void BHthem5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem5MousePressed
        changecolor(BHthem5,new Color(0,163,163));
        
    }//GEN-LAST:event_BHthem5MousePressed

    private void BHthem5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem5MouseReleased
        changecolor(BHthem5,new Color(0,204,204));
        addNCC addNCC = new addNCC();
        addNCC.setVisible(true);
        addNCC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        editNCC.ThemNCC();

    }//GEN-LAST:event_BHthem5MouseReleased

    private void FilterSearch6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterSearch6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearch6ActionPerformed

    private void FilterSearch6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterSearch6KeyReleased
        String query = FilterSearch6.getText().toLowerCase();

        filterTable(TKTable, query, searchType6.getSelectedIndex()-1);

    }//GEN-LAST:event_FilterSearch6KeyReleased

    private void LamMoiSP8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP8MousePressed
        changecolor(LamMoiSP8,new Color(0, 176, 0));
    }//GEN-LAST:event_LamMoiSP8MousePressed

    private void LamMoiSP8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP8MouseReleased
        
        changecolor(LamMoiSP8,new Color(51,204,0));
        deleteTable(TKTable);
        QuanLyTaiKhoanBUS qltkBUS = new QuanLyTaiKhoanBUS();
        HienThiTaiKhoan.AddTable(qltkBUS.getDstk(), TKTable);

    }//GEN-LAST:event_LamMoiSP8MouseReleased

    private void BHsua6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua6MousePressed
        changecolor(BHsua6,new Color(224,177,0));
    }//GEN-LAST:event_BHsua6MousePressed

    private void BHsua6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua6MouseReleased
                
        changecolor(BHsua6,new Color(255,204,0));

        if(TKTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn tài khoản nào để sửa");
        }
        else
        {
            new editTK().setVisible(true);
        }

    }//GEN-LAST:event_BHsua6MouseReleased

    private void BHxoa6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa6MousePressed
        changecolor(BHxoa6,new Color(221,0,0));
    }//GEN-LAST:event_BHxoa6MousePressed

    private void BHxoa6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa6MouseReleased
         
        changecolor(BHxoa6,new Color(255,0,0));
        if(TKTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn tài khoản nào để xóa");
        }
        else
        {
            String maTK =    (String) TKTable.getValueAt(TKTable.getSelectedRow(), 1);
            editTK.XoaTK(maTK);
        }


    }//GEN-LAST:event_BHxoa6MouseReleased

    private void BHthem6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem6MousePressed
        changecolor(BHthem6,new Color(0,163,163));
    }//GEN-LAST:event_BHthem6MousePressed

    private void BHthem6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem6MouseReleased
               
        changecolor(BHthem6,new Color(0,204,204));
        addTK addTK = new addTK();
        addTK.setVisible(true);
        addTK.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_BHthem6MouseReleased

    private void FilterSearch7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterSearch7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearch7ActionPerformed

    private void FilterSearch7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterSearch7KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearch7KeyReleased

    private void LamMoiSP9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP9MousePressed
        changecolor(LamMoiSP9,new Color(0, 176, 0));
        
    }//GEN-LAST:event_LamMoiSP9MousePressed

    private void LamMoiSP9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP9MouseReleased
      
        changecolor(LamMoiSP9,new Color(51,204,0));
        deleteTable(HDTable);
        QuanLyHoaDonBUS qlhdBUS = new QuanLyHoaDonBUS();
        HienThiHoaDon.AddTable(qlhdBUS.getDshd(), HDTable); 
        
      
    }//GEN-LAST:event_LamMoiSP9MouseReleased

    private void BHthem7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem7MousePressed
       changecolor(BHthem7,new Color(0,163,163));
       
       
    }//GEN-LAST:event_BHthem7MousePressed

    private void BHthem7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem7MouseReleased
        changecolor(BHthem7,new Color(0,204,204));
        int index = HDTable.getSelectedRow();
        
        if(index<0){
            JOptionPane.showMessageDialog(null, "Chưa chọn hóa đơn nào để xem");
        }else{
        String mahd = (String) HDTable.getValueAt(index, 1);
        new ChonCTHDForm(mahd).setVisible(true);
        }
    }//GEN-LAST:event_BHthem7MouseReleased

    private void BHthem8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem8MousePressed
        changecolor(BHthem8,new Color(0,163,163));
    }//GEN-LAST:event_BHthem8MousePressed

    private void BHthem8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem8MouseReleased
        
        changecolor(BHthem8,new Color(0,204,204));
        addLSP addLSP = new addLSP();
        addLSP.setVisible(true);
        addLSP.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        editLSP.ThemLSP();
    }//GEN-LAST:event_BHthem8MouseReleased

    private void FilterSearch8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterSearch8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearch8ActionPerformed

    private void FilterSearch8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterSearch8KeyReleased
        String query = FilterSearch8.getText().toLowerCase();

        filterTable(LSPTable, query, searchType8.getSelectedIndex()-1);
    }//GEN-LAST:event_FilterSearch8KeyReleased

    private void BHxoa8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa8MousePressed
       changecolor(BHxoa8,new Color(221,0,0));
    }//GEN-LAST:event_BHxoa8MousePressed

    private void BHxoa8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa8MouseReleased
        
        changecolor(BHxoa8,new Color(255,0,0));
        if(LSPTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn loại sản phẩm nào để xóa");
        }
        else
        {
            String malsp =    (String) LSPTable.getValueAt(LSPTable.getSelectedRow(), 1);
            editLSP.XoaLSP(malsp);
        }
    }//GEN-LAST:event_BHxoa8MouseReleased

    private void BHsua8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua8MousePressed
        changecolor(BHsua8,new Color(224,177,0));
    }//GEN-LAST:event_BHsua8MousePressed

    private void BHsua8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua8MouseReleased
       
        changecolor(BHsua8,new Color(255,204,0));

        if(LSPTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn loại sản phẩm nào để sửa");
        }
        else
        {
            new editLSP().setVisible(true);
        }
    }//GEN-LAST:event_BHsua8MouseReleased

    private void LamMoiSP10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP10MousePressed
        changecolor(LamMoiSP10,new Color(0, 176, 0));
    }//GEN-LAST:event_LamMoiSP10MousePressed

    private void LamMoiSP10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP10MouseReleased
      
        changecolor(LamMoiSP10,new Color(51,204,0));
        deleteTable(LSPTable);
        QuanLyLoaiSanPhamBUS qllspBUS = new QuanLyLoaiSanPhamBUS();
        HienThiLoaiSanPham.AddTable(qllspBUS.getDslsp(), LSPTable);
    }//GEN-LAST:event_LamMoiSP10MouseReleased

    private void BHthem10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem10MousePressed
        changecolor(BHthem10,new Color(0,163,163));
        

    }//GEN-LAST:event_BHthem10MousePressed

    private void BHthem10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem10MouseReleased
        changecolor(BHthem10,new Color(0,204,204));
        addQuyen addQuyen = new addQuyen();
        addQuyen.setVisible(true);
        addQuyen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        editQuyen.ThemQuyen();
    }//GEN-LAST:event_BHthem10MouseReleased

    private void FilterSearch10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterSearch10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearch10ActionPerformed

    private void FilterSearch10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterSearch10KeyReleased
        String query = FilterSearch10.getText().toLowerCase();

        filterTable(QuyenTable, query, searchType10.getSelectedIndex()-1);

    }//GEN-LAST:event_FilterSearch10KeyReleased

    private void BHxoa9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa9MousePressed
        changecolor(BHxoa9,new Color(221,0,0));
    }//GEN-LAST:event_BHxoa9MousePressed

    private void BHxoa9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa9MouseReleased
                
        changecolor(BHxoa9,new Color(255,0,0));
        if(QuyenTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn quyền nào để xóa");
        }
        else
        {
            String maQuyen =    (String) QuyenTable.getValueAt(QuyenTable.getSelectedRow(), 1);
            editQuyen.XoaQuyen(maQuyen);
        }

    }//GEN-LAST:event_BHxoa9MouseReleased

    private void BHsua9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua9MousePressed
        changecolor(BHsua9,new Color(224,177,0));
    }//GEN-LAST:event_BHsua9MousePressed

    private void BHsua9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHsua9MouseReleased
       
        changecolor(BHsua9,new Color(255,204,0));

        if(QuyenTable.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn quyền nào để sửa");
        }
        else
        {
            new editQuyen().setVisible(true);
        }

    }//GEN-LAST:event_BHsua9MouseReleased

    private void LamMoiSP12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP12MousePressed
       changecolor(LamMoiSP12,new Color(0, 176, 0));
    }//GEN-LAST:event_LamMoiSP12MousePressed

    private void LamMoiSP12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP12MouseReleased
                
        changecolor(LamMoiSP12,new Color(51,204,0));
        deleteTable(QuyenTable);
        QuanLyQuyenBUS qlquyenBUS = new QuanLyQuyenBUS();
        HienThiQuyen.AddTable(qlquyenBUS.getDsq(), QuyenTable);

    }//GEN-LAST:event_LamMoiSP12MouseReleased

    private void searchType6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchType6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchType6ActionPerformed

    private void QuyenSubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuyenSubButtonActionPerformed
         if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlQuyen") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemQuyen") ){
              txCurrentPage.setText("Quyền");
             TabContainer.setSelectedIndex(11);}
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
        
//        TabContainer.setSelectedIndex(11);
    }//GEN-LAST:event_QuyenSubButtonActionPerformed

    private void TKSubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKSubButtonActionPerformed
       if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlTaiKhoan") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemTaiKhoan") ){
            txCurrentPage.setText("Tài khoản");
           TabContainer.setSelectedIndex(8);}
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
        
//        TabContainer.setSelectedIndex(8);
        
    
    }//GEN-LAST:event_TKSubButtonActionPerformed

    private void TKSubButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKSubButton1ActionPerformed
         if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlTaiKhoan") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemTaiKhoan") ){
              txCurrentPage.setText("Tài khoản");
             TabContainer.setSelectedIndex(8);}
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
        
//        TabContainer.setSelectedIndex(8);
    }//GEN-LAST:event_TKSubButton1ActionPerformed

    private void QuyenSubButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuyenSubButton1ActionPerformed
         if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlQuyen") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemQuyen") ){
              txCurrentPage.setText("Quyền");
             TabContainer.setSelectedIndex(11);}
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
        
//        TabContainer.setSelectedIndex(11);
    }//GEN-LAST:event_QuyenSubButton1ActionPerformed

    private void HDSubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HDSubButtonActionPerformed
            if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlHoaDon") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemHoaDon") ){
                txCurrentPage.setText("Hóa đơn");
                TabContainer.setSelectedIndex(2);
        }
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
        
//        TabContainer.setSelectedIndex(2);
       
    }//GEN-LAST:event_HDSubButtonActionPerformed

    private void PNSubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNSubButtonActionPerformed
            if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlPhieuNhap") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemPhieuNhap") ){
                txCurrentPage.setText("Phiếu nhập");
                TabContainer.setSelectedIndex(10);}
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
        
//        TabContainer.setSelectedIndex(10);
        
        
    }//GEN-LAST:event_PNSubButtonActionPerformed

    private void SPSubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPSubButtonActionPerformed
            if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlSanPham") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemSanPham") ){
                 txCurrentPage.setText("Sản phẩm");
                TabContainer.setSelectedIndex(3);}
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
        
//        TabContainer.setSelectedIndex(3);
       
    }//GEN-LAST:event_SPSubButtonActionPerformed

    private void LSPSubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LSPSubButtonActionPerformed
          if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlLoaiSanPham") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemLoaiSanPham") ){
              txCurrentPage.setText("Loại sản phẩm");
              TabContainer.setSelectedIndex(9);}
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
        
//        TabContainer.setSelectedIndex(9);
        
        TabContainer.setSelectedIndex(9);
    }//GEN-LAST:event_LSPSubButtonActionPerformed

    private void SPSubButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPSubButton1ActionPerformed
         if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlSanPham") || LoginForm.quyenLogin.getChiTietQuyen().contains("xemSanPham") ){
         TabContainer.setSelectedIndex(3);
         txCurrentPage.setText("Sản phẩm"); 
         }
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
        
//        TabContainer.setSelectedIndex(3);
    }//GEN-LAST:event_SPSubButton1ActionPerformed

    private void LSPSubButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LSPSubButton1ActionPerformed
        TabContainer.setSelectedIndex(9);
    }//GEN-LAST:event_LSPSubButton1ActionPerformed

    private void LamMoiSP11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP11MouseReleased
        changecolor(LamMoiSP11,new Color(51,204,0));
        deleteTable(PNTable);
        QuanLyPhieuNhapBUS qlpnBUS = new QuanLyPhieuNhapBUS();
        HienThiPhieuNhap.AddTable(qlpnBUS.getDspn(), PNTable); 
    }//GEN-LAST:event_LamMoiSP11MouseReleased

    private void LamMoiSP11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP11MousePressed
        changecolor(LamMoiSP11,new Color(0, 176, 0)); 
    }//GEN-LAST:event_LamMoiSP11MousePressed

    private void FilterSearch9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterSearch9KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearch9KeyReleased

    private void FilterSearch9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterSearch9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearch9ActionPerformed

    private void HDSubButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HDSubButton1ActionPerformed
        txCurrentPage.setText("Hóa đơn");
        TabContainer.setSelectedIndex(2);
    }//GEN-LAST:event_HDSubButton1ActionPerformed

    private void PNSubButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNSubButton1ActionPerformed
        TabContainer.setSelectedIndex(10);
    }//GEN-LAST:event_PNSubButton1ActionPerformed

    private void NutbanhangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutbanhangMouseExited
        changecolor(Nutbanhang,new Color(32,30,69));
    }//GEN-LAST:event_NutbanhangMouseExited

    private void NutbanhangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutbanhangMouseEntered
        changecolor(Nutbanhang,new Color(37,39,84));
    }//GEN-LAST:event_NutbanhangMouseEntered

    private void NutbanhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NutbanhangMouseClicked
        if(LoginForm.quyenLogin.getChiTietQuyen().contains("qlBanHang")){
        TabContainer.setSelectedIndex(0);
        txCurrentPage.setText("Bán hàng");
        }
        else{
             JOptionPane.showMessageDialog(null, "Bạn không có quyền để xem trang này!");
        }
    }//GEN-LAST:event_NutbanhangMouseClicked

    private void SPTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SPTableMouseClicked
       
        int index = SPTable.getSelectedRow();
        TableModel model = SPTable.getModel();
        String imageName = model.getValueAt(index, 7).toString();
        ImageIcon icon = new ImageIcon(getClass().getResource("/quanlicuahangdienthoai/images/Product Images/"+imageName));
        Image img = icon.getImage().getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageLabel.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_SPTableMouseClicked

    private void txMaSPBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaSPBHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaSPBHActionPerformed

    private void txLSPBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txLSPBHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txLSPBHActionPerformed

    private void txTenSPBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTenSPBHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTenSPBHActionPerformed

    private void txDonGiaBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDonGiaBHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDonGiaBHActionPerformed

    private void txSoLuongBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txSoLuongBHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txSoLuongBHActionPerformed

    private void BHxoa7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa7MousePressed
       changecolor(BHxoa7,new Color(221,0,0));
        
    }//GEN-LAST:event_BHxoa7MousePressed

    private void BHxoa7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa7MouseReleased
        
      changecolor(BHxoa7,new Color(255,0,0));
      tongtienBH = 0;
      deleteTable(BHTTTable);
      clearBH();
    }//GEN-LAST:event_BHxoa7MouseReleased

    private void txMaHDBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaHDBHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaHDBHActionPerformed

    private void txKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txKhachHangActionPerformed

    private void txTongTienBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTongTienBHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTongTienBHActionPerformed

    private void txMaNVBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaNVBHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaNVBHActionPerformed

    private void txNgayLapHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNgayLapHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNgayLapHDActionPerformed

    private void ChonMaLoaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChonMaLoaiMousePressed
        changecolor(ChonMaLoai,new Color(60,63,65));
    }//GEN-LAST:event_ChonMaLoaiMousePressed

    private void ChonMaLoaiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChonMaLoaiMouseReleased
       
        changecolor(ChonMaLoai,new Color(204,204,204));
        new ChonKHForm().setVisible(true);
    }//GEN-LAST:event_ChonMaLoaiMouseReleased

    private void BHSPTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHSPTableMouseClicked
        int index = BHSPTable.getSelectedRow();
        TableModel model = BHSPTable.getModel();
        String masp = model.getValueAt(index, 2).toString();
        String malsp = model.getValueAt(index, 3).toString();
        String tensp = model.getValueAt(index, 4).toString();
        String dongia = model.getValueAt(index, 4).toString();
        txMaSPBH.setText(masp);
        txLSPBH.setText(malsp);
        txTenSPBH.setText(tensp);
        txDonGiaBH.setText(dongia);
        
        String imageName = model.getValueAt(index, 7).toString();
        ImageIcon icon = new ImageIcon(getClass().getResource("/quanlicuahangdienthoai/images/Product Images/"+imageName));
        Image img = icon.getImage().getScaledInstance(ImageLabelBH.getWidth(), ImageLabelBH.getHeight(), Image.SCALE_SMOOTH);
        ImageLabelBH.setIcon(new ImageIcon(img));
        
    }//GEN-LAST:event_BHSPTableMouseClicked

    private void txTienTongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTienTongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTienTongActionPerformed

    private void txGioLapHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txGioLapHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txGioLapHDActionPerformed

    private void jLabel94MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel94MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel94MouseReleased

    private void txMaSPNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaSPNHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaSPNHActionPerformed

    private void txLSPNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txLSPNHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txLSPNHActionPerformed

    private void txTenSPNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTenSPNHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTenSPNHActionPerformed

    private void txDonGiaNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDonGiaNHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDonGiaNHActionPerformed

    private void txSoLuongNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txSoLuongNHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txSoLuongNHActionPerformed

    private void NHSPTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NHSPTableMouseClicked
        int index = NHSPTable.getSelectedRow();
        TableModel model = NHSPTable.getModel();
        String masp = model.getValueAt(index, 2).toString();
        String malsp = model.getValueAt(index, 3).toString();
        String tensp = model.getValueAt(index, 4).toString();
        String dongia = model.getValueAt(index, 4).toString();
        txMaSPNH.setText(masp);
        txLSPNH.setText(malsp);
        txTenSPNH.setText(tensp);
        txDonGiaNH.setText(dongia);
        
        String imageName = model.getValueAt(index, 7).toString();
        ImageIcon icon = new ImageIcon(getClass().getResource("/quanlicuahangdienthoai/images/Product Images/"+imageName));
        Image img = icon.getImage().getScaledInstance(ImageLabelNH.getWidth(), ImageLabelNH.getHeight(), Image.SCALE_SMOOTH);
        ImageLabelNH.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_NHSPTableMouseClicked

    private void txMaPNNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaPNNHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaPNNHActionPerformed

    private void txNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNhaCungCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNhaCungCapActionPerformed

    private void txTongTienNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTongTienNHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTongTienNHActionPerformed

    private void txMaNVNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaNVNHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaNVNHActionPerformed

    private void txNgayLapPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNgayLapPNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNgayLapPNActionPerformed

    private void ChonMaLoai2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChonMaLoai2MousePressed
       changecolor(ChonMaLoai2,new Color(60,63,65));
    }//GEN-LAST:event_ChonMaLoai2MousePressed

    private void ChonMaLoai2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChonMaLoai2MouseReleased
        
        changecolor(ChonMaLoai2,new Color(204,204,204));
        new ChonNCCForm().setVisible(true);
    }//GEN-LAST:event_ChonMaLoai2MouseReleased

    private void txGioLapPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txGioLapPNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txGioLapPNActionPerformed

    private void BHthem11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem11MousePressed
        changecolor(BHthem11,new Color(0,163,163));
    }//GEN-LAST:event_BHthem11MousePressed

    private void BHthem11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem11MouseReleased
      
        changecolor(BHthem11,new Color(0,204,204));
        AddTableNH();       
    }//GEN-LAST:event_BHthem11MouseReleased

    private void BHxoa10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa10MousePressed
        changecolor(BHxoa10,new Color(0, 176, 0));
    }//GEN-LAST:event_BHxoa10MousePressed

    private void BHxoa10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa10MouseReleased
         
        changecolor(BHxoa10,new Color(51,204,0));
        
        if(txTongTienNH.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Bảng nhập hàng trống!");
        }
        else if(txNhaCungCap.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn nhà cung cấp!");
        }
        else{
        QuanLyPhieuNhapBUS qlpnBUS = new QuanLyPhieuNhapBUS();
//        QuanLyChiTietPhieuNhapBUS qlctpn = new QuanLyChiTietPhieuNhapBUS();
//        ArrayList<ChiTietHoaDon> dscthd = qlcthdDAO.readDB();
       
        PhieuNhap pn = new PhieuNhap(
                txMaPNNH.getText(),
                NhaCungCap.getMaNCC(), 
                LoginForm.nhanVienLogin.getMaNV(),                            
                LocalDate.parse(txNgayLapPN.getText()),
                LocalTime.parse(txGioLapPN.getText()),
                Float.parseFloat(txTienTong1.getText()));
        
        qlpnBUS.add(pn);
        
        TableModel model = NHTTTable.getModel();
        int rowcount = model.getRowCount();
        for(int i = 0; i<rowcount; i++)
        {
            AddCTPN(i);
        }
        
        
        JOptionPane.showMessageDialog(null, "Nhập hàng thành công");
        
        txMaPNNH.setText(qlpnBUS.getNextID());
        clearNH();
        }
    }//GEN-LAST:event_BHxoa10MouseReleased

    private void txTienTong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTienTong1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTienTong1ActionPerformed

    private void FilterSearchBH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterSearchBH1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearchBH1ActionPerformed

    private void FilterSearchBH1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterSearchBH1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterSearchBH1KeyReleased

    private void BHxoa11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa11MousePressed
      changecolor(BHxoa11,new Color(221,0,0)); 
    }//GEN-LAST:event_BHxoa11MousePressed

    private void BHxoa11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHxoa11MouseReleased
         
      changecolor(BHxoa11,new Color(255,0,0));
      tongtienNH = 0;
      deleteTable(NHTTTable);
      clearNH();
    }//GEN-LAST:event_BHxoa11MouseReleased

    private void txKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txKhuyenMaiActionPerformed

    private void ChonMaLoai1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChonMaLoai1MousePressed
       changecolor(ChonMaLoai1,new Color(60,63,65));
        
    }//GEN-LAST:event_ChonMaLoai1MousePressed

    private void ChonMaLoai1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChonMaLoai1MouseReleased
       changecolor(ChonMaLoai1,new Color(204,204,204));
        if(BHTTTable.getRowCount()==0)
        {
            JOptionPane.showMessageDialog(null, "Bảng thanh toán trống!");
        }else
        {
            new ChonKMForm().setVisible(true);
        }
      
    }//GEN-LAST:event_ChonMaLoai1MouseReleased

    private void BHthem12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem12MousePressed
        changecolor(BHthem12,new Color(0,163,163));
       
    }//GEN-LAST:event_BHthem12MousePressed

    private void BHthem12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHthem12MouseReleased
         changecolor(BHthem12,new Color(0,204,204));
         int index = PNTable.getSelectedRow();
        
        if(index<0){
            JOptionPane.showMessageDialog(null, "Chưa chọn phiếu nhập nào để xem");
        }else{
        String mapn = (String) PNTable.getValueAt(index, 1);
        new ChonCTPNForm(mapn).setVisible(true);
        }
    }//GEN-LAST:event_BHthem12MouseReleased

    private void LamMoiSP2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP2MousePressed
        changecolor(LamMoiSP2,new Color(0, 176, 0));
        
    }//GEN-LAST:event_LamMoiSP2MousePressed

    private void LamMoiSP2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP2MouseReleased
        changecolor(LamMoiSP2,new Color(51,204,0));
        deleteTable(BHSPTable);
        QuanLySanPhamBUS qlspBUS = new QuanLySanPhamBUS();
        HienThiSanPham.AddTable(qlspBUS.getDssp(), BHSPTable); 
    }//GEN-LAST:event_LamMoiSP2MouseReleased

    private void LamMoiSP4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP4MousePressed
        changecolor(LamMoiSP4,new Color(0, 176, 0));
    }//GEN-LAST:event_LamMoiSP4MousePressed

    private void LamMoiSP4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LamMoiSP4MouseReleased
       
        changecolor(LamMoiSP4,new Color(51,204,0));
        deleteTable(NHSPTable);
        QuanLySanPhamBUS qlspBUS = new QuanLySanPhamBUS();
        HienThiSanPham.AddTable(qlspBUS.getDssp(), NHSPTable); 
    }//GEN-LAST:event_LamMoiSP4MouseReleased

    private void TabNHMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabNHMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TabNHMouseReleased

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        changecolor(jPanel7, new Color(74,30,113));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        changecolor(jPanel7, new Color(92,37,141));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
         changecolor(jPanel8, new Color(74,30,113));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
       changecolor(jPanel8, new Color(92,37,141));
    }//GEN-LAST:event_jPanel8MouseExited

    private void kGradientPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseClicked
     
    }//GEN-LAST:event_kGradientPanel1MouseClicked

//    
//    public static void AddRowToTable(Object[] dataRow,JTable table)
//    {
//        DefaultTableModel model = (DefaultTableModel)table.getModel();
//        model.addRow(dataRow);
//    }
//  
//        public static void AddTable(ArrayList<SanPham> data,JTable table){
//        for (SanPham sp : data) {
//            AddRowToTable(new Object[]{sp.getMaSP(),
//                              sp.getMaLSP(), 
//                              sp.getTenSP(),
//                              PriceFormatter.format(sp.getDonGia()),
//                              String.valueOf(sp.getSoLuong()),
//                              (sp.getTrangThai() == 0 ? "Hiện" : "Ẩn")
//                              },table);
//        }
//    }
    
    
    public static void main(String args[]) {
        System.setProperty("sun.java2d.uiScale", "1.0");
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new MainPage().setVisible(true);
                
                
                
                
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable BHSPTable;
    public static javax.swing.JTable BHTTTable;
    private static javax.swing.JPanel BHsua1;
    private static javax.swing.JPanel BHsua2;
    private static javax.swing.JPanel BHsua3;
    private static javax.swing.JPanel BHsua4;
    private static javax.swing.JPanel BHsua5;
    private static javax.swing.JPanel BHsua6;
    private static javax.swing.JPanel BHsua8;
    private static javax.swing.JPanel BHsua9;
    private javax.swing.JPanel BHthem;
    private static javax.swing.JPanel BHthem1;
    private static javax.swing.JPanel BHthem10;
    private javax.swing.JPanel BHthem11;
    private javax.swing.JPanel BHthem12;
    private static javax.swing.JPanel BHthem2;
    private static javax.swing.JPanel BHthem3;
    private static javax.swing.JPanel BHthem4;
    private static javax.swing.JPanel BHthem5;
    private static javax.swing.JPanel BHthem6;
    private javax.swing.JPanel BHthem7;
    private static javax.swing.JPanel BHthem8;
    private javax.swing.JPanel BHxoa;
    private static javax.swing.JPanel BHxoa1;
    private javax.swing.JPanel BHxoa10;
    private javax.swing.JPanel BHxoa11;
    private static javax.swing.JPanel BHxoa2;
    private static javax.swing.JPanel BHxoa3;
    private static javax.swing.JPanel BHxoa4;
    private static javax.swing.JPanel BHxoa5;
    private static javax.swing.JPanel BHxoa6;
    private javax.swing.JPanel BHxoa7;
    private static javax.swing.JPanel BHxoa8;
    private static javax.swing.JPanel BHxoa9;
    private javax.swing.JPanel ChonMaLoai;
    private javax.swing.JPanel ChonMaLoai1;
    private javax.swing.JPanel ChonMaLoai2;
    private java.awt.TextField FilterSearch1;
    private java.awt.TextField FilterSearch10;
    private java.awt.TextField FilterSearch2;
    private java.awt.TextField FilterSearch3;
    private java.awt.TextField FilterSearch4;
    private java.awt.TextField FilterSearch5;
    private java.awt.TextField FilterSearch6;
    private java.awt.TextField FilterSearch7;
    private java.awt.TextField FilterSearch8;
    private java.awt.TextField FilterSearch9;
    private java.awt.TextField FilterSearchBH;
    private java.awt.TextField FilterSearchBH1;
    private com.k33ptoo.components.KButton HDSubButton;
    private com.k33ptoo.components.KButton HDSubButton1;
    public static javax.swing.JTable HDTable;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel ImageLabelBH;
    private javax.swing.JLabel ImageLabelNH;
    public static javax.swing.JTable KHTable;
    public static javax.swing.JTable KMTable;
    private com.k33ptoo.components.KButton LSPSubButton;
    private com.k33ptoo.components.KButton LSPSubButton1;
    public static javax.swing.JTable LSPTable;
    private javax.swing.JPanel LamMoiSP1;
    private javax.swing.JPanel LamMoiSP10;
    private javax.swing.JPanel LamMoiSP11;
    private javax.swing.JPanel LamMoiSP12;
    private javax.swing.JPanel LamMoiSP2;
    private javax.swing.JPanel LamMoiSP3;
    private javax.swing.JPanel LamMoiSP4;
    private javax.swing.JPanel LamMoiSP5;
    private javax.swing.JPanel LamMoiSP6;
    private javax.swing.JPanel LamMoiSP7;
    private javax.swing.JPanel LamMoiSP8;
    private javax.swing.JPanel LamMoiSP9;
    public static javax.swing.JTable NCCTable;
    public static javax.swing.JTable NHSPTable;
    public static javax.swing.JTable NHTTTable;
    public static javax.swing.JTable NVTable;
    private javax.swing.JPanel Nutbanhang;
    private javax.swing.JPanel Nutdong;
    private javax.swing.JPanel Nuthoadon;
    private javax.swing.JPanel Nutkhachhang;
    private javax.swing.JPanel Nutkhuyenmai;
    private javax.swing.JPanel Nutnhacungcap;
    private javax.swing.JPanel Nutnhanvien;
    private javax.swing.JPanel Nutnhaphang;
    private javax.swing.JPanel Nutsanpham;
    private javax.swing.JPanel Nuttaikhoan;
    private javax.swing.JPanel Nutthunho;
    private com.k33ptoo.components.KButton PNSubButton;
    private com.k33ptoo.components.KButton PNSubButton1;
    public static javax.swing.JTable PNTable;
    private com.k33ptoo.components.KButton QuyenSubButton;
    private com.k33ptoo.components.KButton QuyenSubButton1;
    public static javax.swing.JTable QuyenTable;
    private com.k33ptoo.components.KButton SPSubButton;
    private com.k33ptoo.components.KButton SPSubButton1;
    public static javax.swing.JTable SPTable;
    private com.k33ptoo.components.KButton TKSubButton;
    private com.k33ptoo.components.KButton TKSubButton1;
    public static javax.swing.JTable TKTable;
    private javax.swing.JPanel TabBH;
    private javax.swing.JTabbedPane TabContainer;
    private javax.swing.JPanel TabHD;
    private javax.swing.JPanel TabKH;
    private javax.swing.JPanel TabKM;
    private javax.swing.JPanel TabLSP;
    private javax.swing.JPanel TabNCC;
    private javax.swing.JPanel TabNH;
    private javax.swing.JPanel TabNV;
    private javax.swing.JPanel TabPN;
    private javax.swing.JPanel TabQuyen;
    private javax.swing.JPanel TabSP;
    private javax.swing.JPanel TabTK;
    private javax.swing.JPanel TabTrangChu;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JPanel formcontainer;
    private keeptoo.KGradientPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel minclose;
    public javax.swing.JComboBox<String> searchType1;
    public javax.swing.JComboBox<String> searchType10;
    public javax.swing.JComboBox<String> searchType2;
    public javax.swing.JComboBox<String> searchType3;
    public javax.swing.JComboBox<String> searchType4;
    public javax.swing.JComboBox<String> searchType5;
    public javax.swing.JComboBox<String> searchType6;
    public javax.swing.JComboBox<String> searchType7;
    public javax.swing.JComboBox<String> searchType8;
    public javax.swing.JComboBox<String> searchType9;
    public javax.swing.JComboBox<String> searchTypeBH;
    public javax.swing.JComboBox<String> searchTypeBH1;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel txCurrentPage;
    private javax.swing.JTextField txDonGiaBH;
    private javax.swing.JTextField txDonGiaNH;
    public static javax.swing.JTextField txGioLapHD;
    public static javax.swing.JTextField txGioLapPN;
    public static javax.swing.JTextField txKhachHang;
    public static javax.swing.JTextField txKhuyenMai;
    private javax.swing.JTextField txLSPBH;
    private javax.swing.JTextField txLSPNH;
    public static javax.swing.JTextField txMaHDBH;
    public static javax.swing.JTextField txMaNVBH;
    public static javax.swing.JTextField txMaNVNH;
    public static javax.swing.JTextField txMaPNNH;
    private javax.swing.JTextField txMaSPBH;
    private javax.swing.JTextField txMaSPNH;
    public static javax.swing.JTextField txNgayLapHD;
    public static javax.swing.JTextField txNgayLapPN;
    public static javax.swing.JTextField txNhaCungCap;
    private javax.swing.JLabel txNhanVienDangNhap;
    public static javax.swing.JTextField txSoLuongBH;
    public static javax.swing.JTextField txSoLuongNH;
    private javax.swing.JTextField txTenSPBH;
    private javax.swing.JTextField txTenSPNH;
    public static javax.swing.JTextField txTienTong;
    public static javax.swing.JTextField txTienTong1;
    public static javax.swing.JTextField txTongTienBH;
    public static javax.swing.JTextField txTongTienNH;
    public javax.swing.JTextField txTongtiensauKM;
    public javax.swing.JTextField txTongtiensauKM1;
    // End of variables declaration//GEN-END:variables
}
