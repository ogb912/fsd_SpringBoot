package com.xiaoxiaojiayuan.fsd.process;

import java.nio.channels.SelectableChannel;
import java.nio.channels.Selector;
import java.util.Set;

/**
 * @author Xiaofan Wang
 * @since 2021-07-01
 */
public abstract class Process {

    public Process() {
    }

    public abstract boolean run();
}
