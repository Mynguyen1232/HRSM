package com.hrsm.DAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.processing.Generated;

import org.junit.Test;

import com.hrsm.Entity.phongBan;

@SuppressWarnings("unused")
@Generated(value = "org.junit-tools-1.1.0")
public class phongBanDAOTest { 	
    private phongBanDAO dao = new phongBanDAO();
    
    private phongBanDAO createTestSubject() {
	return new phongBanDAO();
    }

    @Test
    public void testSelectByKeywordWithNull() throws Exception {
	String keyword = null;
	phongBan expected = null;
	List<phongBan> result = dao.selectByKeyword(keyword);
	assertNotNull(result);

    }
    
    @Test
    public void testSelectByKeywordWithEmpty() throws Exception {
	String keyword = "";
	phongBan expected = null;
	List<phongBan> result = dao.selectByKeyword(keyword);
	assertEquals(keyword, result);

    }
}