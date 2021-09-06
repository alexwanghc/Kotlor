package com.kotlor.core.base

/**
 * Lifecycle Interface for some startable components.
 * @author Wang Haocheng
 */
interface LifeCycle {
    fun start()
    fun destroy()
    fun init()
}
