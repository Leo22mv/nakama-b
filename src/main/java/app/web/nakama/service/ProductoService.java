package app.web.nakama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.web.nakama.model.Producto;
import app.web.nakama.repository.ProductoRepository;

@Service
public class ProductoService implements IProductoService {
    @Autowired
    private ProductoRepository prodRepo;

    @Override
    public void saveProducto(Producto user) {
        prodRepo.save(user);
    }

    @Override
    public Producto findProducto(Long id) {
        Producto user = prodRepo.findById(id).orElse(null);
        return user;
    }

    @Override
    public List<Producto> getProductos() {
       List<Producto> listaProductos = prodRepo.findAll();
       return listaProductos; 
    }
}
