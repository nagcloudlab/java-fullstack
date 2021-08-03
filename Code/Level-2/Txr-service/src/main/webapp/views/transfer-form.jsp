<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
  <!-- CSS only -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="container">

<%--<a href="welcome.htm">welcome</a>--%>

<hr/>
<div> Transfer Service</div>
<hr/>


  <div class="row">
    <div class="col-6">
      <form action="txr.htm" method="post">
      <div class="card">
        <div class="card-header">TransferForm</div>
        <div class="card-body">

            <div class="form-group">
              <label>From Account</label>
              <input class="form-control" name="fromAccNum">
            </div>
            <div class="form-group">
              <label>To Account</label>
              <input class="form-control" name="toAccNum">
            </div>
            <div class="form-group">
              <label>Amount</label>
              <input class="form-control" name="amount">
            </div>
        </div>
        <div class="card-footer">
          <button>Transfer</button>
        </div>
      </div>
      </form>
    </div>
  </div>


</body>
</html>