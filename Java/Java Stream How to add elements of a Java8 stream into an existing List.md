Java Stream How to add elements of a Java8 stream into an existing List
=======================================================================

```
List<String> source = ...;
List<Integer> target = ...;

source.stream()
      .map(String::length)
      .forEachOrdered(target::add);
```

```
List<Integer> list = ...;
// add even numbers from the list to the list again.
list.addAll(list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList())
);
```





