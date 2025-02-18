// YOUR NAME: 
// COLLABORATORS: 
// DATE: 

public class Main
{
                //ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
        public static final String ASCII_ART_0 = "    .----.    .----.  ",
                ASCII_ART_1 = "   (  --  \\  /  --  )",
                ASCII_ART_2 = "          |  |        ",
                ASCII_ART_3 = "         _/  \\_      ",
                ASCII_ART_4 = "        (_    _)      ",
                ASCII_ART_5 = "     ,    `--`    ,   ",
                ASCII_ART_6 = "     \\'-.______.-'/  ",
                ASCII_ART_7 = "      \\          /   ",
                ASCII_ART_8 = "       '.--..--.'     ",
                ASCII_ART_9 = "         `\"\"\"\"\"` ",
                ASCII_CREDIT = "   ascii art by: jgs    ";

        public static final String TITLE_USA = "UNITED STATES OF AMERICA",
                TITLE_EAC = "EMPLOYMENT AUTHORIZATION CARD";
        public static final String LABEL_SURNAME = "Surname", LABEL_GIVEN_NAME = "Given Name", LABEL_USCIS_NUM = "USCIS#",
                LABEL_CATEGORY = "Category", LABEL_CARD_NUM = "Card#", LABEL_BIRTH_COUNTRY = "Country of Birth",
                LABEL_TERMS_CONDITIONS = "Terms and Conditions", LABEL_BIRTH_DATE = "Date of Birth",
                LABEL_SEX = "Sex", LABEL_VALID_DATE = "Valid From:", LABEL_EXPIRE_DATE = "Card Expires:",
                LABEL_REENTRY_DISCLAIMER = "NOT VALID FOR REENTRY TO U.S.";
        public static void main(String[] args)
        {
                // DECLARATION SECTION
                String surname, givenName, category, cardNum, birthCountry, termsAndConditions;
                char sex;
        
                // Date-related fields
                String birthMonth;
                int uscisNum1, uscisNum2, uscisNum3, birthDay, birthYear, validDay, validMonth, validYear, expireMonth, expireDay, expireYear;
        
                // Formatted strings
                String uscisNum, dateOfBirth, validDate, expireDate;
        
                // INITIALIZATION SECTION
                surname = UtilityBelt.readString("Enter surname: ", 0, 30);
                givenName = UtilityBelt.readString("Enter first/given name: ", 0, 30);
        
                uscisNum1 = UtilityBelt.readInt("Enter USCIS # part 1: ", 0,999);
                uscisNum2 = UtilityBelt.readInt("Enter USCIS # part 2: ", 0,999);
                uscisNum3 = UtilityBelt.readInt("Enter USCIS # part 3: ", 0,999);
        
                category = UtilityBelt.readString("Enter category: ", 0, 3);
                cardNum = UtilityBelt.readString("Enter card number: ", 0, 13);
                birthCountry = UtilityBelt.readString("Enter birth country: ", 0, 30);
                termsAndConditions = "None";
        
                birthMonth = UtilityBelt.readString("Enter birth month (first 3 letters): ", 3,3); 
                birthDay = UtilityBelt.readInt("Enter birth day: ", 1,30);
                birthYear = UtilityBelt.readInt("Enter birth year: ", 1000,2025);
        
                sex = UtilityBelt.readChar("Enter sex: ", "FfMmNn");
        
                validMonth = UtilityBelt.readInt("Enter valid month: ", 1,12); 
                validDay = UtilityBelt.readInt("Enter valid day: ", 1,30); 
                validYear = UtilityBelt.readInt("Enter valid year: ", 1000,2025);
        
                expireMonth = UtilityBelt.readInt("Enter expiration month: ", 1,12); 
                expireDay = UtilityBelt.readInt("Enter expiration day: ", 1,30); 
                expireYear = UtilityBelt.readInt("Enter expiration year: ", 1000,2025);
        
                // Correctly format numbers as strings
                uscisNum = String.format("%03d-%03d-%03d", uscisNum1, uscisNum2, uscisNum3);
                dateOfBirth = String.format("%s %02d, %4d", birthMonth, birthDay, birthYear);
                validDate = Main.formatDate(validMonth, validDay, validYear);
                expireDate = Main.formatDate(expireMonth, expireDay, expireYear);

        
                Main.formatCard(surname, givenName, category, cardNum, birthCountry, termsAndConditions, sex, uscisNum, dateOfBirth, validDate, expireDate);
        }
        

    public static void formatCard(String surname, String givenName,String category, String cardNum, String birthCountry, String termsAndConditions, char sex, String uscisNum, String dateOfBirth, String validDate, String expireDate)
    {
        System.out.printf("╔══════════════════════════════════════════════════════════════════════╗%n");
        System.out.printf("║%35s%35s║%n", TITLE_USA, "");
        System.out.printf( "║%60s%10s║%n", TITLE_EAC, "");
        System.out.printf("║%-25s%-45s║%n", "", LABEL_SURNAME);
        System.out.printf("║%-25s%-45s║%n", "", surname);
        System.out.printf("║%-25s%-45s║%n", ASCII_ART_0, LABEL_GIVEN_NAME);
        System.out.printf("║%-25s%-45s║%n", ASCII_ART_1, givenName);
        System.out.printf("║%-25s%-15s%-15s%-15s║%n", ASCII_ART_2, LABEL_USCIS_NUM, LABEL_CATEGORY, LABEL_CARD_NUM);
        System.out.printf("║%-25s%-15s%-15s%-15s║%n", ASCII_ART_3, uscisNum, category, cardNum);
        System.out.printf("║%-25s%-45s║%n", ASCII_ART_4, LABEL_BIRTH_COUNTRY);
        System.out.printf("║%-25s%-45s║%n", ASCII_ART_5, birthCountry);
        System.out.printf("║%-25s%-45s║%n", ASCII_ART_6, LABEL_TERMS_CONDITIONS);
        System.out.printf("║%-25s%-45s║%n", ASCII_ART_7, termsAndConditions);
        System.out.printf("║%-25s%-15s%-30s║%n", ASCII_ART_8, LABEL_BIRTH_DATE, LABEL_SEX);
        System.out.printf("║%-25s%-15s%-30s║%n", ASCII_ART_9, dateOfBirth, sex);
        System.out.printf("║%-25s%-15s%-30s║%n", "", LABEL_VALID_DATE, validDate);
        System.out.printf("║%-25s%-15s%-30s║%n", "", LABEL_EXPIRE_DATE, expireDate);
        System.out.printf("║%-25s%-45s║%n", ASCII_CREDIT, LABEL_REENTRY_DISCLAIMER);
        System.out.printf("╚══════════════════════════════════════════════════════════════════════╝%n");
    }

    public static String formatDate(int month, int day, int year)
    {
        return String.format("%02d/%02d/%4d", month, day, year);
    }
}