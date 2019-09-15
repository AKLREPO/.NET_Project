using System;
using System.Collections.Generic;

namespace ECommerce_Ackcio.Models
{
    public class ShoppingCart
    {
        private List<Product> shoppingCart;

        public ShoppingCart()
        {
            shoppingCart = new List<Product>();
        }

        public void addProductToCart(Product product)
        {
            try
            {
                shoppingCart.Add(product);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public void removeProductFromCart(int productID)
        {

            


        }


    }
}
