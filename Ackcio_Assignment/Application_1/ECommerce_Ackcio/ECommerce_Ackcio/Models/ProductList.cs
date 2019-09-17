using System;
using System.Collections.Generic;


namespace ECommerce_Ackcio.Models
{
    public class ProductList
    {

        private List<Product> productList = new List<Product>();

        public ProductList(){}


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
