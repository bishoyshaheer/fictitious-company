import { Injectable }    from '@angular/core';
import { Headers, Http, Response } from '@angular/http';

import '/app/rxjs-operators';

import { UserLogins } from './user-logins';

@Injectable()
export class LoginService {

  private loginUrl = 'login';  // URL to web api

  constructor(private http: Http) { }

  getUser(userLogins: UserLogins): Promise<any> {

    let url = `${userLogins.username}/${this.loginUrl}/${userLogins.password}`;

    return this.http.get(url)
      .toPromise();
      // .then(this.extractData)
      // .catch(this.handleError);
  }

  // private extractData(res: Response) {
  //   let body = res.json();
  //   // console.log(body.data);
  //   return body || {};
  // }

  // private handleError(error: any) {
  //   // console.error('An error occurred', error);
  //   return Promise.reject(error.message || error);
  // }
}
