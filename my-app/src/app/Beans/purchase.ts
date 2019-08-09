import { User } from './User';
import { Billing } from './Billing';
import { Address } from './Address';

export class Purchase{
    user:User;
    total:number;
    billing:Billing;
    address:Address
    date:Date;
    email:string;
    usersName:string;
    status:string;

    

}