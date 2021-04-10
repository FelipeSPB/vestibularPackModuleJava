package fisica.cinematica.mu;

import java.text.DecimalFormat;

public interface VelocidadeMedia {

    DecimalFormat format = new DecimalFormat("0.##");

    static String discoveringVelocidadeMedia(double deltaS, double deltaT){
        double vm = deltaS/deltaT;
        return format.format(vm);
    }

    static String discoveringDeltaS(double vm,double deltaT){
        double deltaS = vm * deltaT;
        return format.format(deltaS);
    }

    static String discoveringDeltaT(double vm, double deltaS){
        double deltaT = deltaS/vm;
        return format.format(deltaT);

    }
}
