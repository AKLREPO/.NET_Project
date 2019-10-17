using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using ECommerce_Ackcio.Models;
using ECommerce_Ackcio.Services;

namespace ECommerce_Ackcio.Controllers
{
    
    public class HomeController : Controller
    {
        private IData _data;
        public HomeController(IData data)
        {
            _data = data;
        }
        
        public IActionResult Index()
        {
            return View(_data);
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