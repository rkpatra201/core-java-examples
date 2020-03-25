public class Employee {
    private int id;

    public static String showValue(DataType dataType)
    {
        return dataType.name()+"__";
    }
    public int getId() {
        System.out.println("getter called");
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
