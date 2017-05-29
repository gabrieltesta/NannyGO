package br.com.nannygo.app;

public class Transacao {

    private Integer idTransacao;
    private Integer idUsuario;
    private Integer idBaba;
    private String dataTransacao;
    private String dataServico;
    private Integer statusAprovado;
    private String metodoPagamento;
    private String nome;
    private String valor;
    private String horaInicio;
    private Integer qntdHoras;


    public Integer getIdTransacao()
    {
        return idTransacao;
    }

    public void setIdTransacao(Integer idTransacao)
    {
        this.idTransacao = idTransacao;
    }

    public Integer getIdUsuario()
    {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario)
    {
        this.idUsuario = idUsuario;
    }

    public Integer getIdBaba()
    {
        return idBaba;
    }

    public void setIdBaba(Integer idBaba)
    {
        this.idBaba = idBaba;
    }

    public String getDataTransacao()
    {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao)
    {
        this.dataTransacao = dataTransacao;
    }

    public String getDataServico()
    {
        return dataServico;
    }

    public void setDataServico(String dataServico)
    {
        this.dataServico = dataServico;
    }

    public Integer getStatusAprovado()
    {
        return statusAprovado;
    }

    public void setStatusAprovado(Integer statusAprovado)
    {
        this.statusAprovado = statusAprovado;
    }

    public String getMetodoPagamento()
    {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento)
    {
        this.metodoPagamento = metodoPagamento;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getValor()
    {
        return valor;
    }

    public void setValor(String valor)
    {
        this.valor = valor;
    }

    public String getHoraInicio()
    {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio)
    {
        this.horaInicio = horaInicio;
    }

    public Integer getQntdHoras()
    {
        return qntdHoras;
    }

    public void setQntdHoras(Integer qntdHoras)
    {
        this.qntdHoras = qntdHoras;
    }
}
