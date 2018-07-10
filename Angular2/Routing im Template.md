Routing im Template
===================

```
<!-- geraet/rueckgabe/byuser/:userlogin -->
                        <button type="submit"
                                [routerLink]="['/', { outlets: { popup: 'user-management/'+ user.login + '/edit'} }]"
                                replaceUrl="true"
                                queryParamsHandling="merge"
                                class="btn btn-primary btn-sm">
```


### [routerLink]

### replaceUrl = "true"

### queryParamsHandling