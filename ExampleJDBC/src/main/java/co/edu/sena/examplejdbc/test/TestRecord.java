/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.test;

import co.edu.sena.examplejdbc.bd.DBEmployee;
import co.edu.sena.examplejdbc.bd.DBKey;
import co.edu.sena.examplejdbc.bd.DBRecord;
import co.edu.sena.examplejdbc.model.Employee;
import co.edu.sena.examplejdbc.model.Key;
import co.edu.sena.examplejdbc.model.Record;
import java.util.List;
/**
 * Fecha: 20/03/2025
 * @author Karol Arbelaez
 * Objetivo: probar consultas/Transacciones en la tabla record
 */
public class TestRecord {
    public static void main(String[] args) {
        DBRecord dbr = new DBRecord();
        DBEmployee dbe = new DBEmployee();
        DBKey dbk = new DBKey();
        
        //insertar
        Employee employee = dbe.findById(1117);
        Key key = dbk.findById(3);
        Record record = new Record(2, "2025-03-20", "06:50:00", null, employee, key, "PENDIENTE");
//        dbr.insert(record);
        
        //Modificar
        record.setEndTime("13:00:00");
        record.setStatus("ENTREGADO");
        employee = dbe.findById(1117);
        key = dbk.findById(3);
        record.setEmployee(employee);
        record.setKey(key);
        record.setId(7);
//        dbr.update(record);
        
        //Eliminar
//        dbr.delete(8);
        
        //consultar todos
//        List<Record> records = dbr.findAll();
//        for (Record e : records) {
//            System.out.println("id: " + e.getId() + " date_record: " + e.getDateRecord() + " start_time: " + e.getStartTime() +
//                                " end_time: " + e.getEndTime() + " employee: " + e.getEmployee().getFullname() +
//                                " key: " + e.getKey().getRoom());
//        }
////        
////        //consultar por id
//         System.out.println("****************************************************************************");
//        
//        Record record2 = dbr.findById(8);
//        System.out.println("id: " + record2.getId() + " date_record: " + record2.getDateRecord() + " start_time: " + record2.getStartTime()
//                + " end_time: " + record2.getEndTime() + " employee: " + record2.getEmployee().getFullname() + " key: " + record2.getKey().getRoom());
    }
}
