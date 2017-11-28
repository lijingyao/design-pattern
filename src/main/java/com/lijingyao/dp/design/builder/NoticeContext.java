package com.lijingyao.dp.design.builder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lijingyao on 15/12/16 15:12.
 */
public class NoticeContext {


    Map<String, String> contextMap;

    public NoticeContext(Builder builder) {
        this.contextMap = builder.context;
    }

    public Map<String, String> getContextMap() {
        return contextMap;
    }

    public static class Builder {

        Map<String, String> context;

        public Builder(Map<String, String> context) {
            if (null == context) {
                this.context = new HashMap<>();
            } else {
                this.context = context;
            }
        }

        public Builder withNick(String nick) {
            this.context.put(Keys.USER_NICK, nick);
            return this;
        }

        public Builder withId(Long uid) {
            this.context.put(Keys.USER_ID, uid.toString());
            return this;
        }

        public NoticeContext build() {
            return new NoticeContext(this);
        }

    }

    class Keys {
        private static final String USER_NICK = "userNick";
        private static final String USER_ID = "userId";
    }


}
