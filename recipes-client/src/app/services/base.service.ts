import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ingredient } from '../models/ingredient';
import { Recipe } from '../models/recipe';
import { environment } from "../../environments/environment";

export enum SortDirection {
  ASC,
  DESC
}

@Injectable({
  providedIn: 'root'
})
export abstract class BaseService {

  protected baseUrl = environment.apiBaseUrl;

  constructor(protected http: HttpClient) { }

  protected httpGet<T>(path: string, params?: Object):  Observable<T> {
    document.body.style.cursor = 'wait';
    let response: Observable<T> = this.http.get<T>(path, params);
    response.subscribe(() => document.body.style.cursor = 'default')
    return response;
  }
}
