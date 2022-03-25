package patterns.prototype;

public class Computer implements Copyable{
    private String vendorName;
    private String cpu;
    private String ram;
    private String ssd;

    public Computer(String vendorName, String cpu, String ram, String ssd) {
        this.vendorName = vendorName;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    @Override
    public Object copy() {
        return new Computer(vendorName, cpu, ram, ssd);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "vendorName='" + vendorName + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                '}';
    }
}
