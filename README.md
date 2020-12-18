# desafio-phoebus

O projeto consiste em uma apirestful de um sistema de cadastro de hospitais 

## 🚀 Começando

Para reproduzir a api bastar importar o projeto em uma IDE ou ambiente de desenvolvimento spring que contenha o java 11 ou realizando os seguintes comando com dockerfile. 
Na raiz do projeto com docker ativado digite os comandos. 

-docker build -t desafio-pheabus . 

em seguida para apos buildar o projeto para rodar digite: 

-docker run -p 8080:8080 desafio-pheabus 

### 📋 Pré-requisitos

-Docker

-SpringMVC

-H2
  

#### Exemplo de requisição da api 

Após realizar todos os procedimentos descritos vá no postman ou outro software para consumir api e realize o no metodo http post  a seguinte requisão com o json:

http://localhost:8080/api/hospital

{       
    
    "nome" : "Nossa senhora das neves",
    "cnpj" : "123",
    "medico": 2,
    "enfermeira": 2,
    "ambulancia" : 2
    
 
}  













