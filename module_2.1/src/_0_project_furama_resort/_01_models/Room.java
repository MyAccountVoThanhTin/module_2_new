package _0_project_furama_resort._01_models;

public class Room extends Services{
    private FreeService freeServices;

    public Room(){

    }

    public Room(FreeService freeServices) {
        this.freeServices = freeServices;
    }

    public Room(String idServices, String nameServices, double areaUseServices, double rentCostServices, int totalPerson, String typeRent, FreeService freeServices) {
        super(idServices, nameServices, areaUseServices, rentCostServices, totalPerson, typeRent);
        this.freeServices = freeServices;
    }

    public FreeService getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(FreeService freeServices) {
        this.freeServices = freeServices;
    }


    @Override
    public void showInfor() {
        System.out.println("Room{" +
                ", idServices='" + idServices + '\'' +
                ", nameServices='" + nameServices + '\'' +
                ", areaUseServices=" + areaUseServices +
                ", rentCostServices=" + rentCostServices +
                ", totalPerson=" + totalPerson +
                ", typeRent='" + typeRent + '\'' +
                "freeServices=" + freeServices +
                '}');
    }
}
