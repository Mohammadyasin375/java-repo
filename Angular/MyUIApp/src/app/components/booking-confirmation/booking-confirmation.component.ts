import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-booking-confirmation',
  templateUrl: './booking-confirmation.component.html',
  styleUrls: ['./booking-confirmation.component.css']
})
export class BookingConfirmationComponent implements OnInit {
  name: string;
  contact: string;
  doctorId: string;
  slotId: string;
  apptDate: string;

  constructor() { }

  ngOnInit(): void {
    this.name = localStorage.getItem('name');
    this.contact = localStorage.getItem('contact');
    this.doctorId = localStorage.getItem('doctorId');
    this.slotId = localStorage.getItem('slotId');
    this.apptDate = localStorage.getItem('apptDate');
  }

}
