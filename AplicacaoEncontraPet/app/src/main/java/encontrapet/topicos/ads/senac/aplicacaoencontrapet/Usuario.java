package encontrapet.topicos.ads.senac.aplicacaoencontrapet;

/**
 * Created by renat on 28/06/2017.
 */


public class Usuario {

    private String nomeDono;
    private String email;
    private String telefone;
    private String endereco;
    private String nomePet;
    private String especie;
    private String rastreador;

    public Usuario(String nomeDono, String email, String telefone, String endereco, String nomePet, String especie, String rastreador) {
        this.nomeDono = nomeDono;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.nomePet = nomePet;
        this.especie = especie;
        this.rastreador = rastreador;
    }

    public Usuario() {

    }

}