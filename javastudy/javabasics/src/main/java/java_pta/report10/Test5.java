//package java_pta.report10;
//import java.io.*;
//
//public class Test5 {
//    public static void main(String[] args)
//            throws IOException, ClassNotFoundException {
//        try (
//                ObjectInputStream input = new ObjectInputStream(new
//                        BufferedInputStream(new FileInputStream("Exercise17_07.dat")))
//        ) {
//            while (true) {
//                Loan loan = (Loan)input.readObject();
//                System.out.println(loan);
//                System.out.printf("Total loan amount: $%.2f\n",
//                        loan.getTotalPayment());
//                System.out.println();
//            }
//        }
//        catch (EOFException ex) {
//
//        }
//    }
//}