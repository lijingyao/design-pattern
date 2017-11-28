package com.lijingyao.dp.design.builder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lijingyao on 15/12/16 15:13.
 */
public class BuilderDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world");
        NoticeContext key = new NoticeContext.Builder(map).withId(111l).withNick("yamada").build();
        key.getContextMap().entrySet().stream().forEach(c -> System.out.println(c.toString()));
    }
}
