package com.hrsm.DAO;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.hrsm.Entity.nhanVien;
import com.hrsm.Utils.XDate;

public class nhanVienDAOTest {
    nhanVienDAO nvDao = new nhanVienDAO();

    @Test
    public void A0() throws SQLException {
	List<nhanVien> list = nvDao.selectAll();
	assertEquals(72, list.size());
	System.out.println("Hiển thị danh sách nhân viên thành công");
    }

    @Test(expected = Exception.class)
    public void testInsert1() {
	nhanVien model = new nhanVien();
	nvDao.insert(model);

    }

    @Test(expected = Exception.class)
    public void testInsertNull() {
	nhanVien model = null;
	nvDao.insert(model);
    }

    @Test
    public void testInsertWithValidModel() {
	nhanVien model = new nhanVien();
	model.setMaNV("NV0119");
	model.setHoTen("Mai Chi Tho");
	model.setGioiTinh(true);
	model.setNgaySinh(XDate.toDate("20/12/2000", "dd/MM/yyyy"));
	model.setCMND("222200345");
	model.setEmail("mai@gmail.com");
	model.setDiaChi("Phu Tho");
	model.setSoDT("0987324567");
	model.setChucVu(true);
	model.setLoaiHinh_LV("Chính thức");
	model.setQuocTich("Viet Nam");
	model.setTrangThai("Làm việc");
	model.setTenPB("Phong dieu che");
	model.setHinhAnh("");
	nvDao.insert(model);

    }
}