package br.com.nannygo.app;

public class UsuarioFinal {
    private static String nome;
    private static String sexo;
    private static String telefone;
    private static String email;
    private static String login;
    private static String senha;
    private static String dataNascimento;
    private static String idCidade;
    private static String imagem;


    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        UsuarioFinal.nome = nome;
    }

    public static String getSexo() {
        return sexo;
    }

    public static void setSexo(String sexo) {
        UsuarioFinal.sexo = sexo;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        UsuarioFinal.telefone = telefone;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        UsuarioFinal.email = email;
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        UsuarioFinal.login = login;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        UsuarioFinal.senha = senha;
    }

    public static String getDataNascimento() {
        return dataNascimento;
    }

    public static void setDataNascimento(String dataNascimento) {
        UsuarioFinal.dataNascimento = dataNascimento;
    }



    public static String getIdade()
    {
        String dataNascimento[] = getDataNascimento().split("-");
        final java.util.Calendar c = java.util.Calendar.getInstance();
        int ano = c.get(java.util.Calendar.YEAR);
        int idade = ano - Integer.parseInt(dataNascimento[0]);
        String viewIdade = String.format("%d anos", idade);

        return viewIdade;
    }

    public static String getIdCidade() {
        return idCidade;
    }

    public static void setIdCidade(String idCidade) {
        UsuarioFinal.idCidade = idCidade;
    }

    public static String getImagem() {
        return imagem;
    }

    public static void setImagem(String imagem) {
        UsuarioFinal.imagem = imagem;
    }
}
