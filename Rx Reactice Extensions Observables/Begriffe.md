Begriffe
========

Reactive style programming 
mit Observables


Basiert auf dem Observable pattern
ist NICHT das Gang-of-four- *Observer* pattern

Verbesserungen
1. Leserechte bedeuten nicht automatisch Schreibrechte (emit, next...)
	- altes notfify() ist neues next()
	- split Observer(has next) und Observable interface
	- combined: Subject


Naming convention: Obervable heißt wie Variable, mit nachgestelltem Dollar $

*reqParams$*