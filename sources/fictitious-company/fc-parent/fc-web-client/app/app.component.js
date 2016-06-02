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
var AppComponent = (function () {
    function AppComponent() {
    }
    AppComponent = __decorate([
        core_1.Component({
            selector: 'my-app',
            template: "<div class=\"container\">\n    <div class=\"row\">\n        <div class=\"col-md-4 col-md-offset-4\">\n            <div class=\"login-panel panel panel-default\">\n                <div class=\"panel-heading\">\n                    <h3 class=\"panel-title\">Please Sign In</h3>\n                </div>\n                <div class=\"panel-body\">\n                    <form role=\"form\">\n                        <fieldset>\n                            <div class=\"form-group\">\n                                <input class=\"form-control\" placeholder=\"E-mail\" name=\"email\" type=\"email\" autofocus>\n                            </div>\n                            <div class=\"form-group\">\n                                <input class=\"form-control\" placeholder=\"Password\" name=\"password\" type=\"password\" value=\"\">\n                            </div>\n                            <div class=\"checkbox\">\n                                <label>\n                                    <input name=\"remember\" type=\"checkbox\" value=\"Remember Me\">Remember Me\n                                </label>\n                            </div>\n                            <!-- Change this to a button or input when using this as a form -->\n                            <a href=\"index.html\" class=\"btn btn-lg btn-success btn-block\">Login</a>\n                        </fieldset>\n                    </form>\n                </div>\n            </div>\n        </div>\n    </div>\n</div>"
        }), 
        __metadata('design:paramtypes', [])
    ], AppComponent);
    return AppComponent;
}());
exports.AppComponent = AppComponent;
//# sourceMappingURL=app.component.js.map