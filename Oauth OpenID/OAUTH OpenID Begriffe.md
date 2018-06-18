OAUTH OpenID Begriffe
========================

## scope
Client über den Parameter scope mit, für welche Ressourcen er welche Art von Zugriff anfordert. Der Wert von scope ist nicht durch den OAuth-Standard spezifiziert, ihn definieren derzeit jeder einzelne Autorisierungsserver sowie einzelne APIs selbst. Im Beispiel signalisiert der Client, dass er auf die Kontakte des Benutzers zugreifen möchte.

## claim

## Grand Type
Kompliziertheit des Verfahrens, nach dem das AccesToken erstellt werden soll. Bestimmt Anwendungsmöglichkeiten (?)
z.B: "Implicit", "Refresh Token", "Authorization Code",...

## Authentifizierung (Überprüfung der Identität) des Client
- "Public clients" nur cleint_id
- optional: "client_secret"

## Authorization Request

## redirect_uri
Rücksprung URI vom Authentication Server

## Passwort-Anti-Pattern
droht bei GrantType = "Resource Owner Passwerd Credentials"


