package application.model;
import java.util.hashSet;
import java.lang.annotation.Inherited;
import java.nio.file.FileSystem;
import java.util.Set;

import jakarta.persitence.Column;
import jacarta.persitence.Entity;
import jacarta.persitence.GeneratedValue;
import jacarta.persitence.GerantionType;
import jacarta.persitence.Id;
import jacarta.persitence.OneToMany;
import jacarta.persitence.table;

@Entity
@table (name = "categorias")
public class Categoria{
    @Id
    @GeneratedValue(strategy = GerantionType.IDENTIFY)
    private long id;
    @Column (unique = true, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private Set<Jogo> jogos = new HashSet<>();
    

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public Set<Jogo> getJogos(){
        return jogos;
    }
    public void setJogos(Set<Jogo> jogos){
        this.jogos = jogos;
    }
}
