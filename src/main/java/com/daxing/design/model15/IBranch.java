package com.daxing.design.model15;

import java.util.ArrayList;

public interface IBranch {
    public void addSubordinate(ICorp iCorp);
    public ArrayList<ICorp> getSubordinate();

}
