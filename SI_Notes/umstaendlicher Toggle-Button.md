umstaendlicher Toggle-Button
============================

```
<div>
                    <button class="btn btn-danger btn-sm" (click)="setActive(user, true)" *ngIf="!user.activated"
                            jhiTranslate="userManagement.deactivated">Deactivated</button>
                    <button class="btn btn-success btn-sm" (click)="setActive(user, false)" *ngIf="user.activated"
                            [disabled]="currentAccount.login === user.login" jhiTranslate="userManagement.activated">Activated</button>
  </div>
```


*jhiHasAnyAuthority="['ROLE_ADMIN']"

C:\Users\Christoph\SpiritInventory\src\main\webapp\app\admin\user-management\user-management.component.html

C:\Users\Christoph\SpiritInventory\src\main\webapp\app\admin\admin.route.ts	

authorities: ['ROLE_ADMIN', 'ROLE_OFFICE']