package com.kotlor.core.exception

import java.lang.RuntimeException

/**
 * Signals that an bean initialize and obtain exception of some sort has occurred.
 * @author Wang Haocheng
 */
class BeanException(message: String) : RuntimeException(message)