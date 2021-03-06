package com.xiaoxiaojiayuan.fsd.weather;

/**
 * @author Xiaofan Wang
 * @since 2021-07-01
 */
public class TempLayer {
    private int ceiling;
    private int temp;

    public TempLayer() {
    }

    public TempLayer(int ceiling) {
        this.ceiling = ceiling;
    }

    public int getCeiling() {
        return ceiling;
    }

    public void setCeiling(int ceiling) {
        this.ceiling = ceiling;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
