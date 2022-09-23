package com.mycompany.practicotres;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class DirectorioTelefonico {

    private HashMap<Long, Cliente> registro = new HashMap();

    public DirectorioTelefonico() {
    }

    public void agregarCliente(Cliente cliente, long telefono) {

        if (!registro.containsKey(telefono)) {

            System.out.println("El cliente se agrego con exito");
            registro.put(telefono, cliente);

        } else {

            System.out.println("Ese numero de telefono ya esta ocupado");

        }
    }

    public Cliente buscarCliente(long telefono) {

        for (Map.Entry<Long, Cliente> cliente : registro.entrySet()) {

            return registro.get(telefono);
        }

        return null;
    }

    public ArrayList<Long> buscarTelefono(String apellido) {

        ArrayList<Long> telefonos = new ArrayList();

        for (Map.Entry<Long, Cliente> cliente : registro.entrySet()) {

            if (apellido.equalsIgnoreCase(cliente.getValue().getApellido())) {

                telefonos.add(cliente.getKey());

            }
        }
        return telefonos;
    }

    public TreeSet<Cliente> buscarClientes(String ciudad) {

        TreeSet<Cliente> cityCliente = new TreeSet();

        for (Map.Entry<Long, Cliente> cliente : registro.entrySet()) {

            if (ciudad.equalsIgnoreCase(cliente.getValue().getCiudad())) {

                
                cityCliente.add(cliente.getValue());

            }
        }
        return cityCliente;

    }
    
    public void borrarCliente(long telefono){
        
        
          if (registro.containsKey(telefono)) {

            System.out.println("El cliente se quito con exito");
            registro.remove(telefono);// revisar esto!!

        } else {

            System.out.println("Ese numero de telefono no exite en el registro");

        }
        
        
    }
    
    
    

}
