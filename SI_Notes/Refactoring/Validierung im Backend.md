Validierung im Backend
======================

# Problem: 
Dateien werden für Validierung und später Ausgabe möglicherweise mehrfach aus Datenbank gelesen und ni

# Validation Service
Abhängigkeiten: Welcher Service injeziert welchen?


# Valdiation näher an Entity

- class static inject Validationservice
- Analog "Strategy pattern"
- bool validate() {
	if (!validationService) {
	throw new Exception ("ValdiationService not injected into" + this.class.getName };
	// TODO: Do Validation by Class Attributes 	@NotNull first...
	if (!basicCheck()) {
		return false; } 
	return Entity.validator.validate(this)
}

wie inject statically into class, z.B. Geraet???

Validationservice.validate(Entitytype Object){
}

static classname setValidator(Validationservice validationService) {
} 

# Relevante Dateien

Entities: Geraet, Buchung
- keine Service-Importe
ValidationService (MultiStringList Validation (Firmen-Namen))
****
MongoDbReferenceChecker
BerechtigungCheckService