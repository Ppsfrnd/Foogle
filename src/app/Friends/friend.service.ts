import { Http, RequestMethod, Response } from '@angular/http'
import { Injectable } from '@angular/core'
import { Observable } from 'rxjs'
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/do'
import { Friend } from './friend'




@Injectable()
export class FriendService {



    baseUrl = 'http://localhost:8080/app/display/';

    baseUrl_add = 'http://localhost:8080/app/add';
    baseUrl_delete = 'http://localhost:8080/app/delete/'
    baseUrl_update = 'http://localhost:8080/app/update'

    constructor(private _http: Http) { }



    getFriend(id): Observable<Friend> {
        debugger;

        return this._http.get(this.baseUrl + id).map((res: Response) => <Friend>res.json()).do(data => (console.log(data)))._catch(this.handleError);

    }
    deleteFriend(id: number): Observable<Friend> {
        debugger;

        return this._http.delete(this.baseUrl_delete + id).map((res: Response) => res.json()).do(data => (console.log(data)))._catch(this.handleError);

    }

    addFriend(friend: Friend): Observable<Friend> {
        debugger;

        return this._http.post(this.baseUrl_add, friend).map((res: Response) => res.json()).do(data => (console.log(data)))._catch(this.handleError);



    }
    updateFriend(friend: Friend): Observable<Friend> {
        debugger;
        return this._http.put(this.baseUrl_update, friend).map((res: Response) => res.json()).do(data=> (console.log(data)))._catch(this.handleError);
    }

    private handleError(error: Response) {
        console.error(error);
        return Observable.throw(error.json().error || 'Server Error')
    }


}
