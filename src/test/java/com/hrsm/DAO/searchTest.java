package com.hrsm.DAO;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.hrsm.DAO.duAnDAO;
import com.hrsm.DAO.nhanVienDAO;
import com.hrsm.DAO.phongBanDAO;
import com.hrsm.Entity.duAn;
import com.hrsm.Entity.nhanVien;
import com.hrsm.Entity.phongBan;

public class searchTest {
    nhanVienDAO nvdao = new nhanVienDAO();
    public int index, count;

    @Test
    public void findByIdWithId() {

	List<nhanVien> resultlist = nvdao.selectAll();

	assertEquals("NV02", resultlist.get(1).getMaNV());
	System.out.println("Tìm Thành Công!");
    }

    @Test
    public void findnulls() {
	String manv = "";

	nhanVien Result = nvdao.selectById(manv);
	assertEquals("", Result);
	System.out.println("Chưa nhập dữ liệu!");

    }

    public int countUser() {
	int temp = 0;
	try {
	    List<nhanVien> u = nvdao.selectAll();
	    temp = u.size();

	} catch (Exception e) {
	    System.out.println(e);

	}
	return temp;
    }

    @Test
    public void finderror() {

	List<nhanVien> resultlist = nvdao.selectAll();

	assertEquals("abc", resultlist.get(1).getMaNV());
	System.out.println("Tìm Thành Công!");

    }
}
