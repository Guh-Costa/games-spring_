<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Remover Categoria</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container">
    <h1>Remover Categoria</h1>
    <p>Tem certeza que deseja remover a Categoria "${categoria.nome}"</p>
    <form action="/categoria/delete" method="post">
      <input type="hidden" name="id" value="${categoria.id}" />
      <br />
      <button type="submit" class="btn btn-danger">Excluir</button>
    </form>
  </div>
</body>
</html>