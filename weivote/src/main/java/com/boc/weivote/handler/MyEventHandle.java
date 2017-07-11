package com.boc.weivote.handler;

import com.github.sd4324530.fastweixin.handle.EventHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.req.BaseEvent;

/**
 * Created by XAL16 on 2017-7-11.
 */
public class MyEventHandle implements EventHandle {
    @Override
    public BaseMsg handle(BaseEvent baseEvent) {
        return null;
    }

    @Override
    public boolean beforeHandle(BaseEvent baseEvent) {
        return false;
    }
}
