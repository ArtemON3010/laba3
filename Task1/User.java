package Task1;

public class User {
    private String name;
    private String lastName;
    private String patronymicName;
    private int age;
    private long UID;
    private Address address;

    //Constructor
    public User(final String name, final String lastName, final String patronymicName, final int age, final long UID,
                final Address address) {
        this.name = name;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.age = age;
        this.UID = UID;
        this.address = address;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public int getAge() {
        return age;
    }

    public long getId() {
        return UID;
    }

    public Address getAddress() {
        return address;
    }

    //Setters

    public void setName(final String name) {
        this.name = name;
    }


    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }


    public void setPatronymicName(final String patronymicName) {
        this.patronymicName = patronymicName;
    }


    public void setAge(final int age) {
        this.age = age;
    }


    public void setId(final long id) {
        this.UID = id;
    }


    public void setAddress(final Address address) {
        this.address = address;
    }

    //validate method
    public void validate(){
        if(!name.matches("[А-я]+")){
            throw new UncheckedException("Only Russian language name are validate!", ExceptionEnum.ERROR1);
        }


        if(!lastName.matches("[А-я]+")) {
            throw new UncheckedException("Only Russian language lastName are validate!", ExceptionEnum.ERROR1);
        }


        if(!patronymicName.matches("[А-я]+")) {
            throw new UncheckedException("Only Russian language patronymicName are validate!", ExceptionEnum.ERROR1);
        }


        if(age <= 18) {
            throw new UncheckedException("Only adult users are permitted here!", ExceptionEnum.ERROR1);
        }


        if(UID <= 0){
            throw new UncheckedException("Wrong UID!", ExceptionEnum.ERROR1);
        }


        if(!address.getNameOfCity().matches("[А-я]+") || !address.getNameOfRegion().matches("[А-я]+")
                || !address.getNameOfStreet().matches("[А-я]+")|| address.getHomeNumber() <= 0
                || address.getFlatNumber() <= 0){
            throw new UncheckedException("Wrong address!", ExceptionEnum.ERROR1);
        }
    }
}
