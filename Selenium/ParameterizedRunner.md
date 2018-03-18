ParameterizedRunner
===================

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

Ein Testfall, mehrere Aufrufe für jeden Parameter


Jeder Fall wird im TestExplorer separat gelistet. :-)

```
@RunWith(JUnitParamsRunner.class)
public class TestCase extends SeleniumBaseSpec {
...
@Test
	@Parameters({"chrome", 
     "firefox" })
	public static void testShowsMultipleWithEachBrowser(String vBrowser) throws Exception {
		driver = createDriver(vBrowser);
		driver.navigate().to("https://google.de");
		RegistrierungsPageBeispielanwendung page1 = new RegistrierungsPageBeispielanwendung(driver);
		page1.benutzerEingeben("Tim", "Meier", "tim.meier@web.de");
		page1.passwortEingeben("geheimesPasswort");
		page1.absenden();
		Thread.sleep(2000);
		String result = page1.holeNachricht();
		assertEquals("Hallo Herr Tim Meier,\n" + 
				"wilkommen in der HTML Test App. Sie haben sich mit der E-Mailadresse tim.meier@web.de und dem Passwort geheimesPasswort bei uns registriert.\n" + 
				"Sie haben das Standard-Paket gewählt.", result);
		driver.close();
	}

}
}
```
