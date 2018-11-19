import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
/*this*/
import{FormsModule}   from '@angular/forms';
import {RouterModule, Routes} from '@angular/router';
import {HttpModule} from '@angular/http';
import {UserService} from './shared_service/user.service';
/*this*/

import { AppComponent } from './app.component';
import { ListuserComponent } from './components/listuser/listuser.component';
import { UserformComponent } from './components/userform/userform.component';
import { from } from 'rxjs';

/*this*/ 
const appRoutes:Routes=[

  { path: '', component: ListuserComponent },
  { path: 'op', component: UserformComponent }
]
/*this*/
@NgModule({
  declarations: [
    AppComponent,
    ListuserComponent,
    UserformComponent
  ],
  imports: [
    BrowserModule,
    /*this*/ 
    FormsModule,
    HttpModule,
    RouterModule.forRoot(appRoutes)
   /*this*/
  ],
  /*this*/
  providers: [UserService],
  /*this*/ 
  bootstrap: [AppComponent]
})
export class AppModule { }
