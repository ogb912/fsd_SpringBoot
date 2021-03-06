package com.xiaoxiaojiayuan.fsd;

import com.xiaoxiaojiayuan.fsd.constants.FsdPath;
import com.xiaoxiaojiayuan.fsd.support.Support;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * @author Xiaofan Wang
 * @since 2021-07-01
 */

@SpringBootApplication
public class FsdApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(FsdApplication.class);


    public static void main(String[] args) {
        String property = System.getProperty("user.dir");
        Path path = Paths.get(FsdPath.PATH_FSD_CONF);
        File file = new File(FsdPath.PATH_FSD_CONF);
        LOGGER.info(String.format("Using config file: %s", file.getAbsolutePath()));
        String configFile = FsdPath.PATH_FSD_CONF;
        doSignals();
        run(configFile);
    }

    private static void run(String configFile) {
        Fsd fsd = new Fsd(configFile);
        while (true) {
//            try {
            fsd.run();
//            } catch (Exception e) {
//                LOGGER.error("Unhandled exception: ", e);
//            }
        }
    }

    private static void doSignals() {
        Support.startTimer();
    }
}
