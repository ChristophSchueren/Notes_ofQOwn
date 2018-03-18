create Obersvable
=================

import { of } from 'rxjs/observable/of';
import { from } from 'rxjs/observable/from';
import { range } from 'rxjs/observable/range';


const source$ = of(1,2,3);
const rangeSource$ = range(0,5);

var clicksInDiv = Rx.Observable.*fromEvent*(someDivInDocument, 'click');