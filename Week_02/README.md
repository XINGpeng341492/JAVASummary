Nio,线程模型，Netty
第二周总结：
1.本地手撕各种GC以及参数设置不同，经压测后观察对应表现
 serial  适用于clinet端使用
 parallel  并行吞吐量优先
 concMarkSweepGC 响应时间优先
 G1 在Xmx Xms 4G以上时候吞吐量与响应时间表现都不错
  
 ZGC
 
 总结：实际使用时候需根据预估自己系统所需的吞吐量 或者 延时是具体要求而详细压测后进行选型即可，可根据经验如果没有特殊要求线配置经验值，具体根据监控指标进行进一步的调整GC或者参数
  
  

2.Netty 初步理解
 
 IO模型
 reactor 三种编程模式
 netty对bio 与 nio的支持
 netty 对主从reactor编程模型的支持
 同步与异步： 业务处理方式，基于回调
 阻塞与非阻塞：针对线程 线程是否run

Netty对nio的封装，屏蔽网络连接，线程分配，与业务做到隔离

