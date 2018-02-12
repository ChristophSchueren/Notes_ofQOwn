JhiEventManager, JhiAlertService


ngOnDestroy() {
        this.eventManager.destroy(this.eventSubscriber);
    }

registerChangeInEigenschafts() {
	this.eventSubscriber = this.eventManager.subscribe('eigenschaftListModification', (response) => this.loadAll());
}