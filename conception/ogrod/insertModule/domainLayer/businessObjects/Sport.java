/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package ogrod.insertModule.domainLayer.businessObjects;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAGJL4/gqEcyZ1Q= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGJL4/gqEcyZ1Q= >>
// ----------- >>
public class Sport {
    // ----------- << attribute.annotations@AAAAAAGJL4/gqEczvWs= >>
    // ----------- >>
    private int numSport;

    // ----------- << attribute.annotations@AAAAAAGJL4/gqEc0zmQ= >>
    // ----------- >>
    private String nom;

    // ----------- << attribute.annotations@AAAAAAGJL4/gqEdD0NU= >>
    // ----------- >>
    private Set<Epreuve>  = new HashSet<>();

    private int getNumSport() {
        return numSport;
    }

    private String getNom() {
        return nom;
    }

    public Set<Epreuve> get() {
        return ;
    }

    private void setNumSport(int numSport) {
        this.numSport = numSport;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }

    public void link(Epreuve _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
            get().add(_);
        }
    }

    public void unlink(Epreuve _) {
        if (_ != null) {
            _.set(null);
            get().remove(_);
        }
    }

    public void unlink(Epreuve _, Iterator<Epreuve> it) {
        if (_ != null) {
            _.set(null);
            it.remove();
        }
    }

    /**
    * @param sport
    */

    // ----------- << method.annotations@AAAAAAGJL4/gqEc1zBg= >>
    // ----------- >>
    public int getNumSport(Sport sport) {
    // ----------- << method.body@AAAAAAGJL4/gqEc1zBg= >>
    // ----------- >>
    }
    /**
    * @param num
    */

    // ----------- << method.annotations@AAAAAAGJL4/gqEc4MHM= >>
    // ----------- >>
    public void SetNumSport(int num) {
    // ----------- << method.body@AAAAAAGJL4/gqEc4MHM= >>
    // ----------- >>
    }
    /**
    * @param nom
    */

    // ----------- << method.annotations@AAAAAAGJL4/gqEc6zx0= >>
    // ----------- >>
    public void setNom(String nom) {
    // ----------- << method.body@AAAAAAGJL4/gqEc6zx0= >>
    // ----------- >>
    }
    /**
    * @param sport
    */

    // ----------- << method.annotations@AAAAAAGJL4/gqEc8YME= >>
    // ----------- >>
    public void getNom(Sport sport) {
    // ----------- << method.body@AAAAAAGJL4/gqEc8YME= >>
    // ----------- >>
    }
// ----------- << class.extras@AAAAAAGJL4/gqEcyZ1Q= >>
// ----------- >>
}