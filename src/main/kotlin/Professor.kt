class Professor (
    var disciplina: String,
    cargaHoraria: Short,
    turno: String,
    salario: Double,
    cpf: String,
    nome: String,
    rg: String,
    matricula: Short,
    endereco: String,
    telefone: String,
    email: String
) : Funcionario(
    cargaHoraria = cargaHoraria,
    turno = turno,
    salario = salario,
    cpf = cpf,
    nome = nome,
    rg = rg,
    matricula = matricula,
    endereco = endereco,
    telefone = telefone,
    email = email
)