import java.util.Scanner;
public class EVC_PLUS{
    public static void main(String[] args) {
        final String EVC_CODE = "*770#";
        final int CORRECT_PIN = 5050;
        double balance = 2000;
        double lastAmount =1.5 ;
        String lastSentTo = " ";

        Scanner input = new Scanner(System.in);
        String code = input.nextLine();

        if (code.equals(EVC_CODE)) {
            System.out.print("\n-EVCPLUS-\nFadlan geli PIN-kaaga: ");
            int enteredPin = input.nextInt();
            input.nextLine();

            if (enteredPin == CORRECT_PIN) {
                boolean continue_menu = true;
                while (continue_menu) {
                    System.out.println("\n------ EVCPlus ------");
                    System.out.println("1. Itus Haraaga");
                    System.out.println("2. Kaarka hadalka");
                    System.out.println("3. Bixi Biil");
                    System.out.println("4. U wareeji EVCPlus");
                    System.out.println("5. Warbixin Kooban");
                    System.out.println("6. Salaam Bank");
                    System.out.println("7. Maareynta");
                    System.out.println("8. Bill Payment");
                    System.out.println("0. ka Bax");
                    System.out.print("Dooro mid kamid ah : ");

                    int choice = input.nextInt();
                    input.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.println("Haraagaagu waa: $" + balance);
                            break;

                        case 2:
                            System.out.println("\nKaarka Hadalka");
                            System.out.println("1. Ku Shubo Airtime");
                            System.out.println("2. Ugu Shub Airtime");
                            System.out.println("3. MIFI Packages");
                            System.out.println("4. Ku Shubo Internet");
                            System.out.println("5. Ugu Shub qof kale (MMT)");
                            System.out.print("Dooro mid kamid ah: ");
                            int subchoice2 = input.nextInt();
                            input.nextLine();
                            //choice 2
                            switch (subchoice2) {
                                case 1:
                                    System.out.print("Fadlan geli mobile-ka: ");
                                    String mobile1 = input.nextLine();
                                    System.out.print("Geli lacagta: ");
                                    double amount1 = input.nextDouble();
                                    input.nextLine();
                                    System.out.print("Ma hubtaa inaad $" + amount1 + " ugu shubtid " + mobile1 + "? (Haa/Maya): ");
                                    String confirm1 = input.nextLine();
                                    if (confirm1.equalsIgnoreCase("Haa") && amount1 > 0 && amount1 <= balance) {
                                        balance -= amount1;
                                        lastAmount = amount1;
                                        lastSentTo = mobile1;
                                        System.out.println("Lacagta waa la shubay. Haraagaagu waa $" + balance);
                                    } else {
                                        System.out.println("Shubista waa la joojiyay ama lacagta kuma filna.");
                                    }
                                    break;

                                case 2:
                                    System.out.print("Fadlan geli mobile-ka aad rabto inaad ku shubto: ");
                                    String phone2 = input.nextLine();
                                    System.out.print("Geli lacagta aad rabto inaadku shubto: ");
                                    double blance2 = input.nextDouble();
                                    input.nextLine();
                                    System.out.print("Ma hubtaa inaad rabto inaad $" +  blance2+ " ugu shubtid " + phone2 + "? (Haa/Maya): ");
                                    String confirm2 = input.nextLine();
                                    if (confirm2.equalsIgnoreCase("Haa") && blance2 > 0 && blance2 <= balance) {
                                        balance -= blance2;
                                        lastAmount = blance2;
                                        lastSentTo = phone2;
                                        System.out.println("Waad ugu shubtay: $" + blance2 + ". Haraagaagu waa $" + balance);
                                    } else {
                                        System.out.println("laguma shubin.");
                                    }
                                    break;
                                case 3:
                                    System.out.println("\nEVCPlus ");
                                    System.out.println("1. Ku Shubo Data-da MIFI");
                                    System.out.print("Dooro: ");
                                    int subchoice3 = input.nextInt();
                                    input.nextLine();
                                    //choice 3 Internet Bundle Recharge
                                    switch (subchoice3) {
                                        case 1:
                                            System.out.println("\n-- Internet Bundle Recharge --");
                                            System.out.println("1. Isbuucle (Weekly)");
                                            System.out.println("2. Maalinle (Daily)");
                                            System.out.println("3. Bille (MiFi)");
                                            System.out.print("Dooro mid kamida: ");
                                            int bundleType = input.nextInt();
                                            input.nextLine();
                                            switch (bundleType) {
                                                case 1:
                                                    System.out.println("Fadlan dooro bundle ka:");
                                                    System.out.println("1. $5 = 10 GB");
                                                    System.out.println("2. $10 = 25 GB");
                                                    System.out.print("Select option (1-2): ");
                                                    int weeklyOption = input.nextInt();
                                                    input.nextLine();

                                                    if (weeklyOption == 1 && balance >= 5) {
                                                        balance -= 5;
                                                        System.out.println("Waxaad iibsatay 15GB oo Weekly ah. Haraagaagu waa $" + balance);
                                                    } else if (weeklyOption == 2 && balance >= 10) {
                                                        balance -= 10;
                                                        System.out.println("Waxaad iibsatay 25GB oo Weekly ah. Haraagaagu waa $" + balance);
                                                    } else {
                                                        System.out.println("Haraagaagu kuma filna.");
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.println("Fadlan dooro bundle ka:");
                                                    System.out.println("1. $1 = 12 GB");
                                                    System.out.println("2. $2 = 15 GB");
                                                    System.out.print("dooro mid kamida: ");
                                                    int dailychoice = input.nextInt();
                                                    input.nextLine();

                                                    if (dailychoice == 1 && balance >= 1) {
                                                        balance -= 1;
                                                        System.out.println("Waxaad iibsatay 15GB oo Daily ah. Haraagaagu waa $" + balance);
                                                    } else if (dailychoice == 2 && balance >= 2) {
                                                        balance -= 2;
                                                        System.out.println("Waxaad iibsatay 15GB oo Daily ah. Haraagaagu waa $" + balance);
                                                    } else {
                                                        System.out.println("Haraagaagu kuguma filna.");
                                                    }
                                                    break;
                                                case 3:
                                                    System.out.println("Fadlan dooro bundle ka:");
                                                    System.out.println("1. $20 = 46 GB");
                                                    System.out.println("2. $40 = 75 GB");
                                                    System.out.println("3. $60 = 140 GB");
                                                    System.out.println("4. $25 = Monthly Unlimite");
                                                    System.out.print("dooro mid kamida: ");
                                                    int monthlyOption = input.nextInt();
                                                    input.nextLine();

                                                    if (monthlyOption == 1 && balance >= 20) {
                                                        balance -= 20;
                                                        System.out.println("Waxaad iibsatay 75GB oo Monthly ah. Haraagaagu waa $" + balance);
                                                    } else if (monthlyOption == 2 && balance >= 40) {
                                                        balance -= 40;
                                                        System.out.println("Waxaad iibsatay 85GB oo Monthly ah. Haraagaagu waa $" + balance);
                                                    } else if (monthlyOption == 3 && balance >= 60) {
                                                        balance -= 60;
                                                        System.out.println("Waxaad iibsatay 150GB oo Monthly ah. Haraagaagu waa $" + balance);
                                                    } else if (monthlyOption == 4 && balance >= 25) {
                                                        balance -= 25;
                                                        System.out.println("Waxaad iibsatay xirmada Monthly Unlimited. Haraagaagu waa $" + balance);
                                                    } else {
                                                        System.out.println(" kuma filna haraaga.");
                                                    }
                                                    break;

                                                default:
                                                    System.out.println("qalad.");
                                            }
                                            break;

                                        default:
                                            System.out.println("ma shaqaynayo.");
                                    }
                                    break;



                                case 4:
                                    System.out.print("Fadlan geli number-ka: ");
                                    String mobile4 = input.nextLine();
                                    System.out.print("Geli lacagta internet-ka: ");
                                    double blance4 = input.nextDouble();
                                    input.nextLine();
                                    System.out.print("Ma hubtaa inaad ku shubto internet $" + blance4 + " numberka " + mobile4 + "? (Haa/Maya): ");
                                    String confirm4 = input.nextLine();
                                    if (confirm4.equalsIgnoreCase("Haa") && blance4 > 0 && blance4 <= balance) {
                                        balance -= blance4;
                                        lastAmount = blance4;
                                        lastSentTo = mobile4;
                                        System.out.println(" waa lagu shubay internet_ka. Haraagaagu waa $" + balance);
                                    } else {
                                        System.out.println("Lacag laguma shubin.");
                                    }
                                    break;

                                case 5:
                                    System.out.print("Fadlan geli number-ka qofka (MMT): ");
                                    String phone5 = input.nextLine();
                                    System.out.print("Geli lacagta: ");
                                    double blance5 = input.nextDouble();
                                    input.nextLine();
                                    System.out.print("Ma hubtaa inaad ugu shubto (MMT) $" + blance5 + " numberka " + phone5 + "? (Haa/Maya): ");
                                    String confirm5 = input.nextLine();
                                    if (confirm5.equalsIgnoreCase("Haa") && blance5 > 0 && blance5 <= balance) {
                                        balance -= blance5;
                                        lastAmount = blance5;
                                        lastSentTo = phone5;
                                        System.out.println("MMT lacagta waa la diray. Haraagaagu waa $" + balance);
                                    } else {
                                        System.out.println("ku Shubistu waa qalad.");
                                    }
                                    break;

                                default:
                                    System.out.println("khalad");
                            }
                            break;




                        case 3:
                            System.out.println("\n--- Bixi Biil ---");
                            System.out.println("1. Post Paid");
                            System.out.println("2. Ku iibso");
                            System.out.print("dooro mid kamida: ");
                            int billchoice = input.nextInt();
                            input.nextLine();
                            switch (billchoice) {



                                case 1:
                                    System.out.println("\n-- Post Paid --");
                                    System.out.println("1. Ogow Biilka");
                                    System.out.println("2. Bixi Biil");
                                    System.out.println("3. Ka Bixi Biil");
                                    System.out.print("dooro mid kamida: ");
                                    int postPaidchoice = input.nextInt();
                                    input.nextLine();
                                    switch (postPaidchoice) {
                                        case 1:
                                            double postPaidBill =195.0;
                                            System.out.println("Biilkaagu waa: $" + postPaidBill);
                                            break;
                                        case 2:
                                            double fullBill = 195.0;
                                            System.out.print("Ma hubtaa inaad bixiso $" + fullBill + "? (Haa/Maya): ");
                                            String confirmBill = input.nextLine();

                                            if (confirmBill.equalsIgnoreCase("Haa") && fullBill <= balance) {
                                                balance -= fullBill;
                                                lastAmount = fullBill;
                                                lastSentTo = "PostPaid";
                                                System.out.println("Biilka PostPaid waa la bixiyay. Haraagaagu waa: $" + balance);
                                            } else {
                                                System.out.println(" lacagta kuguma filna.");
                                            }
                                            break;
                                        case 3:
                                            System.out.print("Geli lacagta aad rabto in aad ka bixiso: ");
                                            double partialPay = input.nextDouble();
                                            input.nextLine();

                                            if (partialPay > 0 && partialPay <= balance) {
                                                balance -= partialPay;
                                                lastAmount = partialPay;
                                                lastSentTo = "PostPaid (Partial)";
                                                System.out.println("Waxaad ka bixisay $" + partialPay + " biilka. Haraagaagu waa: $" + balance);
                                            } else {
                                                System.out.println("kuguma filna ");
                                            }
                                            break;

                                        default:
                                            System.out.println(" khalad.");
                                    }
                                    break;

                                case 2:
                                    System.out.println("\n--- Ku iibso ---");
                                    System.out.print("Fadlan Geli aqoonsigaga ganacsiga: ");
                                    String businessId = input.nextLine();

                                    System.out.print("Fadlan geli ganacsiga magaciis: ");
                                    String businessName = input.nextLine();

                                    System.out.print("Fadlan geli lacagta aad rabto inaad ku ibsato: ");
                                    double payAmount = input.nextDouble();
                                    input.nextLine();

                                    System.out.print("Ma hubtaa inaad ugu ibsatid $" + payAmount + " ganacsiga " + businessName + "? (Haa/Maya): ");
                                    String confirmPay = input.nextLine();

                                    if (confirmPay.equalsIgnoreCase("Haa") && payAmount > 0 && payAmount <= balance) {
                                        balance -= payAmount;
                                        lastAmount = payAmount;
                                        lastSentTo = "Ganacsi: " + businessName + " (ID: " + businessId + ")";
                                        System.out.println("Waxad ugu ibsatay $" + payAmount + ". Haraagaagu waa $" + balance);
                                    } else {
                                        System.out.println("lacag bixinta mahan mid jiro");
                                    }
                                    break;

                                default:
                                    System.out.println("ma ahan wax jira.");
                            }
                            break;
                        case 4:
                            System.out.print("Fadlan geli number-ka: ");
                            String sendTo = input.nextLine();
                            System.out.print("Geli lacagta: ");
                            double amount = input.nextDouble();
                            input.nextLine();

                            if (amount > 0 && amount <= balance) {
                                System.out.println("Ma hubtaa inaad $" + amount + " u wareejisid " + sendTo + "?");
                                System.out.println("1: Haa");
                                System.out.println("2: Maya");
                                int op = input.nextInt();
                                input.nextLine();


                                if (choice == 1) {
                                    balance -= amount;
                                    lastAmount = amount;
                                    lastSentTo = sendTo;
                                    System.out.println("Waxaa u wareejisay $" + amount + " numberka " + sendTo);
                                    System.out.println("[-EVCPLUS-] Haraagaagu waa: $" + balance);



                                } else if (choice == 2) {
                                    System.out.println(" Wareejinta waa la joojiyay.");
                                } else {
                                    System.out.println("sax maha option aad galisay.");
                                }

                            } else {
                                System.out.println(" kuma filna haraagaaga.");
                            }
                            break;


                        case 5:
                            System.out.println("\nWarbixin Kooban");
                            System.out.println("1. Last Action");
                            System.out.println("2. Wareejintii u dambeysay");
                            System.out.println("3. Iibsashadii u dambeysay");
                            System.out.println("4. Last 3 Actions");
                            System.out.println("5. Email Me My Activity");
                            System.out.print("select option (1-5): ");
                            int subchoice5 = input.nextInt();
                            input.nextLine();
                            switch (subchoice5) {





                                case 1:
                                    if (subchoice5 == 1) {
                                        System.out.println("[-EVCPLUS-]");
                                        if (lastAmount > 0 && !lastSentTo.isEmpty()) {
                                            System.out.println("Waxaad ugu dambeysay u dirtay $" + lastAmount + " numberka " + lastSentTo);
                                        } else {
                                            System.out.println("Ma jiraan lacag aad dirtay");
                                        }
                                    } else
                                        System.out.println("Qeybtaas wali lama dhisin.");
                                    break;
                                case 2:
                                    System.out.println("Statementiga:");
                                    System.out.println("1. U dirtay");
                                    System.out.println("2. Ka heshay");
                                    System.out.print("Dooro mid kamida: ");
                                    int transferChoice = input.nextInt();
                                    input.nextLine();

                                    if (transferChoice == 1) {
                                        System.out.println("$" + lastAmount + " Ayaad u wareejisay " + lastSentTo );
                                    } else if (transferChoice == 2) {
                                        System.out.print("Fadlan Geli Mobile-ka: ");
                                        String receivedFrom = input.nextLine();
                                        System.out.println("Waxaad ka heshay $ numberka " + receivedFrom );
                                    } else {
                                        System.out.println("Doorasho khaldan.");
                                    }
                                    break;
                                case 4:
                                    System.out.println("3-dii dhaqdhaqaaq ee u dambeysay:");
                                    System.out.println("1. U dirtay numberka " + lastSentTo);
                                    System.out.println("2. U dirtay numberka 1234567");
                                    System.out.println("3. U dirtay numberka  7654321");
                                    break;
                                case 5:
                                    System.out.print("Fadlan geli gmailkaaga: ");
                                    String email = input.nextLine();

                                    System.out.print("Fadlan geli taariikhda hore (e.g. 11/05/2024): ");
                                    String startDate = input.nextLine();

                                    System.out.print("Fadlan geli taariikhda danbe (e.g. 3/02/2025): ");
                                    String endDate = input.nextLine();

                                    System.out.println("Maclumadkaaga waxaa loo diri doonaa " + email +
                                            " laga bilaabo " + startDate + " ilaa " + endDate);
                                    break;



                            }
                            break;
                        //salam bank
                        case 6:
                            System.out.println("\n--- Salaam Bank ---");
                            System.out.println("1. itus Haraagaga");
                            System.out.println("2. Lacag Dhigasho");
                            System.out.println("3. Lacag Qaadasho");
                            System.out.println("4. Ka Wareeji EVCPlus");
                            System.out.print("dooro mid kamida: ");
                            int bankOption = input.nextInt();
                            input.nextLine();

                            switch (bankOption) {
                                case 1:
                                    double bankBalance = 15000.0;
                                    System.out.println("Haraagaaga Salaam Bank waa: $" + bankBalance);
                                    break;

                                case 2:
                                    System.out.print("Fadlan geli lacagta aad dhigeyso: ");
                                    double deposit = input.nextDouble();
                                    input.nextLine();

                                    if (deposit > 0 && deposit <= balance) {
                                        balance -= deposit;
                                        System.out.println("Waxaad dhigatay $" + deposit + " Salaam Bank. Haraaga EVCPlus: $" + balance);
                                    } else {
                                        System.out.println("qaabka aad ugalisay waa khalad.");
                                    }
                                    break;

                                case 3:
                                    System.out.print("Fadlan geli lacagta aad rabto in aad ka qaadato Bank ga: ");
                                    double withdraw = input.nextDouble();
                                    input.nextLine();




                                    if (withdraw > 0) {
                                        balance += withdraw;
                                        System.out.println("Waxaad qaadatay $" + withdraw + " Salaam Bank. Haraaga EVCPlus: $" + balance);
                                    } else {
                                        System.out.println("waxaad galisay lacag qaldan.");
                                    }
                                    break;

                                case 4:
                                    System.out.print("Fadlan geli lacagta aad rabto in aad ka wareejiso EVCPlus una wareejiso Salaam Bank: ");
                                    double transferToBank = input.nextDouble();
                                    input.nextLine();

                                    if (transferToBank > 0 && transferToBank <= balance) {
                                        balance -= transferToBank;
                                        System.out.println("Waxaad u wareejisay $" + transferToBank + " Salaam Bank. Haraagaaga EVCPlus waa: $" + balance);
                                    } else {
                                        System.out.println(" lacagta waa khalad.");
                                    }
                                    break;

                                default:
                                    System.out.println("qalad");
                            }
                            break;




                        case 7:
                            System.out.println("\nMaareynta");
                            System.out.println("1. Bedel numbarka sirta ah");
                            System.out.println("2. Bedel Luqadda");
                            System.out.println("3. Wargelin Mobile Lumay");
                            System.out.println("4. Lacag Xirasho");
                            System.out.println("5. U celi lacag qaldantay");
                            System.out.print("dooro mid kamida: ");
                            int subchoice7= input.nextInt();
                            input.nextLine();
                            switch (subchoice7) {
                                case 1:
                                    System.out.print("Fadlan geli PIN-kaaga cusub: ");
                                    String newPin = input.nextLine();
                                    System.out.print("Hubi PIN-kaaga cusub: ");
                                    String confirmPin = input.nextLine();

                                    if (newPin.equals(confirmPin)) {
                                        System.out.println("[-EVCPlus-] Waad ku guuleysatay in aad badasho PIN-kaaga");
                                    } else {
                                        System.out.println("PIN-ku isma laha, isku day mar kale.");
                                    }
                                    break;

                                case 2:
                                    System.out.println("Fadlan dooro luqadda:");
                                    System.out.println("1. English");
                                    System.out.println("2. Somali");
                                    System.out.print("dooro mid kamida ");
                                    int languageOption = input.nextInt();
                                    input.nextLine();
                                    if (languageOption == 1) {
                                        System.out.println("Language changed to English.");
                                    } else if (languageOption == 2) {
                                        System.out.println("Luqadda Somali ayaa loo badaly.");
                                    } else {
                                        System.out.println("ma ahan wax jira");
                                    }
                                    break;

                                case 3:
                                    System.out.print("Fadlan Geli Mobileka Lumay: ");
                                    String lostMobile = input.nextLine();
                                    System.out.print("Fadlan Geli Numberkiisa Sirta ah: ");
                                    String pin = input.nextLine();
                                    System.out.println("Ma hubtaa in aad u diiwaan Geliso lumid number-kan " + lostMobile + "?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    System.out.print("Dooro: ");
                                    int confirm = input.nextInt();
                                    input.nextLine();
                                    if (confirm == 1) {
                                        System.out.println("Number-ka " + lostMobile + " wuu ku guuleystay diiwaangelinta lumidda.");
                                    } else if (confirm == 2) {
                                        System.out.println("waa la joojiyay diwaan galinta.");
                                    } else {
                                        System.out.println("khalad.");
                                    }
                                    break;

                                case 4:
                                    System.out.print("Geli number-ka khalad-ka ah: ");
                                    String wrongNumber = input.nextLine();
                                    System.out.print("Geli number-kii loo rabay: ");
                                    String correctNumber = input.nextLine();
                                    System.out.print("Geli Macluumaad: ");
                                    String info = input.nextLine();

                                    System.out.println("Ma hubtaa in aad xirato lacagtan?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    System.out.print("Dooro: ");
                                    int approve = input.nextInt();
                                    input.nextLine();

                                    if (approve == 1) {
                                        System.out.println("Lacagta waa laguu xiray si loo hubiyo wareejinta u dhaxeysa " + wrongNumber + " iyo " + correctNumber);
                                    } else if (approve == 2) {
                                        System.out.println("Xiridda lacagta waa la joojiyay.");
                                    } else {
                                        System.out.println("Doorasho khaldan.");
                                    }
                                    break;
                                case 5:
                                    System.out.print("Fadlan geli number-ka aad ku qalady: ");
                                    String wrongRecipient = input.nextLine();
                                    System.out.print("Fadlan geli lacagta aad qalady: ");
                                    double wrongAmount = input.nextDouble();
                                    input.nextLine();
                                    System.out.print("Ma hubtaa in aad codsi u dirto si lacagtaas laguu celiyo? (Haa/Maya): ");
                                    String confirmReturn = input.nextLine();

                                    if (confirmReturn.equalsIgnoreCase("Haa")) {
                                        System.out.println("Codsiga celinta lacagta $" + wrongAmount + " ee numberka " + wrongRecipient + " waa la diray.");
                                    } else if (confirmReturn.equalsIgnoreCase("Maya")) {
                                        System.out.println("Celinta lacagta waa la hakiyey.");
                                    } else {
                                        System.out.println("khalad.");
                                    }
                                    break;
                                default:
                                    System.out.println("waxaa jira qalad.");
                            }
                            break;



                        case 8:
                            System.out.println("\nBill Payment");
                            System.out.println("1. Itus Haraaga Bill-ka");
                            System.out.println("2. Wada bixi Bill-ka");
                            System.out.println("3. Qayb ka bixi Bill-ka");
                            System.out.print("Dooro mid kamida: ");
                            int subchoice8 = input.nextInt();
                            input.nextLine();

                            switch (subchoice8) {
                                case 1:
                                    showBillBalance();
                                    break;

                                case 2:
                                    balance = payFullBill(balance);
                                    lastAmount = 70.0;
                                    lastSentTo = "Bill Payment";
                                    break;




                                case 3:
                                    balance = payPartialBill(input, balance);
                                    lastSentTo = "Bill Payment (Qayb)";
                                    break;

                                default:
                                    System.out.println("option khaldan dooratay.");
                            }
                            break;




                        case 0:
                            continue_menu = false;
                            System.out.println("Waad baxday. Mahadsanid.");
                            break;

                        default:
                            System.out.println("khalad.");
                    }
                }
            } else {
                System.out.println("PIN-ka waa khalad.");
            }
        } else {
            System.out.println("khalad .");
        }

    }





    public static void showBillBalance() {
        double billAmount = 120.0;
        System.out.println("Haraaga Bill-kaagu waa: $" + billAmount);
    }

    public static double payFullBill(double balance) {
        double totalBill = 90.0;
        if (balance >= totalBill) {
            balance -= totalBill;
            System.out.println("si buuxda ayaad u bixisay bill-ka: $" + totalBill);
            System.out.println("Haraagaagu waa: $" + balance);
        } else {
            System.out.println("wax lacag ah kuguma jirto.");
        }
        return balance;
    }





    public static double payPartialBill(Scanner input, double balance) {
        System.out.print("Fadlan geli inta aad rabto in aad bixiso: $");
        double partbill = input.nextDouble();
        input.nextLine();

        if (partbill > 0 && partbill <= balance) {
            balance -= partbill;
            System.out.println("qayb ahaan ayaad u bixisay $" + partbill);
            System.out.println("Haraagaagu waa: $" + balance);
        } else {
            System.out.println("lama bixin karo.");
        }
        return balance;
    }








}