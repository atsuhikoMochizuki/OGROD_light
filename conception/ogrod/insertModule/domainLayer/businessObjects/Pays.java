/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package ogrod.insertModule.domainLayer.businessObjects;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAGJL4/gqkeRnww= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGJL4/gqkeRnww= >>
// ----------- >>
public class Pays {
    // ----------- << attribute.annotations@AAAAAAGJL4/gqkeSG04= >>
    // ----------- >>
    private int numPays;

    // ----------- << attribute.annotations@AAAAAAGJL4/gqkeTlXY= >>
    // ----------- >>
    private String nom;

    // ----------- << attribute.annotations@AAAAAAGJL4/gqkeUYYU= >>
    // ----------- >>
    private String noc;

    // ----------- << attribute.annotations@AAAAAAGJL6021VMQrUs= >>
    // ----------- >>
    private Set<Ville> est_compose = new HashSet<>();

    // ----------- << attribute.annotations@AAAAAAGJL4/gp0cfXlA= >>
    // ----------- >>
    private Set<Equipe> est associé = new HashSet<>();

    private int getNumPays() {
        return numPays;
    }

    private String getNom() {
        return nom;
    }

    private String getNoc() {
        return noc;
    }

    public Set<Ville> getEst_compose() {
        return est_compose;
    }

    public Set<Equipe> getEst associé() {
        return est associé;
    }

    private void setNumPays(int numPays) {
        this.numPays = numPays;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }

    private void setNoc(String noc) {
        this.noc = noc;
    }

    public void linkEst_compose(Ville _est_compose) {
        if (_est_compose != null) {
            _est_compose.unlinkEst_situee();
            _est_compose.setEst_situee(this);
            getEst_compose().add(_est_compose);
        }
    }

    public void linkEst associé(Equipe _est associé) {
        if (_est associé != null) {
            _est associé.unlinkAppartient();
            _est associé.setAppartient(this);
            getEst associé().add(_est associé);
        }
    }

    public void unlinkEst_compose(Ville _est_compose) {
        if (_est_compose != null) {
            _est_compose.setEst_situee(null);
            getEst_compose().remove(_est_compose);
        }
    }

    public void unlinkEst_compose(Ville _est_compose, Iterator<Ville> it) {
        if (_est_compose != null) {
            _est_compose.setEst_situee(null);
            it.remove();
        }
    }

    public void unlinkEst associé(Equipe _est associé) {
        if (_est associé != null) {
            _est associé.setAppartient(null);
            getEst associé().remove(_est associé);
        }
    }

    public void unlinkEst associé(Equipe _est associé, Iterator<Equipe> it) {
        if (_est associé != null) {
            _est associé.setAppartient(null);
            it.remove();
        }
    }

    /**
    * @param value
    */

    // ----------- << method.annotations@AAAAAAGJL4/gqkeVFm0= >>
    // ----------- >>
    public void setNumPays(int value) {
    // ----------- << method.body@AAAAAAGJL4/gqkeVFm0= >>
    // ----------- >>
    }
    // ----------- << method.annotations@AAAAAAGJL4/gqkeXYzE= >>
    // ----------- >>
    public int getNumPays() {
    // ----------- << method.body@AAAAAAGJL4/gqkeXYzE= >>
    // ----------- >>
    }
    // ----------- << method.annotations@AAAAAAGJL4/gqkeZKiM= >>
    // ----------- >>
    public String getNom() {
    // ----------- << method.body@AAAAAAGJL4/gqkeZKiM= >>
    // ----------- >>
    }
// ----------- << class.extras@AAAAAAGJL4/gqkeRnww= >>
// ----------- >>
}