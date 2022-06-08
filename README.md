# Avaliação Parcial - Especialização Back-end - Spring Cloud
Repositório criado para armazenar código e arquivos de configuração da primeira avaliação parcial da especialização back-end do Certified Tech Developer

## O problema

A partir da seguinte arquitetura de microsserviços, pedimos que você a implemente usando o Spring Cloud

![Arquitetura de Microsserviços](https://lh5.googleusercontent.com/7YBYtT1TzGXqRK8HUZVP2JePK59AgYvpYDOAD4TxnwOVK2M1N5xqfPoIZFqYMRDE1r9wrcvq8AzOkTZmsNz2ywd8IY62Mg0PU0zyj5OMYcUsUmL8mtrXiLfw4YzQBGUqsTfHdzJryAcAg91M9A)

## Estrutura

- Dois microsserviços: movie-service e catalog-service
- Catalog-service deve consumir dados de movie-service utilizando Feign que por sua vez consome dados de um banco de dados (MySQL foi escolhido pelo aluno)
- Gateway que fará o roteamento para ambos os microsserviços
- Server config obtendo as configurações a partir deste repositório git
- Eureka server para service discovery & service registry

## Endpoints
- `POST`  - `/movie` para cadastro de filme
- `GET`   - `/movie/{genre}` para trazer filmes por gênero
- `GET`   - `/catalog/{genre}` retorna o catalogo de filmes (no momento) por gênero.