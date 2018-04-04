Problem Query Vervollstaendigungsmoeglichkeiten
===============================================

1. gut waere ein Endpunkt fuer alle Vervollstaendigungstypen ?
> "/geraet/vervollstaendigung"
/geraet/vervollstaendigung?type = "


2. gut waere, wenn die reqParams unveraendert weiterverwendet werden koeenten
=> kein extra parameter type (sowiso geraet.type reserviert)

3. Herrausstellen: was wurde momentan schon gettippt:
=> doch extra reqParam
=> Zwei Observables hintereinander
=> Kombiniere Obs queryParams + alreadyTipped
=> Delay
+ const vervollstaendigungsTyp beim Abruf
