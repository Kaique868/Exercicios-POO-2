# Questão-1
O uso de getters e setters em vez de atributos públicos é uma boa prática porque garante o encapsulamento, um dos pilares da programação orientada a objetos. Isso protege o estado interno da classe, impedindo alterações diretas e indevidas no código externo, além de permitir alterar a implementação interna sem afetar o resto do sistema.

**Exemplo com setter:** Imagine uma classe ``Pessoa`` com um atributo privado idade. Se o atributo fosse público, qualquer código poderia atribuir um valor inválido, como ``pessoa.idade = -15``. Utilizando um método ``setIdade(int idade)``, podemos incluir uma validação lógica para garantir que apenas idades válidas sejam aceitas:
```
public void setIdade(int idade) {
    if (idade >= 0) {
        this.idade = idade;
    } else {
        throw new IllegalArgumentException("A idade não pode ser negativa.");
    }
}
```

# Questões-2
Considerando a modelagem de um sistema de controle de biblioteca:  
a) Informações relevantes para representar um livro:
- Título.  
- Autor.   
- ISBN (número de identificação internacional do livro).
- Ano de publicação. 
- Editora.  
- Status de disponibilidade (se está emprestado ou disponível na biblioteca).   


b) Por que a classe Livro é uma abstração:

A classe Livro é considerada uma abstração porque ela mapeia apenas os aspectos e características essenciais de um livro do mundo real para o contexto do sistema de software (como título, autor e disponibilidade), ignorando detalhes irrelevantes para o negócio (como a cor da capa, o tipo de papel ou o estado de conservação físico).   


c) Três métodos que fariam sentido existir nessa classe:
- emprestar(): Altera o estado do livro para indicar que ele foi retirado por um usuário.   
- devolver(): Atualiza o status do livro para disponível, registrando o seu retorno à biblioteca.   
- obterInformacoes(): Retorna um resumo com os principais dados cadastrados do livro.   
