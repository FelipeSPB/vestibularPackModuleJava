package fisica.cinematica.muv;

import java.text.DecimalFormat;

public interface FuncaoHorariaDoEspaco {

    DecimalFormat format = new DecimalFormat("0.##");

    static String discoveringS (double so, double vo, double t, double a){
        double s = so + (vo*t) + ((a*(java.lang.Math.pow(t,2)))/2);
        return format.format(s);
    }

    static String discoveringSo(double s, double vo, double t, double a){
        double so = s - (vo*t) - ((a*(java.lang.Math.pow(t,2)))/2);
        return format.format(so);
    }

    static String discoveringVo(double s, double so,double t, double a){
        double vo = (s - so - (((a*(java.lang.Math.pow(t,2)))/2)))/t;
        return format.format(vo);
    }

    static String discoveringA (double s, double so, double vo, double t){
        double a = ((2*s) - (2*so) - (2*(vo*t)))/java.lang.Math.pow(t,2);
        return format.format(a);
    }
}
