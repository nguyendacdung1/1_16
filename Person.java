public class Person {
    private String name,address;


    public Person(String name, String address){
        this.name=name;
        this.address=address;
    }
    public String getName(){
        return getName();
    }
    public String getAddress(){
        return getAddress();
    }
    public void setAddress(String address){
        this.address=address;
    }

    @Override
    public String toString(){
        return name +"("+address+")";
    }
}
