package com.roncoo.example101.util.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 自定义filter
 * 
 * @author wujing
 */
@WebFilter(urlPatterns="/*")
public class CustomFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init filter");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(((HttpServletRequest)request).getRequestURI()+ "do filter");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("destroy filter");
	}

}
