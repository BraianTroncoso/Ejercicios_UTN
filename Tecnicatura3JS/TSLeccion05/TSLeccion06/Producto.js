class Producto{

    static contadorProductos=0;

    constructor(nombre, precio){
        this._nombre = nombre;
        this._precio = precio;
        this._idProducto = ++Producto.contadorProductos;
    }

    get idProducto(){
        return this._idProducto;
    }
    get nombre(){
        return this._nombre;
    }
    get precio(){
        return this._precio;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    set precio(precio){
        this._precio = precio;
    }

    toString(){
        return `ID: ${this._idProducto} PRODUCTO: ${this._nombre} PRECIO: ${this._precio}`;
    }

}

class Orden extends Producto {
  
    static contadorProductosAgregados = 0;
    static contadorOrdenes = 0;
    static MAX_PRODUCTOS = 5;
    productos= [];

    constructor(){
        if(Orden.contadorOrdenes < MAX_PRODUCTOS){
            this._idOrden = ++ Orden.contadorOrdenes;
        }
    }

    calcularTotal(productos) {
        return this.productos += this.productos;
    }

    agregarProductos(){
        this.productos.push(Producto);
    }
    mostrarOrden(){
        return super.toString();
    }

}


producto1 = new Producto('Chocolate',10);
producto2 = new Producto('Helado', 20);

orden1 = new Orden()

orden1.agregarProductos(producto1);
orden1.mostrarOrden();