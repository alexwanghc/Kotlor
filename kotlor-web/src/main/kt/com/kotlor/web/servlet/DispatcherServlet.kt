package com.kotlor.web.servlet


import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class DispatcherServlet: HttpServlet() {
    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        resp?.writer?.println("init jetty server!")
        //super.doGet(req, resp)
    }
}