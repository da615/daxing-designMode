package com.daxing.design.model06;

public class MaleHumanFactory extends AbstractHumanFactory {

    public Human createBlackHuman(){
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
    public Human createWhiteHuman(){
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }
    public Human createYellowHuman(){
        return super.createHuman(HumanEnum.YellowMaleHuman);
    }

}
