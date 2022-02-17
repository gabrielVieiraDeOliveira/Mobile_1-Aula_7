class PessoaJuridica (
    cnpj: String,
    nomeFantasia: String,
    razaoSocial: String,
    matricula: Short,
    email: String,
    telefone: String,
    endereco: String
) : Pessoa(
    matricula = matricula,
    email = email,
    telefone = telefone,
    endereco = endereco
)