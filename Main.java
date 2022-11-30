package com.lem45;

import com.lem45.dao.ClienteDao;
import com.lem45.dao.CocheDao;
import com.lem45.dao.RevisionDao;
import com.lem45.model.Coche;
import com.lem45.model.Revision;

public class Main {
    public static void main(String[] args) {
        //Cliente cliente = new Cliente("6007","Carlos peres","Cbba", "america", 12345552);
        Coche coche = new Coche("UYSYSX","PETA", "sd422", "Rojo", 25000,"6007");
        Revision revision = new Revision("129OOH","Filtrado","aceit", "see", "UYSYSX");

        ClienteDao clienteDao = new ClienteDao();
        CocheDao cocheDao = new CocheDao();
        RevisionDao revisionDao = new RevisionDao();

        //CREAR
        //clienteDao.addCliente(cliente);
        //cocheDao.addCoche(coche);
        //revisionDao.addRevision(revision);

        //READ
        /*List<Cliente> clientes = clienteDao.getAllClientes();
        for (int i=0; i < clientes.size(); i++){
            Cliente cliente = clientes.get(i);
            System.out.println(cliente);
        }

         */
        /*
        List<Coche> coches = cocheDao.getAllCoches();
        for (int i=0; i < coches.size(); i++){
            Coche coche = coches.get(i);
            System.out.println(coche);
        }
         */
        /*
        List<Revision> revisiones = revisionDao.getAllRevisiones();
        for (int i = 0; i < revisiones.size(); i++){
            Revision revision1 = revisiones.get(i);
            System.out.println(revision1);
        }
         */


        //UPDATE
        /*
        Cliente cliente = new Cliente ("6007","limbert peres","lapaz", "cb32ba", 1255555);
        clienteDao.updateCliente(cliente);
         */
        /*
        Coche coche =  new Coche("UYSYSX", "wolksvagen", "UUUUU1", "BLANCO", 20, "1450");
        cocheDao.updateCoche(coche);
         */
        /*
        Revision revision1 = new Revision("19024","NOFILTRO", "girasol", "NOFRENOS", "UYSYSX");
        revisionDao.updateRevision(revision1) ;
         */

        //DELETE
        //clienteDao.deleteCliente("6007");
        //cocheDao.deleteCoche("UYSYSX");
        //revisionDao.deleteRevision("129OOH");
    }
}
