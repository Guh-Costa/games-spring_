<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Nova Categoria</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container">
    <h1>Nova Categoria</h1>
    <form action="/categoria/insert" method="post">
      <div class="form-group">
        <label for="form-group">Nome:</label>
        <input type="text" name="nome" id="nome" class="form-control">
      </div>
      <br/>
      <a href="/categoria/list" class="btn btn-primary">Voltar</a>
      <button type="submit" class="btn btn-success">Salvar</button>
    </form>
  </div>
</body>
</html>