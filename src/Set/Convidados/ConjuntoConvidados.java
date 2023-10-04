package Set.Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    };

    public void adionarConvidado(String nome, int convite){
        convidadoSet.add(new Convidado(nome, convite));
    };

    public void removerConvidadoPorConvite(int convite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getConvite() == convite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    };

    public int contarConvidado(){
        return convidadoSet.size();
    };

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    };

    public static void main(String[] args){
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();


        conjuntoConvidados.adionarConvidado("Convidado 1", 1235);
        conjuntoConvidados.adionarConvidado("Convidado 2", 1236);
        conjuntoConvidados.adionarConvidado("Convidado 3", 1236);
        conjuntoConvidados.adionarConvidado("Convidado 4", 1238);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem "+ conjuntoConvidados.contarConvidado()+ " dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorConvite(1235);
        System.out.println("Existem "+ conjuntoConvidados.contarConvidado()+ " dentro do Set de Convidados");

    }


}
