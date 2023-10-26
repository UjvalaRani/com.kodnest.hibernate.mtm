package com.kodnest.com.kodnest.hibernate.mtm;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        
        Language l1 = new Language();
        Language l2 = new Language();
        Language l3 = new Language();
        Language l4 = new Language();
        
        List<Language>llist1=new ArrayList<Language>();
        llist1.add(l1);
        llist1.add(l2);
        llist1.add(l3);
        llist1.add(l4);
        
        List<Language>llist2=new ArrayList<Language>();
        llist2.add(l1);
        llist2.add(l2);
        
        List<Language>llist3=new ArrayList<Language>();
        llist3.add(l3);
        llist3.add(l4);
        
        List<Language>llist4=new ArrayList<Language>();
        llist4.add(l1);
        llist4.add(l3);
        
        List<Person>plist1=new ArrayList<Person>();
        plist1.add(p1);
        plist1.add(p2);
        plist1.add(p4);
        
        List<Person>plist2=new ArrayList<Person>();
        plist2.add(p1);
        plist2.add(p2);
        
        List<Person>plist3=new ArrayList<Person>();
        plist3.add(p1);
        plist3.add(p3);
        plist3.add(p4);
        
        List<Person>plist4=new ArrayList<Person>();
        plist4.add(p1);
        plist4.add(p3);
        
        p1.setP_id(11);
        p1.setP_name("amith");
        p1.setLanguage(llist1);
        
        p2.setP_id(12);
        p2.setP_name("prabhu");
        p2.setLanguage(llist2);
        
        p3.setP_id(13);
        p3.setP_name("ujvala");
        p3.setLanguage(llist3);
        
        p4.setP_id(14);
        p4.setP_name("rani");
        p4.setLanguage(llist4);
        
        l1.setL_id(01);
        l1.setL_name("English");
        l1.setPerson(plist1);
        
        l2.setL_id(02);
        l2.setL_name("hindi");
        l2.setPerson(plist2);
        
        l3.setL_id(03);
        l3.setL_name("kannada");
        l3.setPerson(plist3);
        
        l4.setL_id(04);
        l4.setL_name("telagu");
        l4.setPerson(plist4);
        
        Session ss = factory.openSession();
        Transaction tran = ss.beginTransaction();
        ss.save(p1);
        ss.save(p2);
        ss.save(p3);
        ss.save(p4);
        ss.save(l1);
        ss.save(l2);
        ss.save(l3);
        ss.save(l4);
        tran.commit();
    }
}