<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>Title</title>
  <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
</head>

<body class="container">
  <hr />
  <div>Txr web app</div>
  <hr />
  <hr />

  <nav class="nav">
	  <a class="nav-link" href="txr">Transfer</a>
	  <a class="nav-link" href="statement">Statement</a>
    <a class="nav-link" href="logout">logout</a>
	</nav>


  <hr />
  Welcome : ${sessionScope.currentUser}
  <hr />

  <div class="row">
    <div class="col-4"></div>
    <div class="col-4">
      <form action="txr" method="POST">
        <div class="card">
          <div class="card-header">Txr Form</div>
          <div class="card-body">
            <div class="form-group">
              <label>Amount</label>
              <input class="form-control" name="amount" />
            </div>
            <div class="form-group">
              <label>From Account</label>
              <input class="form-control" name="fromAccNum" />
            </div>
            <div class="form-group">
              <label>To Account</label>
              <input class="form-control" name="toAccNum" />
            </div>
          </div>
          <div class="card-footer">
            <button class="btn btn-dark">Txr</button>
          </div>
        </div>
      </form>
    </div>
  </div>

</body>

</html>