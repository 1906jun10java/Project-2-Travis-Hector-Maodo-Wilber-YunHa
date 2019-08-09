import { Item } from './Item';
import { Purchase } from './purchase';

export class purchaseItem{
    quantity:number;
    total:number;
    product:Item;
    purchases:Purchase;
}