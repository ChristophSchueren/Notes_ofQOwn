Webanwendung statt Microservice-Architektur
===========================================

Es wird eine Integration der beiden Anwendungen angestrebt.
- Optik
- Datenaustausch der Benutzerkonten 
- Single Sign-On

Entwicklungen sollen getrennt sein.

All das können Microservices leisten.

Aber Microservices erhöhen die Komplexität weil
- SSV-Webanwendung umstrukturiert werden muss
- Load Balancer, und weiter Komponenten konfiguriert werden müssen
- nicht genutzte Funktionen wie vertikale Skalierbarkeit


Daher:
Eigene Webanwendung mit definierter API -Schnittstelle zu SSV-Anwendung