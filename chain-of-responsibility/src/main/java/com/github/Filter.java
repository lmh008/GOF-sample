package com.github;

import java.util.Map;

public interface Filter {

    void doFilter(Request request, FilterChain filterChain);
}
