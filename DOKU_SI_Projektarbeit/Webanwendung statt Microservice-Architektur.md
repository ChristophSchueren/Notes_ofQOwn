Webanwendung statt Microservice-Architektur
===========================================

Es wird eine Integration der beiden Anwendungen angestrebt.
- Optik
- Datenaustausch der Benutzerkonten 
- Single Sign-On

Entwicklungen sollen getrennt sein. 

# Kein Microservice
All das können Microservices leisten.

Aber Microservices erhöhen die Komplexität weil
- SSV-Webanwendung umstrukturiert werden muss
- Load Balancer, und weiter Komponenten konfiguriert werden müssen
- nicht genutzte Funktionen wie vertikale Skalierbarkeit


# Keine reine Backend-API Integration Lösung
Realisierung von Spirit-Inventory als eigene Webanwendung mit definierter API -Schnittstelle zu SSV-Webanwendung

# Frontend-Integration