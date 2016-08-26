package br.org.soares.appcatalogodeacessos;

/**
 * Created by SOARES on 20/06/2016.
 */
public class Servico {

    private String provedor;
    private String login;
    private String senha;

    public Servico(String provedor, String login, String senha) {
        this.provedor = provedor;
        this.login = login;
        this.senha = senha;
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
