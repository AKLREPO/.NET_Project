using System;
using System.Collections.Generic;


namespace ECommerce_Ackcio.Models
{
    public class ProductList
    {

        private List<Product> productList = new List<Product>();

        public ProductList()
        {
            
            Product newProduct = new Product
            {
                ID = 1,
                Name = "SDSD",
                Price = 21.90,
                Quantity = 20
            };

            productList.Add(newProduct);


            newProduct = new Product
            {
                ID = 2,
                Name = "SDSDSD",
                Price = 12.00,
                Quantity = 11
            };
            productList.Add(newProduct);

        }


        public List<Product> GetProductList()
        {
            return productList;
        }


        public void AddProduct(Product product)
        {
            productList.Add(product);
        }

        public Boolean RemoveProduct(int productID)
        {

            foreach(Product product in productList)
            {
                if(product.ID == productID)
                {
                    productList.Remove(product);
                    return true;
                }
            }

            return false;
        }

    }
}
