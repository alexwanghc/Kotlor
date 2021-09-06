package com.kotlor.core.beans

import com.kotlor.core.base.LifeCycle
import com.kotlor.core.exception.BeanException
import java.util.concurrent.ConcurrentHashMap

/**
 * Kotlor core context
 * @author Wang Haocheng
 */
object KotlorApplicationContext: LifeCycle {

    /**
     * Kotlor lightweight beans factory
     */
    private lateinit var beanFactory: MutableMap<String, Any>


    /**
     * this function will be call when application start.
     */
    override fun start() {

    }

    /**
     * this function will be call when application destroy.
     */
    override fun destroy() {

    }

    /**
     * this function will be call when application initialize.
     */
    override fun init() {
        beanFactory = ConcurrentHashMap(256)
        //TODO 1、IoC：扫描包、解析注解，将所有bean初始化，并置入工厂类
        //TODO 2、DI：依赖注入，解析bean中带有自动注入的注解，从工厂类中取出赋值

    }


    /**
     * put bean into bean factory
     */
    public fun putBean(beanName: String, bean: Any){
        if (beanFactory.containsKey(beanName))
            throw BeanException("bean '$beanName' repeat put into bean factory")
        beanFactory[beanName] = bean
    }

    /**
     * get bean from bean factory
     */
    public fun getBean(beanName: String): Any {
        return beanFactory[beanName]?:throw BeanException("bean '$beanName' not found in bean factory!")
    }
}