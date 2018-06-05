Popup individuell, COOL
=======================

```
<div >
    <input type="checkbox" [ngbPopover]="popContent" placement="top" container="body">
    <div [ngbPopover]="popContent">Hier klicken</div>
    <ng-template #popContent>
        <ngb-rating #level max=4 ></ngb-rating>
        <pre> umfangreicheres Template Freiform </pre>
    </ng-template>
</div>
```
funktioniert!