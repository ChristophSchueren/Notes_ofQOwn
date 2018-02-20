optional values - safe navigation operator
========================

The *safe navigation operator* (?) of TypeScript means that the employer field is optional and if undefined, the rest of the expression should be ignored.

`<p>Employer: {{employer?.companyName}}</p>`

Unlike the safe navigation operator, the *non-null assertion operator* `geraet!.wert` does not guard against null or undefined. Rather it tells the TypeScript type checker to suspend strict null checks for a specific property expression.

```
<!--No hero, no text -->
<div *ngIf="hero">
  The hero's name is {{hero!.name}}
</div>
```
The $any type cast function ($any( <expression> ))