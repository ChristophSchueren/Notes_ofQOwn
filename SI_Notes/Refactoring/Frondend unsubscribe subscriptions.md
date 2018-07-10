Frondend: unsubscribe subscriptions
===================================
```

routeSub: any;

ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            if (params['id']) {
                this.geraetPopupService
                    .open(GeraetRueckgabeDialogComponent as Component, params['id']);
            } else {
                this.geraetPopupService
                    .open(GeraetRueckgabeDialogComponent as Component);
            }
        });
    }

ngOnDestroy() {
  		this.routeSub.unsubscribe();
}
```
