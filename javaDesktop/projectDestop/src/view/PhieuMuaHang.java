/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import BEAN.DonHang;
import BEAN.MatHang;
import DAO.SanPhamDAO;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import service.DonHangService;
import service.MathangService;

/**
 *
 * @author dell
 */
public class PhieuMuaHang extends javax.swing.JFrame {

    DonHang donhang;
    MatHang mathang;
    DonHangService donhangService;
    MathangService mathangService;
    SanPhamDAO sanphamDAO;

    LocalDate ngayGio;
    int maNV =0;
  
    public PhieuMuaHang() {
        init();
    }
    public PhieuMuaHang(int NV) {
      init();
      maNV = NV;
    }
    public void init(){
         initComponents();
        txtSoLuong.setText("0");
        txtPhiVC.setText("0");
//         căn giữa màn hình
        this.setLocationRelativeTo(null);
        donhang = new DonHang();
        mathang = new MatHang();
        donhangService = new DonHangService();
        sanphamDAO = new SanPhamDAO();
        mathangService = new MathangService();

        ngayGio = java.time.LocalDate.now();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        txtHTThanhToan = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtHTVanChuyen = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtKhachHang = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JFormattedTextField();
        txtPhiVC = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        btnDatHang = new javax.swing.JButton();
        btnXoaTT = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/horizontal_on_white_by_logaster_1.png"))); // NOI18N

        jLabel2.setText("Công ti thời trang Hine");

        jLabel3.setText("Phiếu mua hàng");

        jLabel4.setText("Ngày...tháng...năm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin mua hàng   ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Mã sản phẩm");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("HT thanh toán");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("Số lượng");

        txtHTThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. Ví điện tử", "2. Nhận hàng" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("HT vận chuyển");

        txtHTVanChuyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0. Nhận hàng tại quầy", "1. Vận chuyển nhanh", "2. Vận chuyển thường", "3. Vận chuyển hỏa tốc" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("Phí VC");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("Khách hàng");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("SDT");

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("Địa chỉ");

        txtSoLuong.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtPhiVC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaSP)
                            .addComponent(txtHTThanhToan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHTVanChuyen, 0, 137, Short.MAX_VALUE)
                            .addComponent(txtKhachHang))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txtSoLuong)
                            .addComponent(txtPhiVC)))
                    .addComponent(txtDiaChi))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHTThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHTVanChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtPhiVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnDatHang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDatHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok-icon.png"))); // NOI18N
        btnDatHang.setText("Đặt hàng");
        btnDatHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatHangActionPerformed(evt);
            }
        });

        btnXoaTT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoaTT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete-file-icon (1).png"))); // NOI18N
        btnXoaTT.setText("Xóa thông tin");
        btnXoaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTTActionPerformed(evt);
            }
        });

        btnQuayLai.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button-Load-icon.png"))); // NOI18N
        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDatHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnXoaTT)
                .addGap(34, 34, 34)
                .addComponent(btnQuayLai)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDatHang)
                    .addComponent(btnXoaTT)
                    .addComponent(btnQuayLai))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void btnDatHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatHangActionPerformed
        // TODO add your handling code here:
//        LoaiThanhToan,soLuong, DCgiaoHang, khachHang, hinhThucVanChuyen, phiVC, ngayDat
        String sdt = txtSDT.getText();
        String maMH = txtMaSP.getText();
        int thanhToan = txtHTThanhToan.getSelectedIndex() + 1;
        int soLuong = Integer.valueOf(txtSoLuong.getText());
        String diaChi = txtDiaChi.getText();
        String khachHang = txtKhachHang.getText();
        int htVanChuyen = txtHTVanChuyen.getSelectedIndex() + 1;
        int phiVC = Integer.valueOf(txtPhiVC.getText());
        Date ngayDat = Date.from(ngayGio.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
//      Validate form
        if(sdt.length() <= 0 || maMH.length() <=0 || diaChi.length() <=0 || khachHang.length() <= 0 ){
             JOptionPane.showMessageDialog(null,
                        "Vui lòng điền đầy đủ thông tin",
                        "Lỗi!!!",
                        JOptionPane.ERROR_MESSAGE);
        
        }if(  soLuong <= 0){
            JOptionPane.showMessageDialog(null,
                        "Vui lòng chọn số lượng",
                        "Lỗi!!!",
                        JOptionPane.ERROR_MESSAGE);
        }
        if(phiVC<= 0){
            JOptionPane.showMessageDialog(null,
                        "Vui lòng xác nhận phí vận chuyển",
                        "Lỗi!!!",
                        JOptionPane.ERROR_MESSAGE);
        }
        
        else{
//      Kiểm tra mã mặt hàng có tồn tại không.... false: không tồn tại
        if (mathangService.checkSP(maMH)) {
//            Kiểm tra trạng thái sản phẩm đó đã bị hủy hay không?... true: chưa hủy
            if (mathangService.checkTrangThaiSP(maMH)) {
//                kiểm tra lượng tồn kho của san rphaamr có đủ đáp ứng không
                if(mathangService.checkAmount(maMH, soLuong)){
                    donhang.setLoaiThanhToan(thanhToan);
                    donhang.setSoLuong(soLuong);
                    donhang.setDiaChiGH(diaChi);
                    donhang.setKhachHang(khachHang);
                    donhang.setHinhThucVC(htVanChuyen);
                    donhang.setPhiVC(phiVC);
                    donhang.setNgayDat(ngayDat);

                //       1. thêm vào bảng đon hàng
                donhangService.order_Product(donhang, sdt, maMH);
                System.out.println("Thêm vào bảng đơn hàng successfull");
                
                // lấy mã đơn hàng vừa dc tạo ra
                int soDH = donhangService.getLastDonHang();
                // xóa dữ liệu trigger vừa tạo
                donhangService.deleteTinhTrangDonHang(soDH);
                // 1. thêm vào bảng tình trạng đơn hàng
                donhangService.insert_Data_In_TinhTrangDonHang(maNV, soDH);
                // 2. Thêm vào bảng chi tiết hóa đơn
                donhangService.insert_Data_In_ChiTietDonHang(maMH, soDH, donhang.getSoLuong());
                JOptionPane.showMessageDialog(null, "Đặt hàng thành công!!");
                deleteAllData();
                }else{
                    JOptionPane.showMessageDialog(null,
                        "số lượng sản phẩm tại cửa hàng không đủ",
                        "Lỗi!!!",
                        JOptionPane.ERROR_MESSAGE);
                }
                
            } else {
                JOptionPane.showMessageDialog(null,
                        "Sản phẩm đã ngừng kinh doanh",
                        "Lỗi!!!",
                        JOptionPane.ERROR_MESSAGE);
            }

        } else {
           JOptionPane.showMessageDialog(null,
                        "Sản phẩm không tồn tại",
                        "Lỗi!!!",
                        JOptionPane.ERROR_MESSAGE);
        }
        }

    }//GEN-LAST:event_btnDatHangActionPerformed
    public void deleteAllData() {
        txtMaSP.setText("");
        txtSoLuong.setText("0");
        txtHTVanChuyen.setSelectedIndex(0);
        txtPhiVC.setText("0");
        txtKhachHang.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
    }
    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnXoaTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTTActionPerformed
        // TODO add your handling code here:
        deleteAllData();
    }//GEN-LAST:event_btnXoaTTActionPerformed
    public int usingThreadLocalClass(int sl) {
        int ranNum = ThreadLocalRandom.current().nextInt(0, sl);
        return ranNum;

    }

    public String getTenKH() {

        String[] list = {"Tạ Quang Thắng", "Trần Như Quỳnh", "Nguyễn Thị Thêm", "Nguyễn Long"};
        int a = usingThreadLocalClass(list.length);
        String name = list[a].toString();
        return name;
    }

    public String getSDT() {
        String[] list = {"0136542369", "0123987456", "0322323256", "0313322211"};
        int a = usingThreadLocalClass(list.length);
        String sdt = list[a].toString();
        return sdt;
    }

    public String getDiaChi() {
        String[] list = {"Huế", "Quảng Bình", "Hà Nội", "Đà Nẵng"};
        int a = usingThreadLocalClass(list.length);
        String diaChi = list[a].toString();
        return diaChi;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatHang;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnXoaTT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JComboBox<String> txtHTThanhToan;
    private javax.swing.JComboBox<String> txtHTVanChuyen;
    private javax.swing.JTextField txtKhachHang;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JFormattedTextField txtPhiVC;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JFormattedTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables
}
