using System;
using System.Collections.Generic;
using ECommerce_Ackcio.Models;

namespace ECommerce_Ackcio.Services
{
    public interface IData
    {
        IEnumerable<Product> GetProductList();
        IEnumerable<Product> GetShoppingCart();
    }
}
