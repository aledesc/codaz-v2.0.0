package com.srvw.sse.util;

/**
 * Usada como DTO entre app Android and webservice
 * @author erik
 *
 */
public class FormInspeccionHttpPost
{
    private Integer id;
    private String articles;
    
    public FormInspeccionHttpPost(Integer id, String articles)
    {
        super();
        this.id = id;
        this.articles = articles;
    }
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getArticles()
    {
        return articles;
    }
    public void setArticles(String articles)
    {
        this.articles = articles;
    }
}
