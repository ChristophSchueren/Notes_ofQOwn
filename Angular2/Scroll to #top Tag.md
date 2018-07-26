Scroll to #top Tag
==================


    /**scroll to top of page */
    public toTop() {
        // this.router.navigate(['.'], {fragment: 'top'});
        document.querySelector('#' + 'top').scrollIntoView();
    }