import fisica.cinematica.muv.FuncaoHorariaDoEspaco;
import fisica.cinematica.muv.Torricelli;
import fisica.cinematica.muv.FuncaoHorariaDaVelocidade;

public class main {

    public static void main(String[] args) {

       String v = Torricelli.discoveringFinalV(2,1,500);
       String vo = Torricelli.discoverVo(31.686,1,500);
       String deltaS = Torricelli.discoverDeltaS(2,31.686,1);
       String a = Torricelli.discoverA(2,31.686,500);
       String s = FuncaoHorariaDoEspaco.discoveringS(0,2,10,1);
       String so = FuncaoHorariaDoEspaco.discoveringSo(70,2,10,1);
       String voSorvete = FuncaoHorariaDoEspaco.discoveringVo(70,0,10,1);
       String aSorvetao = FuncaoHorariaDoEspaco.discoveringA(70,0,2,10);
       String vDoVovoAteu = FuncaoHorariaDaVelocidade.discoveringFinalV(2,1,10);
       String voDoVovoAteu = FuncaoHorariaDaVelocidade.discoverVo(12,1,10);
       String tempoVovoAteu = FuncaoHorariaDaVelocidade.discoverT(12,2,1);
       String aDoVovoAteu = FuncaoHorariaDaVelocidade.discoverA(12,2,10);


        System.out.println(v);
        System.out.println(vo);
        System.out.println(deltaS);
        System.out.println(a);
        System.out.println(s);
        System.out.println(so);
        System.out.println(voSorvete);
        System.out.println(aSorvetao);
        System.out.println(vDoVovoAteu);
        System.out.println(voDoVovoAteu);
        System.out.println(tempoVovoAteu);
        System.out.println(aDoVovoAteu);

    }
}