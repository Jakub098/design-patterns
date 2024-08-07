package fabrykacja.units;

public class RedFactory extends Factory{
    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType) {
            case RIFLEMAN:
                return new Rifleman(20, 0, 6);
            default:
                throw new UnsupportedOperationException("Nienznay typ");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(75, 0 ,35);
            default:
                throw new UnsupportedOperationException("Nienznay typ");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType unitType) {
        switch (unitType) {
            case HELICOPTER:
                return new Helicopter(60, 0 ,20);
            default:
                throw new UnsupportedOperationException("Nienznay typ");
        }
    }
}
