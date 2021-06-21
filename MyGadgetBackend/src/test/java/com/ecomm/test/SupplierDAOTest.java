package com.ecomm.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.persistence.Id;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.SupplierDAO;
import com.ecomm.entity.Supplier;

public class SupplierDAOTest 
{
	static SupplierDAO SupplierDAO;
	
	@BeforeClass
	public static void initilize()
	{
         AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		SupplierDAO=(SupplierDAO)context.getBean("SupplierDAO");
		
	}
	@Ignore
	@Test
	public void addSupplierTest()
	{
		Supplier supplier= new Supplier();
		supplier.setSupplierId(1121);
		supplier.setSupplierName("Ramu");
		supplier.setSupplierAddress(" 2-1-22,near Manjermall KPHP,Hyderbad ");
		
		assertTrue("Problem occured while adding supplier:",SupplierDAO.addSupplier(supplier));
	}
	@Ignore
	@Test
	public void updateSupplierTest()
	{
		Supplier supplier= new Supplier();
		supplier.setSupplierId(1122);
		supplier.setSupplierName("Ramu");
		supplier.setSupplierAddress(" 3-22 Gandhi nagar, KPHP,Hyderbad ");
		
		assertTrue("Problem occured while adding Product:",SupplierDAO.addSupplier(supplier));
	}
	@Ignore
	@Test
	public void deleteSupplierTest()
	{
		Supplier supplier=SupplierDAO.getSupplier(1121);
		assertTrue("Problem occured while adding Product:",SupplierDAO.addSupplier(supplier));
		
	}
	@Ignore
	@Test
	public void getSupplierTest()
	{
		List<Supplier> supplierList=SupplierDAO.getSuppliers();
		assertTrue("Problem occured while adding Product:",supplierList.size()>0);
		
		for(Supplier supplier:supplierList)
		{
			System.out.println("Supplier ID:"+supplier.getSupplierId());
			System.out.println("Supplier Name:"+supplier.getSupplierName());
			System.out.println("Supplier ADDRESS:"+supplier.getSupplierAddress());
			
		}
		
		
	}
	@Ignore
	@Test
	public void getSupplier()
	{
		Supplier supplier= SupplierDAO.getSupplier(1121);
		System.out.println("SupplierID:"+supplier.getSupplierId());
		System.out.println("Supplier Name:"+supplier.getSupplierName());
		System.out.println("Supplier Address"+supplier.getSupplierAddress());
		
	}
	
}
