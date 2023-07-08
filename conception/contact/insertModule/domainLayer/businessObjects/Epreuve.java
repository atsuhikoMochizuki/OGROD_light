/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package contact.insertModule.domainLayer.businessObjects;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAGJL4/gqEc+an4= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGJL4/gqEc+an4= >>
// ----------- >>
public class Epreuve {
    // ----------- << attribute.annotations@AAAAAAGJL4/gqEdFwjs= >>
    // ----------- >>
    private void numEpreuve;

    // ----------- << attribute.annotations@AAAAAAGJL4/gqEdGRdw= >>
    // ----------- >>
    private String nom;

    // ----------- << attribute.annotations@AAAAAAGJL4/gqkedfFc= >>
    // ----------- >>
    private Set<Athlete> est réalisée = new HashSet<>();

    // ----------- << attribute.annotations@AAAAAAGJL4/gqEdBmgo= >>
    // ----------- >>
    private Set<Session> se déroule = new HashSet<>();

    // ----------- << attribute.annotations@AAAAAAGJL4/gqEdEGHg= >>
    // ----------- >>
    private Sport ;

    private void getNumEpreuve() {
        return numEpreuve;
    }

    private String getNom() {
        return nom;
    }

    public Set<Athlete> getEst réalisée() {
        return est réalisée;
    }

    public Set<Session> getSe déroule() {
        return se déroule;
    }

    public Sport get() {
        return ;
    }

    private void setNumEpreuve(void numEpreuve) {
        this.numEpreuve = numEpreuve;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }

    public void set(Sport ) {
        this. = ;
    }

    public void linkEst réalisée(Athlete _est réalisée) {
        if (_est réalisée != null) {
    		_est réalisée.getRéalise().add(this);
            getEst réalisée().add(_est réalisée);
        }
    }

    public void linkSe déroule(Session _se déroule) {
        if (_se déroule != null) {
    		_se déroule.getOrganise().add(this);
            getSe déroule().add(_se déroule);
        }
    }

    public void link(Sport _) {
        if (_ != null) {
            _.get().add(this);
        }

        unlink();
        set(_);
    }

    public void unlinkEst réalisée(Athlete _est réalisée) {
        if (_est réalisée != null) {
            _est réalisée.getRéalise().remove(this);
            getEst réalisée().remove(_est réalisée);
        }
    };

    public void unlinkEst réalisée(Athlete _est réalisée, Iterator<Athlete> it) {
        if (_est réalisée != null) {
            _est réalisée.getRéalise().remove(this);
            it.remove();
        }
    }

    public void unlinkSe déroule(Session _se déroule) {
        if (_se déroule != null) {
            _se déroule.getOrganise().remove(this);
            getSe déroule().remove(_se déroule);
        }
    };

    public void unlinkSe déroule(Session _se déroule, Iterator<Session> it) {
        if (_se déroule != null) {
            _se déroule.getOrganise().remove(this);
            it.remove();
        }
    }

    public void unlink() {
        if (get() != null) {
            get().get().remove(this);
            set(null);
        }
    }

    /**
    * @param num
    */

    // ----------- << method.annotations@AAAAAAGJL4/gqEdHv2E= >>
    // ----------- >>
    public void setNumEpreuve(int num) {
    // ----------- << method.body@AAAAAAGJL4/gqEdHv2E= >>
    // ----------- >>
    }
    /**
    * @param epreuve
    */

    // ----------- << method.annotations@AAAAAAGJL4/gqEdJG54= >>
    // ----------- >>
    public int getNumEpreuve(Epreuve epreuve) {
    // ----------- << method.body@AAAAAAGJL4/gqEdJG54= >>
    // ----------- >>
    }
    /**
    * @param value
    */

    // ----------- << method.annotations@AAAAAAGJL4/gqEdMB/A= >>
    // ----------- >>
    public void setNom(String value) {
    // ----------- << method.body@AAAAAAGJL4/gqEdMB/A= >>
    // ----------- >>
    }
    /**
    * @param epreuve
    */

    // ----------- << method.annotations@AAAAAAGJL4/gqEdOHj0= >>
    // ----------- >>
    public String getNom(Epreuve epreuve) {
    // ----------- << method.body@AAAAAAGJL4/gqEdOHj0= >>
    // ----------- >>
    }
// ----------- << class.extras@AAAAAAGJL4/gqEc+an4= >>
// ----------- >>
}