using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using ECommerce_Ackcio.Models;
using System.Diagnostics;

namespace ECommerce_Ackcio.Views.Home
{
    public class IndexModel : PageModel
    {
        public List<Product> productList { get; set; }
        public List<Product> shoppingCart { get; set; }

        public IndexModel() { }

        public IndexModel(ProductList productListObj, ECommerce_Ackcio.Models.ShoppingCart shoppingCartObj)
        {
            Debug.WriteLine(productListObj.GetProductList());
            Debug.WriteLine(shoppingCartObj.GetShoppingCart());

            productList = productListObj.GetProductList();
            shoppingCart = shoppingCartObj.GetShoppingCart();

        }




        public void OnGet()
        {
        }
    }
}
