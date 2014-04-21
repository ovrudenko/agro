/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.bean;

import com.onebutton.db.hibernate.Advert;
import com.onebutton.db.hibernate.Customer;
import com.onebutton.db.hibernate.Organization;
import com.onebutton.db.hibernate.RefAdvertType;
import com.onebutton.db.hibernate.RefArea;
import com.onebutton.db.hibernate.RefProduct;
import com.onebutton.db.queries.AdvertQueries;
import com.onebutton.db.queries.CustomerCRUD;
import com.onebutton.db.queries.RefAdvertTypeQueries;
import com.onebutton.db.queries.RefProductCRUD;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author lolka
 */
@ManagedBean
@SessionScoped
public class AdvertBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private Advert advert = new Advert();
    private boolean isCreated;
    private String text;
    private int idUser;
    private int idAdvType;
    private String typeName;
    private int idOrganization;
    private int idProduct;
    private String prodName;
    private int idArea;
    private RefAdvertType rat = new RefAdvertType();
    private RefProduct refProduct = new RefProduct();
    private List<RefProduct> lProd = new ArrayList<RefProduct>();
    private List<RefAdvertType> lRat = new ArrayList<RefAdvertType>();

    @ManagedProperty(value = "#{registrationUserBean}")
    private RegistrationUserBean registrationUserBean;

    //must povide the setter method
    public void setRegistrationUserBean(RegistrationUserBean registrationUserBean) {
        this.registrationUserBean = registrationUserBean;
    }

    public boolean createAdvert() {
        System.out.println("ref_prod: " + idProduct);
        System.out.println("ref_advert_type: " + idAdvType);
        isCreated = false;
        advert = new Advert();
        CustomerCRUD customerCRUD = new CustomerCRUD();
        Customer customer = customerCRUD.getCustomerById(registrationUserBean.getIdUser());
        advert.setCustomer(customer);
        advert.setDateCreate(new Date());
        advert.setOrganization(null);
        rat = new RefAdvertType();
        rat.setIdAdvType(idAdvType);
        advert.setRefAdvertType(rat);
        //Регионов пока нет
        advert.setRefArea(null);
        RefProduct rp = new RefProduct();
        rp.setIdProduct(idProduct);
        advert.setRefProduct(rp);
        advert.setText(text);
        AdvertQueries aq = new AdvertQueries();
        aq.insert(advert);
        isCreated = true;
        return isCreated;
    }

    public Advert getAdvert() {
        return advert;
    }

    public void setAdvert(Advert advert) {
        this.advert = advert;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdAdvType() {
        return idAdvType;
    }

    public void setIdAdvType(int idAdvType) {
        this.idAdvType = idAdvType;
    }

    public int getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(int idOrganization) {
        this.idOrganization = idOrganization;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public boolean isIsCreated() {
        return isCreated;
    }

    public void setIsCreated(boolean isCreated) {
        this.isCreated = isCreated;
    }

    public List<RefAdvertType> getRatList() {
        RefAdvertTypeQueries query = new RefAdvertTypeQueries();
        lRat = query.getRefAdvertTypeList();
        System.out.println(lRat.size());
        return lRat;
    }

    public void setRat(RefAdvertType rat) {
        this.rat = rat;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public List<RefProduct> getlProd() {
        RefProductCRUD crud = new RefProductCRUD();
        lProd = crud.getRefProducts();
        return lProd;
    }

    public void setlProd(List<RefProduct> lProd) {
        this.lProd = lProd;
    }

}
