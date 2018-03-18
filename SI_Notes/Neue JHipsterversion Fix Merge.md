Neue JHipsterversion Fix Merge
==============================
> Zweiter Monitor für Java Spring Logs view parallel zu Frontend-Bedienung

Idee: Git mit altem Stand als Referenz

Dann vergleichen mit aktuellem Datei-Stand

Zum Laufen Bringen



Dann rüberkopieren in neuen Stand-Ordner

ERST DORT nach Kopieren commiten!!!



Fazit: Filtern funktioniert überhaupt nicht mehr!
> Grund: C:\Users\Christoph\SpiritInventory\src\main\webapp\app\shared\model\request-util.ts changed:
keine BaseRequestOptions mehr. Nur noch 
`import { HttpParams } from '@angular/common/http';`

Schuld der Frontend?
Query direkt mit Swagger API
oder mit funktionierender Frontend-Version

Schuld des Backend?

A) Neues Frontend mit funktionierendem, bekanntem *altem* Backend kombinieren (aus anderem Ordner Starten)

B) Neues Backend mit funktionierendem, bekanntem *altem* Frontend kombinieren (aus anderem Ordner Starten)


Momentanes Fazit: neues Backend filtert nicht, obwohl Filter logeinträge hinterlassen werden alle Datensätze zurückgegeben...


Neues Backend funktioniert mit ALTEM Frontend, Filter nach verfuegbarkeit OK
