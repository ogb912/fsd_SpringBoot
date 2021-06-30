package com.xiaoxiaojiayuan.fsd.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiaofan Wang
 * @since 2021-07-01
 */
public class PMan {
    private final static Logger LOGGER = LoggerFactory.getLogger(PMan.class);

    public static List<Process> processes = new ArrayList<>();

    private boolean busy;

    public PMan() {
        busy = false;
    }

    public void registerProcess(Process process) {
        processes.add(process);
    }

    public void run() {
        for (Process process : processes) {
            if (process.run()) {
                busy = true;
            }
        }
    }
}
