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

wie inject statically???

Validationservice.validate(Entitytype Object){
}

static classname setValidator(Validationservice validationService) {
} 