# Documentação da Api

# POSTAGENS

## Endpoints

**POST /posts**:
Esse endpoint permite você criar uma nova postagem.


## POST

## Request Body

**userId (string, required)**: O Id do usuário dono da postagem.

**title (string, required)**: O titulo da postagem.

**content (string, required)**: O conteudo da postagem.

```
{
    "userId": "c13df130-81ca-4792-8432-f7bc336e81d9",
    "title": "Titulo",
    "content": "Essa postagem é de teste."
}
```


## Response

A resposta será um objeto JSON que possui as seguintes propriedades

```
{
    "id": "25178498-e386-4c5f-b936-32497d4f77a1",
    "userId": "c13df130-81ca-4792-8432-f7bc336e81d9",
    "username": "David",
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
    "userId": "c13df130-81ca-4792-8432-f7bc336e81d9",
    "username": "David",
    "title": "Titulo",
    "content": "Essa postagem é de teste.",
    "createdAt": "2024-05-21T12:17:55.963-03:00"
}
```

## GET BY USER
## Endpoints
**/postsByUser/{userId}**
Esse endpoint permite buscar uma postagem pelo seu identificador único (ID).

## Path Parameters
**userId (string, required)**: O identificador único do usuario.
Response
A resposta será um objeto JSON que possui as seguintes propriedades:

```
{
    "id": "25178498-e386-4c5f-b936-32497d4f77a1",
    "userId": "c13df130-81ca-4792-8432-f7bc336e81d9",
    "username": "David",
    "title": "Titulo 1",
    "content": "Essa postagem é de teste.",
    "createdAt": "2024-05-21T12:17:55.963-03:00"
},
{
    "id": "25178498-e386-4c5f-b936-32497d4f77a1",
    "userId": "c13df130-81ca-4792-8432-f7bc336e81d9",
    "username": "David",
    "title": "Titulo 2",
    "content": "Essa postagem é de teste.",
    "createdAt": "2024-05-21T12:17:55.963-03:00"
},
...
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
    "userId": "c13df130-81ca-4792-8432-f7bc336e81d9",
    "username": "David",
    "title": "Titulo 1",
    "content": "Essa postagem é de teste.",
    "createdAt": "2024-05-21T12:17:55.963-03:00"
},
{
    "id": "25178498-e386-4c5f-b936-32497d4f77a1",
    "userId": "f3dad3c3-78e2-43b6-b068-66ab2a59c29c",
    "username": "Jeferson",
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
    "postId": "0c62af2c-e835-4547-a5f6-1ce63768b989",
    "userId": "f3dad3c3-78e2-43b6-b068-66ab2a59c29c",
    "content": "Novo comentário 2.",
}
```


## Response

A resposta será um objeto JSON que possui as seguintes propriedades

```
{
   "id": "040d924a-05ea-4a86-97fe-8949bfd5781c",
    "postId": "0c62af2c-e835-4547-a5f6-1ce63768b989",
    "userId": "f3dad3c3-78e2-43b6-b068-66ab2a59c29c",
    "username": "Jeferson",
    "content": "Novo comentário 2.",
    "createdAt": "2024-08-09T18:59:55.851-03:00"
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
   "id": "040d924a-05ea-4a86-97fe-8949bfd5781c",
    "postId": "0c62af2c-e835-4547-a5f6-1ce63768b989",
    "userId": "f3dad3c3-78e2-43b6-b068-66ab2a59c29c",
    "username": "Jeferson",
    "content": "Novo comentário 2.",
    "createdAt": "2024-08-09T18:59:55.851-03:00"
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
    "id": "040d924a-05ea-4a86-97fe-8949bfd5781c",
    "postId": "0c62af2c-e835-4547-a5f6-1ce63768b989",
    "userId": "f3dad3c3-78e2-43b6-b068-66ab2a59c29c",
    "username": "Jeferson",
    "content": "Novo comentário 1.",
    "createdAt": "2024-08-09T18:59:55.851-03:00"
},
{
   "id": "040d924a-05ea-4a86-97fe-8949bfd5781c",
    "postId": "0c62af2c-e835-4547-a5f6-1ce63768b989",
    "userId": "f3dad3c3-78e2-43b6-b068-66ab2a59c29c",
    "username": "Jeferson",
    "content": "Novo comentário 2.",
    "createdAt": "2024-08-09T18:59:55.851-03:00"
},
...
```

## GET BY POST
## Endpoints
**/commentsByPost/{postId}**
Esse endpoint permite listar os comentarios da postagem especifica.


Response
A resposta será um objeto JSON que possui as seguintes propriedades:

```

{
    "id": "040d924a-05ea-4a86-97fe-8949bfd5781c",
    "postId": "0c62af2c-e835-4547-a5f6-1ce63768b989",
    "userId": "f3dad3c3-78e2-43b6-b068-66ab2a59c29c",
    "username": "Jeferson",
    "content": "Novo comentário 1.",
    "createdAt": "2024-08-09T18:59:55.851-03:00"
},
{
    "id": "040d924a-05ea-4a86-97fe-8949bfd5781c",
    "postId": "0c62af2c-e835-4547-a5f6-1ce63768b989",
    "userId": "f3dad3c3-78e2-43b6-b068-66ab2a59c29c",
    "username": "Jeferson",
    "content": "Novo comentário 2.",
    "createdAt": "2024-08-09T18:59:55.851-03:00"
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

**POST /auth/register**:
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
## Endpoints

**POST /auth/login**:
Esse endpoint permite você fazer login.


## POST

## Request Body

**email (string, required)**: O email do usuario.

**password (string, required, minimun 6 characters, maximum 255 characters)**: A senha do usuario.

```
{
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

## GET ID
## Endpoints
**GET /user/{id}**:
Esse endpoint permite buscar um Usuário pelo seu identificador único (ID).

## Path Parameters
**id (string, required)**: O identificador único do usuário.
Response
A resposta será um objeto JSON que possui as seguintes propriedades:

```
{
    "id": "3258c1bd-1e7a-48f3-a9ee-eb2ee2d953a2",
    "name": "Usuario",
    "email": "usuario@email.com"
}
```

## UPDATE

**PUT /user/{id}**:
Esse endpoint permite você atualizar os dados do usuario do ID informado.

## Request Body

**name (string)**: O nome do usuario.

**email (string)**: O email do usuario.

**password (string, minimun 6 characters, maximum 255 characters)**: A senha do usuario.

```
Usuario atualizado com sucesso.
```

## DELETE 
## Endpoints
**/user/{id}**
Esse endpoint permite deletar um usuário pelo seu identificador único (ID).

## Path Parameters
**id (string, required)**: O identificador único do usuário.
Response
A resposta será uma mensagem de confirmação.

```
Usuário excluído com sucesso!!!
```