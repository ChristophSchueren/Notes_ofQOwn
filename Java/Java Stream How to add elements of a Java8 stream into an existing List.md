Java Stream How to add elements of a Java8 stream into an existing List
=======================================================================

```
List<String> source = ...;
List<Integer> target = ...;

source.stream()
      .map(String::length)
      .forEachOrdered(target::add);
```





