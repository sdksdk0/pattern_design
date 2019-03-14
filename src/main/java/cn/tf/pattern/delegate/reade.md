
例子1：AbstractApplicationContext类

这里使用了委派设计模式，父类定义了抽象的refreshBeanFactory()方法，具体实现调用子类容器的refreshBeanFactory()方法
    
    protected ConfigurableListableBeanFactory obtainFreshBeanFactory() {
    		refreshBeanFactory();
    		ConfigurableListableBeanFactory beanFactory = getBeanFactory();
    		if (logger.isDebugEnabled()) {
    			logger.debug("Bean factory for " + getDisplayName() + ": " + beanFactory);
    		}
    		return beanFactory;
    	}
    

例子2：AbstractRefreshableApplicationContext类


    @Override
    	protected final void refreshBeanFactory() throws BeansException {
    		//如果已经有容器，销毁容器中的bean，关闭容器
    		if (hasBeanFactory()) {
    			destroyBeans();
    			closeBeanFactory();
    		}
    		try {
    			//创建IOC容器
    			DefaultListableBeanFactory beanFactory = createBeanFactory();
    			beanFactory.setSerializationId(getId());
    			//对IOC容器进行定制化，如设置启动参数，开启注解的自动装配等
    			customizeBeanFactory(beanFactory);
    			//调用载入Bean定义的方法，主要这里又使用了一个委派模式，在当前类中只定义了抽象的loadBeanDefinitions方法，具体的实现调用子类容器
    			loadBeanDefinitions(beanFactory);
    			synchronized (this.beanFactoryMonitor) {
    				this.beanFactory = beanFactory;
    			}
    		}
    		catch (IOException ex) {
    			throw new ApplicationContextException("I/O error parsing bean definition source for " + getDisplayName(), ex);
    		}
    	}


类图关系：

![](https://i.imgur.com/J9ksQzo.png)


