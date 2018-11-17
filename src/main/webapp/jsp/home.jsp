<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <title>Cryptocurrency Market Mr'Nut</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="/css/style.css">
  <script src="js/sort.js"></script>
</head>

<body>
  <a href="/"><img src="images/icons/favicon.ico" height="35" width="35"></a><br>
  <h1 style="font-family:'Courier New'">
    Cryptocurrency Prices
  </h1>
  <form action="${edit}" method="${method}">
    <input type="hidden" name="permiss" value="${hello.permiss}">
    <input type="hidden" name="email" value="${hello.email}">
    <input type="hidden" name="password" value="${hello.password}">
    <p style="font-family:'Courier New';color:black;">
      Hello <span style="color:white;font-size:20px">${hello.username}</span> , Welcome back! , <button type="submit">${status}</button>
    </p>
  </form>


  <main>

    <table id="myTable">
      <!-- Table Head -->
      <thead>
        <tr>
          <th onclick="sortTable()">Rank#</th>
          <th>Name</th>
          <th>Symbol</th>
          <th>Price : USD</th>
          <th>Price : THB</th>
          <th>CirculatingSupply</th>
          <th>Volume(24h)</th>
        </tr>
      </thead>

      <!-- Table Foot -->
      <tfoot>
        <tr>
          <th colspan='7'><a href="/"><button>Logout</button></a></th>
        </tr>
      </tfoot>

      <!-- Table Body -->
      <tbody>
        <tr>
          <td>${btcRank}</td>
          <td><img src="images/icons/btc.png"> ${btcName}</td>
          <td>${btcSymbol}</td>
          <td>$ ${btcPrice}</td>
          <td>฿ ${btcTHB}</td>
          <td>${btcCirculatingSupply} ${btcSymbol}</td>
          <td>$ ${btcDayVolume}</td>
        </tr>

        <tr>
          <td>${ethRank}</td>
          <td><img src="images/icons/eth.png"> ${ethName}</td>
          <td>${ethSymbol}</td>
          <td>$ ${ethPrice}</td>
          <td>฿ ${ethTHB}</td>
          <td>${ethCirculatingSupply} ${ethSymbol}</td>
          <td>$ ${ethDayVolume}</td>
        </tr>

        <tr>
          <td>${xrpRank}</td>
          <td><img src="images/icons/xrp.png"> ${xrpName}</td>
          <td>${xrpSymbol}</td>
          <td>$ ${xrpPrice}</td>
          <td>฿ ${xrpTHB}</td>
          <td>${xrpCirculatingSupply} ${xrpSymbol}</td>
          <td>$ ${xrpDayVolume}</td>
        </tr>

        <tr>
          <td>${bchRank}</td>
          <td><img src="images/icons/bch.png"> ${bchName}</td>
          <td>${bchSymbol}</td>
          <td>$ ${bchPrice}</td>
          <td>฿ ${bchTHB}</td>
          <td>${bchCirculatingSupply} ${bchSymbol}</td>
          <td>$ ${bchDayVolume}</td>
        </tr>

        <tr>
          <td>${eosRank}</td>
          <td><img src="images/icons/eos.png"> ${eosName}</td>
          <td>${eosSymbol}</td>
          <td>$ ${eosPrice}</td>
          <td>฿ ${eosTHB}</td>
          <td>${eosCirculatingSupply} ${eosSymbol}</td>
          <td>$ ${eosDayVolume}</td>
        </tr>

        <tr>
          <td>${xlmRank}</td>
          <td><img src="images/icons/xlm.png"> ${xlmName}</td>
          <td>${xlmSymbol}</td>
          <td>$ ${xlmPrice}</td>
          <td>฿ ${xlmTHB}</td>
          <td>${xlmCirculatingSupply} ${xlmSymbol}</td>
          <td>$ ${xlmDayVolume}</td>
        </tr>

        <tr>
          <td>${ltcRank}</td>
          <td><img src="images/icons/ltc.png"> ${ltcName}</td>
          <td>${ltcSymbol}</td>
          <td>$ ${ltcPrice}</td>
          <td>฿ ${ltcTHB}</td>
          <td>${ltcCirculatingSupply} ${ltcSymbol}</td>
          <td>$ ${ltcDayVolume}</td>
        </tr>

        <tr>
          <td>${adaRank}</td>
          <td><img src="images/icons/ada.png"> ${adaName}</td>
          <td>${adaSymbol}</td>
          <td>$ ${adaPrice}</td>
          <td>฿ ${adaTHB}</td>
          <td>${adaCirculatingSupply} ${adaSymbol}</td>
          <td>$ ${adaDayVolume}</td>
        </tr>

        <tr>
          <td>${xmrRank}</td>
          <td><img src="images/icons/xmr.png"> ${xmrName}</td>
          <td>${xmrSymbol}</td>
          <td>$ ${xmrPrice}</td>
          <td>฿ ${xmrTHB}</td>
          <td>${xmrCirculatingSupply} ${xmrSymbol}</td>
          <td>$ ${xmrDayVolume}</td>
        </tr>

        <tr>
          <td>${usdtRank}</td>
          <td><img src="images/icons/usdt.png"> ${usdtName}</td>
          <td>${usdtSymbol}</td>
          <td>$ ${usdtPrice}</td>
          <td>฿ ${usdtTHB}</td>
          <td>${usdtCirculatingSupply} ${usdtSymbol}</td>
          <td>$ ${usdtDayVolume}</td>
        </tr>

      </tbody>
    </table>
    
  </main>

</body>

    <script src="js/index.js"></script>

</html>