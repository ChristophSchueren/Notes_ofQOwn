Stream iterate
==============

 ```
List<Adress> beispielAdressen = Stream.iterate(0, n -> n + 1)
                    .limit(new Random().nextInt(5))
                    .map(it -> new Address("Hamburger City", "Random Muster Straße " + it, it + "5678"))
                    .collect(Collectors.toList()));
```
