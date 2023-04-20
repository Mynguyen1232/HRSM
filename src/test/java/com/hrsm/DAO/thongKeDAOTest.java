package com.hrsm.DAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hrsm.Entity.nhanVien;

@Generated(value = "org.junit-tools-1.1.0")
public class thongKeDAOTest {
    private thongKeDAO dao = new thongKeDAO();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetStaffInformationWithNull() throws Exception {
	String status = null;
	List<Object[]> result = dao.getStaffInformation(status);
	assertNotNull(result);
	System.out.println("Kiểm tra dữ liệu getStaffInformation null");
    }

    @Test
    public void testGetStaffInformationWithEmpty() throws Exception {
	String status = "";
	List<Object[]> result = dao.getStaffInformation(status);
	assertTrue(result.isEmpty());
	System.out.println("Kiểm tra dữ liệu getStaffInformation rỗng");
    }

    @Test
    public void testGetStaffInformationWithData() throws Exception {
	String status = "Nghỉ việc";
	List<Object[]> result = dao.getStaffInformation(status);
	assertEquals("NV01", result);
    }

    @Test
    public void testgetStaffProjectWithNull() throws Exception {
	String progress = null;
	int year = 0;
	List<Object[]> result = dao.getStaffProject(progress, year);
	assertNotNull(result);
	System.out.println("Kiểm tra dữ liệu getStaffProject null");
    }

    @Test
    public void testgetStaffProjectWithEmpty() throws Exception {
	String progress = "";
	int year = 0;
	List<Object[]> result = dao.getStaffProject(progress, year);
	assertTrue(result.isEmpty());
	System.out.println("Kiểm tra dữ liệu getStaffProject rỗng");
    }

    @Test
    public void testgetStaffSalaryWithNull() throws Exception {
	String status = null;
	int year = 0;
	List<Object[]> result = dao.getStaffSalary(status, year);
	assertNotNull(result);
	System.out.println("Kiểm tra dữ liệu getStaffSalary null");
    }

    @Test
    public void testgetStaffSalaryWithEmpty() throws Exception {
	String progress = "";
	int year = 0;
	List<Object[]> result = dao.getStaffSalary(progress, year);
	assertTrue(result.isEmpty());
	System.out.println("Kiểm tra dữ liệu getStaffSalary rỗng");
    }

}