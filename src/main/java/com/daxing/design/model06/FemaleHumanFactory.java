package com.daxing.design.model06;

public class FemaleHumanFactory extends AbstractHumanFactory {
    public Human createBlackHuman(){
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }
    public Human createWhiteHuman(){
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }
    public Human createYellowHuman(){
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }

}
