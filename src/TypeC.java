interface TypeC { void connectTypeC(); }
class OldCharger { void connectMicroUsb() { System.out.println("Зарядка MicroUSB"); } }

class ChargerAdapter implements TypeC {
    private OldCharger oldCharger;
    public ChargerAdapter(OldCharger charger) { this.oldCharger = charger; }
    @Override
    public void connectTypeC() { oldCharger.connectMicroUsb(); }
}
