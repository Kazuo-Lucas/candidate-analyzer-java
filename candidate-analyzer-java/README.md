📝 Candidate Analyzer - Java
Este é um projeto simples em Java criado com o objetivo de praticar conceitos básicos de programação orientada a objetos (POO), controle de fluxo e manipulação de listas.

O sistema simula um processo seletivo onde candidatos são avaliados de acordo com o salário pretendido e se atendem ao contato dentro de um número limitado de tentativas.

📌 Funcionalidades
✅ Cadastro de candidatos (nome + salário pretendido)
✅ Análise de candidatos com base em um salário base
✅ Simulação de tentativas de contato com cada candidato (máximo de 3 tentativas)
✅ Apenas candidatos que atendem ao contato e têm o salário dentro da faixa são aprovados
✅ Impressão da lista final de candidatos aprovados

🚀 Tecnologias utilizadas
Java (versão mínima: 17)

IDE recomendada: Visual Studio Code ou IntelliJ IDEA

Nenhuma biblioteca externa (apenas Java puro - JDK)

💡 Como funciona a lógica de seleção
O sistema percorre a lista de candidatos.

Verifica se o salário pretendido está dentro do limite do salário base (definido como R$2000.00).

Para cada candidato elegível, o sistema tenta ligar até 3 vezes.

Se o candidato atender dentro dessas 3 tentativas (usando um método de simulação com Random), ele é adicionado à lista de aprovados.