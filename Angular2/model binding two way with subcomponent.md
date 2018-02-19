model binding two way with subcomponent
=======================================

ungelöstes Problem

model binding two way with subcomponent

master-detail binding two-way

update observable

https://angular.io/tutorial/toh-pt3 simple

google search
`angular master detail update observable -AngularJS`


I recommend communicating via **bound objects**. Maybe you have a details object on some customer object somewhere that you can bind to the detail component. 

I have a master detail scenario here that might illustrate the concept: syntaxsuccess.com/viewarticle/recursive-treeview-in-angular-2.0 It's a treeview where a tree node can be a master for multiple child nodes. Different components, but a related concept from what I can tell. – TGH Nov 28 '15 at 2:02

# Example Bound Objects
http://www.syntaxsuccess.com/viewarticle/recursive-treeview-in-angular-2.0

Notice in the html for the treeview, there is a **self reference**. This is important since it's how I am able to render the nodes **recursively**.
<ul>
    <li *ngFor="let dir of directories">
        <span><input type="checkbox" [checked]="dir.checked" (click)="dir.check()"    /></span> 
        <span (click)="dir.toggle()">{{ dir.name }}</span>
        <div *ngIf="dir.expanded">
            <ul >
                <li *ngFor="let file of dir.files">{{file}}</li>
            </ul>
            <tree-view [directories]="dir.directories"></tree-view>
        </div>
    </li>
</ul>

