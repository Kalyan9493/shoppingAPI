package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>
{
		
	@Query("select p from product p where p.os like  %:os% AND p.catagory like %:catagory%")
	public List<Product> findByCatagoryAndOs(@Param("os")String os,@Param("catagory") String catagory); 

	
}
