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

**PUT /posts/{id}**:
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
Postagem atualizada com sucesso!!!
```

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

## GET 
## Endpoints
**/comments**
Esse endpoint permite listar os comentarios.


Response
A resposta será um objeto JSON que possui as seguintes propriedades:

```

{
    "postId": "25178498-e386-4c5f-b936-32497d4f77a1",
    "content": "Esse comentario é de teste.",
    "createdAt": "2024-05-21T12:17:55.963-03:00"
},
{
    "postId": "14efd749-7ac6-498a-8de2-24f85f414aa5",
    "content": "Esse comentario é de teste.",
    "createdAt": "2024-05-21T12:17:55.963-03:00"
},
...
```



## UPDATE

**PUT /comments/{id}**:
Esse endpoint permite você atualizar o comentário do ID informado.

## Request Body

**content (string)**: O conteudo do comentário.

```
{
    "content": "Novo conteúdo do comentário."
}
```


## Response

A resposta será um objeto JSON que possui as seguintes propriedades

```
Comentario atualizado com sucesso!!!
```

## DELETE 
## Endpoints
**/comments/{id}**
Esse endpoint permite deletar um comentario pelo seu identificador único (ID).

## Path Parameters
**id (string, required)**: O identificador único de comentario.
Response
A resposta será uma mensagem de confirmação.

```
Comentario excluído com sucesso!!!
```

# USUARIOS

## Endpoints

**POST /user**:
Esse endpoint permite você criar um novo usuario.


## POST

## Request Body

**name (string, required)**: O nome do usuario.

**email (string, required)**: O email do usuario.

**password (string, required, minimun 6 characters, maximum 255 characters)**: A senha do usuario.

```
{
    "name": "Usuario",
    "email": "usuario@email.com",
    "password": "123456"
}
```


## Response

A resposta será um objeto JSON que possui as seguintes propriedades

```
{
    "id": "3258c1bd-1e7a-48f3-a9ee-eb2ee2d953a2",
    "name": "Usuario",
    "email": "usuario@email.com"
}
```