package Human_Resources;

import java.text.NumberFormat;
import java.util.Locale;

// Khai báo lớp abstract 

public abstract class Staff {

	Locale lc = new Locale("vi","VN");
	NumberFormat numf= NumberFormat.getInstance();
//	Khai báo biến

	private String maNhanVien, tenNhanhVien;
	private int tuoiNhanVien;
	private float heSoluong;
	private String ngayVaoLam;
	private String boPhanLamViec;
	private int soNgayNghiPhep;
	protected double luong;
	
//	Hàm contructor
	public Staff(String maNhanVien, String tenNhanhVien, int tuoiNhanVien, float heSoluong, String ngayVaoLam,
			String boPhanLamViec, int soNgayNghiPhep) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanhVien = tenNhanhVien;
		this.tuoiNhanVien = tuoiNhanVien;
		this.heSoluong = heSoluong;
		this.ngayVaoLam = ngayVaoLam;
		this.boPhanLamViec = boPhanLamViec;
		this.soNgayNghiPhep = soNgayNghiPhep;

	}

//	Các hàm getter and setter
	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getTenNhanhVien() {
		return tenNhanhVien;
	}

	public void setTenNhanhVien(String tenNhanhVien) {
		this.tenNhanhVien = tenNhanhVien;
	}

	public int getTuoiNhanVien() {
		return tuoiNhanVien;
	}

	public void setTuoiNhanVien(int tuoiNhanVien) {
		this.tuoiNhanVien = tuoiNhanVien;
	}

	public float getHeSoluong() {
		return heSoluong;
	}

	public void setHeSoluong(float heSoluong) {
		this.heSoluong = heSoluong;
	}

	public String getNgayVaoLam() {
		return ngayVaoLam;
	}

	public void setNgayVaoLam(String ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}

	public String getBoPhanLamViec() {
		return boPhanLamViec;
	}

	public void setBoPhanLamViec(String boPhanLamViec) {
		this.boPhanLamViec = boPhanLamViec;
	}

	public int getSoNgayNghiPhep() {
		return soNgayNghiPhep;
	}

	public void setSoNgayNghiPhep(int soNgayNghiPhep) {
		this.soNgayNghiPhep = soNgayNghiPhep;
	}
// 	Hàm abstract 
	public abstract String displayInformation();
}
