Olá, se você está recebendo este TESTE é porque você passou pela primeira etapa dessa jornada, Parabéns!
Gostaríamos que você participasse deste DESAFIO para que possamos testar suas habilidades, será um grande diferencial e um prazer enorme em participar desta fase com você, então vamos lá!

# Teste de back-end Via Varejo

Este teste busca avaliar quesitos técnicos para as pessoas que se candidatem às vagas de desenvolvimento back-end da Via Varejo.

## O desafio

Seu objetivo é criar um endpoint para que possamos simular a compra de um produto, deve retornar uma lista de parcelas, acrescidas de juros com base na taxa SELIC de 1.15% ao mês (se possível consultar a taxa em tempo real), somente quando o número de parcelas for superior a 06 (seis) parcelas.

## Esse endpoint deve receber os seguintes dados: 

> Request da requisição
  
  * Produto -> código, nome e valor.
  * Condição de Pagamento -> valor de entrada e quantidade de parcelas.

  {
    "produto": {
        "codigo": 123,
        "nome": "Nome do Produto",
        "valor": 9999.99
    },
    "condicaoPagamento": {
        "valorEntrada": 9999.99,
        "qtdeParcelas": 999
    }
  }

> Response da requisição
 
  * Lista de parcelas -> número da parcela, valor e taxa de juros ao mês (se houver).

  [{
    "numeroParcela": 1,
    "valor": 9999.99,
    "taxaJurosAoMes": 9999
  }]


## Pré-Requisitos

- Criar uma API utilizando a estrutura base do spring-boot, você pode gerar o template padrão no site oficial: https://start.spring.io/
- Utilizar o kit de desenvolvimento Java -> JDK 8
- Ao finalizar o teste, você precisa nos encaminhar o link seu repositrio no Github para que possamos fazer o codereview.
- Se possível, crie um arquivo README.md na raiz do repositório contendo os passos parar executar o seu projeto.

### Desejável (Será considerado um diferencial)

- Criar cobertura de testes unitários para as principais funcionalidades, não precisa ser nada muito complexo ou extenso, basta ser objetivo e assertivo.
- Configurar o Swagger para termos acesso a documentação da API.
- Consultar a Taxa de Juros Selic acumulada dos últimos 30 dias utilizando um RestClient através do endereço "https://dadosabertos.bcb.gov.br/dataset/11-taxa-de-juros---selic", poderá utilizar as anotações @FeignClient ou @RestTemplate;


## O que será avaliado

- Padrões de classe, atributos e métodos
- Utilização dos recursos disponíveis no spring-boot
- Conhecimento da linguagem, orientação a objetos
- Utilização correta de git
- Testes unitários

System.out.println("Boa sorte!");

