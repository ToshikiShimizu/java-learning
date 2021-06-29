import org.apache.commons.lang3.builder.*;

public class Bank{
    String name;
    String address;

    public boolean equals(Object o){
        // 5-2
        // if ( o == this) return true;
        // if ( o == null) return false;
        // Bank r = (Bank)o;
        // if (!this.name.equals(r.name)) return false;
        // if (!this.address.equals(r.address)) return false;
        // return true;

        // 5-3
        return EqualsBuilder.reflectionEquals(this, o);
    }

    // 5-4
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }
}