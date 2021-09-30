package rivercrossing;

import java.util.ArrayList;

public class BridgeCrossing2 {

    static int getTime(String person) {
        int time = 0;

        switch (person) {
            case "A":
                time = 1;
                break;
            case "B":
                time = 3;
                break;
            case "C":
                time = 6;
                break;
            case "D":
                time = 8;
                break;
            case "E":
                time = 12;
                break;
            default:
                time = 0;
                break;
        }

        return time;
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
        for (int i = 0; i < siteA.size(); i++) {
            System.out.print(siteA.get(i) + " ");
        }
        System.out.println("");
        for (int i = 0; i < siteB.size(); i++) {
            System.out.print(siteB.get(i) + " ");
        }
        System.out.println("");
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
        String output = "";
        String tempOut = "";
        int timeA = 0;
        int timeB = 0;
        int counter = 0;
        int running = 0;
        int tempRun = 0;
        int timeLimit = 30;
        siteA.add("A");
        siteA.add("B");
        siteA.add("C");
        siteA.add("D");
        siteA.add("E");
        ArrayList<String> tempO = new ArrayList<>();
        tempO.addAll(siteA);
        //A B C D E
        for (int i = 0; i < siteA.size(); i++) {
            for (int ii = i; ii < siteA.size() - 1; ii++) {
//                output = "pergi: " + siteA.get(i) + ", ";
                moveTo("B", siteA.get(i));
//                output += siteA.get(ii) + "\n";
                moveTo("B", siteA.get(ii));
//                print("ikanhiumakantomat");
                ArrayList<String> tempI1 = new ArrayList<>();
                tempI1.addAll(siteA);
                ArrayList<String> tempI2 = new ArrayList<>();
                tempI2.addAll(siteB);
                for (int j = 0; j < siteB.size(); j++) {
//                    output += "pulang: " + siteB.get(j) + "\n";
                    moveTo("A", siteB.get(j));
//                    print("jforjotaro");
                    ArrayList<String> tempJ1 = new ArrayList<>();
                    tempJ1.addAll(siteA);
                    ArrayList<String> tempJ2 = new ArrayList<>();
                    tempJ2.addAll(siteB);
                    for (int k = 0; k < siteA.size() - 1; k++) {
                        for (int kk = k; kk < siteA.size() - 1; kk++) {
//                            System.out.println("k = " + k);
                            tempRun = Math.max(getTime(siteA.get(i)), getTime(siteA.get(ii)));
//                            tempOut = "pergi: " + siteA.get(k) + ", ";
                            moveTo("B", siteA.get(k));
//                            tempOut += siteA.get(kk) + "\n";
                            moveTo("B", siteA.get(kk));
//                            print("keraktelor");
                            ArrayList<String> tempK1 = new ArrayList<>();
                            tempK1.addAll(siteA);
                            ArrayList<String> tempK2 = new ArrayList<>();
                            tempK2.addAll(siteB);
//                            if (running + tempRun <= timeLimit) {
//                                running += tempRun;
//                                output += tempOut;
//                                tempRun = 0;
//                                tempOut = "";
                                for (int l = 0; l < siteB.size(); l++) {
                                    tempRun = getTime(siteB.get(j));
//                                    tempOut = "pulang: " + siteB.get(j) + "\n";
                                    moveTo("A", siteB.get(l));
//                                    print("l");
                                    ArrayList<String> tempL1 = new ArrayList<>();
                                    tempL1.addAll(siteA);
                                    ArrayList<String> tempL2 = new ArrayList<>();
                                    tempL2.addAll(siteB);
//                                    if (running + tempRun <= timeLimit) {
//                                        running += tempRun;
//                                        output += tempOut;
//                                        tempRun = 0;
//                                        tempOut = "";

                                        for (int m = 0; m < siteA.size(); m++) {
                                            if (m == siteA.size() - 1) {
                                                tempRun = Math.max(getTime(siteA.get(m)), getTime(siteA.get(0)));
//                                                tempOut = "pergi: " + siteA.get(m) + ", ";
                                                moveTo("B", siteA.get(m));
//                                                tempOut += siteA.get(0) + "\n";
                                                moveTo("B", siteA.get(0));
                                            } else {
                                                tempRun = Math.max(getTime(siteA.get(m)), getTime(siteA.get(m + 1)));
//                                                tempOut = "pergi: " + siteA.get(m) + ", ";
                                                moveTo("B", siteA.get(m));
//                                                tempOut += siteA.get(0) + "\n";
                                                moveTo("B", siteA.get(m));
                                            }
//                                            print("m");
                                            ArrayList<String> tempM1 = new ArrayList<>();
                                            tempM1.addAll(siteA);
                                            ArrayList<String> tempM2 = new ArrayList<>();
                                            tempM2.addAll(siteB);
//                                            if (running + tempRun <= timeLimit) {
//                                                running += tempRun;
//                                                output += tempOut;
//                                                tempRun = 0;
//                                                tempOut = "";
                                                for (int n = 0; n < siteB.size(); n++) {
                                                    tempRun = getTime(siteB.get(n));
//                                                    tempOut = "pulang: " + siteB.get(j) + "\n";
                                                    moveTo("A", siteB.get(n));
//                                                    print("n");
                                                    ArrayList<String> tempN1 = new ArrayList<>();
                                                    tempN1.addAll(siteA);
                                                    ArrayList<String> tempN2 = new ArrayList<>();
                                                    tempN2.addAll(siteB);
//                                                    if (running + tempRun <= timeLimit) {
//                                                        running += tempRun;
//                                                        output += tempOut;
//                                                        tempRun = 0;
//                                                        tempOut = "";
                                                        for (int o = 0; o < 1; o++) {
                                                            tempRun = Math.max(getTime(siteA.get(0)), getTime(siteA.get(1)));
//                                                            tempOut = "pergi: " + siteA.get(0) + ", ";
                                                            moveTo("B", siteA.get(0));
//                                                            tempOut += siteA.get(0) + "\n";
                                                            moveTo("B", siteA.get(0));
//                                                            print("o");
                                                            counter++;
                                                            System.out.println("c" + counter);
//                                                            if (running + tempRun <= timeLimit) {
//                                                                running += tempRun;
//                                                                output += tempOut;
//                                                                System.out.print(output);
//                                                                System.out.println("time: " + running);
//                                                                System.out.println("");
//                                                            }
                                                        }
//                                                    }
                                                    siteA.clear();
                                                    siteA.addAll(tempM1);
                                                    siteB.clear();
                                                    siteB.addAll(tempM2);
                                                }
//                                            }
                                            siteA.clear();
                                            siteA.addAll(tempL1);
                                            siteB.clear();
                                            siteB.addAll(tempL2);
                                        }
//                                    }
                                    siteA.clear();
                                    siteA.addAll(tempK1);
                                    siteB.clear();
                                    siteB.addAll(tempK2);
                                }
//                            }
                            siteA.clear();
                            siteA.addAll(tempJ1);
                            siteB.clear();
                            siteB.addAll(tempJ2);
                        }
                    }
                    siteA.clear();
                    siteA.addAll(tempI1);
                    siteB.clear();
                    siteB.addAll(tempI2);
                }
            }
            siteA.clear();
            siteA.addAll(tempO);
            siteB.clear();
        }
    }
}
