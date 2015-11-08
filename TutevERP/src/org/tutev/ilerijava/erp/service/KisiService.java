/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tutev.ilerijava.erp.service;

import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tutev.ilerijava.erp.entity.genel.Kisi;
import org.tutev.ilerijava.erp.utility.HibernateUtil;

/**
 *
 * @author Bilisim-Hoca
 */
public class KisiService implements ServiceBase<Kisi> {


    @Override
    public Kisi save(Kisi entity) {
        Session session = getSession();
        Transaction t= session.getTransaction();
        t.begin();
        entity.setDurum(Boolean.TRUE);
        entity.setEklemeTarihi(new Date());
        entity.setEkleyen("CURR_USER");
        session.save(entity);
        t.commit();
        return entity;
    }

    @Override
    public Kisi update(Kisi entity) {
        Session session = getSession();
        Transaction t= session.getTransaction();
        t.begin();
        entity.setGuncellemeTarihi(new Date());
        entity.setGuncelleyen("CURR_USER");
        session.saveOrUpdate(entity);
        t.commit();
        return entity;
    }

    @Override
    public Boolean delete(Kisi entity) {
        try {
            Session session = getSession();
            Transaction t= session.getTransaction();
            t.begin();
            session.delete(entity);
            t.commit();
            session.getTransaction().commit();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    @Override
    public Kisi getById(Long id) {
        Session session = getSession();
        Kisi kisi = (Kisi) session.get(Kisi.class, id);
        return kisi;
    }

    @Override
    public List<Kisi> getAll() {
        //Criteria Where Şartı oluşturmayı sağlar
        Criteria criteria=getSession().createCriteria(Kisi.class);
        return (List<Kisi>) criteria.list();
    }

    @Override
    public Session getSession() {
        return HibernateUtil.getSessionFactory().openSession();
    }
}
