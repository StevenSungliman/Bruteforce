package rivercrossing;

import java.util.ArrayList;

public class BridgeCrossing {

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

    public static void main(String[] args) {
        int time = 0;

        siteA.add("A");
        siteA.add("B");
        siteA.add("C");
        siteA.add("D");
        siteA.add("E");

        for (int i = 0; i < siteA.size(); i++) {
            moveTo("B", siteA.get(0));
            moveTo("B", siteA.get(0));
            print("i");
            for (int j = 0; j < siteB.size(); j++) {
                moveTo("A", siteB.get(0));
                print("j");
                for (int k = 0; k < siteA.size(); k++) {
                    moveTo("B", siteA.get(0));
                    moveTo("B", siteA.get(0));
                    print("k");
                    for (int l = 0; l < siteB.size(); l++) {
                        moveTo("A", siteB.get(0));
                        print("l");
                        for (int m = 0; m < siteA.size(); m++) {
                            moveTo("B", siteA.get(0));
                            moveTo("B", siteA.get(0));
                            print("m");
                            for (int n = 0; n < siteB.size(); n++) {
                                System.out.println(siteB.size());
                                moveTo("A", siteB.get(0));
                                print("n");
                                for (int o = 0; o < 1; o++) {
                                    moveTo("B", siteA.get(0));
                                    moveTo("B", siteA.get(0));
                                    print("o");
                                }
                                moveTo("A", siteB.get(siteB.size() - 2));
                            }
                            moveTo("A", siteB.get(siteB.size() - 2));
                            moveTo("A", siteB.get(siteB.size() - 1));
                        }
                        moveTo("B", siteA.get(siteA.size() - 1));
                    }
                    print("bump");
                }
                
            }
            
        }
    }
}
