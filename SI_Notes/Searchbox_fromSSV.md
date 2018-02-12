div style="padding:5px;border-radius:5px;background-color: rgb(242, 242, 242); margin-bottom:10px" class="float-right">
                        <div class="float-left" style="padding:5px">
                            <h5>Filter</h5>
                            <div ngbDropdown class="d-inline-block" style="padding:5px">
                                <button class="btn btn-sm" (click)="deleteValue(); setISODateToday()" id="MitarbeiterFilterButton" ngbDropdownToggle>
                                    <span class="fa fa-search"></span>
                                    Verfügbare Mitarbeiter
                                </button>
                                <div ngbDropdownMenu aria-labelledby="MitarbeiterFilterButton">
                                    <button class="dropdown-item" type="submit" (click)='getUserWithActivity(dateISO);this.setFilter("MitarbeiterFilter")' id="MitarbeiterFilterButton">
                                        <span class="hidden-md-down">
                                            <i class="fa fa-clock-o"></i>
                                            &nbsp;Ab Sofort frei:&nbsp;
                                            <u style="font-weight: bolder">{{dateISO |date: formatDate}}</u>
                                        </span>
                                    </button>
                                    <button class="dropdown-item" type="submit" (click)='this.setFilter("MitarbeiterFilter")' id="MitarbeiterFilterButton1">
                                        <span class="hidden-md-down">
                                            <i class="fa fa-calendar"></i>
                                            &nbsp;Nach Datum suchen </span>
                                    </button>
                                    <li class="dropdown-divider"></li>
                                    <button class=" dropdown-submenu dropdown-item dropdown-toggle" type="submit" id="MitarbeiterFilterButton2">
                                        <span class="hidden-md-down">
                                            <i class="fa fa-calendar-check-o"></i>
                                            &nbsp;Nach Wochen suchen: </span>
                                        <ul class="dropdown-menu">
                                            <button class="dropdown-item" type="submit" (click)="setTime(7);this.setFilter('MitarbeiterFilter')">
                                                in eine Woche
                                            </button>
                                            <button class="dropdown-item" type="submit" (click)="setTime(14);this.setFilter('MitarbeiterFilter')">
                                                in zwei Wochen
                                            </button>
                                            <button class="dropdown-item" type="submit" (click)="setTime(28);this.setFilter('MitarbeiterFilter')">
                                                in vier Wochen
                                            </button>
                                        </ul>
                                    </button>
                                </div>
                            </div>
                            <div ngbDropdown class="d-inline-block" style="padding:5px">
                                <button (click)='this.setFilter("PositionenFilter")' class="btn btn-sm" id="PositionenFilterButton" ngbDropdownToggle>Positionen
                                </button>
                                <div ngbDropdownMenu aria-labelledby="PositionenFilterButton" (click)='this.setFilter("PositionenFilter")'>
                                    <button class="dropdown-item" (click)="loadByAuthorities(['ROLE_CONSULTANT', 'ROLE_FREELANCER', 'ROLE_CANDIDATE'])">
                                        Alle anzeigen
                                    </button>
                                    <button class="dropdown-item" (click)="loadByAuthorities(['ROLE_CONSULTANT'])">Berater anzeigen
                                    </button>
                                    <button class="dropdown-item" (click)="loadByAuthorities(['ROLE_FREELANCER'])">Freie Mitarbeiter anzeigen
                                    </button>
                                    <button class="dropdown-item" (click)="loadByAuthorities(['ROLE_CANDIDATE'])">Bewerber anzeigen
                                    </button>
                                    <hr/>
                                    <button class="dropdown-item" (click)="loadByAuthorities(['ROLE_APPLICANT'])">Neue Bewerber anzeigen
                                    </button>
                                </div>
                            </div>
                            <div class="d-inline-block" style="padding:5px">
                                <button (click)='this.setFilter("SkillFilter");deleteValue()' class="btn btn-sm" id="SkillFilterButton">Fähigkeiten </button>
                            </div>
                            <div ngbDropdown class="d-inline-block" style="padding:5px">
                                <button ngbDropdownToggle class="btn btn-sm" id="ActivityFilterButton">Berufserfahrungen
                                </button>
                                <div ngbDropdownMenu aria-labelledby="ActivityFilterButton">
                                    <button class="dropdown-item" *ngFor="let role of roles" (click)="findAllActivitiesWithRole(role.id);setFilter('ActivityFilter'); setRole(role);deleteValue()">
                                        {{role.name}}
                                    </button>
                                </div>

                            </div>
                            <div class="d-inline-block" style="padding:5px">
                                <button (click)="loadByAuthorities(['ROLE_CONSULTANT', 'ROLE_FREELANCER', 'ROLE_CANDIDATE']); this.setFilter('NoFilter')"
                                    class="btn btn-sm" id="NoFilterButton">Kein Filter
                                </button>
                            </div>
                        </div>
                        <div>
                            <div></div>
                            <div id="PositionenFilter"></div>
                            <div id="MitarbeiterFilter">
                                <div class="form-group">
                                    <div class="input-group">
                                        <input type="text" class="form-control" disabled="disabled" id="datepicker" placeholder="alle freien Mitarbeiter ab {{ dateISO | date: formatDate }} oder wählen Sie ein neues Datum zum filtern"
                                            ngbDatepicker #datePicker="ngbDatepicker">
                                        <span class="input-group-btn">
                                            <button type="button" class="btn btn-default" (click)="datePicker.toggle()">
                                                <i class="fa fa-calendar"></i>
                                            </button>
                                        </span>
                                    </div>
                                    <button class="btn btn-info btn-sm float-left" (click)="deleteValue()">
                                        <span class="fa fa-arrow-circle-o-left"></span>
                                        <span> &nbsp;Zurücksetzen</span>
                                    </button>
                                    <button class="btn btn-primary btn-sm float-right" (click)="getUserWithActivity(this.date)">
                                        <span class="fa fa-search"></span>
                                        <span> &nbsp;Suchen</span>
                                    </button>
                                </div>
                            </div>
                            <div id="SkillFilter">
                                <input type="text" class="btn btn-sm form-control" list="skilldatalist" id="textskilldatalist" (change)="getUserBehindSkill()"
                                    placeholder="Suche nach Skills: z.B. Java">
                                <datalist id="skilldatalist">
                                    <option *ngFor="let skill of skills" value="{{skill}}"></option>
                                </datalist>
                                <button class="btn btn-info btn-sm float-left" (click)="deleteValue()">
                                    <span class="fa fa-arrow-circle-o-left"></span>
                                    <span> &nbsp;Zurücksetzen</span>
                                </button>
                                <button class="btn btn-primary btn-sm float-right" (click)="getUserBehindSkill()">
                                    <span class="fa fa-search"></span>
                                    <span> &nbsp;Suchen</span>
                                </button>
                            </div>
                            <div id="ActivityFilter">
                                <input type="text" class="btn btn-sm form-control" list="activitydatalist" id="textactivitydatalist" (change)="getUserBehindActivity();"
                                    placeholder="Suche nach {{this.selectedRoleName}}">
                                <datalist id="activitydatalist">
                                    <option *ngFor="let activity of activities" value="{{activity}}"></option>
                                </datalist>
                                <button class="btn btn-info btn-sm float-left" (click)="deleteValue()">
                                    <span class="fa fa-arrow-circle-o-left"></span>
                                    <span> &nbsp;Zurücksetzen</span>
                                </button>
                                <button class="btn btn-primary btn-sm float-right" (click)="getUserBehindActivity()">
                                    <span class="fa fa-search"></span>
                                    <span> &nbsp;Suchen</span>
                                </button>
                            </div>
                            <div id="NoFilter"></div>
                        </div>
                    </div>