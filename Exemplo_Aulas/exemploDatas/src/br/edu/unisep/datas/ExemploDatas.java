package br.edu.unisep.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExemploDatas {
    public static void main(String[] args) throws ParseException {

        var agora = new Date();
        System.out.println(agora.getTime());

        var cal = Calendar.getInstance();
        cal.set(1991, Calendar.MARCH, 16);
        var nascimento = new Date(cal.getTimeInMillis());
        System.out.println(nascimento);

        var df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(df.format(nascimento));

        var natal = "25/12/2019";
        var dtNatal = df.parse(natal);
        System.out.println(dtNatal);

    }
}
