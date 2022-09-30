package com.mycompany.practicotres;

public class PracticoTres {

    public static void main(String[] args) {
//  creo el directorio telefonico

        //JOptionPane.showMessageDialog(null,"El cliente se agrego con exito");
        DirectorioTelefonico paginasNaranjas = new DirectorioTelefonico();
// crear dos clientes 
        Cliente clienteUno = new Cliente(383838, "Martin", "Aaaaaa", "Pluton", "lado oscuro");

        Cliente clienteDos = new Cliente(161616, "Rodrigo", "Bbbbbb", "Mercurio", "lado claro");

        Cliente clienteTres = new Cliente(56565, "Caty", "Ccccc", "Pluton", "a la welta");
        
// agregarlos al registro 

        paginasNaranjas.agregarCliente(clienteUno, 2222);// CONSULTAR POR EL 0 PRIMERO

        paginasNaranjas.agregarCliente(clienteUno, 2222);
        paginasNaranjas.agregarCliente(clienteUno, 5555);

        paginasNaranjas.agregarCliente(clienteDos, 7777);

        paginasNaranjas.agregarCliente(clienteTres, 8888);
        
      
        System.out.println("----------");

// buscar con telefono << un cliente
        System.out.println(paginasNaranjas.buscarCliente(2222));

        System.out.println(paginasNaranjas.buscarCliente(8888));

        System.out.println(paginasNaranjas.buscarCliente(9999));
        System.out.println("----------");
// buscar con apellido << lista de telefonos 
        System.out.println(paginasNaranjas.buscarTelefono("Perez"));

        System.out.println(paginasNaranjas.buscarTelefono("Aaaaaa"));
        System.out.println("----------");
// busca con ciudad << lista de clientes !!
        System.out.println(paginasNaranjas.buscarClientes("Pluton"));

// borrar con el telefono << borra nomas
        paginasNaranjas.borrarCliente(2222);

        paginasNaranjas.borrarCliente(2222);
        

    }

}
