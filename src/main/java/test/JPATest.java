package test;


import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.Cliente;
import model.Cuenta;
import model.Movimiento;
import model.Rol;
import model.TipoDeCuenta;

public class JPATest {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction tx = manager.getTransaction();

        try {
            tx.begin();

            Cliente cli = new Cliente();
            cli.setApe_mate("Espiritu");
            cli.setApe_pate("Centella");
            cli.setName("Josue");

            manager.persist(cli);
            
            TipoDeCuenta Tc = new TipoDeCuenta();
           Tc.setDes("Moneda Nacional");
           Tc.setMon("Soles");
            manager.persist(Tc);
            
            Rol Tr= new Rol();
            Tr.setAct(1);
            Tr.setDes("Desafiliado");
             manager.persist(Tr);
                      
             Cuenta cu= new Cuenta();
             cu.setAct(1);
             cu.setNro_cu("987456321");
             cu.setSaldo(900.0);
             cu.setCliente(cli);
             cu.setTipodecuenta(Tc);
             manager.persist(cu);

            	Movimiento mov = new Movimiento();           	
            	mov.setDes("PagoEfectivo");
            	 mov.setFec(LocalDate.of(2022, 7, 15)); 
            	 mov.setMont(150.25);
            	 mov.setCuenta(cu);
            	 manager.persist(mov);
            	
            
            tx.commit();
                    
            
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            
            manager.close();
            factory.close();
        }
    }
}