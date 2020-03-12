package ie.gmit;

public class Employee {
    String title;
    String name;
    String pps;
    String phone;
    String type;
    int age;

    public Employee(String title, String name, String pps, String phone, String type, int age) {
        super();
    }

    public void setTitle(String title) throws Exception{
            if (title.equalsIgnoreCase("Mr") || title.equalsIgnoreCase("Mrs") || title.equalsIgnoreCase("Ms")){
                this.title = title;
            }
            else {
                throw new IllegalArgumentException("Invalid title provided");
            }
    }

    public void setName(String name) {
        if (name.length() >= 3 && name.length() < 25){
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Invalid name provided");
        }
    }

    public void setPps(String pps) {
        if (pps.length() == 8){
            this.pps = pps;
        }
        else {
            throw new IllegalArgumentException("Invalid pps error");
        }
    }

    public void setPhone(String phone) {
        if(phone.length()==9) {
            this.phone = phone;
        }
        else {
            throw new IllegalArgumentException("Invalid phone number error");
        }

    }

    public void setType(String type) {
        if(type.equalsIgnoreCase("Full-time") || type.equalsIgnoreCase("Part-time") || type.equalsIgnoreCase("Contract")) {
            this.type = type;
        }
        else {
            throw new IllegalArgumentException("Invalid employment type error");
        }
    }

    public void setAge(int age) {
        if (age >= 16){
            this.age = age;
        }
        else {
            throw new IllegalArgumentException("Age should be above 16");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getPps() {
        return pps;
    }

    public String getPhone() {
        return phone;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }
}
