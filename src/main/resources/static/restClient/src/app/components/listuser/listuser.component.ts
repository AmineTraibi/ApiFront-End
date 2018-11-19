import { Component, OnInit } from '@angular/core';
import {UserService} from '../../shared_service/user.service';
import {User} from '../../user';
import { from } from 'rxjs';
import{Router}  from '@angular/router';
@Component({
  selector: 'app-listuser',
  templateUrl: './listuser.component.html',
  styleUrls: ['./listuser.component.css']
})
export class ListuserComponent implements OnInit {
 
  private users:User[];
  constructor(private _userservice:UserService,private _router:Router) { }

  ngOnInit() {

    this._userservice.getUsers().subscribe((users)=>{ 
        console.log(users);
        this.users=users;
    },(error)=>{
        console.log(error);
    })
  }

  deleteUser(user){
    this._userservice.deleteUser(user.emailID).subscribe((data)=>{
        this.users.splice(this.users.indexOf(user),1);
    },(error)=>{
      console.log(error);
    });
  }

   updateUser(user){  
     this._userservice.setter(user);
     this._router.navigate(['/op']);


   }
   newUser(){
   let user = new User();
    this._userservice.setter(user);
     this._router.navigate(['/op']);
   
   }

}
