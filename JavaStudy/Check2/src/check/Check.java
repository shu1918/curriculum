package check;

public class Check {

    private static String firstName = "修平";
    private static String lastName = "齋藤";

 private static void printName(String first_Name,String last_Name)  {
     String fullName = last_Name + first_Name;
     System.out.println("printNameメソッド　→" + fullName);
 }
    public static void  main(String[] args) {
        printName(firstName,lastName);

        Pet petName = new Pet (constants.Constants.CHECK_CLASS_JAVA,constants.Constants.CHECK_CLASS_HOGE);
        petName.introduce();

        RobotPet roboName = new RobotPet(constants.Constants.CHECK_CLASS_R2D2 ,constants.Constants.CHECK_CLASS_LUKE);
        roboName.introduce();

        }

    }

