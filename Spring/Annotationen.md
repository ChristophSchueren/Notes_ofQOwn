Annotationen
============

@Service
Services werden zuerst gestartet und instanttiert.
Dependency-Injection funktioniert

@Autowired
Beim Start verschaltet
> Reihenfolge: beachte Log-Ausgaben bei Start
aus .org.springframework
.org.springframework.shell

@ShellMethod
verschaltet an einer Stelle


@Component
Klasse wird beim sarten instantiiert

@PostConstruct
public void initExecute() {
}
Nach Instantiierung der Klasse wird initExecute ausgeführt



### JPA Java Persistance API (Hibernate)
@Column
@Basic
private String name;

betzeichnen eine Spalte in der relationalen Datenbank. Mapping erfolgt automatisch.

