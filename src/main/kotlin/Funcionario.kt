open class Funcionario (
            var cargaHoraria: Short,
            var turno: String,
            var salario: Double,
            cpf: String,
            nome: String,
            rg: String,
            matricula: Short,
            endereco: String,
            telefone: String,
            email: String
        ) : PessoaFisica(
            cpf = cpf,
            nome = nome,
            rg = rg,
            matricula = matricula,
            endereco = endereco,
            telefone = telefone,
            email = email
        )