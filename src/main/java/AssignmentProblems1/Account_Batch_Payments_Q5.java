package AssignmentProblems1;

class FeeAccount {
    String accountType;

    FeeAccount(String accountType) {
        this.accountType = accountType;
    }
}

class HostelFeeAccount extends FeeAccount {

    HostelFeeAccount(String accountType) {
        super(accountType);
    }
}

public class Account_Batch_Payments_Q5 {

    static int hostelCount = 0;
    static int dayScholarCount = 0;

    static void processPayment(FeeAccount account, double amount) {

        // Runtime type checking using instanceof
        if (account instanceof HostelFeeAccount) {

            double installment = amount / 2;

            System.out.println(
                    "Paid in two installments (hostel account)"
            );

            System.out.println(
                    "Paid in two installments (hostel account)"
            );

            hostelCount++;

        } else {

            System.out.println(
                    "Paid in one go (day-scholar account)"
            );

            dayScholarCount++;
        }
    }

    public static void main(String[] args) {

        // Accounts in the given order
        FeeAccount[] accounts = {
                new HostelFeeAccount("Hostel"),
                new HostelFeeAccount("Hostel"),
                new FeeAccount("Day Scholar"),
                new FeeAccount("Day Scholar")
        };

        double amount = 60000;

        // Process the complete batch
        for (FeeAccount account : accounts) {
            processPayment(account, amount);
        }

        // Print counters
        System.out.println(
                "Hostel accounts processed: " + hostelCount +
                        " | Day-scholar accounts processed: " + dayScholarCount
        );
    }
}
