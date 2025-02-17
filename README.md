<h2 align="center">
  Desafio Backend: Emprestismos
</h2>


Resolução do desafio proposto pelo repositorio Backend Brasil, confira detalhes [neste link](https://github.com/backend-br/desafios/blob/master/loans/PROBLEM.md).


## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Validation](https://docs.spring.io/spring-framework/reference/core/validation/beanvalidation.html)


## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/loans-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).


## API Endpoints


- Criar Emprestismo 
```
$ http POST :8080/customer-loans
{
    "age": 26,
    "cpf": "275.484.389-23",
    "name": "Vuxaywua Zukiagou",
    "income": 7000.00,
    "location": "SP"
}
```
## Retorno 
```
{
    "customer": "Fulano de Tal",
    "loans": [
        {
            "type": "PERSONAL",
            "interestRate": 4.0
        },
        {
            "type": "CONSIGNMENT",
            "interestRate": 2.0
        },
        {
            "type": "GUARANTEED",
            "interestRate": 3.0
        }
    ]
}
```
