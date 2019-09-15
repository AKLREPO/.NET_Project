using System;
using System.Collections.Generic;


namespace ECommerce_Ackcio.Models
{
    public class ProductList
    {

        public List<Product> productList;

        public void AddProduct(Product product)
        {
            productList.Add(product);
        }

        public Boolean RemoveProduct(int productID)
        {

            foreach(Product product in productList)
            {
                if(product.ID == productID.ToString())
                {
                    productList.Remove(product);
                    return true;
                }
            }

            return false;
        }

    }
}
