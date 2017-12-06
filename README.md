# public_projects
some public projects ----maven
## 1 c3p0 使用c3p0 dataSource demo的maven java
## 2 ssm  ssm 环境搭建demo
## 3 qiuxx-ssmdz  springmvc+mybatis+spring+dubbo+zookeeper搭建环境，内含一个小demo--对user表进行增删改查操作
    启动顺序， 1）maven install qiuxx-ssmdz-api              一些bean与interface
              2) maven install qiuxx-ssmdz-orm-user         user orm，dao层
              3）maven install qiuxx-ssmdz-service-user      user service
              4) 运行qiuxx-ssmdz-service-user中的maven方法    启动服务
              5）run jetty qiuxx-ssmdz-server                启动消费
