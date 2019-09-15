using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using ECommerce_Ackcio.Models;
using ECommerce_Ackcio.Views.Home;

namespace ECommerce_Ackcio.Controllers
{
    public class HomeController : Controller
    {
        private ProductList _productList;
        private ShoppingCart _shoppingCart;

        public HomeController(ShoppingCart shoppingCart, ProductList productList)
        {
            _productList = productList;
            _shoppingCart = shoppingCart;
        }

        public IActionResult Index()
        {
            return View(new IndexModel(_productList, _shoppingCart));
        }

        public IActionResult Privacy()
        {
            return View();
        }

        public IActionResult Edit()
        {
            return View();
        }

        //https://dev.to/azure/creating-the-simplest-possible-aspnet-core-form-with-a-post-method-416g

        [HttpGet]
        public IActionResult Create()
        {
            return View(new CreateModel(_productList));
        }

        [HttpPost]
        public IActionResult Create(CreateModel createModel)
        {

            _productList.AddProduct(createModel.ProductObj);
            return RedirectToAction("Index");

        }

        public IActionResult Delete()
        {
            return View();
        }


        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}