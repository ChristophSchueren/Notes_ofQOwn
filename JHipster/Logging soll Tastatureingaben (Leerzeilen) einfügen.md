Logging soll Tastatureingaben (Leerzeilen) einfügen
===================================================

Spring (xml)

```
<stream:stdin-channel-adapter channel="echo"/>

<channel id="echo"/>

<stream:stdout-channel-adapter channel="echo"/>
```
