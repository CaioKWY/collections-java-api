package Listas.ListaTarefas;


import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t :  tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            };
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }
    public static void main(String[] args){
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("comer batata");
        listaTarefa.adicionarTarefa("comer cebola");
        listaTarefa.adicionarTarefa("comer arroz");
        listaTarefa.adicionarTarefa("comer cebola");
        System.out.println("o numero de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());

       // listaTarefa.removerTarefa("Comer Arroz");
        System.out.println("o numero de elementos na lista atualizado é : "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefas();
    }


}
