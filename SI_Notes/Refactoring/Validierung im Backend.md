Validierung im Backend
======================

# Validation Service
Abhängigkeiten: Welcher Service injeziert welchen?


# Valdiation näher an Entity

- class static inject Validationservice
- Analog "Strategy pattern"
- bool validate() {
	if (!validationService) {
	throw new Exception ("ValdiationService not injected into" + this.class.getName };
	return Entity.validator.validate(this)
}

wie inject statically into class, z.B. Geraet???

Validationservice.validate(Entitytype Object){
}

static classname setValidator(Validationservice validationService) {
} 

# Relevante Dateien
Entities: Geraet, Buchung
ValidationService (MultiStringList Validation (Firmen-Namen))
MongoDbReferenceChecker
BerechtigungCheckService