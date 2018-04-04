Java Stram Intersection
=======================

```
List<T> intersect = list1.stream()
                         .filter(list2::contains)
                         .collect(Collectors.toList());
```
