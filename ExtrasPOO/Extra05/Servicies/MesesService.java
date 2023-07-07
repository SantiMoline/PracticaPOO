package ExtrasPOO.Extra05.Servicies;

import ExtrasPOO.Extra05.Entities.Meses;

public class MesesService {
    private Meses meses = new Meses();


    public boolean esMesSecreto(String mes) {
        return mes.equalsIgnoreCase(meses.getMesSecreto());
    }

    public Meses getMeses() {
        return this.meses;
    }

}
