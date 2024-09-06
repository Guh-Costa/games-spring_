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
@table (name = "jogos")
public class jogo{
    @Id
    @GeneratedValue(strategy = GerantionType.IDENTIFY)
    private long id;
    @Column (unique = true, nullable = false)
    private String titulo;
    
public void setId(long id) {
    this.id = id;
}
public long getId() {
    return id;
}
public void settitulo(String titulo) {
    this.titulo = titulo;
}
public String gettitulo() {
    return titulo;
}

}
