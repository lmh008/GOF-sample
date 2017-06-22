package com.github;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FilterChain implements Filter {

    private List<Filter> filters = new ArrayList<Filter>();
    private int index = 0;

    public FilterChain addFilter(Filter f) {
        this.filters.add(f);
        return this;
    }

    @Override
    public void doFilter(Request request, FilterChain filterChain) {
        if (index == filters.size()) return;
        Filter f = filters.get(index);
        index++;
        f.doFilter(request, filterChain);
    }
}
