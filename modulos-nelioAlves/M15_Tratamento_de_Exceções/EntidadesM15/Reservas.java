package EntidadesM15;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import Excessões.Excessões_de_Domínio;


public class Reservas {

    private Integer número_do_quarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservas(Integer número_do_quarto, Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new Excessões_de_Domínio("O check-out deve ser depois da check-in");
        }
        this.número_do_quarto = número_do_quarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNúmero_do_quarto() {
        return número_do_quarto;
    }

    public void setNúmero_do_quarto(Integer número_do_quarto) {
        this.número_do_quarto = número_do_quarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duração() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void datasATT(Date checkIn, Date checkOut) {
        Date agora = new Date();
        if (checkIn.before(agora) || checkOut.before(agora)) {
            throw new Excessões_de_Domínio("A atualização das datas das reservas devem ser somente para datas futuras");
        }
        if (!checkOut.after(checkIn)) {
            throw new Excessões_de_Domínio("O check-out deve ser depois da check-in");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Quarto "
                + número_do_quarto
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duração()
                + " noites";
    }
}
