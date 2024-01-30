public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 17;
        boolean isAnAdult = age >= 18;
        if (isAnAdult) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (!isAnAdult) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //Задание 2
        int temperature = 7;
        boolean isCold = temperature < 5;
        if (isCold) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (!isCold) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        //Задание 3
        int speed = 70;
        boolean isSpeeding = speed > 60;
        if (isSpeeding) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (!isSpeeding){
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        //Задание 4
        int ageOfPerson = 4;
        if (ageOfPerson >=2 && ageOfPerson <= 6) {
            System.out.println("Если возраст человека равен " + ageOfPerson + ", то ему нужно ходить в садик");
        } else {
            if (ageOfPerson >=7 && ageOfPerson <= 17) {
                System.out.println("Если возраст человека равен " + ageOfPerson + ", то ему нужно ходить в школу");
            } else {
                if (ageOfPerson >=18 && ageOfPerson <=24) {
                    System.out.println("Если возраст человека равен " + ageOfPerson + ", то ему нужно ходить в университет");
                } else {
                    System.out.println("Если возраст человека равен " + ageOfPerson + ", то ему нужно ходить на работу");
                }
            }
        }

        //Задание 5
        int ageOfChild = 6;
        if (ageOfChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему нельзя кататься на аттракционе");
        } else {
            if (ageOfChild >=5 && ageOfChild <= 14) {
                System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
            }
        }

        //Задание 6
        int peoples = 80;
        if (peoples <= 60) {
            System.out.println("Есть сидячие места");
        } else {
            if (peoples >60 && peoples <=102 ) {
                System.out.println("Есть стоячие места");
            } else {
                System.out.println("Мест нет");
            }
        }

        //Задание 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (three>two) {
            System.out.println("больше three");
        } else {
            if (two>one) {
                System.out.println("больше two");
            } else {
                System.out.println("больше one");
            }
        }
    }
}