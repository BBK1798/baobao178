package Human_Resources;

import java.text.NumberFormat;
import java.util.Locale;

public class Manager extends Staff implements CalculateSalary {
//	Khai báo biến
	private String chucDanh;
	Locale lc = new Locale("vn","VN");
	NumberFormat numf= NumberFormat.getInstance();

//	Hàm contructor
	public Manager(String maNhanVien, String tenNhanhVien, int tuoiNhanVien, float heSoluong, String ngayVaoLam,
			String boPhanLamViec, int soNgayNghiPhep, String chucDanh) {
		super(maNhanVien, tenNhanhVien, tuoiNhanVien, heSoluong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep);
		this.chucDanh = chucDanh;
		this.luong = tinhLuong();
	}
//	Hàm getter and setter
	public String getChucDanh() {
		return chucDanh;
	}

	public void setChucDanh(String chucDanh) {
		this.chucDanh = chucDanh;
	}

// Hàm tính lương
	@Override
	public double tinhLuong() {
		double luongTrachNhiem;
		if (this.chucDanh.equals("Business Leader")) {
			luongTrachNhiem = 8000000;
		} else if (this.chucDanh.equals("Project Leader")) {
			luongTrachNhiem = 5000000;
		}else {
			luongTrachNhiem = 6000000;
		}
		return luong = (5000000*this.getHeSoluong()) + luongTrachNhiem;
	}
// Hàm in ra thông tin nhân viên
	@Override
	public String displayInformation() {
		return "/n" + " Mã nhân viên : " + getMaNhanVien() + ", Tên nhân viên : " + getTenNhanhVien()
				+ ", Tuổi nhân viên : " + getTuoiNhanVien() + ", Hệ số lương : " + getHeSoluong() + ", Ngày vào làm : "
				+ getNgayVaoLam() + ", Bộ phân làm việc : " + getBoPhanLamViec() + ", Số ngày nghỉ phép : "
				+ getSoNgayNghiPhep() + "Chức danh : " + chucDanh + ", Luong : " + numf.format(getLuong());

	}
//// Hàm toString
//	@Override
//	public String toString() {
//		return " Mã nhân viên : " + getMaNhanVien() + " Tên nhân viên : " + getTenNhanhVien() + ", Tuổi nhân viên : "
//				+ getTuoiNhanVien() + ", Hệ số lương : " + getHeSoluong() + ", Ngày vào làm : " + getNgayVaoLam()
//				+ ", Bộ phân làm việc : " + getBoPhanLamViec() + ", Số ngày nghỉ phép : " + getSoNgayNghiPhep()
//				+ ", Chức danh : " + chucDanh + ", Lương : " + numf.format(getLuong());
//	}
}
