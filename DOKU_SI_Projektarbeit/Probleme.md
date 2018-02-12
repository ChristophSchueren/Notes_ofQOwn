#Probleme / Design Choices

##Polymorphie (Entitäten) in relationale Datenbank abblilden
-Speichern
-Laden
-Abgeleitete Klassen enthalten zusätzliche Attribute

##Autonomie Microservice
Alle Daten sollten unter der vollen Kontrolle des Microservices sein.
Nutzerprofile stammen aber von SSV Anwendung und werden mit dieser geteilt.
Was soll passieren, wenn SSV ein Profil löscht?

##Authentifizierung / Autorisierung
Muss von SSV ausgehen

##Bezeichung
"inventar item" sind zwei Worte. "Asset" besser?

##Tabellen in gleicher Datenbank wie SSV Spirit SkillProfil Verwaltung: Präfix INV_