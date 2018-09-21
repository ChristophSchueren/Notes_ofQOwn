TODO_Code
=========

### Erster Schritt

Geraet.offeneAnnahmeBuchung entfernen

Ersetzen durch Geraet.zuteilung.


### Zweiter Schritt

Abstrahiere Interface Zuteilungsfaehig

jedes Zuteilungsfaehgig muss wissen, wie es sich selbst persistiert

geraet.save()
zuteilungsfaehig.save()

geraet braucht static reference to geraetservice (3. Tier, NICHT Repository)

download "helloworld.txt"

java call programm
youtube tutorial

Nutzer anlegen muss firma speichern

Buchung geraetId ist zu spezifisch
sollte fuer zuteilungsfaehig funktionieren