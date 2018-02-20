BINDING
=======

Two-way binding ( [(...)] )

Here's an example in which the AppComponent.fontSizePx is two-way bound to the SizerComponent

`<app-sizer [(size)]="fontSizePx"></app-sizer>`

export class SizerComponent {
  @Input()  size: number | string;
  @Output() sizeChange = new EventEmitter<number>();
