<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="css/warenkorb.css">
  
  <title>Warenkorb</title>
</head>
<body>
  <h1>Ihr Warenkorb</h1>

  <table border="1">
    <tr>
      <th>Produkt</th>
      <th>Einzelpreis</th>
      <th>Menge</th>
      <th>Gesamtpreis</th>
      <th>Aktion</th>
    </tr>

    <tr>
      <td>Tablet Air 10</td>
      <td>349,00 &euro;</td>
      <td><input type="number" name="menge" value="1" min="1" /></td>
      <td>349,00 &euro;</td>
      <td><button>Entfernen</button></td>
    </tr>

    <tr>
      <td>Bluetooth Lautsprecher Boom</td>
      <td>79,00 &euro;</td>
      <td><input type="number" name="menge" value="2" min="1" /></td>
      <td>158,00 &euro;</td>
      <td><button>Entfernen</button></td>
    </tr>

    
    <tr>
      <td colspan="3" align="right"><b>Gesamtsumme:</b></td>
      <td colspan="2"><b>507,00 &euro;</b></td>
    </tr>
  </table>

  <br>

  <form action="CheckoutView.jsp" method="post">
    <input type="submit" value="Zur Kasse gehen" />
    <input type="button" value="Weiter einkaufen" onclick="window.location.href='ShopView.jsp';" />
  </form>

</body>
</html>