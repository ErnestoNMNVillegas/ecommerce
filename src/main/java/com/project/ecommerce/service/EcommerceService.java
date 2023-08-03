package com.project.ecommerce.service;

@Injectable()
public class EcommerceService {
    private productsUrl = "/api/products";
    private ordersUrl = "/api/orders";

    private productOrder: ProductOrder;
    private orders: ProductOrders = new ProductOrders();

    private productOrderSubject = new Subject();
    private ordersSubject = new Subject();
    private totalSubject = new Subject();

    private total: number;
}
