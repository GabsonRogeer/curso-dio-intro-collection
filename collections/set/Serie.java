package collections.set;

import java.util.Comparator;
import java.util.Objects;

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempodeEpisodio;

    public Serie(String nome, String genero, Integer tempodeEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempodeEpisodio = tempodeEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempodeEpisodio() {
        return tempodeEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempodeEpisodio=" + tempodeEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempodeEpisodio, serie.tempodeEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempodeEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        return Integer.compare(this.getTempodeEpisodio(), serie.getTempodeEpisodio());
    }

}
    class NomeGeneroTime implements Comparator<Serie> {

        @Override
        public int compare(Serie s1, Serie s2) {
            int nome = s1.getGenero().compareTo(s2.getGenero());
            if (nome != 0) return nome;

            int genero = s1.getGenero().compareTo(s2.getGenero());
            if (genero != 0) return genero;

            return Integer.compare(s1.getTempodeEpisodio(), s2.getTempodeEpisodio());

        }
    }