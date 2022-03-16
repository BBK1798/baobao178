package Human_Resources;


public class Department {
//	Khai báo biến 
		private String maBoPhan;
		private String tenBoPhan;
		private int soLuongNhanVien;
//		Hàm contructor
		public Department(String maBoPhan, String tenBoPhan, int soLuongNhanVien) {
			this.maBoPhan = maBoPhan;
			this.tenBoPhan = tenBoPhan;
			this.soLuongNhanVien = soLuongNhanVien;
		}
//		Các hàm getter and setter
		public String getMaBoPhan() {
			return maBoPhan;
		}
		public void setMaBoPhan(String maBoPhan) {
			this.maBoPhan = maBoPhan;
		}
		public String getTenBoPhan() {
			return tenBoPhan;
		}
		public void setTenBoPhan(String tenBoPhan) {
			this.tenBoPhan = tenBoPhan;
		}
		public int getSoLuongNhanVien() {
			return soLuongNhanVien;
		}
		public void setSoLuongNhanVien(int soLuongNhanVien) {
			this.soLuongNhanVien = soLuongNhanVien;
		}		
		public void inDanhSachBoPhan() {
			System.out.println("Mã bộ phận : " + getMaBoPhan());
			System.out.println("Bộ phận : " + getTenBoPhan());
			System.out.println("Số lượng nhân viên : "+ getSoLuongNhanVien());
		}
		@Override
//		Hàm toString
		public String toString() {
			return "Mã bộ phân : " + getMaBoPhan() + ", Tên bộ phận : " + getTenBoPhan() + ", Sô lượng nhân viên : "
					+ getSoLuongNhanVien() + "]";
		}
		
}
