/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import baza.DBBroker;
import java.util.ArrayList;
import java.util.List;
import model.Autor;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author PC
 */
public class Controller {
    
    private DBBroker dbb;
    private List<Knjiga> listaKnjiga = new ArrayList<>();
    private List<Autor> listaAutora = new ArrayList<>();
    
    private static Controller instance;
    public static Controller getInstance(){
        if(instance==null){
           instance = new Controller();
        }
        return instance;
    }

    public Controller() {
        dbb = new DBBroker();
        
        /* Autor autor1 = new Autor("Ivo", "Andrić", 1892,"Biografija autora Ive Andrica bla bla");
        Autor autor2 = new Autor("Danilo", "Kiš", 1935,"Biografija autora Danila Kiša bla bla");
        Autor autor3 = new Autor("Meša", "Selimović", 1910,"Meša Selimović je rodjen u BiH");
        
        Knjiga knjiga1 = new Knjiga("Na Drini ćuprija", autor1, "1234567890", 1945,Zanr.DETEKTIVSKI);
        Knjiga knjiga2 = new Knjiga("Bašta, pepeo", autor2, "0987654321", 1982,Zanr.ISTORIJSKI);
        Knjiga knjiga3 = new Knjiga("Tvrđava", autor3, "1122334455", 1970,Zanr.NAUCNA_FANTASTIKA);
        
        
        listaKnjiga.add(knjiga1);
        listaKnjiga.add(knjiga2);         OVO JE AKO NAM TRAZI DA UNESEMO PODATKE U LOKALNOJ MEMORIJI
        listaKnjiga.add(knjiga3);
        
        listaAutora.add(autor1);
        listaAutora.add(autor2);
        listaAutora.add(autor3);  */
    }

    public List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void setListaKnjiga(List<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }

    public List<Autor> getListaAutora() {
        return listaAutora;
    }

    public void setListaAutora(List<Autor> listaAutora) {
        this.listaAutora = listaAutora;
    }

    public void obrisiKnjigu(int id) {
        
           dbb.obrisiKnjigu(id);
        
        //listaKnjiga.remove(selektovaniRed);
    }

    public void dodajKnjigu(Knjiga novaKnjiga) {
        
        dbb.dodajKnjigu(novaKnjiga);
        
        //listaKnjiga.add(novaKnjiga);
       /// System.out.println("Knjiga je dodata");
        //System.out.println(listaKnjiga);
    }

    public List<Knjiga> ucitajListuKnjigaIzBaze() {
        return dbb.ucitajListuKnjigaIzBaze();
    }

    public List<Autor> ucitajListuAutoraIzBaze() {
        return dbb.ucitajListuAutoraIzBaze();
    }

    public void azurirajKnjigu(Knjiga knjigaZaIzmenu) {
        dbb.azurirajKnjigu(knjigaZaIzmenu);
    }
    
}
