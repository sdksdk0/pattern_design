#设计模式总结

##用一句话总结自己掌握的设计模式
- 工厂模式：直接从工厂里面提货，而不用去管这些货物是怎么做出来的
- 单例模式：你是我的唯一
- 原型模式：方便复制复杂对象
- 代理模式：买火车票不一定在火车站买，也可以去代售点
- 策略模式：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
- 模板模式：一些方法通用，却在每一个子类都重新写了这一方法。
- 委派模式：劳务外包，活你干，但钱我拿
- 适配器模式：兼容转换
- 装饰器模式：包装，例如对房子进行装修
- 观察者模式：任务完成时通知。例如当客流人数超过预警值时触发客流预警通知。


##例举SpringAOP、IOC、DI应用的代码片段
- AOP
   。总结事物的规律，开发时候将其规律分离，单独处理，使用的时候再将其合并在一起组成整体,解耦，专人做专事.

    	@Pointcut("execution(* cn.tf.pattern.spring.aop.service..*(..))")
    	public void aspect(){	}
    
    	@Before("aspect()")
        public void before(JoinPoint joinPoint){}


- IOC。将 new 对象的动作交给 Spring 管理，并由Spring 保存已创建的对象（IOC 容器）。

`
       
	  @Autowired
       private UserService userService;
`

- DI.依赖注入。依赖注入、依赖查找，Spring 不仅保存自己创
建的对象，而且保存对象与对象之间的关系


	    @Value("${baidu.baidu-token-url}")
        private  String tokenUrl;