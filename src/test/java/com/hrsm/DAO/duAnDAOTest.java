package com.hrsm.DAO;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import com.hrsm.DAO.duAnDAO;
import com.hrsm.DAO.nhanVienDAO;
import com.hrsm.DAO.phongBanDAO;
import com.hrsm.Entity.duAn;
import com.hrsm.Entity.nhanVien;
import com.hrsm.Entity.phongBan;

public class duAnDAOTest {
    private static duAn u;
    duAnDAO dadao = new duAnDAO();
    static int count, index;

    @Rule
    public ErrorCollector ec = new ErrorCollector();

    public int countUser() {
	int temp = 0;
	try {
	    List<duAn> u = dadao.selectAll();
	    temp = u.size();

	} catch (Exception e) {
	    System.out.println(e);

	}
	return temp;
    }

    @BeforeClass
    public static void A() {
	u = new duAn();
    }

    @Test
    public void A0() throws SQLException {
	List<duAn> list = dadao.selectAll();
	index = countUser();
	assertEquals(index, list.size());
	System.out.println("Hiển thị danh sách user thành công");
    }

    @Before
    public void beforeDuan() {
	count = countUser();
	System.out.println(count);
    }

    @Test
    public void test() {
	try {
	    String MADA = "asdasd";
	    dadao.delete(MADA);
	} catch (Exception e) {
	    e.printStackTrace();

	}
	index = countUser();

	assertEquals(index, count);
	System.out.println("mã dự án không hợp lệ!");
    }

    @Test
    public void test1() {
	try {
	    String MADA = "";
	    dadao.delete(MADA);

	} catch (Exception e) {
	    e.printStackTrace();

	}
	index = countUser();

	assertEquals(index, count);
	System.out.println("chưa nhập mã dự án!");
    }

    @Test
    public void test2() {
	try {
	    String MADA = "DA016";
	    dadao.delete(MADA);

	} catch (Exception e) {
	    e.printStackTrace();

	}
	index = countUser();

	assertEquals(index, count - 1);
	System.out.println("xoá thành công!");
    }

}