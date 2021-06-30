package com.xiaoxiaojiayuan.fsd.manager;

/**
 * @author Xiaofan Wang
 * @since 2021-07-01
 */
public class ManageVar {
    private int type;

    private String name;

    private ManageVarValue value;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ManageVarValue getValue() {
        return value;
    }

    public void setValue(ManageVarValue value) {
        this.value = value;
    }
}
