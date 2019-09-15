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


        public List<Product> GetShoppingCart()
        {
            return shoppingCart;
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

        public Boolean removeProductFromCart(int productID)
        {
            foreach(Product product in shoppingCart)
            {
                if(product.ID == productID)
                {
                    shoppingCart.Remove(product);
                    return true;
                }
            }


            return false;
        }


    }
}
