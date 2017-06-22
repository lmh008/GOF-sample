package com.github;

import java.util.Map;

public class HTMLFilter implements Filter {

    @Override
    public void doFilter(Request request, FilterChain filterChain) {
        request.setRqtStr(request.getRqtStr().replace("<", "[").replace(">", "]"));
        filterChain.doFilter(request, filterChain);
    }
}
