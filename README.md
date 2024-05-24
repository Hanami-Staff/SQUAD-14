## Projeto Hanami

Para iniciar o projeto, algum membro do squad deve enviar o ***template inicial e fazer o primeiro commit para a branch main***.

- Crie um **template de WebAPI** na linguagem escolhida;
- Crie um **.gitignore** para que não seja enviado arquivos desnecessários (chequem documentação, exemplos de outros projetos no github ou pesquisem como preferir);
- Enviar o template com o .gitignore para a **branch main** do repositório do seu squad.

Após o envio do template, as tasks do projeto podem ser iniciadas.

> **Material de apoio para o Git/Github:**
> 

> ***[Geral]***
Os comandos do Git | Documentação oficial
https://git-scm.com/docs/git/pt_BR#_os_comandos_do_git
> 

> ***[Geral]***
APRENDA GIT E GITHUB DO ZERO - guia completo | Fernanda Kipper
https://www.youtube.com/watch?v=pyM5QLS2h6M
> 

> ***[Branchs]***
GIT BRANCH E GIT MERGE - Git e GitHub #03 | Gustavo Caetano
https://www.youtube.com/watch?v=gcOhd8rvBOc
> 

> ***[Pull Request]***
COMO FAZER UM PULL REQUEST - Git e GitHub #04 | Gustavo Caetano
https://www.youtube.com/watch?v=IMerCpaT_zM
> 

> ***[Geral]***
Git e Github para Iniciantes | Willian Justen [Playlist]
https://www.youtube.com/watch?v=IBClN6VpJDw&list=PLlAbYrWSYTiPA2iEiQ2PF_A9j__C4hi0A
>


# Documentação da Api


## Endpoints

**POST /posts**:
Esse endpoint permite você criar uma nova postagem.


## Post

## Request Body

**title (string, required)**: O titulo da postagem.

**content (string, required)**: O conteudo da postagem.

```
{
    "title": "Titulo",
    "content": "Essa postagem é de teste."
}
```


## Response

A resposta será um objeto JSON que possui as seguintes propriedades

```
{
    "id": "25178498-e386-4c5f-b936-32497d4f77a1",
    "title": "Titulo",
    "content": "Essa postagem é de teste.",
    "createdAt": "2024-05-21T12:17:55.963-03:00"
}
```


**id (string)**: O identificador único do post criado.

**title (string)**: O título do post criado.

**content (string)**: O conteúdo do post criado.

**createdAt (string)**: Data da criação da postagem.


## GET ID
## Endpoints
**/posts/{id}**
Esse endpoint permite buscar uma postagem pelo seu identificador único (ID).

## Path Parameters
**id (string, required)**: O identificador único da postagem.
Response
A resposta será um objeto JSON que possui as seguintes propriedades:

```
{
    "id": "25178498-e386-4c5f-b936-32497d4f77a1",
    "title": "Titulo",
    "content": "Essa postagem é de teste.",
    "createdAt": "2024-05-21T12:17:55.963-03:00"
}
```

**POST /posts/{id}**:
Esse endpoint permite você atualizar a postagem do ID informado.


## Update

## Request Body

**title (string)**: O titulo da postagem.

**content (string)**: O conteudo da postagem.

```
{
    "title": "Novo Titulo",
    "content": "Novo conteúdo da postagem."
}
```


## Response

A resposta será um objeto JSON que possui as seguintes propriedades

```
{
    "id": "25178498-e386-4c5f-b936-32497d4f77a1",
    "title": "Novo Titulo",
    "content": "Novo conteúdo da postagem.",
    "createdAt": "2024-05-23T12:17:55.963-03:00"
}
```


**id (string)**: O identificador único do post criado.

**title (string)**: O título do post criado.

**content (string)**: O conteúdo do post criado.

**createdAt (string)**: Data da criação da postagem.