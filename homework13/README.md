# 第十三周学习笔记
***
## 作业详情(做完的点击后就跳转到作业详情)
- [x] [1、（必做）搭建一个3节点Kafka集群，测试功能和性能；实现spring kafka下对kafka集群的操作，将代码提交到github](http://github.com/Caroline5432/JavaCourseCodes/tree/master/homework/mq/kakfa-example)

- [x] [2、（必做）思考和设计自定义 MQ 第二个版本或第三个版本，写代码实现其中至少一个功能点，将代码提交到github](http://github.com/Caroline5432/JavaCourseCodes/tree/master/homework/mq/kakfa-example)

**工程地址：[http://github.com/Caroline5432/JavaCourseCodes/tree/master/homework/mq](http://github.com/Caroline5432/JavaCourseCodes/tree/master/homework/mq)**

### 第一个版本：内存 Queue
- [x] 1、基于内存Queue实现生产和消费API（已经完成）
  - [x] 1）创建内存Queue，作为底层消息存储
  - [x] 2）定义Topic，支持多个Topic
  - [x] 3）定义Producer，支持Send消息
  - [x] 4）定义Consumer，支持Poll消息

### 第二个版本：自定义 Queue
- [x] 2、去掉内存Queue，设计自定义Queue，实现消息确认和消费offset
  - [x] 1）自定义内存Message数组模拟Queue。
  - [x] 2）使用指针记录当前消息写入位置。
  - [x] 3）对于每个命名消费者，用指针记录消费位置。
