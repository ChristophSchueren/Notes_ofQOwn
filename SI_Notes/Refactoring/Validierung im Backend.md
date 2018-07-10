Validierung im Backend
======================

# Validation Service
Abhängigkeiten: Welcher Service injeziert welchen?


# Valdiation näher an Entity

- class static inject Validationservice
- Analog "Strategy pattern"
- bool validate() {
	return Entity.validator.validate(this)
}

wie inject statically???

Validationservice.validate(Entitytype Object){
}