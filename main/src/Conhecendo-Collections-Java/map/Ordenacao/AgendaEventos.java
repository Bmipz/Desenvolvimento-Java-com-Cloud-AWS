package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    //Atributo
    Map<LocalDate, Evento> eventos;

    //Construtor
    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    //adiciona um evento
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventos.put(data, new Evento(nome, atracao));
    }

    //exibir Agenda
    public void exibirAgenda(){
        Map<LocalDate, Evento> exibirEventos = new TreeMap<>(eventos);
        if(!eventos.isEmpty()){
            System.out.println(exibirEventos);
        }
        else{
            System.out.println("Agenda vazia");
        }
    }

    //obter proximo evento
    public void obterProximoEvento(){
        if(!eventos.isEmpty()){
            LocalDate dataAtual = LocalDate.now();
            LocalDate dataProxima = null;
            Evento proximoevento = null;
            //Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
            for(Map.Entry<LocalDate, Evento> entry : eventos.entrySet()){
                if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                    dataProxima = entry.getKey();
                    proximoevento = entry.getValue();
                    System.out.println("Próximo evento será " + proximoevento + " acontecera na data " + dataProxima);
                    break;
                }
            }
        }
        else{
            throw new RuntimeException("Não existe nenhum evento");
        }
    }



    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        
        
        agenda.adicionarEvento(LocalDate.of(2023, 8, 15), "Internet", "Pagar internet");
        agenda.adicionarEvento(LocalDate.of(2023, 8, 20), "Dentista", "Pagar dentista");
        agenda.adicionarEvento(LocalDate.of(2023, 8, 23), "Curso", "Pagar curso");
        agenda.adicionarEvento(LocalDate.of(2023, 8, 30), "Carro", "Pagar carro");

        agenda.exibirAgenda();

        agenda.obterProximoEvento();
    }
}
