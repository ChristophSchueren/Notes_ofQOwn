Opening an angular Modal without popup-service: ng-bootstrap
============================================================

```
private modal: NgbModal, openModal(myModal, entitiyID) {
       this.baSkillprofilService.find(entitiyID).subscribe((entity) => {
           this.baSkillprofile = entity;
           if (this.baSkillprofile !== undefined) {
               this.dialog = this.modal.open(myModal, { size: 'lg' });

           }
       });
   }
   close() {
       this.dialog.close();
   }
```


### 
```
<button type="button" (click)="openModal(baSkillModal, skill.id)" class="btn btn-info btn-sm">
                               <span class="fa fa-eye"></span>
                               <span class="hidden-md-down">&nbsp;Ansehen</span>
                           </button>
<ng-template #baSkillModal role="dialog">
```
