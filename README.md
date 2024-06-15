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

# POSTAGENS

## Endpoints

**POST /posts**:
Esse endpoint permite você criar uma nova postagem.


## POST

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

## GET 
## Endpoints
**/posts**
Esse endpoint permite listar as postagens.


Response
A resposta será um objeto JSON que possui as seguintes propriedades:

```

{
    "id": "25178498-e386-4c5f-b936-32497d4f77a1",
    "title": "Titulo 1",
    "content": "Essa postagem é de teste.",
    "createdAt": "2024-05-21T12:17:55.963-03:00"
},
{
    "id": "14efd749-7ac6-498a-8de2-24f85f414aa5",
    "title": "Titulo 2",
    "content": "Essa postagem é de teste.",
    "createdAt": "2024-05-21T12:17:55.963-03:00"
},
...
```



## UPDATE

**POST /posts/{id}**:
Esse endpoint permite você atualizar a postagem do ID informado.

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

## DELETE 
## Endpoints
**/posts/{id}**
Esse endpoint permite deletar uma postagem pelo seu identificador único (ID).

## Path Parameters
**id (string, required)**: O identificador único da postagem.
Response
A resposta será uma mensagem de confirmação.

```
Postagem excluída com sucesso!!!
```

# COMENTÁRIOS
**POST /comments**:
Esse endpoint permite você adicionar um novo comentário a uma postagem específica.


## POST

## Request Body

**postId (string, required)**: O ID da postagem.

**content (string, required)**: O conteudo do comentário.

```
{
    "postId": "3a52d80f-0e47-47ba-a3b0-8bf717fe1754",
    "content": "Novo comentário."
}
```


## Response

A resposta será um objeto JSON que possui as seguintes propriedades

```
{
    "id": "6d55428e-280d-4319-b81b-13c77a2c3ef9",
    "content": "Novo comentário.",
    "createdAt": "2024-06-12T09:21:14.326-03:00",
    "postId": "3a52d80f-0e47-47ba-a3b0-8bf717fe1754"
}
```


**id (string)**: O identificador único do comentário criado.

**content (string)**: O conteúdo do comentário criado.

**createdAt (string)**: Data da criação do comentário.

**postId (string)**: O identificador único da postagem.


## GET ID
## Endpoints
**/comments/{id}**
Esse endpoint permite buscar um comentário pelo seu identificador único (ID).

## Path Parameters
**id (string, required)**: O identificador único do comentário.
Response
A resposta será um objeto JSON que possui as seguintes propriedades:

```
{
    "id": "6d55428e-280d-4319-b81b-13c77a2c3ef9",
    "content": "Novo comentário.",
    "createdAt": "2024-06-12T09:21:14.326-03:00",
    "postId": "3a52d80f-0e47-47ba-a3b0-8bf717fe1754"
}
````