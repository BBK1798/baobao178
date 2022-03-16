package Human_Resources;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class HumanResources {

	Locale lc = new Locale("vn", "VN");
	NumberFormat numf = NumberFormat.getInstance();

	// Tạo ArrayList
	private ArrayList<Staff> danhSachNhanVien;

	public HumanResources() {
		this.danhSachNhanVien = new ArrayList<Staff>();
	}

	// Hàm thêm nhân viên thường
	public void themNhanVien(Employee nv) {
		this.danhSachNhanVien.add(nv);
	}

	// Hàm thêm nhân quản lý
	public void themQuanLy(Manager nv) {
		this.danhSachNhanVien.add(nv);
	}

//	Hàm hiển thị danh sách nhân viên công ty
	public void inDanhSach() {
		for (Staff staff : danhSachNhanVien) {
			System.out.println("" + " + " + staff.displayInformation());
		}
		System.out.println("");
	}

//	Hàm hiển thị danh sách nhân viên công ty theo từng bộ phận
	public void inDanhSachTheoBoPhan() {
		System.out.println("Quản Lý");
		for (Staff staff : danhSachNhanVien) {
			if (staff.getBoPhanLamViec().equals("Manager")) {
				System.out.println(" + " + staff.displayInformation());
			}
		}
		System.out.println("");
		System.out.println("Nhân Viên");
		for (Staff staff : danhSachNhanVien) {
			if (staff.getBoPhanLamViec().equals("Employee")) {
				System.out.println(" + " + staff.displayInformation());
			}
		}
	}

// Hàm tìm nhân viên trong công ty theo tên
	public void timNhanVien(String ten) {
		for (Staff staff : danhSachNhanVien) {
			if (staff.getTenNhanhVien().indexOf(ten) >= 0) {
				System.out.println(staff.displayInformation());
			}
		}
	}

	// Hàm tìm nhân viên trong công ty theo mã NV
	public void timNhanVienMaNv(String maNv) {
		for (Staff staff : danhSachNhanVien) {
			if (staff.getMaNhanVien().indexOf(maNv) >= 0) {
				System.out.println(staff.displayInformation());
			}
		}
	}

//	Hàm in ra bảng lương của công ty
	public void inRaBangLuong() {
		for (Staff staff : danhSachNhanVien) {
			System.out.println("Mã nhân Viên : " + staff.getMaNhanVien() + "   -   Tên : " + staff.getTenNhanhVien()
					+ "   -   Lương : " + numf.format(staff.getLuong())  + "\n");
		}
	}

//Hàm in ra danh sách bộ phận
	public void inDanhSachBoPhan() {
		String maBoPhannv = "", boPhannv = "", maBoPhanql = "", boPhanql = "";
		int soLuong1 = 0, soLuong2 = 0;
		System.out.println("Nhân Viên");
		for (Staff staff : danhSachNhanVien) {
			if (staff.getBoPhanLamViec().equals("Employee")) {
				soLuong1 += 1;
				maBoPhannv = "Emp";
				boPhannv = "Employee";
			}
		}
		Department bp1 = new Department(maBoPhannv, boPhannv, soLuong1);
		System.out.println(bp1.toString());
		System.out.println("");

		System.out.println("Quản lý");
		for (Staff staff : danhSachNhanVien) {
			if (staff.getBoPhanLamViec().equals("Manager")) {
				soLuong2 += 1;
				maBoPhanql = "Mana";
				boPhanql = "Manager";
			}
		}
		Department bp2 = new Department(maBoPhanql, boPhanql, soLuong2);
		System.out.println(bp2.toString());
	}

// Hàm Sắp xếp  lương nhân viên tăng dần
	public void sapXepTang() {
		Collections.sort(this.danhSachNhanVien, new Comparator<Staff>() {
			@Override
			public int compare(Staff nv1, Staff nv2) {
				if (nv1.getLuong() < nv2.getLuong()) {
					return 1;
				} else if (nv1.getLuong() > nv2.getLuong()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
	}

	// Hàm Sắp xếp lương nhân viên tăng dần
	public void sapXepGiam() {
		Collections.sort(this.danhSachNhanVien, new Comparator<Staff>() {
			@Override
			public int compare(Staff nv1, Staff nv2) {
				if (nv1.getLuong() > nv2.getLuong()) {
					return 1;
				} else if (nv1.getLuong() < nv2.getLuong()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
	}

// Hàm main điều khiển luồng chính 
	public static void main(String[] args) {
		HumanResources dsnv = new HumanResources();
		Scanner sc = new Scanner(System.in);
		Scanner ec = new Scanner(System.in);
		int luacChon = 0;
//      Vòng lặp do…while để cho phép người dùng chọn lại chức năng;
		do {
			System.out.println("----------MENU----------");
			System.out.println("Vui lòng lựa chọn chức năng : \n" + "0. Thoát khỏi chương trình.\n"
					+ "1. Thêm nhân viên.\n" + "2. Thêm quản lý.\n" + "3. Hiển thị danh sách nhân viên công ty.\n"
					+ "4. Hiển thị danh sách nhanh viên theo từng bộ phận.\n" + "5. Tìm kiếm nhân viên theo tên.\n"
					+ "6. Tìm kiếm nhân viên theo mã nhân viên.\n" + "7. Hiển thị từng bộ phận của công ty.\n"
					+ "8. Hiển thị bảng lương toàn công ty.\n"
					+ "9. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần.\n"
					+ "10. Hiển thị bảng lương của nhân viên theo thứ tự giảm dần.\n");

			luacChon = sc.nextInt();
			if (luacChon == 1) {

//				1. Thêm 1 nhân viên mới
				System.out.println("Nhập mã nhân viên : ");
				String maNhanVien = ec.nextLine();
				System.out.println("Nhập tên nhân viên : ");
				String tenNhanVien = ec.nextLine();
				System.out.println("Nhập tuổi nhân viên : ");
				int tuoiNhanVien = sc.nextInt();
				System.out.println("Nhập hệ số lương  : ");
				float hsl = sc.nextFloat();
				System.out.println("Nhập ngày vào làm : ");
				String ngayVaoLam = ec.nextLine();
				String boPhanLamViec = "Employee";
				System.out.println("Nhập số ngày nghỉ phép : ");
				int ngayNghiPhep = sc.nextInt();
				System.out.println("Nhập số giờ làm thêm : ");
				double soGioLamThem = sc.nextDouble();
				Employee nv = new Employee(maNhanVien, tenNhanVien, tuoiNhanVien, hsl, ngayVaoLam, boPhanLamViec,
						ngayNghiPhep, soGioLamThem);
				dsnv.themNhanVien(nv);

			} else if (luacChon == 2) {
//				2.Thêm 1 quản lý mới
				System.out.println("Nhập mã quản lý : \n");
				String maNhanVien = ec.nextLine();
				System.out.println("Nhập tên quản lý : \n");
				String tenNhanVien = ec.nextLine();
				System.out.println("Nhập tuổi quản lý : \n");
				int tuoiNhanVien = sc.nextInt();
				System.out.println("Nhập hệ số lương  : \n");
				float hsl = sc.nextFloat();
				System.out.println("Nhập ngày vào làm : \n");
				String ngayVaoLam = ec.nextLine();
				String boPhanLamViec = "Manager";
				System.out.println("Nhập số ngày nghỉ phép : ");
				int ngayNghiPhep = sc.nextInt();
				System.out.println(
						"Nhập chuc danh quản lý (1 = Business Leader, 2 = Project Leader, 3 = Technical Leader) : \n");
				int nhapvao = sc.nextInt();
				String chucDanh = "";
				if (nhapvao == 1) {
					chucDanh = "Business Leader";
				} else if (nhapvao == 2) {
					chucDanh = "Project Leader";
				} else if (nhapvao == 3) {
					chucDanh = "Technical Leader";
				}
				Manager ql = new Manager(maNhanVien, tenNhanVien, tuoiNhanVien, hsl, ngayVaoLam, boPhanLamViec,
						ngayNghiPhep, chucDanh);
				dsnv.themQuanLy(ql);

			} else if (luacChon == 3) {
//				3.Hiển thị danh sách nhanh viên
				dsnv.inDanhSach();
			} else if (luacChon == 4) {
//				4.Hiển thị danh sách nhanh viên theo từng bộ phận
				dsnv.inDanhSachTheoBoPhan();
			} else if (luacChon == 5) {
//				5.Tìm kiếm nhân viên theo tên.
				System.out.println("Nhập tên nhân viên cần tìm");
				String tenNv = ec.nextLine();
				dsnv.timNhanVien(tenNv);
			} else if (luacChon == 6) {
//				6.Tìm kiếm nhân viên theo mã nv.
				System.out.println("Nhập tên nhân viên cần tìm");
				String maNv = ec.nextLine();
				dsnv.timNhanVienMaNv(maNv);
			} else if (luacChon == 7) {
//				7. Hiển thị bộ phận
				dsnv.inDanhSachBoPhan();
			} else if (luacChon == 8) {
//				7. Hiển thị bộ phận
				dsnv.inRaBangLuong();
			} else if (luacChon == 9) {
//				9. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần
				dsnv.sapXepTang();
				dsnv.inDanhSach();
			} else if (luacChon == 10) {
//				9. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần
				dsnv.sapXepGiam();
				dsnv.inDanhSach();
			}

		} while (luacChon != 0);
	}

}
