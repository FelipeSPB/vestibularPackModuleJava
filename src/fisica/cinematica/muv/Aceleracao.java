package fisica.cinematica.muv;

import java.text.DecimalFormat;

public interface Aceleracao {

    DecimalFormat format = new DecimalFormat("0.##");

    static String discoveringA(double deltaT, double deltaV){
        double a = deltaV/deltaT;
        return format.format(a);
    }

    static String discoveringDeltaV(double a, double deltaT){
        double deltaV = deltaT*a;
        return format.format(deltaV);
    }

    static String discoveringDeltaT(double a, double deltaV){
        double deltaT = deltaV/a;
        return format.format(deltaT);
    }

}
