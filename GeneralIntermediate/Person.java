import java.util.Scanner;



    private String personName;
    private String personJob;
    private int personAge;

    public static void main(String[] args) {
        int numberPeople = 4;
        String [] allAttributes = new String [4];

        Person john = new Person("John", "programmer", 23);
        Person travis = new Person("Travis", "musition", 25);
        Person adam = new Person("Adam", "bartender", 27);
        Person frank = new Person("Frank", "manager", 42);


        String[] arrayAttributes = new String[numberPeople];
        arrayAttributes[0] = john.getAttributes();
        arrayAttributes[1] = travis.getAttributes();
        arrayAttributes[2] = adam.getAttributes();
        arrayAttributes[3] = frank.getAttributes();
        
        // for (int i=0;i<numberPeople; i++) {
        //     System.out.println(arrayAttributes[i]);
        // }
        
        Scanner search = new Scanner(System.in);
        Scanner nsearch = new Scanner(System.in);
        System.out.println("would you like to search by name? y/n");
        String checkSearch = search.nextLine();

        if (new String("y").equals(checkSearch)){
            
            String[] arrayName = new String[numberPeople];
            arrayName[0] = john.getName();
            arrayName[1] = travis.getName();
            arrayName[2] = adam.getName();
            arrayName[3] = frank.getName();

            System.out.println("Please input name to search, case sensitive");
            String searchName = nsearch.nextLine();
            nameSearch(searchName, arrayAttributes, arrayName, numberPeople);

        } else if (new String("n").equals(checkSearch)){

            for (int i=0;i<numberPeople; i++) {
            System.out.println(arrayAttributes[i]);
        } 
        
        }else {
             System.out.println("Invalid answer");
            }

    }

    public Person(String Name, String Job, int Age) {

        personName = Name;
        personJob = Job;
        personAge = Age;


    }

    public String getAttributes() {
        
        String spersonAge = Integer.toString(personAge);

        String personAttributes = String.format("Name: " + personName + "  Job: " + personJob + "  Age: " + spersonAge);

        return personAttributes;

    }

    public String getName() {
        return personName;
    }

    public static void nameSearch(String searchName, String[] arrayAttributes, String[] arrayName, int numberPeople){


        //String[] arrayName = new String[numberPeople];

        // arrayName[0] = john.getName();
        // arrayNAme[1] = travis.getName();
        // arrayName[2] = adam.getName();
        // arrayName[3] = frank.getName();
        int count =0;
        for(int i = 0; i<numberPeople; ++i){
            if ((searchName).equals(arrayName[i])){

                System.out.println(arrayAttributes[i]);
                count = count+1;

                System.out.println(i);
            }
            

        }
        if (count <1){
              //  System.out.println(count);
                System.out.println("Person not found");
        }
    }


}