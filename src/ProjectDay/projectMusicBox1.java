package ProjectDay;

import java.util.Scanner;

public class projectMusicBox1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What type of music would you like ? Classical/Pop/Country");
        String type1 = input.nextLine();
        if (type1.equalsIgnoreCase("classical")) {
            System.out.println(" Four Seasons, Fur Elise, Finlandia, Vocalise, The Planet - Which one do you want to listen?");
            String classic = input.nextLine();
            if (classic.equalsIgnoreCase("four seasons")) {
                System.out.println("Enter 2$");
                String fourSeasons = input.nextLine();
                if (fourSeasons.equalsIgnoreCase("2")) {
                    System.out.println("Enjoy your music");
                }
            } else if (classic.equalsIgnoreCase("fur elise")) {
                System.out.println("Enter 2$");
                String furElse = input.nextLine();
                if (furElse.equalsIgnoreCase("2")) {
                    System.out.println("Enjoy your music");
                }
            } else if (classic.equalsIgnoreCase("Finlandia")) {
                System.out.println("Enter 2$");
                String finlandia = input.nextLine();
                if (finlandia.equalsIgnoreCase("2")) {
                    System.out.println("Enjoy your music");
                }
            } else if (classic.equalsIgnoreCase("Vocalise")) {
                System.out.println("Enter 2$");
                String vocalise = input.nextLine();
                if (vocalise.equalsIgnoreCase("2")) {
                    System.out.println("Enjoy your music");
                }
            } else if (classic.equalsIgnoreCase("The Planet")) {
                System.out.println("Enter 2$");
                String thePlanet = input.nextLine();
                if (thePlanet.equalsIgnoreCase("2")) {
                    System.out.println("Enjoy your music");
                }
            } else {
                System.out.println("Type of music is not available");
            }
        } else if (type1.equalsIgnoreCase("Pop")) {
            System.out.println("For Pop genre we have a Bad guy, Talk, Please Me, 7 Ring, Without Me available");
            String pop = input.nextLine();
            if (pop.equalsIgnoreCase("bad guy")) {
                System.out.println("Please enter 4$");
                double rest = input.nextDouble();
                double popPrice = 4;
                if (rest == 4) {
                    System.out.println("Enjoy your music");
                } else if (rest < 4) {
                    System.out.println(rest + " is not enough. Please try again later");
                } else if (rest > 4) {
                    double moreMoney = rest - popPrice;
                    System.out.println("You have entered " + moreMoney + " dollar more. Please wait for change. Bad guy is playing. Enjoy your music");
                }
            } else if (pop.equalsIgnoreCase("talk")) {
                System.out.println("Please enter 4$");
                double rest = input.nextDouble();
                double popPrice = 4;
                if (rest == 4) {
                    System.out.println("Enjoy your music");
                } else if (rest < 4) {
                    System.out.println(rest + " is not enough. Please try again later");
                } else if (rest > 4) {
                    double moreMoney = rest - popPrice;
                    System.out.println("You have entered " + moreMoney + " dollar more. Please wait for change. Talk is playing. Enjoy your music");
                }
            } else if (pop.equalsIgnoreCase("please me")) {
                System.out.println("Please enter 4$");
                double rest = input.nextDouble();
                double popPrice = 4;
                if (rest == 4) {
                    System.out.println("Enjoy your music");
                } else if (rest < 4) {
                    System.out.println(rest + " is not enough. Please try again later");
                } else if (rest > 4) {
                    double moreMoney = rest - popPrice;
                    System.out.println("You have entered " + moreMoney + " dollar more. Please wait for change. Please me is playing. Enjoy your music");
                }
            } else if (pop.equalsIgnoreCase("7 ring")) {
                System.out.println("Please enter 4$");
                double rest = input.nextDouble();
                double popPrice = 4;
                if (rest == 4) {
                    System.out.println("Enjoy your music");
                } else if (rest < 4) {
                    System.out.println(rest + " is not enough. Please try again later");
                } else if (rest > 4) {
                    double moreMoney = rest - popPrice;
                    System.out.println("You have entered " + moreMoney + " dollar more. Please wait for change. 7 ring is playing. Enjoy your music");
                }
            } else if (pop.equalsIgnoreCase("without me")) {
                System.out.println("Please enter 4$");
                double rest = input.nextDouble();
                double popPrice = 4;
                if (rest == 4) {
                    System.out.println("Enjoy your music");
                } else if (rest < 4) {
                    System.out.println(rest + " is not enough. Please try again later");
                } else if (rest > 4) {
                    double moreMoney = rest - popPrice;
                    System.out.println("You have entered " + moreMoney + " dollar more. Please wait for change. Without me is playing. Enjoy your music");
                }
            } else {
                System.out.println("Type of music not available");
            }
        } else if (type1.equalsIgnoreCase("country")) {
            System.out.println("For country genre we have Meant to Be, Heaven, Simple, One Number Away, Get Along is available");
            String country = input.nextLine();
            if (country.equalsIgnoreCase("meant to be")) {
                System.out.println("Please enter 3$");
                double rest = input.nextDouble();
                double countryPrice = 3;
                if (rest == countryPrice) {
                    System.out.println("Meant to be is playing. Enjoy your music");
                } else if (rest < countryPrice) {
                    double restAmmount = countryPrice - rest;
                    System.out.println("You have entered " + restAmmount + " Please enter the rest");
                }
            } else if (country.equalsIgnoreCase("Heaven")) {
                System.out.println("Please enter 3$");
                double rest = input.nextDouble();
                double countryPrice = 3;
                if (rest == countryPrice) {
                    System.out.println("Heaven is playing. Enjoy your music");
                } else if (rest < countryPrice) {
                    double restAmmount = countryPrice - rest;
                    System.out.println("You have entered " + restAmmount + " Please enter the rest");
                }
            } else if (country.equalsIgnoreCase("Simple")) {
                System.out.println("Please enter 3$");
                double rest = input.nextDouble();
                double countryPrice = 3;
                if (rest == countryPrice) {
                    System.out.println("Simple is playing. Enjoy your music");
                } else if (rest < countryPrice) {
                    double restAmmount = countryPrice - rest;
                    System.out.println("You have entered " + restAmmount + " Please enter the rest");
                }
            } else if (country.equalsIgnoreCase("One number away")) {
                System.out.println("Please enter 3$");
                double rest = input.nextDouble();
                double countryPrice = 3;
                if (rest == countryPrice) {
                    System.out.println("One number away is playing. Enjoy your music");
                } else if (rest < countryPrice) {
                    double restAmmount = countryPrice - rest;
                    System.out.println("You have entered " + restAmmount + " Please enter the rest");
                }
            } else if (country.equalsIgnoreCase("Get along")) {
                System.out.println("Please enter 3$");
                double rest = input.nextDouble();
                double countryPrice = 3;
                if (rest == countryPrice) {
                    System.out.println("Get along is playing. Enjoy your music");
                } else if (rest < countryPrice) {
                    double restAmmount = countryPrice - rest;
                    System.out.println("You have entered " + restAmmount + " Please enter the rest");
                }


            }


        }
    }


}