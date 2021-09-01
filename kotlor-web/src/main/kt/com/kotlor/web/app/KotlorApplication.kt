package com.kotlor.web.app

import com.kotlor.web.servlet.DispatcherServlet
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.server.ServerConnector
import org.eclipse.jetty.servlet.ServletHandler
import org.eclipse.jetty.webapp.WebAppContext


object KotlorApplication {

    private lateinit var server: Server

    @Suppress("MemberVisibilityCanBePrivate")
    fun createServer(port: Int): Server {
        server = Server(port).apply {
            stopAtShutdown = true
            val connector = ServerConnector(server).apply {
                this.port = port
                reuseAddress = false
            }
            connectors = arrayOf(connector)
            val servletHandler = ServletHandler().apply {
                addServletWithMapping(DispatcherServlet::class.java, "/*")
            }
            server.handler = servletHandler
        }
        return server
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val createServer = createServer(8000)
        createServer.apply {
            start()
            join()
        }
    }
}