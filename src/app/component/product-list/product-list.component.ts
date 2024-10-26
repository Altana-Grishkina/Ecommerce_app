import { Product } from '../../common/product';
import { ProductService } from './../../services/product.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list-grid.component.html',
  // templateUrl: './product-list-table.component.html',
  //templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.css'
})
export class ProductListComponent implements OnInit {

  products: Product[] = [];
  constructor(private ProductService: ProductService) {

  }

  ngOnInit(): void {
    this.listProducts();
  }

  listProducts() {
    this.ProductService.getProductList().subscribe(
      data => {
        this.products = data;
      }
    )
  }
}
