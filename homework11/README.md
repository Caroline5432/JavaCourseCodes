# 第十一周学习笔记
***
### 1.基于Redis封装分布式数据操作：
- [x] （必做）基于Redis封装分布式数据操作：
 - [x] 1）在Java中实现一个简单的分布式锁；
 - [x] 2）在Java中实现一个分布式计数器，模拟减库存。

代码及详情地址：[redis-lock](http://github.com/Caroline5432/JavaCourseCodes/tree/master/homework/redis/redis-lock)

### 2.基于Redis的PubSub实现订单异步处理
- [x] 基于Redis的PubSub实现订单异步处理

代码及详情地址：[redis-pubsub](http://github.com/Caroline5432/JavaCourseCodes/tree/master/homework/redis/redis-pubsub)

## 其他
### Redis docker 的简便使用
```bash
# 下载并运行redis，映射到宿主机端口
docker run -dit --name redis -p 6379:6379 redis

# 查看运行日志
docker logs -f redis

# 使用的客户端连接redis
docker exec -ti redis redis-cli -h 192.168.101.104 -p 6379
```