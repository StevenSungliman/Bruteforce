package rivercrossing;

import java.util.ArrayList;

public class BridgeCrossingBackup {

    static int getTime(String person) {
//        int time = 0;
//
//        switch (person) {
//            case "1":
//                time = 1;
//                break;
//            case "3":
//                time = 3;
//                break;
//            case "6":
//                time = 6;
//                break;
//            case "8":
//                time = 8;
//                break;
//            case "12":
//                time = 12;
//                break;
//            default:
//                time = 0;
//                break;
//        }
//
//        return time;

        return Integer.parseInt(person);
    }

    static void moveTo(String site, String person) {
        if (site == "A") {
            siteB.remove(person);
            siteA.add(person);
        } else if (site == "B") {
            siteA.remove(person);
            siteB.add(person);
        }
    }

    static void print(String x) {
        System.out.println("------------------" + x);
        if (siteA.size() == 0) {
            System.out.print("-");
        } else {
            for (int i = 0; i < siteA.size(); i++) {
                System.out.print(siteA.get(i) + " ");
            }
        }
        System.out.println("");
        if (siteB.size() == 0) {
            System.out.print("-");
        }else {
            for (int i = 0; i < siteB.size(); i++) {
                System.out.print(siteB.get(i) + " ");
            }
        }
        System.out.println("");
    }

    static String printToString(String x) {
        String text = "------------------" + x + "\n";
        for (int i = 0; i < siteA.size(); i++) {
            text += siteA.get(i) + " ";
        }
        text += "\n";
        for (int i = 0; i < siteB.size(); i++) {
            text += siteB.get(i) + " ";
        }
        text += "\n";
        return text;
    }

//    static String[] siteA = {"A", "B", "C", "D", "E"};
//    static String[] siteB = new String[5];
    static ArrayList<String> siteA = new ArrayList<>();
    static ArrayList<String> siteB = new ArrayList<>();

    static int faktorial(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }

    public static void main(String[] args) {
        int counter = 0;
        int timeLimit = 30;
        int running = 0;
        int timeA, timeB, timeI, timeJ, timeK, timeL, timeM, timeN;
        String output = "";
        String textI, textJ, textK, textL, textM, textN;
        siteA.add("1");
        siteA.add("3");
        siteA.add("6");
        siteA.add("8");
        siteA.add("12");
        ArrayList<String> tempO = new ArrayList<>();
        tempO.addAll(siteA);
        //A B C D E
        for (int i = 0; i < siteA.size(); i++) {
            for (int ii = i; ii < siteA.size() - 1; ii++) {
                timeA = getTime(siteA.get(i));
                moveTo("B", siteA.get(i));
                timeB = getTime(siteA.get(ii));
                moveTo("B", siteA.get(ii));
                running += Math.max(timeA, timeB);
                ArrayList<String> tempI1 = new ArrayList<>();
                tempI1.addAll(siteA);
                ArrayList<String> tempI2 = new ArrayList<>();
                tempI2.addAll(siteB);
                timeI = running;
                output += printToString("i");
                textI = output;
//                print("i");
//                System.out.println(" time: " + running);
                for (int j = 0; j < siteB.size(); j++) {
                    running += getTime(siteB.get(j));
                    moveTo("A", siteB.get(j));
                    ArrayList<String> tempJ1 = new ArrayList<>();
                    tempJ1.addAll(siteA);
                    ArrayList<String> tempJ2 = new ArrayList<>();
                    tempJ2.addAll(siteB);
                    timeJ = running;
                    output += printToString("j");
                    textJ = output;
//                    print("j");
//                    System.out.println(" time: " + running);
                    for (int k = 0; k < siteA.size() - 1; k++) {
                        for (int kk = k; kk < siteA.size() - 1; kk++) {
//                            System.out.println("k = " + k);
                            timeA = getTime(siteA.get(k));
                            moveTo("B", siteA.get(k));
                            timeB = getTime(siteA.get(kk));
                            moveTo("B", siteA.get(kk));
                            running += Math.max(timeA, timeB);
                            ArrayList<String> tempK1 = new ArrayList<>();
                            tempK1.addAll(siteA);
                            ArrayList<String> tempK2 = new ArrayList<>();
                            tempK2.addAll(siteB);
                            timeK = running;
                            output += printToString("k");
                            textK = output;
//                            print("k");
//                            System.out.println(" time: " + running);
                            for (int l = 0; l < siteB.size(); l++) {
                                running += getTime(siteB.get(l));
                                moveTo("A", siteB.get(l));
                                ArrayList<String> tempL1 = new ArrayList<>();
                                tempL1.addAll(siteA);
                                ArrayList<String> tempL2 = new ArrayList<>();
                                tempL2.addAll(siteB);
                                timeL = running;
                                output += printToString("l");
                                textL = output;
//                                print("l");
//                                System.out.println(" time: " + running);
                                for (int m = 0; m < siteA.size(); m++) {
                                    if (m == siteA.size() - 1) {
                                        running += Math.max(getTime(siteA.get(m)), getTime(siteA.get(0)));
                                        moveTo("B", siteA.get(m));
                                        moveTo("B", siteA.get(0));
                                    } else {
                                        running += Math.max(getTime(siteA.get(m)), getTime(siteA.get(m + 1)));
                                        moveTo("B", siteA.get(m));
                                        moveTo("B", siteA.get(m));
                                    }
                                    ArrayList<String> tempM1 = new ArrayList<>();
                                    tempM1.addAll(siteA);
                                    ArrayList<String> tempM2 = new ArrayList<>();
                                    tempM2.addAll(siteB);
                                    timeM = running;
                                    output += printToString("m");
                                    textM = output;
//                                    print("m");
//                                    System.out.println(" time: " + running);
                                    for (int n = 0; n < siteB.size(); n++) {
                                        running += getTime(siteB.get(n));
                                        moveTo("A", siteB.get(n));
                                        ArrayList<String> tempN1 = new ArrayList<>();
                                        tempN1.addAll(siteA);
                                        ArrayList<String> tempN2 = new ArrayList<>();
                                        tempN2.addAll(siteB);
                                        timeN = running;
                                        output += printToString("n");
                                        textN = output;
//                                        print("n");
//                                        System.out.println(" time: " + running);
                                        for (int o = 0; o < 1; o++) {
                                            running += Math.max(getTime(siteA.get(0)), getTime(siteA.get(1)));
                                            moveTo("B", siteA.get(0));
                                            moveTo("B", siteA.get(0));
                                            counter++;
                                            if (running <= timeLimit) {
                                                System.out.print(output);
                                                print("o");
                                                System.out.println(counter + " TIME: " + running);
                                                System.out.println("");
                                            }
                                        }
                                        siteA.clear();
                                        siteA.addAll(tempM1);
                                        siteB.clear();
                                        siteB.addAll(tempM2);
                                        running = timeM;
                                        output = textM;
                                    }
                                    siteA.clear();
                                    siteA.addAll(tempL1);
                                    siteB.clear();
                                    siteB.addAll(tempL2);
                                    running = timeL;
                                    output = textL;
                                }
                                siteA.clear();
                                siteA.addAll(tempK1);
                                siteB.clear();
                                siteB.addAll(tempK2);
                                running = timeK;
                                output = textK;
                            }
                            siteA.clear();
                            siteA.addAll(tempJ1);
                            siteB.clear();
                            siteB.addAll(tempJ2);
                            running = timeJ;
                            output = textJ;
                        }
                    }
                    siteA.clear();
                    siteA.addAll(tempI1);
                    siteB.clear();
                    siteB.addAll(tempI2);
                    running = timeI;
                    output = textI;
                }
                siteA.clear();
                siteA.addAll(tempO);
                siteB.clear();
                running = 0;
                output = "";
            }
        }
    }
}
