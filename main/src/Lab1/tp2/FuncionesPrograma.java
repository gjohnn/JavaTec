package Lab1.tp2;

import java.util.Date;

public class FuncionesPrograma {

    public static String getFechaString(Date fecha) {
        String fechaToString = String.valueOf(fecha);
        return fechaToString;
    }

    public static Date getFechaDate(int dia, int mes, int anio) {
        anio = anio - 1900;
        Date intToDate = new Date(anio, mes, dia);
        return intToDate;
    }

}
