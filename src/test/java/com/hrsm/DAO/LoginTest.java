package com.hrsm.DAO;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.hrsm.DAO.nguoiDungDAO;
import com.hrsm.Entity.nguoiDung;

public class LoginTest {
    nguoiDungDAO nddao = new nguoiDungDAO();

    @Test
    public void checklogin1() {
	String user = "NV01";
	String pass = "ahq";
	List<nguoiDung> nd = nddao.selectAll();

	assertEquals(user, nd.get(0).getTaiKhoan());
	assertEquals(pass, nd.get(0).getMatKhau());

	System.out.println("đã nhập đúng tài khoản và mật khẩu !");
    }

    @Test
    public void checksaitaikhoan() {
	try {
	    String taikhoan = "abc";
	    List<nguoiDung> nd = nddao.selectAll();

	    assertEquals(taikhoan, nd.get(0).getTaiKhoan());
	} catch (Exception e) {
	    e.printStackTrace();
	}

//	String expected = "NV01";

    }

    @Test
    public void checksaimatkhau() {
	try {
	    String pass = "123";
	    List<nguoiDung> nd = nddao.selectAll();

	    assertEquals(pass, nd.get(0).getMatKhau());
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }
}