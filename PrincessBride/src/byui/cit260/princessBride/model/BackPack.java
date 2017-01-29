/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author danortega
 */
public class BackPack implements Serializable {
    
    private String pocket1;
    private String pocket2;
    private String pocket3;
    private String pocket4;

    public BackPack() {
    }

    public String getPocket1() {
        return pocket1;
    }

    public void setPocket1(String pocket1) {
        this.pocket1 = pocket1;
    }

    public String getPocket2() {
        return pocket2;
    }

    public void setPocket2(String pocket2) {
        this.pocket2 = pocket2;
    }

    public String getPocket3() {
        return pocket3;
    }

    public void setPocket3(String pocket3) {
        this.pocket3 = pocket3;
    }

    public String getPocket4() {
        return pocket4;
    }

    public void setPocket4(String pocket4) {
        this.pocket4 = pocket4;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.pocket1);
        hash = 67 * hash + Objects.hashCode(this.pocket2);
        hash = 67 * hash + Objects.hashCode(this.pocket3);
        hash = 67 * hash + Objects.hashCode(this.pocket4);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BackPack other = (BackPack) obj;
        if (!Objects.equals(this.pocket1, other.pocket1)) {
            return false;
        }
        if (!Objects.equals(this.pocket2, other.pocket2)) {
            return false;
        }
        if (!Objects.equals(this.pocket3, other.pocket3)) {
            return false;
        }
        if (!Objects.equals(this.pocket4, other.pocket4)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BackPack{" + "pocket1=" + pocket1 + ", pocket2=" + pocket2 + ", pocket3=" + pocket3 + ", pocket4=" + pocket4 + '}';
    }
    
    
    
}
