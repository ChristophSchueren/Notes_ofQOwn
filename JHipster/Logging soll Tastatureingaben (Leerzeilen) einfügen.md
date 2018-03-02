Logging soll Tastatureingaben (Leerzeilen) einfügen
===================================================

Spring (xml)

```
<stream:stdin-channel-adapter channel="echo"/>

<channel id="echo"/>

<stream:stdout-channel-adapter channel="echo"/>
```


Oder auf Route reagieren


Im Code
1. Channel erzeugen
2. Auf stdin hören
3. Output erledigt spezieller logger - kein Problem


```
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Stream<String> stream = in.lines();
        stream.forEach((enterPressed)-> log.debug("---------------------------------------------------"));
```


