import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { HttpManagerService } from './../../services/http-manager.service';
import { environment } from './../../../environments/environment.prod';
import { User } from './../models/user';


@Injectable({
  providedIn: 'root'
})
export class DashboardService {

  constructor(private httpManager: HttpManagerService) {}

  getUsers(accessToken?: string): Promise<User[]> {
    const url = accessToken ? `${environment.endpointUrl.user}?access_token=${accessToken}`
                : environment.endpointUrl.user;
    return this.httpManager.get<User[]>(url);
  }

}
