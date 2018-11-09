<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Spring MVC</h2>
  <p>Alerts are created with the .alert class, followed by a contextual color classes:</p>
  <div class="alert alert-success">
    <strong>Success!</strong> Mesaj : ${mesaj1} ${mesaj2} ${mesaj3}
  </div>
  <div class="alert alert-info">
    <strong>Info!</strong> Mesaj : ${mesaj1} ${mesaj2} ${mesaj3}
  </div>
  <div class="alert alert-warning">
    <strong>Warning!</strong> Mesaj : ${mesaj1} ${mesaj2} ${mesaj3}
  </div>
  <div class="alert alert-danger">
    <strong>Danger!</strong> Mesaj : ${mesaj1} ${mesaj2} ${mesaj3}
  </div>
  <div class="alert alert-primary">
    <strong>Primary!</strong> Mesaj : ${mesaj1} ${mesaj2} ${mesaj3}
  </div>
  <div class="alert alert-secondary">
    <strong>Secondary!</strong> Mesaj : ${mesaj1} ${mesaj2} ${mesaj3}
  </div>
  <div class="alert alert-dark">
    <strong>Dark!</strong> Mesaj : ${mesaj1} ${mesaj2} ${mesaj3}
  </div>
  <div class="alert alert-light">
    <strong>Light!</strong> Mesaj : ${mesaj1} ${mesaj2} ${mesaj3}
  </div>
</div>

</body>
</html>
