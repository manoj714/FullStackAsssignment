import { Component } from '@angular/core';
import { AppService } from '../app/app.component.service';
import { SelectItem } from 'primeng/components/common/api';
import { Message } from 'primeng/components/common/api';
import { MessageService } from 'primeng/components/common/messageservice';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [MessageService]
})
export class AppComponent {

  public email: string;
  public password: string;
  public address: string;
  public inputCity: string;
  public zipCode: string;


  msgs: Message[] = [];

  constructor(private service: AppService, private messageService: MessageService) {

  }

  showSuccess() {
    this.msgs = [];
    this.msgs.push({ severity: 'success', summary: 'Success Message', detail: 'Form submitted' });
  }
  showError() {
    this.msgs = [];
    this.msgs.push({ severity: 'error', summary: 'Error Message', detail: 'Validation failed' });
  }

  submitFormBadHandled() {
    let data = {};
    data["name"] = this.email;
    data["password"] = this.password;
    data["address"] = this.address;
    data["city"] = this.inputCity;
    data["zipCode"] = this.zipCode;

    console.log(data);
    this.service.submitFormH(data).subscribe(response => {
      this.showSuccess();
    },
      error => {
        this.showError();
      })
  }
  submitForm() {

    let data = {};
    data["name"] = this.email;
    data["password"] = this.password;
    data["address"] = this.address;
    data["city"] = this.inputCity;
    data["zipCode"] = this.zipCode;


    this.service.submitForm(data).subscribe(response => {
     
      this.showSuccess();
    },
      error => {
       
        this.showError();
      })


  }
}
