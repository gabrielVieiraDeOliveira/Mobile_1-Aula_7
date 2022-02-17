open class PessoaFisica (
    var cpf: String,
    var nome: String,
    var rg: String,
    matricula: Short,
    endereco: String,
    telefone: String,
    email: String
) : Pessoa(
    telefone = telefone,
    matricula = matricula,
    endereco = endereco,
    email = email
)
