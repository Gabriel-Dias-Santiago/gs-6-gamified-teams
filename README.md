# gs-6-gamified-teams

API para soluções gamificadas para motivação em equipes híbridas.

## Membros do Grupo
- Gabriel Dias Santiago - RM 551406

## Tema Escolhido
Soluções gamificadas para motivação em equipes híbridas

## Descrição da API
Esta API fornece informações sobre o tema escolhido, incluindo detalhes dos membros e uma descrição textual.

## Execução Local
1. Certifique-se de ter o Java 17 e Maven instalados.
2. Clone o repositório.
3. Execute `mvn clean install` para construir o projeto.
4. Execute `mvn spring-boot:run` para iniciar a aplicação.
5. Acesse a API em `http://localhost:8081/info`.
6. Documentação Swagger em `http://localhost:8081/swagger-ui.html`.

## URL da Imagem no Docker Hub
[URL da imagem no Docker Hub]

## Workflows CI/CD
- **Versioning**: Disparado por push na branch main, gera tags automáticas.
- **CI**: Disparado por push nas branches feature/**, release, hotfix. Executa build, testes e build da imagem Docker.
- **CD**: Disparado por pull request na branch develop, envia imagem automaticamente ao Docker Hub.
# gs-6-gamified-teams
# gs-6-gamified-teams
