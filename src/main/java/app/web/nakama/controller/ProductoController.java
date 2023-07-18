package app.web.nakama.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.web.nakama.model.Producto;
import app.web.nakama.service.IProductoService;

@RestController
@CrossOrigin(origins = "https://nakama-0.web.app")
// @CrossOrigin(origins = "http://localhost:4200")
public class ProductoController {
    @Autowired
    private IProductoService iprods;

    @PostMapping ("/agregar")
    public void register(@RequestBody Producto prod) {
        iprods.saveProducto(prod);
    }

    @GetMapping ("/productos")
    public List<Producto> getProductos() {
        return iprods.getProductos();
    }
}