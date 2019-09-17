using System;
using System.Collections.Generic;
using ECommerce_Ackcio.Models;

namespace ECommerce_Ackcio.Services
{
    public class PopulateData : IData
    {

        private IEnumerable<Product> _ProductList;
        private IEnumerable<Product> _ShoppingCart;

        public PopulateData()
        {
            _ProductList = new List<Product>
            {
                new Product
                {
                    ID = 1,
                    Name = "ASD",
                    Price = 23.05,
                    Quantity = 5
                },
                new Product
                {
                    ID = 2,
                    Name = "ABC",
                    Price = 12.00,
                    Quantity = 10
                }
            };

            _ShoppingCart = new List<Product> { };

        }
        //refer to page 143 for Form authentication e.g. Login / Logout

        public IEnumerable<Product> GetProductList()
        {
            return _ProductList;
        }

        public IEnumerable<Product> GetShoppingCart()
        {
            return _ShoppingCart;
        }
    }
}
