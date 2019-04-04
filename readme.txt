1、打开apache-tomcat-8-solr\webapps\solr\WEB-INF下面的web.xml 
将solrHome的路径复制到
<env-entry-value>D:\solr\solrHome</env-entry-value>
然后启动tomcat 浏览http://localhost:8880/solr/index.html即可
2、solr-5.5.5是本次的版本
3、中文分词器是本次的版本