using System;
namespace ECommerce_Ackcio.Models
{
    public class Admin : User
    {

        public Boolean AddProductToMenu(Product newProduct)
        {
            return false;
        }

        public Boolean RemoveProductFromMenu(int productID)
        {
            return false;
        }

        public Boolean UpdateProductInMenu(int productID)
        {
            return false;
        }


    }
}
