package com.concretepage.dao.integration.test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.dao.IArticleDAO;
import com.concretepage.entity.Article;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArticleDAOIntegrationTest {

	static int articleId;
	
	@Autowired
	private IArticleDAO articleDAO;
	
	@Test
	public void test1GetAllArticles() throws Exception{
		List<Article> articleList = articleDAO.getAllArticles();
		assertTrue(articleList.size()>0);
	}
	
	@Test
	public void test2AddArticle() throws Exception{
		Article article = new Article();
		article.setCategory("NEws");
		article.setTitle("New tiel");
		articleDAO.addArticle(article);
		articleId = article.getArticleId();
		assertTrue(article.getArticleId()>0);
	}
	

	@Test
	public void test3GetArticleById() throws Exception{
		Article article = articleDAO.getArticleById(articleId);
		assertTrue(article.getArticleId()==articleId);
	}
	
	@Test
	public void test4UpdateArticle() throws Exception{
		
		// no hagas new... coge uno que haya... modificalo y recogelo... 
		
		Article article = articleDAO.getArticleById(articleId);
		Article article2= new Article();
		article2.setCategory(article.getCategory());
		article2.setTitle(article.getTitle());
	
		article.setTitle("Tecnological Wars");
		articleDAO.updateArticle(article);

		assertTrue(!article.getTitle().equals(article2.getTitle()));
	}
	
	@Test
	public void test5DeleteArticle() throws Exception{
		articleDAO.deleteArticle(articleId);
		Article article = articleDAO.getArticleById(articleId);
		assertNull(article);
	}
}
