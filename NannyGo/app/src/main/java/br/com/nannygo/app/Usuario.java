package br.com.nannygo.app;

public class Usuario
{

    private String idUsuario;
    private String nome;
    private String sexo;
    private String telefone;
    private String email;
    private String login;
    private String senha;
    private String dataNascimento;
    private String idCidade;
    private String imagem;
    private String statusBaba;


    public String getNome()
    {
        return nome;
    }

    public String getSexo()
    {
        return sexo;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public String getEmail()
    {
        return email;
    }

    public String getLogin()
    {
        return login;
    }

    public String getSenha()
    {
        return senha;
    }

    public String getDataNascimento()
    {
        return dataNascimento;
    }

    public String getIdCidade()
    {
        return idCidade;
    }

    public String getImagem()
    {
        return imagem;
    }

    public String getIdUsuario()
    {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario)
    {
        this.idUsuario = idUsuario;
    }

    public String getStatusBaba()
    {
        return statusBaba;
    }

    public void setStatusBaba(String statusBaba)
    {
        this.statusBaba = statusBaba;
    }

    public String getIdade()
    {
        String dataNascimento[] = getDataNascimento().split("-");
        final java.util.Calendar c = java.util.Calendar.getInstance();
        int ano = c.get(java.util.Calendar.YEAR);
        int idade = ano - Integer.parseInt(dataNascimento[0]);
        String viewIdade = String.format("%d anos", idade);

        return viewIdade;
    }
}


