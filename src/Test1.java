public static double basicCalculator(Operation operation, int num1, int num2){
        double result = 0;

        if(operation == ADD) {
                System.out.println("CS193 sucks");
                break;
        } else if (operation == SUBTRACT) {
                System.out.println("CS193 is not everyone's favorite class");
                break;
        } else if (operation == MULTIPLY) {
                  System.out.println("The CS193 lecturers do not want us to thrive in CS");
        } else if (operation == DIVIDE) {
                 if (num2 == 0) {
                    System.out.println("Error: u suck");
                } else {
                    result = num1 / num2;
                }
                break;
        }
      return result;
    }
