package com.ecomm.test;

import com.ecomm.dao.ProductDAO;
import com.ecomm.entity.Product;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductDAOTest
{
	static ProductDAO ProductDAO;
	
	@BeforeClass
	public static void initilize()
	{
         AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		ProductDAO=(ProductDAO)context.getBean("ProductDAO");
		
	}
	@Ignore
	@Test
	public void addProductTest()
	{
		Product product= new Product();
		product.setProductId(102);
		product.setProductName("Goodday");
		product.setProductDesc("Eat goodday have a great day");
		
		assertTrue("Problem occured while adding Product:",ProductDAO.addProduct(product));
	}
	@Ignore
	@Test
	public void deleteProdductTest()
	{
		Product product = ProductDAO.getProduct(101);
		assertTrue("Problem occured while deleting Product:",ProductDAO.deleteProduct(product));
	}
	@Ignore
	@Test
	public void updateproductTest()
	{
		Product product=ProductDAO.getProduct(101);
		product.setProductName("sunfeast");
		product.setProductDesc("Good cookies with butter");
		
		assertTrue("problemoccured while Updateing Product:",ProductDAO.updateProduct(product));
	}
	@Ignore
	@Test
	public void getProductTest()
	{
		List<Product> productList = ProductDAO.getProducts();
		assertTrue("Problem occured while Retrieving Products:",productList.size()>0);
		
		for(Product product:productList)
		{
			System.out.print("Category ID  : "+product.getProductId());
			System.out.println("Category Name : "+product.getProductName());
		
		}
	}

	@Test
	public void getProduct()
	{
		Product product = ProductDAO.getProduct(101);
		System.out.println("Product Id    : "+product.getProductId());
		System.out.println("Product Name  :  "+product.getProductName());
		System.out.println("Product Desc  :  "+product.getProductDesc());
	}


}
