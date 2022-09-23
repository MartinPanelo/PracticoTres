package com.mycompany.practicotres;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import javax.swing.JOptionPane;

public class DirectorioTelefonico {

    private HashMap<Long, Cliente> registro = new HashMap();

    public DirectorioTelefonico() {
    }

    public void agregarCliente(Cliente cliente, long telefono) {

        if (!registro.containsKey(telefono)) {

            // System.out.println("El cliente se agrego con exito");
            JOptionPane.showMessageDialog(null, "El cliente se agrego con exito");

            registro.put(telefono, cliente);

        } else {

            //   System.out.println("Ese numero de telefono ya esta ocupado");
            JOptionPane.showMessageDialog(null, "Ese numero de telefono ya esta ocupado");
        }
    }

    public Cliente buscarCliente(long telefono) {

        // for (Map.Entry<Long, Cliente> cliente : registro.entrySet()) {
        return registro.get(telefono);
        //  }

        //  return null;
    }

    public ArrayList<Long> buscarTelefono(String apellido) {

        ArrayList<Long> telefonos = new ArrayList();

        for (Map.Entry<Long, Cliente> cliente : registro.entrySet()) {

            if (apellido.equalsIgnoreCase(cliente.getValue().getApellido())) {

                telefonos.add(cliente.getKey());

            }
        }
        if(telefonos.isEmpty()){
             JOptionPane.showMessageDialog(null, "No existen clientes con este apellido");
    
        }
        return telefonos;
    }

    public TreeSet<Cliente> buscarClientes(String ciudad) {

        TreeSet<Cliente> cityCliente = new TreeSet();

        for (Cliente unCliente : registro.values()) {

            if (ciudad.equalsIgnoreCase(unCliente.getCiudad())) {

                cityCliente.add(unCliente);

            }

        }

        return cityCliente;

        /*    for (Map.Entry<Long, Cliente> cliente : registro.entrySet()) {

            if (ciudad.equalsIgnoreCase(cliente.getValue().getCiudad())) {

               // System.out.println(cliente.getKey());
                //  System.out.println(cliente.getValue().getClass());
                
                
               cityCliente.add(cliente.getValue());
               
             

            }
        }*/
    }

    public void borrarCliente(long telefono) {

        if (registro.containsKey(telefono)) {

            JOptionPane.showMessageDialog(null, "El cliente se quito con exito");
            //   System.out.println("El cliente se quito con exito");
            registro.remove(telefono);// revisar esto!! PD esta bien asdasd

        } else {
            JOptionPane.showMessageDialog(null, "Ese numero de telefono no exite en el registro");
            //  System.out.println("Ese numero de telefono no exite en el registro");

        }

    }

    @Override
    public String toString() { // ver despues
        return "DirectorioTelefonico{" + "registro=" + registro + '}';
    }

}
