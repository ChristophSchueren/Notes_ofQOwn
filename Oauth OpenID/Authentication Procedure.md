Authentication Procedure
========================

Der *Client* erhält nur Zugriff auf die Daten des Benutzers, wenn dieser vorher zugestimmt hat. Hierzu sendet der Client einen **Authorization Request** (1) an den *Resource Owner*. Das kann bedeuten, dass der Client den Benutzer direkt nach Benutzername und Passwort fragt. Es kann sich aber auch um eine Anfrage handeln, die via **Browser-Weiterleitung über den Authorization Server** als Mittler durchgeführt wird. Wenn der Benutzer dem Zugriff zustimmt, erhält der Client einen korrespondierenden (2) *Authorization Grant* ausgehändigt. Abbildung 4 zeigt beispielhaft einen Dialog für eine solche Zustimmung. Den Grant sendet der Client an den *Authorization Server* (3), der im Gegenzug ein *Access Token ausstellt* (4). Dieses verwendet der Client dann für die Autorisierung von Aufrufen beim Resource Server (5..n).

![chrome_2018-06-18_11-49-39](file://media/15114.png)
