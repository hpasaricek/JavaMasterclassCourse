import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satelites = new HashSet<>();
    private final BodyTypes bodyType;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatelites() {
        return new HashSet<>(this.satelites);
    }

    public boolean addSatellite(HeavenlyBody satellite) {
        return this.satelites.add(satellite);
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody newObj = (HeavenlyBody) obj;
            if (this.getName().equals(newObj.getName())) {
                return this.getBodyType() == newObj.getBodyType();
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57 + this.getBodyType().hashCode();
    }

    @Override
    public String toString() {
        return this.getName() + ": " + this.getBodyType() + ", " + this.getOrbitalPeriod();
    }
}
