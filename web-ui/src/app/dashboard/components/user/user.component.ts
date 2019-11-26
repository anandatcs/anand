import { Component, OnInit } from '@angular/core';
import { USER_COLS } from '../../constants/index';
import { User } from '../../models/user';
import { DashboardService } from '../../services/dashboard.service';

@Component({
  selector: 'app-dashboard-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  cols: any[];

  users: User[];
  isAdd = true;
  label: string;
  status: string;
  showAdd = true;
  header = 'Users';

  accessToken = '3847af13-fc47-4c99-a26c-42b40dbec589';
  constructor(private _dashboardservice: DashboardService) { }

  ngOnInit() {
    this.cols = USER_COLS;
    this.getUsers();
  }

  public getUsers(): void {
    this._dashboardservice.getUsers(this.accessToken).then(data => {
      this.users = data;
    });
  }

  onstateChange(event): void {
    console.log(event);
  }

  onFormDataSave(event): void {
    console.log(event);
  }


}
