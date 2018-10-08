import { Injectable } from '@angular/core';
import { HttpClient , HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class AppService{

    constructor(private http:HttpClient ) { }

    submitForm(data) {

       // data = JSON.stringify(data);
        return this.http.post('http://localhost:8082/registerUser', data);
    }

    submitFormH(data) {

        // data = JSON.stringify(data);
         return this.http.post('http://localhost:8082/registerUserFailBack', data);
     }

}