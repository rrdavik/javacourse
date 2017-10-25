package com.concretepage.repository.integration.test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.concretepage.entity.Dress;
import com.concretepage.entity.DressCategory;
import com.concretepage.repository.DressCategoryRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DressCategoryRepositoryIntegrationTest {

	
	@Autowired
	private DressCategoryRepository dressCategoryRepository;
	
	@Test
	public void test1SaveDressCategory() throws Exception{
		DressCategory dressCategory = new DressCategory("mini-falda");
		Set<Dress> dresses = new HashSet<Dress>(){{
			add(new Dress("elasctica", dressCategory));
			add(new Dress("cuero", dressCategory));
		}};
		dressCategory.setDresses(dresses);
		dressCategoryRepository.save(dressCategory);
		assertTrue(dressCategoryRepository.findAll().size()>0);
	}
}
