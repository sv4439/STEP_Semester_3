package AssignmentProblems1;

class Account {
    String regNo;
    double totalFees;

    Account(String regNo, double totalFees) {
        this.regNo = regNo;
        this.totalFees = totalFees;
    }

    // final method cannot be overridden by subclasses
    final double calculateLateFee(int daysLate) {
        if (daysLate <= 0) {
            return 0;
        }

        // 10% of total fees for each late day
        return totalFees * daysLate * 0.10;
    }

    // final method cannot be overridden
    final void printSummary(int daysLate) {
        if (daysLate <= 0) {
            System.out.println(regNo + " | On-time, no late fee");
            return;
        }

        double lateFee = calculateLateFee(daysLate);

        System.out.println(regNo + " | Total Fee: Rs "
                + totalFees + " | Late Fee: Rs " + lateFee);
    }
}

public class Late_Fees_Q3{
    public static void main(String[] args) {

        String[] regNos = {"RA001", "RA002", "RA003", "RA004"};
        double[] totalFees = {20000, 15000, 18000, 22000};
        int[] daysLate = {10, 0, 2, 5};

        // Process the entire batch in one pass
        for (int i = 0; i < regNos.length; i++) {

            Account account = new Account(regNos[i], totalFees[i]);

            // Skip accounts that are on-time
            if (daysLate[i] <= 0) {
                account.printSummary(daysLate[i]);
            } else {
                account.printSummary(daysLate[i]);
            }
        }
    }
}

