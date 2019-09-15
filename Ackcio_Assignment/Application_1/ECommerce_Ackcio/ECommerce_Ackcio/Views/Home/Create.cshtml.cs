using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using ECommerce_Ackcio.Models;

namespace ECommerce_Ackcio.Views.Home
{
    public class CreateModel : PageModel
    {

        public List<Product> productList { get; set; }
        public Product ProductObj { get; set; }


        public CreateModel() { }

        public CreateModel(ProductList productListObj)
        {
            productList = productListObj.GetProductList();
        }

        public void OnGet()
        {
        }
    }
}
