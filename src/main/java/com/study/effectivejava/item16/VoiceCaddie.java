package com.study.effectivejava.item16;

public class VoiceCaddie {

    public static class VcSoft {
        public double 초코에몽;
        private double 미쯔;
    }

    public VcSoft getVCsoft() {
        VcSoft vcSoft = new VcSoft();
        vcSoft.초코에몽 = 1.2;
        vcSoft.미쯔 = 5.5;

        return vcSoft;
    }

    public double get초코에몽Count() {
        return getVCsoft().초코에몽;
    }

}
