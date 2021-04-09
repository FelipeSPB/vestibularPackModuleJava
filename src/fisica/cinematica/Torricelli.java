package fisica.cinematica;

import java.text.DecimalFormat;

public interface Torricelli {
    DecimalFormat format = new DecimalFormat("0.##");


    static String discoveringFinalV(double vo, double a, double deltaS) {
        double v = java.lang.Math.sqrt(((java.lang.Math.pow(vo, 2)) + (2*a*deltaS)));
        return format.format(v);
    }

    static String discoverVo(double v, double a, double deltaS){
        double vo = java.lang.Math.sqrt((java.lang.Math.pow(v,2) - (2*a*deltaS)));
        return format.format(vo);
    }

    static String discoverDeltaS(double vo,double v, double a ){
        double deltaS = ((java.lang.Math.pow(v,2) - (java.lang.Math.pow(vo,2)))/(2*a));
        return format.format(deltaS);
    }

    static String discoverA (double vo, double v, double deltaS){
        double a = ((java.lang.Math.pow(v,2) - (java.lang.Math.pow(vo,2)))/(2*deltaS));
        return format.format(a);
    }



}
