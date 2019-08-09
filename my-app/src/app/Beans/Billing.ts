import { User } from './User';

export class Billing{
    paymentId:number
    userID:number
    user:User;
    expirationDate:Date;
    nameOnCard:string;
    cardNumber:number;
    securityCode:number;
    cardType:string;

}