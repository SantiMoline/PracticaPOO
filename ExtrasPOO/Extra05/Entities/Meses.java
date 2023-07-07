package ExtrasPOO.Extra05.Entities;


public class Meses {
    public static final String[] meses = 
                                {"Enero","Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
                                "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private String mesSecreto;

    public Meses() {
        mesSecreto = meses[(int)(Math.random() * 12)];
    }

    public Meses(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }    

    public String getMesSecreto() {
        return this.mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    //toString
    public String toString() {
        return "Mes secreto: " + this.mesSecreto;
    }
}
