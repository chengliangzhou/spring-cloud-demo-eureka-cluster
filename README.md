# spring-cloud-demo-eureka-cluster
<h2>spring eureka注册中心Demo (集群)</h2>
<p>模块简介</p>
<ul>
  <li>server01,02,03 --> 注册中心集群</li>
  <li>provider01 --> 服务提供者</li>
  <li>consumer01 --> 服务消费者</li>
</ul>
<p>ps: 如果在一台机器上演示，需要修改hosts文件中localhost域名，增加如下内容</p>
<p>127.0.0.1       registry-center-1</p>
<p>127.0.0.1       registry-center-2</p>
<p>127.0.0.1       registry-center-3</p>
