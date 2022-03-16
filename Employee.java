package Human_Resources;

public class Employee extends Staff implements CalculateSalary { //Hàm con của hàm Staff và thực thi lại interface CalculateSalary
//	Khai Báo Biến
	private double soGioLamThem;
	private double luong;
//	Hàm contructor
	public Employee(String maNhanVien, String tenNhanhVien, int tuoiNhanVien, float heSoluong, String ngayVaoLam,
			String boPhanLamViec, int soNgayNghiPhep, double soGioLamThem) {
		super(maNhanVien, tenNhanhVien, tuoiNhanVien, heSoluong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep);
		this.soGioLamThem = soGioLamThem;
		this.luong = tinhLuong();
	}
//	Các hàm getters and setters
	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public double getSoGioLamThem() {
		return soGioLamThem;
	}

	public void setSoGioLamThem(double soGioLamThem) {
		this.soGioLamThem = soGioLamThem;
	}

	@Override
	public String displayInformation() {
		return "" + "Mã nhân viên : " + getMaNhanVien() + ", Tên nhân viên : " + getTenNhanhVien() + ", Tuổi : "
				+ getTuoiNhanVien() + ", Hệ số lương : " + getHeSoluong() + ", Ngày vào làm : " + getNgayVaoLam()
				+ ", Bộ phận làm việc : " + getBoPhanLamViec() + ", Số ngày nghỉ phép : " + getSoNgayNghiPhep()
				+ ", Số giờ làm thêm :" + soGioLamThem + " Lương : " + numf.format(getLuong());
	}
//	Hàm tính lương để tính lương cho nhân viên
	@Override
	public double tinhLuong() {
		return luong = (this.getHeSoluong() * 3000000) + (this.soGioLamThem * 200000);
	}
//// 	Hàm toString để thực thi in chuỗi ra màn hình
//	@Override
//	public String toString() {
//		return "Mã nhân viên : " + getMaNhanVien() + ", Tên nhân viên : " + getTenNhanhVien() + ", Tuổi : "
//				+ getTuoiNhanVien() + ", Hệ số lương : " + getHeSoluong() + ", Ngày vào làm : " + getNgayVaoLam()
//				+ ", Bộ phận làm việc : " + getBoPhanLamViec() + ", Số ngày nghỉ phép : " + getSoNgayNghiPhep()
//				+ ", Số giờ làm thêm :" + soGioLamThem + " Lương : " + numf.format(getLuong());
//	}

}
