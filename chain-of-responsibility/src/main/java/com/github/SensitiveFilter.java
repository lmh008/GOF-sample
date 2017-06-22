package com.github;

import java.util.Map;

public class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, FilterChain filterChain) {
        request.setRqtStr(request.getRqtStr().replace("敏感", ""));
        filterChain.doFilter(request, filterChain);
    }
}
