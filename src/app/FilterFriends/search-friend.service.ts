import { Http, RequestMethod, Response } from '@angular/http'
import { Injectable } from '@angular/core'
import { Observable } from 'rxjs'
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/do'
import { Friend } from '../Friends/friend'

@Injectable()
export class SearchFriendService {


    baseUrl = 'http://localhost:8080/app/listAll';



    constructor(private _http: Http) { }


    getAll(): Observable<Friend[]> {


        return this._http.get(this.baseUrl).map((res: Response) => <Friend[]>res.json())._catch(this.handleError);

    }


    private handleError(error: Response) {
        console.error(error);
        return Observable.throw(error.json().error || 'Server Error')
    }

}
