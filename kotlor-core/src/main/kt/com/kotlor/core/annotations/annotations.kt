package com.kotlor.core.annotations

/**
 * Indicates that a class is Kotlor Component,
 * if a class is annotated with this annotation this class will be initialize and auto inject.
 * @author Wang Haocheng
 */
annotation class Component


/**
 * Indicates that a member variable will be auto inject by type
 * @author Wang Haocheng
 */
annotation class Typed


/**
 * Indicates that a member variable will be auto inject by name
 * @author Wang Haocheng
 */
annotation class Named