package aula01_08;

import jdk.jshell.execution.LoaderDelegate;

import javax.xml.transform.sax.SAXSource;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EstudoDatas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual);
        System.out.println("Ano "+ dataHoraAtual.getYear());
        System.out.println("Mês "+ dataHoraAtual.getMonthValue());
        System.out.println("Dia "+ dataHoraAtual.getDayOfMonth());
        System.out.println("Dia da semana "+ dataHoraAtual.getDayOfWeek());
        int ano = 2022;
        int mes = 12;
        int dia = 8;

        LocalDate dataValida = LocalDate.of(ano, mes, dia);
        System.out.println(dataValida);

        //LocalDate hoje  = LocalDate.now();
        LocalDate amanha = LocalDate.of(2023, 8, 2);

        if(hoje.isAfter(amanha)){
            System.out.println("a data"+amanha+" ja passou");
        }
        else{
            System.out.println("ainda "+amanha+"não passou");
        }
        //hoje.isAfter(data);  -> verifica se hoje ja passou da data
        //hoje.isBefore(data); -> verifica se hoje ainda nao passou da data;
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter formatoBr2 = DateTimeFormatter.ofPattern("EEE, MMMM, yyyy");
        String dataHoraAtualFormatada = dataHoraAtual.format(formatoBr2);

        System.out.println(dataHoraAtualFormatada);
    }
}
