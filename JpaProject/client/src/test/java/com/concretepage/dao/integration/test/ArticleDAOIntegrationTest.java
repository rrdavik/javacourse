package com.concretepage.dao.integration.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.dao.IArticleDAO;
import com.concretepage.entity.Article;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleDAOIntegrationTest {

	@Autowired
	private IArticleDAO articleDAO;
	
	@Test
	public void testGetAllArticles() throws Exception{
		List<Article> articleList = articleDAO.getAllArticles();
		assertTrue(articleList.size()>0);
	}
	
	@Test
	@Transactional
	@Rollback(true)
	public void testAddArticle() throws Exception{
		Article article = new Article();
		article.setCategory("NEws");
		article.setTitle("New tiel");
		articleDAO.addArticle(article);
		assertTrue(article.getArticleId()>0);
	}
}
