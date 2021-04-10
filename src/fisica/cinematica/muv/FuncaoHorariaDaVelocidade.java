package fisica.cinematica.muv;

import java.text.DecimalFormat;

public interface FuncaoHorariaDaVelocidade {
    DecimalFormat format = new DecimalFormat("0.##");

    static String discoveringFinalV(double vo, double a, double t){
        double v = vo +(a*t);
        return format.format(v);
    }

    static String discoverVo(double v, double a, double t){
        double vo = v - (a*t);
        return format.format(vo);
    }

    static String discoverT(double v, double vo,double a){
        double t = (v - vo)/a;
        return format.format(t);
    }


    static String discoverA(double v, double vo, double t){
        double a = (v-vo)/t;
        return format.format(a);
    }
}
