package com.daxing.design.model06;

public enum HumanEnum {
    YellowMaleHuman("com.daxing.design.model06.impl.YellowMaleHuman"),

    YellowFemaleHuman("com.daxing.design.model06.impl.YellowFemaleHuman"),

    WhiteFemaleHuman("com.daxing.design.model06.impl.WhiteFemaleHuman"),

    WhiteMaleHuman("com.daxing.design.model06.impl.WhiteMaleHuman"),

    BlackFemaleHuman("com.daxing.design.model06.impl.BlackFemaleHuman"),

    BlackMaleHuman("com.daxing.design.model06.impl.BlackMaleHuman");

    private String value = "";
    private HumanEnum(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}
