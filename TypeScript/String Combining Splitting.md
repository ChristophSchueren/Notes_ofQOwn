String Combining Splitting
==========================
/** spezifisch fuer combining values to value und kombiniert auslesen */
    public get value():string
    {
        const combindedString = this.values.join(',');
        return combindedString;
    }

    public set value(newvalue:string) // z.B. 'auto,notebook'
    {
        const splitArr = newvalue.split(',');
        this.values = splitArr;
    }
