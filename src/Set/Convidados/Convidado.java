package Set.Convidados;

import java.util.Objects;

public class Convidado {
    //atributos
    private String nome;
    private int convite;

    public Convidado(String nome, int convite) {
        this.nome = nome;
        this.convite = convite;
    };

    public String getNome() {
        return nome;
    };

    public int getConvite() {
        return convite;
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getConvite() == convidado.getConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", convite=" + convite +
                '}';
    }
}
