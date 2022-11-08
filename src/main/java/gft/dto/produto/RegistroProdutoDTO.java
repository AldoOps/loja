package gft.dto.produto;

public class RegistroProdutoDTO {

    private String nome;
    private String descricao;
    private String unidade;

    public RegistroProdutoDTO() {
    }

    public RegistroProdutoDTO(String nome, String descricao, String unidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
}
