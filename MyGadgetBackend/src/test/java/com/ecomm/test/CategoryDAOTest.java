package com.ecomm.test;

import static org.junit.Assert.assertTrue;


import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.CategoryDAO;
import com.ecomm.entity.Category;

public class CategoryDAOTest 
{
	static CategoryDAO CategoryDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.ecomm");
		context.refresh();
		
		CategoryDAO=(CategoryDAO)context.getBean("CategoryDAO");
	}
    @Ignore
	@Test
	public void addCategoryTest()
	{
		Category category = new Category();
		category.setCategoryId(1005);
		category.setCategoryName("Poco");
		category.setCategoryDesc("All 5G Mobiles with AI tech with best camera");
		
		assertTrue("Problem occured while adding Category:",CategoryDAO.addCategory(category));
		
	}
	@Ignore
	@Test
	public void updateCategoryTest()
	{
		Category category = CategoryDAO.getCategory(1003);
		category.setCategoryName("XiomiMobile");
		category.setCategoryDesc("All Xiomi Mobiles");
		assertTrue("Problem occured while adding Category:",CategoryDAO.updateCategory(category));
	}
	
	@Ignore
	@Test
	public void deleteCategoryTest()
	{
		Category category = CategoryDAO.getCategory(1005);
		assertTrue("Problem occured while deleting Category:",CategoryDAO.deleteCategory(category));
	}
	@Ignore
	@Test
	public void getCategoriesTest()
	{
		List<Category> categoryList = CategoryDAO.getCategories();
		assertTrue("Problem occured while Retrieving Categories:",categoryList.size()>0);
		
		for(Category category:categoryList)
		{
			System.out.print("Category ID  : "+category.getCategoryId());
			System.out.println("Category Name : "+category.getCategoryName());
		
		}
	}
	@Ignore
	@Test
	public void getCategory()
	{
		Category category = CategoryDAO.getCategory(1001);
		System.out.println("Category Id    : "+category.getCategoryId());
		System.out.println("Category Name  :  "+category.getCategoryName());
		System.out.println("Category Dest  :  "+category.getCategoryDesc());
	}
	
}	
	 