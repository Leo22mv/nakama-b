package app.web.nakama.service;

import java.util.List;

import app.web.nakama.model.Producto;

public interface IProductoService {
    public List<Producto> getProductos();
    public void saveProducto (Producto prod);
    public Producto findProducto (Long id);
}
