Tree-shaking is the process of dead code elimination
====================================================


Operator which are part of the prototype of the observable are not tree-shakable by webpack or other bundlers. This will increase the bundle size since the operators becomes *part of the bundle* even if they are not used. Lettable operators, however, are pure functions. When unused, they are excluded from the bundle. Even linters can identify that the functions are declared but not used anywhere.
