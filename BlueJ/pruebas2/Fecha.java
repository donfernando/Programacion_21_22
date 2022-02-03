public class Fecha {
    static String[] nombreMeses = { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre" };
    private int dia, mes, anio;

    public static boolean esBisiesto(int anio) {
        return anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0;
    }

    public Fecha(int dia, int mes, int anio) {
        setFecha(dia, mes, anio);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setFecha(int dia, int mes, int anio) {
        int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anio == 0)
            throw new RuntimeException();
        if (esBisiesto(anio))
            diasPorMes[2] = 29;
        if (dia > diasPorMes[mes])
            throw new RuntimeException();
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void incrementar() {
        int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (esBisiesto(this.anio))
            diasPorMes[2] = 29;
        if (dia < diasPorMes[mes]) {
            dia++;
        } else {
            dia = 1;
            if (mes < 12) {
                mes++;
            } else {
                mes = 1;
                if (anio == -1)
                    anio = 1;
                else
                    anio++;
            }
        }
    }

    public void decrementar() {
        int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (esBisiesto(this.anio))
            diasPorMes[2]++;

        if (dia > 1) {
            dia--;
        } else {

            if (mes > 1) {
                mes--;
            } else {
                mes = 12;
                if (anio == 1)
                    anio = -1;
                else
                    anio--;
            }
            dia = diasPorMes[mes];
        }
    }

    public static int diferencia(Fecha a, Fecha b) {
        return dias(b) - dias(a);
    }

    private static int dias(Fecha f) {
        int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int i, numDias;
        final int BISIESTOS_CADA_400 = 97;
        int numBisiestos, numNoBisiestos;
        int anioAnterior, resto;
        if (esBisiesto(f.anio))
            diasPorMes[2] = 29;
        anioAnterior = f.anio - 1;
        numBisiestos = anioAnterior / 400 * BISIESTOS_CADA_400;
        resto = anioAnterior % 400;
        numBisiestos += resto / 4 - resto / 100;
        numNoBisiestos = anioAnterior - numBisiestos;

        numDias = numBisiestos * 366 + numNoBisiestos * 365;

        for (i = 1; i < f.mes; i++)
            numDias += diasPorMes[i];
        return numDias + f.dia;
    }

    @Override
    public String toString() {
        String s;
        s = this.dia + " de " + nombreMeses[this.mes] + " de " + this.anio;
        return s;
    }
	@Override
    public boolean equals(Object obj) {
		Fecha f = (Fecha)obj;
		return dia==f.dia & mes==f.mes & anio==f.anio ;
    }

}
