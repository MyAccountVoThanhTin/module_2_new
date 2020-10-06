package _0_project_furama_resort._01_models;

/**
 * Tất cả các dịch vụ này sẽ bao có các thông tin: Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa,
 * Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).
 */

public abstract class Services {
    protected  String idServices;
    protected String nameServices;
    protected double areaUseServices;
    protected double rentCostServices;
    protected int totalPerson;
    protected String typeRent;

    public Services() {
    }

    public Services(String idServices, String nameServices, double areaUseServices, double rentCostServices, int totalPerson, String typeRent) {
        this.idServices = idServices;
        this.nameServices = nameServices;
        this.areaUseServices = areaUseServices;
        this.rentCostServices = rentCostServices;
        this.totalPerson = totalPerson;
        this.typeRent = typeRent;
    }

    public String getIdServices() {
        return idServices;
    }

    public void setIdServices(String idServices) {
        this.idServices = idServices;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getAreaUseServices() {
        return areaUseServices;
    }

    public void setAreaUseServices(double areaUseServices) {
        this.areaUseServices = areaUseServices;
    }

    public double getRentCostServices() {
        return rentCostServices;
    }

    public void setRentCostServices(double rentCostServices) {
        this.rentCostServices = rentCostServices;
    }

    public int getTotalPerson() {
        return totalPerson;
    }

    public void setTotalPerson(int totalPerson) {
        this.totalPerson = totalPerson;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "idServices='" + idServices + '\'' +
                ", nameServices='" + nameServices + '\'' +
                ", areaUseServices=" + areaUseServices +
                ", rentCostServices=" + rentCostServices +
                ", totalPerson=" + totalPerson +
                ", typeRent='" + typeRent ;
    }

    public abstract void showInfor();
}
