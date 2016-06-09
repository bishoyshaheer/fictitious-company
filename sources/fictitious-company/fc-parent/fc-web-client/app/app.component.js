"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require('@angular/core');
var router_1 = require('@angular/router');
var login_component_1 = require('./components/login/login.component');
var layout_component_1 = require('./components/layout/layout.component');
var AppComponent = (function () {
    function AppComponent(router) {
        this.router = router;
        this.title = 'Fictitious Company';
    }
    AppComponent.prototype.ngOnInit = function () {
        this.router.navigateByUrl('/login');
    };
    AppComponent = __decorate([
        core_1.Component({
            selector: 'fc-app',
            template: "<router-outlet></router-outlet>",
            directives: [router_1.ROUTER_DIRECTIVES],
            providers: [
                router_1.ROUTER_PROVIDERS
            ]
        }),
        router_1.Routes([
            {
                path: '/login',
                component: login_component_1.LoginComponent
            },
            {
                path: '/layout',
                component: layout_component_1.LayoutComponent
            }
        ]), 
        __metadata('design:paramtypes', [router_1.Router])
    ], AppComponent);
    return AppComponent;
}());
exports.AppComponent = AppComponent;
//# sourceMappingURL=app.component.js.map