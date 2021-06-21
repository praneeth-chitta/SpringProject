package com.ecomm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.ecomm.entity.Supplier;
@Repository("SupplierDAO")
public class SupplierDAOImpl implements SupplierDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
    @Transactional
	@Override
	public boolean addSupplier(Supplier supplier) 
    {
    	try {
			sessionFactory.getCurrentSession().save(supplier);
			return true;	
		}catch(Exception e) 
		{
			System.out.println(e);
		return false;
		}
	}

	@Override
	public boolean deleteSupplier(Supplier supplier) 
	{
		try
		{
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}

	@Override
	public boolean updateSupplier(Supplier supplier)
	{
		try
		{
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;		
		}
	}
    @Transactional
	@Override
	public List<Supplier> getSuppliers()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Supplier");
		List<Supplier> supplierList=query.list();
		session.close();
		return supplierList;
	}

	@Override
	public Supplier getSupplier(int supplierId)
	{
		Session session=sessionFactory.openSession();
		Supplier supplier=(Supplier)session.get(Supplier.class,supplierId);
        session.close();
		return supplier;
	}
	

}
