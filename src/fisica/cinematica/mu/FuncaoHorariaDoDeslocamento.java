package fisica.cinematica.mu;

import java.text.DecimalFormat;

public interface FuncaoHorariaDoDeslocamento {

    DecimalFormat format = new DecimalFormat("0.##");

    static String discoveringSFinal(double so,double v, double deltaT){
        double s = so + (v*deltaT);
        return format.format(s);
    }

    static String discoveringV(double s, double so, double deltaT){
        double v = (s - so)/deltaT;
        return format.format(v);
    }

    static String discoveringDeltaT(double s, double so, double v){
        double deltaT = (s - so)/v;
        return format.format(deltaT);
    }

}
