package filter;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class LogFilter extends HttpFilter implements Filter {

    public LogFilter() {
        super();
    }

    public void destroy() {
    }

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        chain.doFilter(request, response);

        // アクセスされた場所と日時を記録する
        System.out.println(((HttpServletRequest) request).getRequestURI() + ":" + LocalDateTime.now());
    }

    public void init(FilterConfig fConfig) throws ServletException {
    }

}
