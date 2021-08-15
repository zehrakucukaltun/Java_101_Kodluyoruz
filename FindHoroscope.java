import java.util.Scanner;

public class FindHoroscope {
    public static void main(String[] args) {

        // To find horoscopes by using switch-case

        int month, day;
        boolean isError =false;
        String horos ="";
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your birthday.");
        System.out.println("Month:");
        month = input.nextInt();
        System.out.println("Day:");
        day = input.nextInt();

        /*
        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horos = "Capricorn";
                    } else {
                        horos = "Aquarius";
                    }
                }else {

                    isError =true;
                }
            break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        horos = "Aquarius";
                    } else {
                        horos = "Pisces";
                    }
                } else {
                    isError =true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        horos = "Pisces";
                    } else {
                        horos = "Aries";
                    }
                }
                else {
                    isError =true;
                }
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        horos = "Aries";
                    } else {
                        horos = "Taurus";
                    }
                }
                else {
                    isError =true;
                }
                break;

            case 5:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        horos = "Taurus";
                    } else {
                        horos = "Gemini";
                    }
                }
                else {
                    isError =true;
                }
                break;

            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        horos = "Gemini";
                    } else {
                        horos = "Cancer";
                    }
                }
                else {
                    isError =true;
                }
                break;

            case 7:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horos = "Cancer";
                    } else {
                        horos = "Leo";
                    }
                }
                else {
                    isError =true;
                }
                break;

            case 8:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horos = "Leo";
                    } else {
                        horos = "Virgo";
                    }
                }
                else {
                    isError =true;
                }
                break;

            case 9:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horos = "Virgo";
                    } else {
                        horos = "Libra";
                    }
                }
                else {
                    isError =true;
                }
                break;

            case 10:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        horos = "Libra";
                    } else {
                        horos = "Scorpio";
                    }
                }
                else{
                    isError = true;
                }
                break;

            case 11:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        horos = "Scorpio";
                    } else {
                        horos = "Sagittarius";
                    }
                }
                else {
                    isError =true;
                }
                break;

            case 12:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        horos = "Sagittarius";
                    } else {
                        horos = "Capricorn";
                    }
                }
                else {
                    isError =true;
                }
                break;
            default:
                isError =true;

        }
    if(isError){
            System.out.println("Invalid month or day ! Please try again..");
        } else{
            System.out.println("Welcome ! Your horoscope is :" + horos);
        }

        */

// to find horoscopes by using if-else statements (without switch-case)
        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22)
                    horos = "Capricorn";
                else
                    horos = "Aquarius";
            } else
                isError = true;
        } else if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day > 20)
                    horos = "Aquarius";
                else
                    horos = "Pisces";
            } else
                isError = true;
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21)
                    horos = "Pisces";
                else
                    horos = "Aries";
            } else
                isError = true;
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21)
                    horos = "Aries";
                else
                    horos = "Taurus";
            } else
                isError = true;
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22)
                    horos = "Taurus";
                else
                    horos = "Gemini";
            } else
                isError = true;
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23)
                    horos = "Gemini";
                else
                    horos = "Cancer";
            } else
                isError = true;
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23)
                    horos = "Cancer";
                else
                    horos = "Leo";
            } else
                isError = true;
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23)
                    horos = "Leo";
                else
                    horos = "Virgo";
            } else
                isError = true;
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 23)
                    horos = "Virgo";
                else
                    horos= "Libra";
            } else
                isError = true;
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23)
                    horos = "Libra";
                else
                    horos= "Scorpio";
            } else
                isError = true;
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 22)
                    horos = "Scorpio";
                else
                    horos = "Sagittarius";
            } else
                isError = true;
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22)
                    horos = "Sagittarius";
                else
                    horos = "Capricorn";
            } else
                isError = true;
        }
        else {
            isError =true;
        }


        if(isError){
            System.out.println("Invalid month or day ! Please try again..");
        } else{
            System.out.println("Welcome ! Your horoscope is :" + horos);
        }

    }
}

