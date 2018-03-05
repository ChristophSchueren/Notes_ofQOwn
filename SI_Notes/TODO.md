TODO
====
- geraet-dialog-component
	- removeRequiredSettingOfTemplate() DONE

GeraetType
- checkbox für required DONE




# Probleme

- geraet-create-dialog
	- Popupservice übergibt setzt geraet = new Geraet()  ZU SPÄT
	- <weitere-eigenschaften-component [geraet]="geraet"> bekommt geraet = null !!!

- C:\Users\Christoph\SpiritInventory\src\main\webapp\app\entities\geraet\geraet-changeuser-dialog.component.html
	-  <option value="GENUTZT" selected>{{'spiritInventoryApp.Verfuegbarkeit.GENUTZT' | translate}}</option>
	-  ist NICHT selected, aber Feld grün hinterlegt für Valid (geraet.neueVerfügbarkeit steht auf GENUTZT)


- key name "max. Bilddiagonale" wirft exception, wegen punkt im String"
	- Java Seite: Hashmap

Bootstrap
- two column Design

Datenbank Filter geraet ENTSORGT


Schöne Logs für Spring SLF4J