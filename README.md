# Via Varejo - Backend Test


## Como rodar a aplicação - How to run the application

- Faça o clone da aplicação em uma pasta de sua preferência.
- Importe a pasta raiz no IDE de sua preferência.
- Faça o update do projeto para efetuar o download das dependências, ou acesse a pasta raiz via cmd e execute o comando `mvn clean install`.
- Execute a aplicação como `Springboot Application` em Run As > Springboot Application* (*utilizando o IDE Eclipse/Spring Tool Suite).
- Para acessar a documentação, abra a página `http://localhost:8095/swagger-ui.html` em um navegador de sua preferência.
(A porta 8095 está configurada no arquivo `application.properties`)
- Para executar a chamada, clique no botão `Try it out` do Label correspondente à chamada Checkout POST no Swagger, edite o JSON de acordo com a chamada à ser feita, e clique em `Execute`, ou efetue a chamada via POSTMAN ou aplicação similar.

## Estrutura do projeto

- Root
--- Controller
	--- CheckoutController
--- DTO
	--- CheckoutRequestDTO
	--- CheckoutResponseDTO
	--- CondicaoPagamentoDTO
	--- ProdutoDTO
--- Service
	--- CheckoutServiceDTO

## Funcionalidades

- [X] Demonstrativos das prestações
- [X] Cálculo do valor por prestação, acrescido ou não de juros


## Melhorias Futuras

- [X] Documentação via Swagger
- [ ] Testes Unitários
- [ ] Consulta do valor da SELIC em tempo real