# spring-cloud-alibaba
## 本项目主要记录Alibaba版的SpringCloud的实战
#### sudo ./startup.sh -m standalone 启动nacos
### 版本节点：
#### 1.0.6.0917(20190917)
增加全局过滤器。
#### 1.0.5.0826(20190826)
增加spring cloud gateway路由网关，以及增加熔断器。
#### 1.0.4.0825(20190825)
版本描述:使用spring cloud alibab毕业版本（2.1.0.RELEASE）jar，spring boot 改为：2.1.7.RELEASE。项目接口调用改为feign接口方式。备注：NACOS版本为：1.1.3
#### 1.0.3.0804(20190824)
版本描述:修改父项目依赖，修改配置中心为yaml配置（此时nacos的0.9.0.release不能用）
#### 1.0.2.0309(20190309)
版本描述:集成统计配置中心
#### 1.0.1.0127(20190127)
版本描述:更改项目间的依赖关系，更改日志文件框架
#### 1.0.0.0124(20190124)
版本描述:完成服务注册和消费（客户端采用RestTemplate和loadBalancerClient.choose方法）
补充：nacos采用0.8.0(0.7.0亦可)，spring-boot版本（2.1.1.RELEASE）
