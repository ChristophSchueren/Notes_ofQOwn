Remote Server
=============

1. `java -jar selenium-server-standalone-x.xx.x.jar -role hub`
> ein zentraler hub reicht, nicht pro Maschine notwendig

2. check:
`http://localhost:444/grid/console`
im Browser aufrufen

3. es muss mindestens ein node gestartet werden, der auf  den hub zugreift
`java -jar selenium-server-standalone-x.xx.x.jar -role node -hub http://localhost:4444/grid/register`

> alles in einer Zeile ausführen

4. Selenium Testcase ausführen, verwende in java
`driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub", new ChromeSettings())`
*von der URL her wird der hub-Server hier als hub angesprochen*


> Die Selenium-Bibliothek-versionen müssen mit der Server-Version und mit der Browser-Version übereinstimmen!!!