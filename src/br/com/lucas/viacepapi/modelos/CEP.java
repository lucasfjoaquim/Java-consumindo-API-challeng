package br.com.lucas.viacepapi.modelos;

public class CEP {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public CEP(String cep, String logradouro, String complemento,
               String bairro, String uf, String ibge,
               String gia, String ddd, String siafi) {

        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.uf = uf;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;

    }
    public CEP(Cepconsumido cepconsumido) {

        cep = cepconsumido.cep();
        logradouro = cepconsumido.logradouro();
        complemento = cepconsumido.complemento();
        bairro = cepconsumido.bairro();
        uf = cepconsumido.uf();
        ibge = cepconsumido.ibge();
        gia = cepconsumido.gia();
        ddd = cepconsumido.ddd();
        siafi = cepconsumido.siafi();
    }

    @Override
    public String toString() {
        return "CEP{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", uf='" + uf + '\'' +
                ", ibge='" + ibge + '\'' +
                ", gia='" + gia + '\'' +
                ", ddd='" + ddd + '\'' +
                ", siafi='" + siafi + '\'' +
                '}';
    }

}


