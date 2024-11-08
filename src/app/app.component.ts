import { Component } from '@angular/core';
import { ProductCategoryMenuComponent } from "./component/product-category-menu/product-category-menu.component";
import { SearchComponent } from "./component/search/search.component";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
  // imports: [
  //   // ProductCategoryMenuComponent, SearchComponent
  // ]
})
export class AppComponent {
  title = 'angular-ecommerce';
}
